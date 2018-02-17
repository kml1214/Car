public class Car{
	
	private String brand;
	private int year;
	private int mileage;

	public Car(){
		brand = "";
		year = 0;
		mileage = 0;
	}

	public String getBrand()
	{
		return brand;
	}

	public int getYear()
	{
		return year;
	}

	public int getMileage()
	{
		return mileage;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}

	public String toString()
	{
		return ("Brand: " + brand + "/nYear: " + year + "/nMileage" + mileage);
	}

}