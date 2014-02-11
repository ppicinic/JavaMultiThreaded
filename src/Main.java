
public class Main {
	
	public static void main(String args[]){
		MyThread threads[] = new MyThread[8];
		for(int i = 0; i < threads.length; i++){
			String name = "Thread #" + i;
			threads[i] = new MyThread(name);
		}
		for(int i = 0; i < threads.length; i++){
			threads[i].join();
		}
		System.out.println("Main thread closing.");
	}
}