package lld.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite — contains items or categories and delegates recursively
public class MenuCategoryComposite implements MenuItem {
    private String name;
    private List<MenuItem> list;

    public MenuCategoryComposite(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(MenuItem menuItem) {
        list.add(menuItem);
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
        for (MenuItem menuItem : list)
            menuItem.display();
    }
}
