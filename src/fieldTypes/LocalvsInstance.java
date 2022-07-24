package fieldTypes;

public class LocalvsInstance {
    public int a;   // instance variable --belongs to the object created from his class

    public void showDifference(){

        int a = 5;  // local variable
        System.out.println(a);
    }

    public void showDifference(int number){
        int a = number;
        System.out.println(a);
    }

    public static void main(String[] args) {

        LocalvsInstance obj = new LocalvsInstance();    // default constructor even if we don't write one

        System.out.println("--coming from the method: local---");
        obj.showDifference();

        System.out.println("---coming from instance variable---");
        System.out.println(obj.a);

        obj.a = 1;
        System.out.println(obj.a);

        obj.showDifference(8);

    }



}
