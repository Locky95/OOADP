
 
 public class Supplement {

 	 int ProductCode;
	 double price;
 	 String Flavour, Type, Function;
	 Brand brand;

 	public Supplement()
	{

	}
 	public Supplement(int ProductCode, String Flavour, String Type, Brand Brand, String Function,double price)
 	{
 		setProductCode(ProductCode);
 		setFlavour(Flavour);
 		setType(Type);
 		setBrand(Brand);
 		setFunction(Function);
		setPrice(price);
 	}
 	
 	public void setProductCode(int ProductCode)
 	{
 		this.ProductCode = ProductCode;
 	}
 	public void setFlavour(String Flavour)
 	{
 		this.Flavour = Flavour.toUpperCase();
 	}
 	public void setType(String Type)
 	{
 		this.Type = Type.toUpperCase();
 	}
 	public void setBrand(Brand Brand)
 	{
 		this.brand = Brand;
 	}
 	public void setFunction(String Function)
 	{
 		this.Function = Function.toUpperCase();
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

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }
 }


