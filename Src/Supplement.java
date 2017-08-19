/*class for my project, should be for each different type of supplement
 *each instance of the class should have a product code, flavour, name, brand and function
 *ie. "123456, Chocalate, protein, HpNutrition, MuscleBuilder" */
 
 public class Supplement {
 	//each item will have a product code unique to that product
	//each supplement will have a flavour
	//there will be different types of supplements ie. fat burners,weight gainers, creatine, protein powders
	//different supplements will serve different functions ie. Muscle building, Weight Loss, Performance etc etc
 	int ProductCode;
 	String Flavour, Type, Function;
	 Brand brand;

 	public Supplement()
	{

	}
 	public Supplement(int ProductCode, String Flavour, String Type, Brand Brand, String Function)
 	{
 		setProductCode(ProductCode);
 		setFlavour(Flavour);
 		setType(Type);
 		setBrand(Brand);
 		setFunction(Function);
 	}
 	
 	public void setProductCode(int ProductCode)
 	{
 		this.ProductCode = ProductCode;
 	}
 	public void setFlavour(String Flavour)
 	{
 		this.Flavour = Flavour;
 	}
 	public void setType(String Type)
 	{
 		this.Type = Type;
 	}
 	public void setBrand(Brand Brand)
 	{
 		this.brand = Brand;
 	}
 	public void setFunction(String Function)
 	{
 		this.Function = Function;
 	}

 	public int getProductCode()
 	{
 		return ProductCode;
 	}
 	public String getFlavour()
 	{
 		return Flavour;
 	}
 	public String getType()
 	{
 		return Type;
 	}
 	public Brand getBrand()
 	{
 		return brand;
 	}
 	public String getFunction()
 	{
 		return Function;
 	}
 }


