
import java.util.Iterator;
import java.util.LinkedList;

public class StoreStock{
 	
 	private LinkedList<Supplement> stock = new LinkedList<Supplement>();

	Brand brand;
 	
 	public StoreStock()
 	{

 	}
 	public void addStock(final int ProductCode,String Flavour,String Type,Brand Brand,String Function, double price)
 	{
 		Supplement supplement = new Supplement(ProductCode, Flavour, Type, Brand, Function, price);
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
			if(a.getBrand() == wantedBrand.getBrand())
			{
				x = "" + a.toString();
				return x;
			}
		}
		return x;

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