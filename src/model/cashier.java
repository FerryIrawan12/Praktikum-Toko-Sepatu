package model;

import java.util.ArrayList;
import entity.CashierEntity;

public class cashier
{
    private static ArrayList<CashierEntity> DBcasshier = new ArrayList<>();
   
    public static void initialData()
    {
        DBcasshier.add(new CashierEntity("123","123", "123"));
    }

    public static void create(CashierEntity newCasshier)
    {
        DBcasshier.add(newCasshier);
    }

    public static ArrayList<CashierEntity> read(){
        return DBcasshier;
    }

    public static CashierEntity findUsername(String username)
    {
        for (CashierEntity list : read()){
            if (username.equals(list.getUsername())){
                return list;
            }
        }
        return null;
    }
}