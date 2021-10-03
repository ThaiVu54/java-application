import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int numberHouse;
        Bill bill;
        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> clientList = new ArrayList<>();
        System.out.print("nhap so luong ho gia dinh: ");
        numberHouse = sc.nextInt();
        for (int i = 0; i < numberHouse; i++) {
            bill = new Bill();
            System.out.println("nhap thong tin bien lai cua ho gia dinh thu "+(i+1)+": ");
            bill.inputBill();
            clientList.add(bill);
        }
        System.out.println();
        System.out.println("thong tin bien lai cua ho gia dinh ----> ");
        for(int i = 0; i < clientList.size(); i++) {
            System.out.println("\nthong tin bien lai ho gia dinh thu "+(i+1)+": ");
            clientList.get(i).displayBill();
        }
    }
}
