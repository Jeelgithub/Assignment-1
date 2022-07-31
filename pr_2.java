import java.util.*;
class pr_2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String ans = startOz(str);
        System.out.println(ans);
        sc.close();
    }
    public static String startOz(String a)
        {   
//when 'o' and 'z' are come in first in string then it's include in obt variable.
            String obt = "";
            if(a.charAt(0)=='o')
            obt=obt+'o';

            if(a.charAt(1)=='z')
            obt=obt+'z';
        return obt;
        } 
