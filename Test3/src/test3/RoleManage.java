package test3;

class Role {
	
	char name;
	int HP,MP, Exp;
	Role () {
		name = ' ';HP = 10;	MP = 10;
	}
	void setRole(char name){	this.name = name;	}
	void setRole(char name,int HP,int MP){
		this.name = name;this.HP = HP; this.MP = MP;
	}
	void expUp (int Exp) {	this.Exp = Exp;	}
}

public class RoleManage{
	Role A;
	void setRoleManage (Role A) {	this.A = A;	}
	void attack (Role B) {
		
	}
	void getHurt (Role B) {
		
	}
}
