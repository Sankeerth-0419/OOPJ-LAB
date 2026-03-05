package p1;
public class Derived extends Protection
{
	public Derived()
	{
		System.out.println("derived construction");
		System.out.println("n= "+n);
		//class only
		// System.out.println("n_priv ="4+n_priv);
		System.out.println("n_pro ="+n_pro);
		System.out.println("n_pub = "+n_pub);
	}
}
