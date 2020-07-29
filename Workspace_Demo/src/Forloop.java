
public class Forloop {

	public void printGrid()
	{
	   int height=4;
	for ( int row = 1 ; row < height ; row++ )
	   {
	      int width=2;
		// PRINT a row
	      for ( int col = 1 ; col < width ; col++ )
	      {
	         System.out.print( "1" ) ;
	      }
	      // PRINT newline
	      System.out.println( "" ) ;
	   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forloop f=new Forloop();
		f.printGrid();
		

	}

}
