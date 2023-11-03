// this program display amount to be paid after three years

// class name
public class compound { 

    // method name with variables declaration
    static double comp(double p, double r, double t, double n){ 

        // output to be returned
        return  p*(Math.pow(1+(r/(n*100)),n*t)); 
    }
    // main class 
    public static void main(String[] args) { 
        compound C= new compound(); // object name
        System.out.println("the amount he will have paid after 3 years period is equal to: " + comp(500000,18,3,12));//output
    }
} 