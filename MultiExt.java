import java.util.*;


class MultiExt extends Thread{
	public void run(){
		
		if(currentThread().getName() == "second"){
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		}
		if(currentThread().getName() == "first"){
			try{
				Thread.currentThread().sleep(5000);
			}
			catch (Exception e) {
				
			}
		}
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+i);
			System.out.println(Thread.currentThread().getPriority());
			try{
				Thread.sleep(500);
			}
			catch(Exception e){

			}
		}
	} 


	public static void main(String args[]){
	
		MultiExt m1 = new MultiExt();
		MultiExt m2 = new MultiExt();
		m1.setName("first");
		m2.setName("second");

		m1.start();
		m2.start();
		

	}

}

