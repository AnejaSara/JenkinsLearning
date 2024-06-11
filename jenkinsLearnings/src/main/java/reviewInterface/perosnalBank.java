package reviewInterface;


public class perosnalBank implements CentrealBank{

public void print (int amt, int duration) {
		
		float returnAmount = amt * duration * intRate;
		System.out.println(returnAmount);

	}

	public static void main(String[] args) {
		
		int prAmt=45000, duration=5;
		perosnalBank obj=new perosnalBank();
		obj.print(prAmt, duration);
		
	}
	}


