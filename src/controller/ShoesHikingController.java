package controller;

import java.util.ArrayList;

import abstraction.ShoesHikingInterface;
import entity.ShoesHikingEntity;
import model.ShoesHiking;

public class ShoesHikingController extends ShoesHikingInterface {

    @Override
    public ArrayList<ShoesHikingEntity> read() {
        return ShoesHiking.read();
    } 

    @Override
    public void create(String shoesName, String shoesSize, int priceShoes, int shoesWeight) {
      ShoesHikingEntity shEntity=new ShoesHikingEntity();
      shEntity.setShoesName(shoesName);
      shEntity.setShoesSize(shoesSize);
      shEntity.setPriceShoes(priceShoes);
      shEntity.setShoesWeight(shoesWeight);
      ShoesHiking.create(shEntity);
    }

    @Override
    public void update(int index, String shoesName, String shoesSize, int priceShoes,int shoesWeight) {
      ShoesHikingEntity shEntity=new ShoesHikingEntity();
        shEntity.setShoesName(shoesName);
        shEntity.setShoesSize(shoesSize);
        shEntity.setPriceShoes(priceShoes);
        shEntity.setShoesWeight(shoesWeight);
        ShoesHiking.update(index, shEntity);
    }

    @Override
    public void delete(int index) {
    ShoesHiking.delete(index);
    }

    @Override
    public ShoesHikingEntity getIndexDB_ShoesHiking(int index) {
      return ShoesHiking.read().get(index);
    }
    
}
