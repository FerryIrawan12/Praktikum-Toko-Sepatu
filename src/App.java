import view.admin.DasBoardRegister;
import view.admin.DashBordLogin;
import controller.view_controller;
import model.cashier;
public class App {
    public static void main(String[] args) throws Exception {
        dataDummy();
      
        new view_controller().toLogin();
    }
    public static void dataDummy()
    {
        cashier.initialData();
    }
}
