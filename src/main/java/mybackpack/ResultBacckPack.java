package mybackpack;

import java.util.ArrayList;
import java.util.List;

public class ResultBacckPack {
    public static double backpackMaxWeigth = 2.0; // укажем размер рюкзака
    public static List<ItemBackpack> resultItemInBackpak(){
        List<ItemBackpack> itemBackpacks = new ArrayList<>();
        itemBackpacks.add(new ItemBackpack("Ноутбук", 1, 120000));
        itemBackpacks.add(new ItemBackpack("PowerBank", 0.3, 3000));
        itemBackpacks.add(new ItemBackpack("Книга", 0.4, 800));
        itemBackpacks.add(new ItemBackpack("Компас", 0.005, 600));
        itemBackpacks.add(new ItemBackpack("Смартфон", 0.3, 20000));
        itemBackpacks.add(new ItemBackpack("Зажигалка", 0.005, 50));
        itemBackpacks.add(new ItemBackpack("Термос(чай)", 1.3, 1000));
        // выведем список предметов
        System.out.println("Всего имеется " +itemBackpacks.stream().count() + " предметов:");
        for (int i = 0; i < itemBackpacks.stream().count(); i++) {
            System.out.printf(itemBackpacks.get(i) + "\n");
        }
        Backpack backpack = new Backpack(backpackMaxWeigth);
        backpack.makeAllSets(itemBackpacks);//создаем все наборы перестановок значений
        return backpack.getBestItems();// возвращаем лучший результат
    }
}
