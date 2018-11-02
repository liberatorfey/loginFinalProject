
import java.util.*;
import javax.swing.*;

public class MainpageService {

    static String imageLocation;

    public static ArrayList<Product> showAllProduct() {
        return ProductDao.getAllProducts();
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }

    static void getinfo() {
        ArrayList<Product> product = MainpageService.showAllProduct();
        int i = 0;
        for (Product e : product) {
            Product product1 = MainpageService.getProduct(e.getId());
            if (i == 0) {
                MainPage.x10.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon("D:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\chelsea-shirt.png");
                MainPage.x1.setIcon(icon);
            } else if (i == 1) {
                MainPage.x11.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon("D:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\sweatershirt.png");
                MainPage.x2.setIcon(icon);
            } else if (i == 2) {
                MainPage.x12.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon("D:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\pajamas.png");
                MainPage.x3.setIcon(icon);
            } else if (i == 3) {
                MainPage.x13.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon("D:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\hawaii-shirt.png");
                MainPage.x4.setIcon(icon);
            } else if (i == 4) {
                MainPage.x14.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon("D:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\supernova.png");
                MainPage.x5.setIcon(icon);
            } else if (i == 5) {
                MainPage.x15.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon("D:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\adidas_zne.png");
                MainPage.x6.setIcon(icon);
                break;
            }
            //MainPage.x1.setText(""+product1.getImage());
            i++;
        }

    }
}
