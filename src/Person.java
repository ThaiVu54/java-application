import java.util.Scanner;

public class Person {
    private String name;
    private String numCMND;
    private String address;

    public Person() {
    }

    public Person(String name, String numCMND, String address) {
        this.name = name;
        this.numCMND = numCMND;
        this.address = address;
    }


    public String getNumCMND() {
        return numCMND;
    }

    public void setNumCMND(String numCMND) {
        this.numCMND = numCMND;
    }

    public void inputInfoClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name client: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter number Identity card: ");
        numCMND = sc.nextLine();
    }

    public void displayInfoClient() {
        System.out.println("Client name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Identity card: " + numCMND);

    }
}
