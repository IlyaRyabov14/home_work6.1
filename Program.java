public class Program {
    private static void ShowProducts(Product[] all){
        for (Product product : all){
            System.out.println(product);
            System.out.println("----");
        }
    }

    public static void main(String[] args) {
        Product milk = new Milk("Простоквашино", 70, 6, "Литр", "6 месяцев", 2);
        Product limonade = new Drinks("Coca Cola", 80, 10, "Литр", 2);
        Product bread = new Bread("Бородинский", 50, 1, "шт.", "3 дня", "1 сорт");
        Product eggs = new Eggs("Тридевятое", 82, 10, "шт.", "3 недели", 10);
        Product masks = new Masks("Чистая линия", 455, 12, "шт", 12);
        Product pappare = new ToiletPappar("Zeva", 112, 56, "шт.", 12, 2);
        Product diapers = new Diapers("Gool", 1112, 56, "шт.", 2, "да", 12, 5, 7, "Дышащий");
        Product nipple = new Nipple("Соска", 134, 1, "шт.", 1, "да");
        
        Product[] all = new Product[]{milk, limonade, bread, eggs, masks, pappare, diapers, nipple};

        ShowProducts(all);
    }
}