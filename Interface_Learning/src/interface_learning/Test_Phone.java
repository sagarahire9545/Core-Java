package interface_learning;

class Phone
{
	public void call()
	{
		System.out.println("Calling");
	}
	public void sms()
	{
		System.out.println("sms");
	}
	
}

interface Camera
{
	public void click();
	
	public void record();
	
}

interface MusicPlayer
{
	public void play();
	
	public void pause();
	
}

class Smartphone extends Phone implements Camera,MusicPlayer
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("paly");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
		System.out.println("click");
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		
		System.out.println("record");
	}
	
}
public class Test_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone p=new Smartphone();
		p.call();
		p.click();
		p.play();
		p.pause();
		p.sms();
		p.record();

	}

}
