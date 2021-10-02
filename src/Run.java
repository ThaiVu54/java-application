import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
//        Person person1 = new Person("1019084092","ádad","ádas");
//        person1.displayInfoClient();

        Scanner sc = new Scanner(System.in);
        int n;
        Hotel person;

        //todo toa mang chua danh sach thong tin khach tro
        ArrayList<Hotel> personList = new ArrayList<>();
        System.out.print("Enter quantity client: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            person = new Hotel();
            System.out.println("Enter info client " + (i + 1) + "-------");
            person.InputInfoManage();
            personList.add(person);
        }

        //todo hien thi danh sach khach
        for (int i = 0; i < personList.size(); i++) {
            System.out.println("\nInfo client " + (i + 1) + ": ");
            personList.get(i).displayInfoManage();
        }

        //todo tinh tien phong khi khach trả phòng
        System.out.println("\nEnter identity card client return room: ");
        String tim = sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPerson().getNumCMND().equalsIgnoreCase(tim)) {
                System.out.println("room money of client = " + personList.get(i).bill());
            }
        }
    }
}
