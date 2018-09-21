public class ValidateId{

 public static final String id = "ABC1204234241";

 
 
     public static void main(String args[]) {
         
         //change the id and see if this method is correct
		//String id = "ABC1204234241";
		if(id.matches("[A-Z]{3}[0-9]{10}"))
		{
		    String[] result1 = id.split(id.substring(3));
		    String FirstThree = result1[0];
		
    		String[] result2 = id.split(id.substring(0, 3));
    		String TenDigits = result2[1];
		
    		if (isStringUpperCase(FirstThree) && validateString(TenDigits)) {
    			System.out.println("PASS");
    		} else
    			System.out.println("FAIL");
    		    
    	}
    	else
    	{
    	     System.out.println("Invalid ID Format");   
    	}
	

		

	}
	
	
	private static boolean validateString(String TenDigits){
	    //TRUE if all are digits and length 10
	    //TRUE if two occurs in the string
	    
	    String[] result  = TenDigits.split("2");
	    //omit the last chunk
	    int until = result.length-1; 
	    
	    //by making i = 1 (NOT 0) omit the first chunk
		for(int i=1; i<until;i++)
		{
		    //check if the distance between digit 2 is greater than 2 chars
		     if(result[i].length()<2)
		    {		       
		        return false;		        
		    }
		    
		}
		return true;
	}

	private static boolean isStringUpperCase(String str) {

		// convert String to char array
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			// if any character is not in upper case, return false
			if (!Character.isUpperCase(charArray[i]))
				return false;
		}

		return true;
	}
}