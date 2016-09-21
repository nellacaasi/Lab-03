package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.net.*;
import java.io.*;

public class WordList implements StringSearchInterface {
	
	protected String url = "http://dl.dropbox.com/u/18678304/2011/BSc2/words.txt";
	protected ArrayList<String> wordList;

	public WordList(String urlString) throws IOException {
				
	    BufferedReader in = null;
	    
	    try {
	      wordList = new ArrayList<String>();
	      in = new BufferedReader(new InputStreamReader(new URL(urlString).openStream()));
	      String inputLine;
	      while ((inputLine = in.readLine()) != null)
	        wordList.add(inputLine);
	    }
	    finally {
	      if (in != null)
	        in.close();
	    }
	  }
	
	@Override
	public List<String> getSubstringList(String subString) {
		
		return null;
	}

	@Override
	public void addString(String s) {
		
	}
}