import view.admin.DashBordLogin;
import model.cashier;
public class App {
    public static void main(String[] args) throws Exception {
        dataDummy();
    
       DashBordLogin o=new DashBordLogin();
       o.formLogin();
    }
    public static void dataDummy()
    {
        cashier.initialData();
    }
}
