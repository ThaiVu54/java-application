import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
//        Person person1 = new Person("1019084092","ádad","ádas");
//        person1.displayInfoClient();

        Scanner sc = new Scanner(System.in);
        int n;
        Hotel hotel;
        ArrayList<Hotel> arrHotel = new ArrayList<>();
        System.out.print("Enter numbers client: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            hotel = new Hotel();
            System.out.println("Enter info client " + (i + 1) + "-------");
            hotel.InputInfoManage();
            arrHotel.add(hotel);
        }

        for (int i = 0; i < arrHotel.size(); i++) {
            System.out.println("\nInfo client " + (i + 1) + ": ");
            arrHotel.get(i).displayInfoManage();
        }

        System.out.println("\nEnter identity card client return room: ");
        String tim = sc.nextLine();
        for (int i = 0; i < arrHotel.size(); i++) {
            if (arrHotel.get(i).getPerson().getNumCMND().equalsIgnoreCase(tim)) {
                System.out.println("room money of client = " + arrHotel.get(i).bill());
            }
        }
    }
}
