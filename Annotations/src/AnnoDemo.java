// step 1 : Create 
//step 2: Apply
//step 3: Get(using Reflections possible)
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@SuppressWarnings("unused")

//@Target(ElementType.FIELD)
//@Target(ElementType.CONSTRUCTOR)
//@Target(ElementType.PACKAGE)
//@Target(ElementType.METHOD) //element restriction
@Inherited
@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.SOURCE)
	@Documented
	@interface MyAnno
	{
	String name();
	int age();
	}
	@MyAnno (name="Kumar", age=30) //annotation created and applied on class
	public class AnnoDemo
	{
	int num1,num2;
	@MyAnno (name="Tushar", age=35) //applied on constructor
	public AnnoDemo()
	{
		System.out.println("Constructor ! ! !");
	}
	@MyAnno (name="Kiran", age=40) //applied on method
	public void display()

	{
		System.out.println("Display Called ! ! !");
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@SuppressWarnings(value={"rawtypes","unchecked"})
	public static void main(String[] args) {
		//AnnoDemo a=new AnnoDemo();
		//a.display();
		Derived d=new Derived();
		//@SuppressWarnings("rawtypes")
		Class cs=d.getClass();
		//@SuppressWarnings("unchecked")
		Annotation a=cs.getAnnotation(MyAnno.class);
		System.out.println(a);
	}
}
class Derived extends AnnoDemo
{	@Deprecated	//strike through or use another method or the better/higher version features
	public void show()
{
	System.out.println("Show Called ! ! !");
}
}




