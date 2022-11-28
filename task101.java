import java.util.Scanner;
import java.io.*;

public class task101 {
public static void main(String[] args) {}
    

static boolean isTriangular(int num){
        if (num < 0)
            return false;}
private int b;
     
        
        {
        int c = (-2 * num);
        int b = 1, a = 1;
        int d = (b * b) - (4 * a * c);
            if (d < 0)
                return false;
            
        
        
        float root1 = ( -b +
           (float)Math.sqrt(d)) / (2 * a);
            
        float root2 = ( -b -
           (float)Math.sqrt(d)) / (2 * a);
     
        
        if (root1 > 0 && Math.floor(root1)
                                  == root1)
            return true;
     
        
        if (root2 > 0 && Math.floor(root2)
                                  == root2)
            return true;
     
        return false;
    
     
    
            int num = 55;
            if (void isTriangular(num))
            System.out.println("The number is" + " a triangular number");
                else
                System.out.println ("The number " + "is NOT a triangular number");
    
    
}
}
}
     
    