package Mariana;

public class Becak {

	private Ban ban;
	public Becak()
	{
		ban = new Ban();
		System.out.println("Konstruktor becak");
	}

	class Ban {
		public Ban()
		{
			System.out.println("Konstruktor ban");
		}
	}

}
