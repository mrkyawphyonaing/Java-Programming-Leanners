public class Inheritance {

    // main is executed by JVM when my program will run
    public static void main(String[] args) {

        // Create an Object : Product

        /*
         * Product pd1 = new Product();
         * 
         * pd1 is not and object its a referance variable with holds the hashCode of the
         * object in hexadecimal notation
         * 
         * 
         * System.out.println("Pd1 is " + pd1);
         * 
         * // Writing data in Object
         * pd1.setProductDetail(100, "iPhone-11", 2000000);
         * 
         * // Reading data from object
         * pd1.showProductDetail();
         * 
         * System.out.println();
         * 
         * Product pd2 = new Product();
         * System.out.println("Pd2 is " + pd2);
         * 
         * // Writing data in Object
         * pd2.setProductDetail(101, "Samsung Tab-7", 1000000);
         * 
         * // Reading data from object
         * pd2.showProductDetail();
         */

        // Requesting to get Mobile Object Constructed
        Mobile productNumber1 = new Mobile();

        productNumber1.setProductDetail(001, "MiMax3", 300000, "Android OS", 6, 128);
        productNumber1.showProductDetail();

    }
}

// Textual Representation how an object will look like in the memory
// What ever we written in class is in actual the property of object as we are
// describing the object
class Product {

    // Additional Attributes Of Mobile other than Product(State)
    int pid;
    String name;
    int price;

    // Constructor
    public Product() {
        System.out.println(">>Product Object Constructed");
    }

    // Method(Behavior)
    // To write data in Product Object we have this method
    void setProductDetail(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">>Data Written in Object");
    }

    // To read Data from Product Object
    void showProductDetail() {
        System.out.println("-----Product ID  " + pid + " ----------");

        System.out.println("Name:\t" + name);

        System.out.println("Price:\t" + price);

        System.out.println("--------------------------------");

    }

}

class Mobile extends Product { // IS-A relation, (Mobile IS-A Product), Mobile is child, Product is Parent

    // Attributes(State)
    String os;
    int RAM;
    int sdCardSize;

    // Constructor
    public Mobile() {
        System.out.println(">>Mobile Object Constructed");
    }

    // (We have defined the same method from the Parent into the child with diferent
    // inputs)
    // We have now 2 methods in the child, 1 from parent and 1 of child
    // both are different as in based on inputs (even thought name is same)
    // Method Overloading : Same Methods Name with Different Inputs
    void setProductDetail(int pid, String os, int price, String CPU, int RAM, int sdCardSize) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.os = CPU;
        this.RAM = RAM;
        this.sdCardSize = sdCardSize;
        System.out.println(">>Data Written in Object");
    }

    /*
     * => Let defined showProductDetail as well
     * => But here we have same inputs
     * => 2 Methods in the child, 1 from parent and 1 of child we have same
     * signatures !!
     * => Child method well be excuted and not the Parent method
     * => Method Overriding : (Same Method name with same inpuits in Parent Child
     * Relationship
     */
    void showProductDetail() {
        System.out.println("-----Product ID  " + pid + " ----------");

        System.out.println("Name:\t" + name);

        System.out.println("Price:\t" + price);

        System.out.println("OS:\t" + os);

        System.out.println("RAM:\t" + RAM + " GB");

        System.out.println("sdCardSize: " + sdCardSize + " GB");

        System.out.println("--------------------------------");

    }

}