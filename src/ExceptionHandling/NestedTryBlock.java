package ExceptionHandling;

public class NestedTryBlock {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 try {  
				    
		             
		            try {  
		    
		                  
		                try {  
		                    int arr[] = { 1,2,3,4,7,5,6,9,4,6,9 };
		                    System.out.println(arr[101]);  
		                }  
		     
		                catch (ArithmeticException e) {  
		                    System.out.println("Arithmetic exception");  
		                    System.out.println(" inner try block 2");  
		                }  
		            }  
		    
	 
		            catch (ArithmeticException e) {  
		                System.out.println("Arithmetic exception");  
		                System.out.println("inner try block 1");  
		            }  
		        }  
		     
		        catch (ArrayIndexOutOfBoundsException e4) {  
		            System.out.print(e4);  
		            System.out.println(" outer (main) try block");  
		        }  
		        
		    

		}

	}
