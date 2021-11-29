package algorrithm.search;

public class BinarySearch { 
       public int binarySearch(int[] array, int key) { 
             int pLeft = 0;
             int pRight = array.length - 1;
             
             do {
                   int center = (pLeft + pRight) /2;
                   
                   if (array[center] == key) {
                   return center;
                   } else if(array[center] < key) {
                   pLeft = center + 1;
                   } else {
                   pRight = center - 1;
                   }
                }while (pLeft <= pRight);
                
                return -1;
                }
                public void see(int[] array) {
                   System.out.println("‘ÎÛ‚Ì”z—ñ‚ÍˆÈ‰º‚Ì’Ê‚è‚Å‚·B");
                   for(int i = 0; i < array.length; i++) {