import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class ComparatorF{
    public boolean compare(int s1, int s2) {
        return s1 == s2;
    }
    public boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public boolean compare(int[] array1, int[] array2) {
        int l1 = array1.length;
        int l2 = array2.length;
        if (l1 != l2) return false;
        for (int i = 0; i < l1; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}
// */ */
/* **** /* sss */
class SolutionF {
    public static void main(String[] args) {
        int i = 0011;
        int j = 0x2222;
        System.out.println(i);
//        System.out.println(j);
//        Scanner scan = new Scanner(System.in);
//        ComparatorF comp = new ComparatorF();
//
//        int testCases = Integer.parseInt(scan.nextLine());
//        while(testCases-- > 0){
//            int condition = Integer.parseInt(scan.nextLine());
//            switch(condition){
//                case 1:
//                    String s1=scan.nextLine().trim();
//                    String s2=scan.nextLine().trim();
//
//                    System.out.println( (comp.compare(s1,s2)) ? "Same" : "Different" );
//                    break;
//                case 2:
//                    int num1 = scan.nextInt();
//                    int num2 = scan.nextInt();
//
//                    System.out.println( (comp.compare(num1,num2)) ? "Same" : "Different");
//                    if(scan.hasNext()){ // avoid exception if this last test case
//                        scan.nextLine(); // eat space until next line
//                    }
//                    break;
//                case 3:
//                    // create and fill arrays
//                    int[] array1 = new int[scan.nextInt()];
//                    int[] array2 = new int[scan.nextInt()];
//                    for(int i = 0; i < array1.length; i++){
//                        array1[i] = scan.nextInt();
//                    }
//                    for(int i = 0; i < array2.length; i++){
//                        array2[i] = scan.nextInt();
//                    }
//
//                    System.out.println( comp.compare(array1, array2) ? "Same" : "Different");
//                    if(scan.hasNext()){ // avoid exception if this last test case
//                        scan.nextLine(); // eat space until next line
//                    }
//                    break;
//                default:
//                    System.err.println("Invalid input.");
//            }// end switch
//        }// end while
//        scan.close();
    }
}
