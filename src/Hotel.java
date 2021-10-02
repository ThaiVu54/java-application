import java.util.Scanner;

public class Hotel extends Person {
    private int numDay;
    private String typeRoom;
    private double priceRoom;
    private Person person;

    //    public Hotel(int numDay, String typeRoom, double priceRoom, Person person) {
//        super();
//        this.numDay = numDay;
//        this.typeRoom = typeRoom;
//        this.priceRoom = priceRoom;
//        this.person = person;
//    }
    public Hotel(int numDay, String typeRoom, double priceRoom, Person person) {
        this.numDay = numDay;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
        this.person = person;
    }

    public Hotel(String name, String numCMND, String address, int numDay, String typeRoom, double priceRoom, Person person) {
        super(name, numCMND, address);
        this.numDay = numDay;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
        this.person = person;
    }


    public Hotel() {
        super();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void InputInfoManage(){
        Scanner sc = new Scanner(System.in);
        person = new Person();
        person.inputInfoClient();
        System.out.print("Enter numbers stay day: ");
        numDay = Integer.parseInt(sc.nextLine()); //là phân tích chuỗi thành số kiểu Integer
        System.out.print("Enter type room: ");
        typeRoom = sc.nextLine();
        System.out.print("Enter price room: ");
        priceRoom = sc.nextDouble();
    }

    public void displayInfoManage(){
        person.displayInfoClient();
        System.out.print("number days of stay: "+ numDay);
        System.out.print("\nType room of stay: "+typeRoom);
        System.out.print("\nPrice room of stay: "+priceRoom);
    }
    public double bill(){
        return numDay * priceRoom;
    }
}
