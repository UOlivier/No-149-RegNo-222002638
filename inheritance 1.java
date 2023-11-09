interface E {
    void car();
}
class A extends B implements E { 
   public void car(){
        System.out.println("LANDCRUISER");

    }
    public void vehicle() {
        System.out.println("LANDCRUISER");
    }
}
class B extends C {
public void speed(){
    System.out.println("80km/h");
}
}
class C extends D {
    public void color(){
        System.out.println("black");
    }
}
class D {
    public void fuel(){
        System.out.println("benzine");
    }
}
public class eric1 {
    
    public static void main(String[]args){
        A Object=new A ();
        Object.vehicle();
        Object.speed();
        Object.color();
        Object.fuel();
    }
}