import java.io.*;

//exercise 1.19
class squaredn {
    public static void main(String[] args)
    {
        //input = Integer n >= 0
        //output= s = n^2
        int n = 8;
        int i = 0;
        int s = 0;
        //invariant: I
        while (i<n) {
            i++;
            s = s+i;
        }
        s = s+s-n;

        System.out.println("Result of n*^2 : " + s);
    }

}



//exercise 1.18
class squaredn2 {
    public static void main(String[] args)
    {
        int n = 24;
        int i = 1;
        int s = 1;

        //invariant = s=i^2
        //= s + 2 * i + 1 = (i+1)^2 skal løses som s=i^2
        while (i<n) {
            s = s + 2 * i + 1;
            i++;
        }
        System.out.println("The final value of S = " + s);
    }

}

