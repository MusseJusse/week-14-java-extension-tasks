import java.util.Random;
public class Madlib {
public static void main(String[] args) {
  String[] noun = {"cat","dog","bed","table","house","car","bean","person","arm","leg"};
  String[] adj = {"hairy","thin","fat","small","big","tall","tiny","thick","heavy","light"};
  String[] verb = {"kill","explode","drag","play","spray","squeeze","store","want","remove","peel"};
  String[] adverb = {"slowly","quickly","helplessly","accidentally","happily","excitedly","cruelly",
                     "sheepishly","hastily","fiercefully"};
  Random rand = new Random();
  String sentence = "Do you "+verb[rand.nextInt(10)]+" your "+adj[rand.nextInt(10)]+" "
                    +noun[rand.nextInt(10)]+" "+adverb[rand.nextInt(10)]+".";
  System.out.println(sentence);
}
}
