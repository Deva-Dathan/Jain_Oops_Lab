class ThreadTest implements Runnable
{
	public void run(){
		
		if(Thread.currentThread().getName() == "second"){
			Thread.currentThread().setPriority(10);
		}
		if(Thread.currentThread().getName() == "first"){
			try{
				Thread.sleep(500);
			}
			catch (Exception e) {
				
			}
		}
		for(int i=0;i<5;i++)
        {
			System.out.println("\n"+Thread.currentThread().getName()+"\t"+i);
		}
	} 
}

class MultiRun{

	public static void main(String args[]){
	
		ThreadTest tt = new ThreadTest();
		Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt);
		t1.setName("first");
        t1.setPriority(1);
		t2.setName("second");

		t1.start();
		t2.start();

	}

}

