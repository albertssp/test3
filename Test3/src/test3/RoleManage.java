package test3;

class Role {
	
	char name;
	int HP,MP, Exp, baseDamage;
	Role () {
		name = ' ';HP = 10;	MP = 10; baseDamage = 5;
	}
	void setRole(char name){	this.name = name;	}
	void setRole(char name,int HP,int MP){
		this.name = name;this.HP = HP; this.MP = MP;
	}
	void expUp (int Exp) {	this.Exp = Exp;	}
}

public class RoleManage{
	Role A;
	Skill S;
	void setRoleManage (Role A) {	this.A = A;	}
	int attack (Role B) {
		B.HP = B.HP - A.baseDamage;
		if (B.HP <=0 ) {
			return 0;
		}
		else
			return B.HP;
	}
	int useSkill (Role B) {
		
		if (A.name == 'F') {
			S = new PassivitySkill();
			((PassivitySkill) S).setPassivitySkill();
			A.HP += S.defens;
			A.baseDamage += S.damage;
		}
		else if (A.name == 'S') {
			S = new InitiativeSkill();
			((InitiativeSkill) S).setInitiativeSkill();
			B.HP = B.HP - S.damage;
			if (B.HP <=0 ) {
				return 0;
			}
			else
				return B.HP;
		}
		return -1;
	}
	
}
