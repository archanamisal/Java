// 4----- type anonymous inner class
//[[used to handle events]]

public class AnonymousInner {

	public static void main(String[] args) {
		Runnable r=new Runnable()
		{
			public void run()
			{

				System.out.println( "First Run method called ! ! !");
			}

		};

		r.run();

		Runnable r2=new Runnable()
		{

			public void run()
			{
				System.out.println( "Second Run method called ! ! !");

			}
		};
		r2.run();

	}
}
