import java.time.LocalDate;

public interface SearchAble {
    String  findProductByName(String name);
    String findProductByProduct(Productype productype);
    LocalDate vegetabls(LocalDate vegetabls);
    LocalDate electronies(LocalDate electronies);

}
