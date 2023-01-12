package model;

import java.util.ArrayList;
import entity.CashierEntity;

public class cashier
{
    private static ArrayList<CashierEntity> DBcasshier = new ArrayList<>();
    private static CashierEntity casshier=null;

    public static void initialData()
    {
        DBcasshier.add(new CashierEntity("ferry","admin", "admin"));
    }

    public static void create(CashierEntity newCasshier)
    {
        DBcasshier.add(newCasshier);
    }

    public static ArrayList<CashierEntity> read(){
        return DBcasshier;
    }

    public static CashierEntity getCashier(){
        return casshier;
    }

    public static void setCashier(CashierEntity data)
    {
        cashier.casshier=data;
    }
}