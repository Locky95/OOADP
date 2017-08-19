

import javax.swing.*;
public class Store
{
    public static void main(String args[])
    {
        String flavour,type,function;
        Brand brand;
        final int productCode;

        StoreStock store = new StoreStock();
        //adding stock to the stock file

        store.addStock(00001,"Strawberry ", "Protein ", Brand.HPNUTRITION, "Muscle Builder");
        store.addStock(00002,"Chocalate ", "Protein ", Brand.MAXINUTRITION, "Muscle Builder");
        store.addStock(00003,"Sour Apples ", "Creatine ", Brand.MYPROTEIN, "Performance");
        store.addStock(00004,"UnFlavoured ", "Caffeine Tablets ", Brand.PHD, "Fat Loss");

        Supplement supplementWanted = new Supplement();
        //brand = JOptionPane.showInputDialog("select brand? ");
        brand = Brand.valueOf("select brand");
        supplementWanted.setBrand(brand);

        String y = store.searchBrand(supplementWanted);
        JOptionPane.showMessageDialog(null, y);
    }
}
