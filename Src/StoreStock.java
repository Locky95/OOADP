/* A stock file class to act like an inventory,
 * all the items that are in the supplement store are in it
 * itll be used to search for an item that the customer is searching for
 */
import java.util.Iterator;
import java.util.LinkedList;

public class StoreStock{
 	
 	private LinkedList<Supplement> stock = new LinkedList<Supplement>();
 	
 	public StoreStock()
 	{

 	}
 	public void addStock(int ProductCode,String Flavour,String Type,String Brand,String Function)
 	{
 		Supplement supplement = new Supplement(ProductCode, Flavour, Type, Brand, Function);
		stock.add(supplement);
 	}

 	public Supplement searchStock(Supplement wantedStock)
	{
		for(Supplement a:stock)
		{
			if(a.getProductCode() == wantedStock.getProductCode())
			{
				return a;
			}
		}
		return null;
	}
	public String searchFlavour(Supplement wantedFlavour)
	{
		String x = "";
		for(Supplement a:stock)
		{
			if(a.getFlavour().equals(wantedFlavour.getFlavour()))
			{
				x = "" + a.toString();
				return x;
			}
		}
		return "Supplement Flavour not Found";
	}
	public String searchBrand(Supplement wantedBrand)
	{
		String x = "";

		for(Supplement a:stock)
		{
			if(a.getBrand().equals(wantedBrand.getBrand()))
			{
				x = "" + a.toString();
				return x;
			}
		}
		return x;
		//return "Brand of Supplement not Found";
	}
	public String searchType(Supplement wantedType)
	{
		String x = "";
		for(Supplement a:stock)
		{
			if(a.getType().equals(wantedType.getType()))
			{
				x = "" + a.toString();
				return x;
			}
		}

		return "Type of Supplement not Found";
	}
	public String searchFunction(Supplement wantedFunction)
	{
		String x = "";
		for(Supplement a:stock)
		{
			if(a.getFunction().equals(wantedFunction.getFunction()))
			{
				x = "" + a.toString();
				return x;
			}
		}

		return "Type of Function not Found";
	}

 }