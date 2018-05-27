import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.Span;


public class CustomerExtractor {
	
	
	private static List<String> customerNames = new ArrayList<String>();
	private static List<String> customerAddress = new ArrayList<String>();
	
	private static int noCustomerNames;
	private static int noCustomerAddress;
	private static int garbageValue;
	
	
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("input/customerInformation.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	SentenceDetect(line);
		    }
		}
		
		System.out.println("-----------Analysis----------------");
		
		System.out.println("Total number of customers : "+ customerNames.size());
		System.out.println("Number of customers who did not provide full name : "+noCustomerNames);
		System.out.println("Number of customers who provided complete address : "+customerAddress.size());
		System.out.println("Number of customers who provided garbage information : "+garbageValue);
		System.out.println("Number of customers without address information : "+noCustomerAddress);
		
		System.out.println("-----------------------------------");
		
		
	}
	
	
	public static List<String>  SentenceDetect(String fileInput) throws InvalidFormatException, IOException {
	
	// always start with a model, a model is learned from training data
	InputStream is = new FileInputStream("lib/en-sent.bin");
	SentenceModel model = new SentenceModel(is);
	SentenceDetectorME sdetector = new SentenceDetectorME(model);
	
	String sentences[] = sdetector.sentDetect(fileInput);
	
	for (String string : sentences) {
		tokenize(string);
	}
	
	is.close();
	
	return Arrays.asList(sentences);
	
	}
	
	public static void tokenize(String singleInput) throws InvalidFormatException, IOException {
		InputStream is = new FileInputStream("lib/en-token.bin");
	 
		TokenizerModel model = new TokenizerModel(is);
	 
		Tokenizer tokenizer = new TokenizerME(model);
	 
		findNameAndAddress(tokenizer.tokenize(singleInput));
	 
		is.close();
	}
	
	
	
	public static void findNameAndAddress(String[] inputTokens) throws IOException {
		
		InputStream nameis = new FileInputStream("lib/en-ner-person.bin");
		InputStream addressis = new FileInputStream("lib/en-ner-location.bin");
	 
		TokenNameFinderModel namemodel = new TokenNameFinderModel(nameis);
		TokenNameFinderModel addressmodel = new TokenNameFinderModel(addressis);
		nameis.close();
		addressis.close();
	 
		NameFinderME nameFinder = new NameFinderME(namemodel);
		NameFinderME addressFinder = new NameFinderME(addressmodel);
	 
		Span nameSpans[] = nameFinder.find(inputTokens);
		Span addressSpans[] = addressFinder.find(inputTokens);
				
				if(nameSpans.length==0 && addressSpans.length==0)
					garbageValue++;
				else if(nameSpans.length==0 )
					noCustomerNames++;
				else if(addressSpans.length==0)
					noCustomerAddress++;
				
				for(Span s: nameSpans)
					customerNames.add(s.toString());	
				for(Span s: addressSpans)
					customerAddress.add(s.toString());
	}
	
}
