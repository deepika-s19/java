class Games{
	String gId;
	String gName;
	Games(String gId,String gName){
		this.gId = gId;
		this.gName = gName;
	}
	
}
class Players{
	String plId;
	String plName;
	Games[] gms;
	Players(String plId, String plName, Games[] gms){
		this.plId = plId;
		this.plName = plName;
		this.gms = gms;
	}
	public void getPlayersDetails(){
		System.out.println("Players Details: ");
		System.out.println("Players Id: " + plId);
		System.out.println("Players Name: " + plName);
		System.out.println("Games ID  Games Name ");
		System.out.println("------------------------------------------------------");
		for(int i = 0;i<gms.length;i++){
			Games g = gms[i];
			System.out.println(g.gId+"  "+g.gName);
		}
		System.out.println();
		
	}
}
//Many to Many association 
class ManyToMany{
	public static void main(String[] args){
		Games g1 = new Games("01", "foot Ball");
		Games g2 = new Games("02","Cricket");
		Games g3 = new Games("03","Ko-kho");
		Games[] gms = new Games[3];
		gms[0]=g1;
		gms[1]=g2;
		gms[2]=g3;
		Players pl1 = new Players("p01", "Deppika", gms);
		Players pl2 = new Players("p02", "rohith",  gms);
		Players pl3 = new Players("p03", "pallavi", gms);
		pl1.getPlayersDetails();
		pl2.getPlayersDetails();
		pl3.getPlayersDetails();
		
		
		
		
	}
}