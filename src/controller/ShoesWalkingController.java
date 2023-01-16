package controller;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import abstraction.ShoesWalkingInterface;
import entity.ShoesWalkingEntity;
import model.ShoesWalking;

public class ShoesWalkingController extends ShoesWalkingInterface {
   

   @Override
   public ArrayList<ShoesWalkingEntity> read() {
      return ShoesWalking.read();
   } 

   @Override
   public void create(String shoesName, String shoesSize, int priceShoes ,String shoesType) {
      ShoesWalkingEntity shEntity=new ShoesWalkingEntity();
      shEntity.setShoesName(shoesName);
      shEntity.setShoesSize(shoesSize);
      shEntity.setPriceShoes(priceShoes);
      shEntity.setShoesType(shoesType);
      ShoesWalking.create(shEntity);
   }

   @Override
   public void update(int index,String shoesName, String shoesSize, int priceShoes ,String shoesType) {
      ShoesWalkingEntity shEntity=new ShoesWalkingEntity();
      shEntity.setShoesName(shoesName);
      shEntity.setShoesSize(shoesSize);
      shEntity.setPriceShoes(priceShoes);
      shEntity.setShoesType(shoesType);
      ShoesWalking.update(index, shEntity);
   }

   @Override
   public void delete(int index) {
      ShoesWalking.delete(index);
   }


   @Override
   public ShoesWalkingEntity getIndexDB_ShoesWalking(int index) {
     return ShoesWalking.read().get(index);
   }
}
