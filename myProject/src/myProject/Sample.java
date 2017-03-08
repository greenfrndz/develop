package myProject;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Start");
		Sample s=new Sample();
		s.play();
	}
	public void play(){
		System.out.println("playing...");
	}
	
	public void run(){
		System.out.println("running....");
	}
	public void walk(){
		System.out.println("walking...");
	}
	
	public void jump(){
		System.out.println("jumping...");
	}
	
	public String getStr(){
		return "name";
	}
}
