package test3;

import java.util.Scanner;

public class BattleManage {
	
}

interface Attachment {
	
	public SkillManage skills = new SkillManage();
	void setRoleManage ();
}

class Round implements Attachment{
	//回合用于控制战斗
	RoleManage []player = new RoleManage[11];
	{
		for (int i = 0; i<11; i++) {
			player[i] = new RoleManage();
			player[i].A = new Role();
		}
	}
	//fighter  战士
	//shooter  射手
	public static char []playrole = {'F','S'};

	int time = 2;
	int role = 1;
	public void run (BattleField B, int n) {
		setRoleManage();
		for (int i=1; i<=2;i++) {
			for (int j=B.size-3; j<B.size-1; j++) {
				if (role > 5) break;
				B.battle[i][j]=player[role].A.name;
				role++;
			}
		}
		role = 1;
		for (int i=B.size-3; i<B.size-1;i++) {
			for (int j=1; j<=2; j++) {
				B.battle[i][j]=player[role].A.name;
				role++;
			}
		}		
		move(B,n);
	}
	public void setRoleManage() {
		for (int i=1; i<11; i++) {
			if (i%2 != 0)
				player[i].A.name = playrole[0];
			else
				player[i].A.name = playrole[1];
		}
	}
	public void move (BattleField B,int s) {
		Scanner sc = new Scanner(System.in);
		
		int[][] moving = new int [10][2];
		for (int h= 0; h<10; h++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (B.battle[n][m] == '0' || B.battle[n][m] == '|' || B.battle[n][m] == '-') {
				System.out.println("Error!You are knocking the wall!Please go on the right way!");
				n = sc.nextInt();
				m = sc.nextInt();
				moving[h][0] = n;
				moving[h][1] = m;
			}
			else {
				moving[h][0] = n;
				moving[h][1] = m;
			}
		}
		
		B.setBattleField(s);
		for (int i = 0; i<s; i++) {
			for (int j = 0; j<s; j++) {
				for (int k = 0; k<10; k++) {
					if (i==moving[k][0]&&j==moving[k][1]) {
						B.battle[i][j] = player[k+1].A.name;
						
						
					}
				}
			}
		}
		B.displayBattle();
		System.out.println("Round over!");
		
		
		time --;
		
	}
}


class BattleField {
	//该类用于建造一个战场
	char [][]battle;
	int size;
	//设置战场方法
	void setBattleField (int size) {
		this.size = size;
		battle = new char [this.size][this.size];
		for (int i = 0; i<this.size; i++) {
			for (int j = 0; j<this.size; j++) {
				if (i==0||i==this.size-1) 
					battle[i][j] = '-';
				else if (j==0||j==this.size-1) 
					battle[i][j] = '|';
				else if (i==1||j==1||i==this.size-2||j==this.size-2||i==j||j==this.size-1-i||i==this.size/2||j==this.size/2)
					battle[i][j] = ' ';
				else 
					battle[i][j] = '0';
			}
		}
	}
	
	
	
	//输出战场方法
	void displayBattle (){
		for (int i = 0; i<this.size; i++) {
			for (int j = 0; j<this.size; j++) {
				System.out.print(battle[i][j]);
			}
			System.out.println();
		}
	}
	
}
