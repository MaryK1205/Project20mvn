import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void testRemoveProduct(){
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(5, "Хлеб", 100);
        Product product2 = new Product(10, "Масло", 200);
        Product product3 = new Product(15, "Соль", 300);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(10);

        Product[] expected = {product1, product3};
        Product[] actual =repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testRemoveProductNotAvaible(){
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(5, "Хлеб", 100);
        Product product2 = new Product(10, "Масло", 200);
        Product product3 = new Product(15, "Соль", 300);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(50);

        Product[] expected = {product1, product3};
        Product[] actual =repo.findAll();



        Assertions.assertArrayEquals(expected, actual);



    }



}
