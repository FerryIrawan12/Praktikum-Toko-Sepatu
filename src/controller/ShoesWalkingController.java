package controller;

import java.util.ArrayList;

import abstraction.ShoesWalkingInterface;
import entity.ShoesWalkingEntity;
import model.ShoesWalking;

public class ShoesWalkingController extends ShoesWalkingInterface {

    @Override
    public ArrayList<ShoesWalkingEntity> read() {
       return model.ShoesWalking.all();
    }

    public ShoesWalkingEntity findDataById(int id){
      for (ShoesWalkingEntity list : read()){
         if (id==list.getIdShoes()){
            return list;
         }
      }
      return null;
    }

    @Override
    public boolean update(int index) {
         ShoesWalkingEntity find=findDataById(index);

         if (find !=null){
            ShoesWalking.updateByKode(index,find);
            return true;
         }
         return false;
    }

    @Override
    public boolean create(ShoesWalkingEntity data) {
      model.ShoesWalking.create(data);
      return true;
    }

    @Override
    public boolean delete(int index) {
      ShoesWalkingEntity find=findDataById(index);

      if (find!=null){
         ShoesWalking.delete(find);
         return true;
      }
      return false;
    }
}
