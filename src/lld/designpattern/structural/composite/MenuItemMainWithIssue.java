package lld.designpattern.structural.composite;

import java.math.BigDecimal;

public class MenuItemMainWithIssue {

    MenuItemImp prigles = new MenuItemImp("Prigles", new BigDecimal(5));

    MenuItemImp coke = new MenuItemImp("Coke", new BigDecimal(5));
    MenuItemImp pespi = new MenuItemImp("Pespi", new BigDecimal(5));

    // grouping is the issue

}
