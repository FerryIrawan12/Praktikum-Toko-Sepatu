package view.Shoes.ShoesWalking;

import java.util.Scanner;

import controller.ShoesWalkingController;
import entity.ShoesWalkingEntity;

public class AddDataShoesWalking {
    private Scanner in=new Scanner(System.in);
    private ShoesWalkingController _ShoesWalkingC=new ShoesWalkingController();

    public void insertData()
    {
        String ShoesName;
        String ShoesSize;
        String ShoesType;
        int ShoesPrice;
        int ShoesId;

        System.out.println("-----ADD Data Walking Shoes-----");

        System.out.print("In Shoes Name  : ");
        ShoesName=in.nextLine();
        System.out.print("In Shoes Size  : ");
        ShoesSize=in.nextLine();
        System.out.print("In Shoes Price : ");
        ShoesPrice=in.nextInt();
        System.out.print("In Shoes Type  :");
        ShoesType=in.nextLine();
        System.out.print("In Shoes Id    :");
        ShoesId=in.nextInt();

        ShoesWalkingEntity shoesData=new ShoesWalkingEntity(ShoesName, ShoesSize, ShoesPrice, ShoesId, ShoesType);
        boolean cek=_ShoesWalkingC.create(shoesData);

        if (cek==true)
        {
            System.out.println("Data Accepted");
        }



    }
}
