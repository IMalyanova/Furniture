import java.util.ArrayList;
import java.util.Collections;

public class Loader {
    public static void main(String[] args) {
        ArrayList<Furniture> furnitures = new ArrayList<>();
        addFurnitures(furnitures);
        Collections.sort(furnitures);

        for (Furniture element: furnitures){
            element.info();
        }

    }

    private static void addFurnitures(ArrayList<Furniture> furnitures) {

        furnitures.add(new Table(20_000,1000));
        furnitures.add(new Chair(1200,400));
        furnitures.add(new Chair(1200,400));
        furnitures.add(new Chair(1600,500));
        furnitures.add(new Table(40_000,1200));
        furnitures.add(new Chair(1700,500));
        furnitures.add(new Table(40_000,900));
        furnitures.add(new Chair(1600,550));
        furnitures.add(new Chair(1200,400));
    }

}
