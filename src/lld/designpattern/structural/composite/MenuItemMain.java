package lld.designpattern.structural.composite;

import java.math.BigDecimal;

// Client — assembles and uses the pattern
public class MenuItemMain {

    public static void main(String[] args) {
        MenuCategoryComposite chipsMenuCategoryComposite = new MenuCategoryComposite("Chips");
        MenuItem pringles = new MenuItemImp("Pringles", new BigDecimal(5));
        chipsMenuCategoryComposite.add(pringles);

        MenuCategoryComposite drinksMenuCategoryComposite = new MenuCategoryComposite("Drinks");
        MenuItem coke = new MenuItemImp("Coke", new BigDecimal(5));
        MenuItem pepsi = new MenuItemImp("Pepsi", new BigDecimal(5));
        drinksMenuCategoryComposite.add(coke);
        drinksMenuCategoryComposite.add(pepsi);

        MenuCategoryComposite kioskMenuComposite = new MenuCategoryComposite("Menu");
        kioskMenuComposite.add(chipsMenuCategoryComposite);
        kioskMenuComposite.add(drinksMenuCategoryComposite);

        kioskMenuComposite.display();


    }
}
