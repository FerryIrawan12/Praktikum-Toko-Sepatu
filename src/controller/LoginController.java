package controller;
import model.cashier;
import entity.CashierEntity;
import abstraction.CasshierInterface;

public class LoginController implements CasshierInterface 
{ 
    @Override
    public boolean loginProcces(String username, String password) {
      CashierEntity find=cashier.findUsername(username);

      if (find!=null){
        if (password.equals(find.getPassword())){
            return true;
        }
      }
      return false;
    }

    
}
