
import javax.swing.ImageIcon;

public class ProductDetailService {

    static String blue = "น้ำเงิน";
    static String gray = "เทา";
    static String red = "แดง";
    static String brown = "น้ำตาล";
    static String pink = "ชมพู";
    static String black = "ดำ";

    public static void showProductDetail() {
        ProductDetailFrame productdetail = new ProductDetailFrame();
        productdetail.setVisible(true);
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }

    public static String changeEngtoThaiColor(String color) {
        if (color.equals("blue")) {
            return blue;
        } else if (color.equals("gray")) {
            return gray;
        } else if (color.equals("red")) {
            return red;
        } else if (color.equals("brown")) {
            return brown;
        } else if (color.equals("pink")) {
            return pink;
        }
        return black;
    }

    public static void getDetailProduct(String pid) {
        Product product1 = getProduct(pid);
        String setcolor = changeEngtoThaiColor(product1.getColor());
        getSize(product1.getSize());
        getPicture(pid);
        getBand(product1.getBrand());
        getPrice(product1.getPrice());
        ProductDetailFrame.nameproduct.setText(product1.getName().toUpperCase());
        ProductDetailFrame.colortxt.setText(setcolor);

    }

    public static void getBand(String band) {
        ProductDetailFrame.bandtxt.setText(band);

    }

    public static void getSize(String size) {
        ProductDetailFrame.sizetxt.setText(size);

    }

    public static void getPrice(int price) {
        ProductDetailFrame.pricetxt.setText("" + price);

    }

    public static void getPicture(String pid) {
        if (pid.equals("S01")) {
            ImageIcon icon = new ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\chelsea-shirt.png");
            ProductDetailFrame.pic1.setIcon(icon);
        } else if (pid.equals("S02")) {
            ImageIcon icon = new ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\sweatershirt.png");
            ProductDetailFrame.pic1.setIcon(icon);
        } else if (pid.equals("S03")) {
            ImageIcon icon = new ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\pajamas.png");
            ProductDetailFrame.pic1.setIcon(icon);
        } else if (pid.equals("S04")) {
            ImageIcon icon = new ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\hawaii-shirt.png");
            ProductDetailFrame.pic1.setIcon(icon);
        } else if (pid.equals("S05")) {
            ImageIcon icon = new ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\supernova.png");
            ProductDetailFrame.pic1.setIcon(icon);
        } else if (pid.equals("S06")) {
            ImageIcon icon = new ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\adidas_zne.png");
            ProductDetailFrame.pic1.setIcon(icon);
        }
    }

}
