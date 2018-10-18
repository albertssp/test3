package test3;

class Skill {
	int damage,defens,time;
	Skill () {
		damage = 0;defens = 0;time = 0;
	}
	void setSkill(int damage,int defens,int time){
		this.damage = damage;this.defens = defens;this.time = time;
	}
}

 public class SkillManage{
	Role A = new Role();
	
}
 
 class InitiativeSkill extends Skill{
	 int distance;
	 void setInitiativeSkill (int damage,int defens,int time,int distance) {
		 this.damage = damage;this.defens = defens;this.time = time;this.distance = distance;
	 }
 }
 
 class PassivitySkill extends Skill{
	 
 }
