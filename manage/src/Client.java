import java.util.Scanner;

public class Client {
    private String name;
    private String numberHouse;
    private int codeMeter;

    public Client() {
        super();
    }

    public Client(String name, String numberHouse, int codeMeter) {
        super();
        this.name = name;
        this.numberHouse = numberHouse;
        this.codeMeter = codeMeter;
    }

    public void inputInfoClient(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu ho: ");
        name = sc.nextLine();
        System.out.print("Nhap so nha: ");
        numberHouse = sc.nextLine();
        System.out.print("Nhap ma cong to: ");
        codeMeter = sc.nextInt();
    }
    public void displayInfoClient(){
        System.out.println("ten chu ho: "+ name);
        System.out.println("so nha: "+ numberHouse);
        System.out.println("ma so cong to: "+codeMeter);
    }
}
