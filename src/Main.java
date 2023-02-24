import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produckt produckt1 = new Produckt("apple","sweed",16, LocalDate.of(2023,3,2),Productype.VEGETABLES);
        Produckt produckt2 = new Produckt("Sok","sweed",45, LocalDate.of(2023,3,12),Productype.VEGETABLES);
        Produckt produckt3 = new Produckt("Iphone","10/10",12000, LocalDate.of(2020,3,13),Productype.ELECTRONIC);
        Produckt produckt4 = new Produckt("MacBook","10/10",120000, LocalDate.of(2021,1,3),Productype.ELECTRONIC);
        Produckt produckt5 = new Produckt("Kurtka","10/10",1200, LocalDate.of(2021,1,3),Productype.CLOTHES);
        Produckt produckt6 = new Produckt("Djinsy","10/10",1500, LocalDate.of(2021,1,3),Productype.CLOTHES);

        Produckt[] produckts={produckt1,produckt2,produckt3,produckt4,produckt5,produckt6};

        Inventory inventory = new Inventory(produckts);
        //inventory.findProductByName(new Scanner(System.in).nextLine());
        inventory.findProductByProduct(Productype.VEGETABLES);
        //inventory.electronies(LocalDate.of(2023,8,22));
        //inventory.vegetabls(LocalDate.of(2023,3,11));

        }
    }
