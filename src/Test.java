
public class Test
{
    public static void main(String[] args)
    {
	Lampe Malampe = new Lampe();
	System.out.println(Malampe.getpuissance());
	System.out.println(Malampe.getestallumee());
	
	if (Malampe.estAllumee)
	{
	    Malampe.eteindre();
	}
	else
	{
	    Malampe.allumee();
	}
	System.out.println(Malampe.getpuissance());
	System.out.println(Malampe.getestallumee());


    }

}
