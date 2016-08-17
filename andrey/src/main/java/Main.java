/**
 * @author Andrey Telegin
 *         <p>The program creates an array of 10 objects (10 big companies).
 *         Sorts them by the profit, assets, Forbes List index and name.
 *         Prints the sorted data in a table.</p>
 *         <p>All the data is real and it corresponds to a
 *         <a href = "http://forbes.net.ua/ratings/3">Forbes report</a> data on top 200 Ukraine companies as of 2015.
 *         The numbers in profit, assets are in mlns. UAH</p>
 */
public class Main {
    public static void main(String[] args) {
        CompanyProc cProc = new CompanyProc();
        cProc.start();
    }
}