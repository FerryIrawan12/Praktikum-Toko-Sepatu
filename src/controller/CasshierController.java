package controller;
import entity.CashierEntity;
import model.cashier;

public class CasshierController {
    
    public CashierEntity findData(String username){
        for (CashierEntity list : cashier.read()){
            if (username.equals(list.getUsername())){
                return list;
            }
        }
        return null;
    }

    public boolean tambahData(String nama,String username,String password){
        if (findData(username)==null){
            cashier.create(new CashierEntity(username, password, username));
            return true;
        }
        return false;
    }
}
