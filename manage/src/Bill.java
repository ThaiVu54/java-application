import java.util.Scanner;

public class Bill{
    private int oldIndex;
    private int newIndex;
    private double moneyToPay;
    private Client client;

    public Bill(){
        super();
    }

    public Bill(int oldIndex, int newIndex, double moneyToPay, Client client) {
        super();
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.moneyToPay = moneyToPay;
        this.client = client;
    }

    public void inputBill(){
        client = new Client();
        client.inputInfoClient();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap chi so cu: ");
            oldIndex = sc.nextInt();
            System.out.print("nhap chi so moi: ");
            newIndex = sc.nextInt();
        }while (newIndex<oldIndex);
        moneyToPay = (double) (newIndex - oldIndex) * 750;
    }

    public void displayBill(){
        client.displayInfoClient();
        System.out.println("Chi so cu: "+oldIndex);
        System.out.println("Chi so moi: "+newIndex);
        System.out.println("so tien phai tra: "+moneyToPay);
    }
}
