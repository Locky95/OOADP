

import javax.swing.*;
public class Store
{
    public static void main(String args[])
    {
        String flavour,type,function;
        Brand brand;
        final int productCode;

        StoreStock store = new StoreStock();


        store.addStock(00001,"Strawberry ", "Protein ", Brand.HPNUTRITION, "Muscle Builder", 17.00f);
        store.addStock(00002,"Chocalate ", "Protein ", Brand.MAXINUTRITION, "Muscle Builder", 22.00f);
        store.addStock(00003,"Sour Apples ", "Creatine ", Brand.MYPROTEIN, "Performance", 12.00f);
        store.addStock(00004,"UnFlavoured ", "Caffeine Tablets ", Brand.PHD, "Fat Loss", 19.00f);

        Supplement supplementWanted = new Supplement();
        brand = Brand.valueOf("select brand");
        supplementWanted.setBrand(brand);

        String y = store.searchBrand(supplementWanted);
        JOptionPane.showMessageDialog(null, y);
    }
}
