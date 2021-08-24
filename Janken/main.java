package Janken;

public class main {

	public static void main(String[] args) {
		
		Player you   = new Challengers();
		Player enemy = new CPU();

		int p_point=0;
		int e_point = 0;
		int p_points=0;
		int e_points=0;
		
		//カウント　
		int turn = 0;
		int [] yourHands = new int [100];
		
		//game,名前入力
		System.out.print("おなまえを入力して下さい。： > ");
		you.setName();
		enemy.setName();
		String yourName  = you.getName();
		String enemyName = enemy.getName();
		System.out.println("Your name　" + yourName);
		System.out.println("Enemy name　" + enemyName);
		
		//game開始ィイィィイイイイイイイイ
		//一回戦目
		while(p_points < 3) {
			Hands yourHand  = you.nextHand(yourHands,turn);
			Hands enemyHand = enemy.nextHand(yourHands,turn);
			
			System.out.println(yourName   + "は　" + yourHand  +  "  をだした。");
			System.out.println(enemyName  + "は　" + enemyHand +  "  をだした。");
			
			if(yourHand == Hands.Rock) {
				yourHands[turn] = 0;
			}else if(yourHand == Hands.Scissors) {
				yourHands[turn] = 1;
			}else if(yourHand == Hands.Paper) {
				yourHands[turn] = 2;
			}
			
			
			if (yourHand.winTo(enemyHand)) {
				System.out.println(yourName + "　のかち！");
				p_points += 1;
			} else if (yourHand.loseTo(enemyHand)) {
				System.out.println(yourName + "　のまけ…");
				e_points += 1;
			} else {
				System.out.println("あいこです。");
			}
			turn +=1;
		}
		System.out.println("--------------------------");
		System.out.println("You : " + p_points + "   Enemy : " + e_points );
		System.out.println("You Clear....");
		System.out.println("Enemy Level Up!");
		System.out.println("--------------------------");

		//二回戦目
		
		while(p_point < 3) {
			Hands yourHand  = you.nextHand(yourHands,turn);
			Hands enemyHand = enemy.nextHand(yourHands,turn);
			
			System.out.println(yourName   + "は　" + yourHand  +  "  をだした。");
			System.out.println(enemyName  + "は　" + enemyHand +  "  をだした。");
			
			if(yourHand == Hands.Rock) {
				yourHands[turn] = 0;
			}else if(yourHand == Hands.Scissors) {
				yourHands[turn] = 1;
			}else if(yourHand == Hands.Paper) {
				yourHands[turn] = 2;
			}
			
			if (yourHand.winTo(enemyHand)) {
				System.out.println(yourName + "　のかち！");
				p_point += 1;
			} else if (yourHand.loseTo(enemyHand)) {
				System.out.println(yourName + "　のまけ…");
				e_point += 1;
			} else {
				System.out.println("あいこです。");
			}
			turn += 1;
		}
		
		System.out.println("--------------------------");
		System.out.println("You : " + p_point + "   Enemy : " + e_point );
		System.out.println("You Clear....");
		System.out.println("--------------------------");
		
	}
}
