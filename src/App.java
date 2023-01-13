import view.admin.DasBoardRegister;
import view.admin.DashBordLogin;
import model.cashier;
public class App {
    public static void main(String[] args) throws Exception {
        dataDummy();
        // new DashBordLogin();
        new DasBoardRegister();
    }
    public static void dataDummy()
    {
        cashier.initialData();
    }
}
