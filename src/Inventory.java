import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Inventory implements SearchAble {
    private Produckt[] produckts;

    public Inventory(Produckt[] produckts) {
        this.produckts = produckts;
    }

    public Produckt[] getProduckts() {
        return produckts;
    }

    public void setProduckts(Produckt[] produckts) {
        this.produckts = produckts;
    }

    @Override
    public String findProductByName(String name) {
        for (Produckt a: produckts){
            if(a.getName().equals(name)){
                System.out.println(a);
            }
        }
        return name;
    }

    @Override
    public String findProductByProduct(Productype productype) {
        for (Produckt b: produckts){
            if (b.getProductype().equals(productype)){
                System.out.println(b.toString());
            }
        }
        return "uspeshno";
    }

    @Override
    public LocalDate vegetabls(LocalDate vegetabls) {
        int s = Period.between(vegetabls,LocalDate.now()).getDays();
        if (s<=10) {
            System.out.println(s);
        } else {
            System.out.println("Prosrocheniy");
        }
        return vegetabls;
    }

    @Override
    public LocalDate electronies(LocalDate electronies) {
        int a = Period.between(electronies,LocalDate.now()).getMonths();
        if (a<6){
            System.out.println("50% skidka");
        }
        return null;
    }

    @Override
    public String toString() {
        return "produckts: " + Arrays.toString(produckts);
    }
}
