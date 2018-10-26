package test3;

import java.util.Scanner;

public class Main {
	//游戏入口在这里
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BattleField battle = new BattleField();
		battle.setBattleField(n);
		battle.displayBattle();
		Round r = new Round();
		while (r.time!=0) {
			r.run(battle, n);
		}
		sc.close();
	}
}
