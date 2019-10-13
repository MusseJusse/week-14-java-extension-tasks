import java.util.Random;
public class Challenges {
	public int reverseNum(int num) {
		int rev = 0;
		int last =0;
		while (num>0) {
			last = num%10;
		    rev = (rev*10)+last;
		    num = num/10;
		}
		return(rev);
	}
	public String generatePhone() {
		Random rand = new Random();
		String phone = "";
		for (int i=0;i<3;i++) {
			int n = rand.nextInt(8);
			phone = phone+n;
		}
		phone = phone+"-"+(rand.nextInt(900)+100)+"-"+(rand.nextInt(556)+100);
		return(phone);
	}
	public String madLibs(){
		String[] noun = {"cat","dog","bed","table","house","car","bean","person","arm","leg"};
		String[] adj = {"hairy","thin","fat","small","big","tall","tiny","thick","heavy","light"};
		String[] verb = {"kill","explode","drag","play","spray","squeeze","store","want","remove","peel"};
		String[] adverb = {"slowly","quickly","helplessly","accidentally","happily","excitedly","cruelly",
	                     "sheepishly","hastily","fiercefully"};
		Random rand = new Random();
		String sentence = "Do you "+verb[rand.nextInt(10)]+" your "+adj[rand.nextInt(10)]+" "
	                    +noun[rand.nextInt(10)]+" "+adverb[rand.nextInt(10)]+".";
		return(sentence);
	}
}
