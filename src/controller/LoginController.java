package controller;
import model.cashier;
import entity.CashierEntity;
import abstraction.CasshierInterface;

public class LoginController implements CasshierInterface 
{ 
    @Override
    public boolean loginProcces(String username, String password) {
       for (CashierEntity list : cashier.read()){
        if (username.equals(list.getUsername())){
            if (password.equals(list.getPassword())){
             
                return true;
            }
        }
       }
       return false;
    }
}
