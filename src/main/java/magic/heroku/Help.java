package magic.heroku;

public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello START ");
		Help help = new Help();
		help.doWork();
	}

	private void doWork() {
		int idx=1;
		while(true) {
			System.out.println("Hello times "+idx);
			idx++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
