
public class StaticExam {

	
	     int nonStaticVariable;
	     static int staticVariable;
	 
	     static void staticMethod()
	     {
	          System.out.println(staticVariable);
	     //   System.out.println(nonStaticVariable);
	     }
	 
	     void nonStaticMethod()
	     {
	          System.out.println(staticVariable);
	          System.out.println(nonStaticVariable);
	     }
	}
	 
	class MainClass
	{
	     public static void main(String[] args)
	     {
	          StaticExam.staticVariable = 10;
	     //   StaticExam.nonStaticVariable = 10;
	          StaticExam.staticMethod();
	    //   StaticExam.nonStaticMethod();
	 
	          StaticExam a1 = new  StaticExam();
	          StaticExam a2 = new  StaticExam();
	 
	          System.out.println(a1.nonStaticVariable);
	          System.out.println(a1.staticVariable);
	          a1.nonStaticMethod();
	          a1.staticMethod();
	 
	          System.out.println(a2.staticVariable);
	          a1.staticVariable = 20;
	          System.out.println(a2.staticVariable);
	     }
	}

