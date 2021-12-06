class RadiusIsNegative extends Exception//自訂例外類別
{
}
class RadiusTooLarge extends Exception
{
}
class CCircle
{
	public double radius;
	public void setRadius(double r)throws RadiusIsNegative,RadiusTooLarge
	{
		if(r<0)
			throw new RadiusIsNegative();
		else if(r>100)
			throw new RadiusTooLarge();
		else
			radius=r;
	}
	public void show()
	{
		System.out.println("area="+3.14*radius*radius);
	}
}
public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir=new CCircle();
		try
		{
			cir.setRadius(-1);
		}
		catch(RadiusTooLarge e)
		{
			System.out.println(e+" throwed");
		}
		catch(RadiusIsNegative e)
		{
			System.out.println(e+"throwed");
		}
	}

}
