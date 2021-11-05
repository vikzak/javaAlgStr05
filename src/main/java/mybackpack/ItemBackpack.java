package mybackpack;

public class ItemBackpack {
    private String nameItem;
    private double weigthItem;
    private double priceItem;

    public ItemBackpack(String nameItem, double weigthItem, double priceItem) {
        this.nameItem = nameItem;
        this.weigthItem = weigthItem;
        this.priceItem = priceItem;
    }

    public double getWeigthItem() {
        return weigthItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    @Override
    public String toString() {
        return nameItem +  " (вес: " + weigthItem + ", цена: " + priceItem + ")";
    }
}
