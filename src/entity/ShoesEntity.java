package entity;

public abstract class ShoesEntity
{
    private String ShoesName;
    private String ShoesSize;
    private int PriceShoes;
    private int idShoes;

    public ShoesEntity(String shoesName, String shoesSize, int priceShoes, int idShoes) {
        ShoesName = shoesName;
        ShoesSize = shoesSize;
        PriceShoes = priceShoes;
        this.idShoes = idShoes;
    }

    public String getShoesName() {
        return ShoesName;
    }

    public String getShoesSize() {
        return ShoesSize;
    }

    public int getPriceShoes() {
        return PriceShoes;
    }

    public void setShoesName(String shoesName) {
        ShoesName = shoesName;
    }

    public void setShoesSize(String shoesSize) {
        ShoesSize = shoesSize;
    }

    public void setPriceShoes(int priceShoes) {
        PriceShoes = priceShoes;
    }

    public int getIdShoes() {
        return idShoes;
    }

    public void setIdShoes(int idShoes) {
        this.idShoes = idShoes;
    }

}