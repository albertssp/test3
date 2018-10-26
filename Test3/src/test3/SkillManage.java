package test3;

class Skill {
	int damage,defens,time;
	char name;
	Skill () {
		damage = 0;defens = 0;time = 0;name = '*';
	}
}

 public class SkillManage{
	Role A = new Role();
	
}
 
 class InitiativeSkill extends Skill{
	 int distance;
	 char skill = '*';
	 void setInitiativeSkill () {
		 damage = 9; defens = 0; time = 2; distance = 2;
	 }
 }
 
 class PassivitySkill extends Skill{
	 void setPassivitySkill () {
		 damage = 5; defens = 4; time = 2;
	 }
 }
