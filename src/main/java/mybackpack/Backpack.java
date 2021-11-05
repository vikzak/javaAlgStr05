package mybackpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<ItemBackpack> bestItemBackpacks = null;
    private double maxWeigth; // максимальный вес
    private double bestPrice; // дорогие товары

    public Backpack(double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    public List<ItemBackpack> getBestItems() {
        return this.bestItemBackpacks;
    }

    // метод вычисляет общий вес списка предметов
    private double calcWeigth(List<ItemBackpack> itemBackpacks) {
        double result = 0;
        for (ItemBackpack itemBackpack : itemBackpacks) {
            result += itemBackpack.getWeigthItem();
        }
        return result;
    }

    // метод вычисляет общую стоимость списка предметов
    private double calcPrice(List<ItemBackpack> itemBackpacks) {
        double result = 0;
        for (ItemBackpack itemBackpack : itemBackpacks) {
            result += itemBackpack.getPriceItem();
        }
        return result;
    }

    // проверка, является ли данный набор лучшим решением задачи
    private void checkSet(List<ItemBackpack> itemBackpacks) {
        if (this.bestItemBackpacks == null) {
            if (this.calcWeigth(itemBackpacks) <= this.maxWeigth) {
                this.bestItemBackpacks = itemBackpacks;
                this.bestPrice = this.calcPrice(itemBackpacks);
            }
        } else {
            if (this.calcWeigth(itemBackpacks) <= this.maxWeigth && this.calcPrice(itemBackpacks) > this.bestPrice) {
                this.bestItemBackpacks = itemBackpacks;
                this.bestPrice = this.calcPrice(itemBackpacks);
            }
        }
    }

    // создание всех наборов перестановок значений
    public void makeAllSets(List<ItemBackpack> itemBackpacks) {
        if (itemBackpacks.size() > 0) {
            this.checkSet(itemBackpacks);
        }
        for (int i = 0; i < itemBackpacks.size(); i++) {
            List<ItemBackpack> newSet = new ArrayList<>(itemBackpacks);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

}
