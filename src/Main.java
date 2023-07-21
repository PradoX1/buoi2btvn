import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập tên hàng nhập kho: ");
            String nameh = sc.nextLine();
            System.out.println(nameh);
            System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
            String birthday = sc.nextLine();
            LocalDate bd= LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            System.out.println(bd);
            System.out.println("Mời bạn nhập thời gian nhập hàng: ");
            String lt = sc.nextLine();
            LocalDateTime lt1= LocalDateTime.parse(lt, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
            System.out.println(lt1);
            System.out.println("Mời bạn nhập thời gian: ");
            String lt2 = sc.nextLine();
            LocalTime lt3= LocalTime.parse(lt2, DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(lt3);
    }
}