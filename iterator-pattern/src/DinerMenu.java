public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOffItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles","Waffles, with your choice of blueberries of strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOffItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add items to menu");
        } else {
            menuItems[numberOffItems] = menuItem;
            numberOffItems = numberOffItems +1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
