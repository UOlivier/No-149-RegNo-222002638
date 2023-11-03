// this program display simple interest
public class simple { 
    // name of the method and declare variables
    static int interest(int p, int r, int t){ 
        return (p*r*t)/100; // output that will be returned
    }

    public static void main(String[] args) { // main class
        simple I = new simple(); // object name
        System.out.println("simple interest is = " + I.interest(100000, 5, 5)); // out put
    }    
} 