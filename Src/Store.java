

import javax.swing.*;
public class Store
{
    public static void main(String args[])
    {
        String flavour,brand,type,function;
        int productCode;

        StoreStock store = new StoreStock();
        //adding stock to the stock file

        store.addStock(00001,"Strawberry ", "Protein ", " MaxiNutrition", "Muscle Builder");
        store.addStock(00002,"Chocalate ", "Protein ", " MyProtein", "Muscle Builder");
        store.addStock(00003,"Sour Apples ", "Creatine ", " Optinimum Nutrition", "Performance");
        store.addStock(00004,"UnFlavoured ", "Caffeine Tablets ", " MaxiNutrition", "Fat Loss");

        Supplement supplementWanted = new Supplement();
        brand = JOptionPane.showInputDialog("select brand? ");
        supplementWanted.setBrand(brand);

        String y = store.searchBrand(supplementWanted);
        JOptionPane.showMessageDialog(null, y);
    }
}
