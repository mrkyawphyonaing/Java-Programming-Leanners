public class Inheritance {

    // main is executed by JVM when my program will run
    public static void main(String[] args) {

        // Create an Object : Product

        Product pd1 = new Product();
        /*
         * pd1 is not and object its a referance variable with holds the hashCode of the
         * object in hexadecimal notation
         */

        System.out.println("Pd1 is " + pd1);

        // Writing data in Object
        pd1.setProductDetail(100, "iPhone-11", 2000000);

        // Reading data from object
        pd1.showProductDetail();

        System.out.println();

        Product pd2 = new Product();
        System.out.println("Pd2 is " + pd2);

        // Writing data in Object
        pd2.setProductDetail(101, "Samsung Tab-7", 1000000);

        // Reading data from object
        pd2.showProductDetail();

    }
}

// Textual Representation how an object will look like in the memory
// What ever we written in class is in actual the property of object as we are
// describing the object
class Product {

    // Attributes(State)
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