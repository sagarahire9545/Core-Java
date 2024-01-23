package innercClasses_learning;


abstract class Anno{
	void show() {
		System.out.println("show method.");
	}
	
	abstract void disp();
	abstract void run();
}

class Extending extends Anno{

	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp method");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}
	
}
public class ExpAnnonym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extending e = new Extending();
		e.disp();
		e.show();
		e.run();
		
		Anno ano = new Anno() {

			@Override
			void disp() {
				// TODO Auto-generated method stub
				System.out.println("disp method using annonymous.");
			}

			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("run method using annonymous.");
			}
		};
		ano.disp();
		ano.run();
		ano.show();
	}

	

}
