import java.util.ArrayList;

public class Loot {














    public static void main(String[] args) {
        ArrayList<ThiefLoot>list  = new ArrayList<>();

        ThiefLoot loot = new ThiefLoot();
        loot.setValue(100);
        loot.setWeight(10);

        ThiefLoot loot1 = new ThiefLoot();
        loot.setValue(100);
        loot.setWeight(10);

        ThiefLoot loot2 = new ThiefLoot();
        loot.setValue(100);
        loot.setWeight(10);

        list.add(loot1);
        list.add(loot2);
//        list.add(loot3);

    }
}
