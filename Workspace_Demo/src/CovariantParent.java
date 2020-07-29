//covaritant of return type 


public class CovariantParent {

	public Number getObject()
	{
		return new Double(23.5);
		
	}
	
	class Child extends CovariantParent
	{
		public Integer getObject()
		{
			return new Integer(50);
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
