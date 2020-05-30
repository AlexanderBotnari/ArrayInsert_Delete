
public class Insert {

	 public static void insert() {
	        
		    int[] data = {10, 20, 30, 40, 50};
	        int indexToInsert = 2;
	        int[] newData = new int[data.length + 1];
	        int newValue = -10;
	         
	        for (int oi = 0, ci = 0; oi < data.length; oi++) {
	            if (oi == indexToInsert) {
	                newData[ci++] = newValue;
	            } else {
	                newData[ci++] = data[oi];
	            }
	        }
	                data = newData;

	        for (int i : data ) {
	            System.out.println(i);

	        }
	    }
	 
}
