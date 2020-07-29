class PreGenn<T>
	{
		T o;
		public PreGenn(T o)
		{
			this.o=o;
		}
		public T getObj()
		{

			return o;
		}
		public static void display(PreGenn<?>p)
		{
			System.out.println(p.getObj());

		}

	public static void main(String[] args)
	{
		PreGenn<Integer> p=new PreGenn<>(new Integer(100));
	
		
		//Integer i=p.getObj();
		
		PreGenn<String> p2=new PreGenn<>("Hello ! ! !");
		//String s=p2.getObj();
		
		PreGenn.display(p2);
		PreGenn.display(p);

	}

}