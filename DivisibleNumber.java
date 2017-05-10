import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DivisibleNumber {
	
	public Integer getSum(Integer capSize){
		Integer count = 0;
		for(Integer number = 1; number <= capSize; number++ ){			
			if(number % 3 == 0 || number % 5 == 0  ){
				count++;
			}
		}
		return count;
	}
	
	public static String getFormettedDate(String convertDate){
  	  try{
  		  String requiredFormatte = "";
  		  Date parse = new SimpleDateFormat("MM/dd/yyyy").parse(convertDate);
  		  requiredFormatte = new SimpleDateFormat("yyyy-MM-dd").format(parse);
  		  return requiredFormatte;
  	  }catch( ParseException e ) {
            System.out.println( e.getMessage());
            return null;
        }
  	 
       
    }
	
	
public static boolean isPalindrome(String str){
		
		if(str.length()==1){
			return true;
		}		
		int begin=0;
		int end=str.length()-1;
		while(begin<=end){
			if(!Character.toString(str.charAt(begin)).equalsIgnoreCase(Character.toString(str.charAt(end))))return false;
				begin++;
				end--;
		}
		return true;
		
	}
		
	public static void main(String[] args) {
		//Write a function that finds the frequency of occurrence of a given word in an article
		//WORDCOUNT
		String data = "man nam man i am man";
	    String ocurrenceWord = "man";
	     
	     int countOcurrence = 0;
	     
	     String artArray [] = data.split (" ");
	     
	     for ( String p : artArray)
	     {
	           if ( p.equals(ocurrenceWord))
	        	   countOcurrence ++;
	     }
	      
	      System.out.println ("The occurence of the given word is " + countOcurrence);
	     	     		
		DivisibleNumber divisibleNumber = new DivisibleNumber();
		System.out.println("Count of numbers divisible by 3 or 5 : " + divisibleNumber.getSum(1000));
	}
}
