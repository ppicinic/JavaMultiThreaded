public class MyThread implements Runnable {
	private Thread t;

	public MyThread(String name) {
		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 3; i <= 200000; i++) {
			boolean isprime = true;
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				total++;
				// System.out.println(t.getName() + " found prime number: " +
				// i);
			}
		}
		System.out.println(t.getName() + " found " + total + " prime numbers.");
	}

	public void join() {
		try {
			t.join();
		} catch (Exception e) {

		}
	}

}
