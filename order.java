public class order {
	private int mydelivery,cost;
	private String mymessage="",commoditynumber="";
	private String mysite;
	private char sites;
	public char[] number= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public char[] site= {'A','B','C','D','E'};
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	public int delivery(int cost) {
		if(cost<1200 && cost>400) {
			mydelivery=200;
		}
		else if(cost>1200) {
			mydelivery=0;
		}
		return mydelivery;
	}
	public void setMessage(String mymessage) {
		this.mymessage=mymessage;
	}
	public String getMessage() {
		return mymessage;
	}
	public char site(String mysite) {
		if(mysite.equals(sitelocate.A.toString())){
			return ('A');
		}
		else if(mysite.equals(sitelocate.B.toString())){
			return ('B');		
		}
		else if(mysite.equals(sitelocate.C.toString())){
			return ('C');		
		}
		else if(mysite.equals(sitelocate.D.toString())){
			return ('D');		
		}
		else if(mysite.equals(sitelocate.E.toString())){
			return ('E');		
		}
		else
			return '*';
	}
	public int totalcost(int cost,int mydelivery){
		cost=cost+mydelivery;
		return cost;
	}
	public void placeorder(int cost,int mydelivery,String mysite,String mymessage){
		this.cost=cost;
		this.mydelivery=mydelivery;
		this.mysite=mysite;
		this.mymessage=mymessage;
		site(mysite);
		show(cost,mydelivery,site(mysite),mymessage);
	}
	public int change(int action){
		action=0;
		return action;
	}
	public void show(int cost,int mydelivery,char sites,String mymessage){
		this.cost=cost;
		this.mydelivery=mydelivery;
		this.sites=sites;
		this.mymessage=mymessage;
		System.out.print("your delivery is:");
		System.out.println(delivery(cost));
		System.out.print("your total cost is:");
		System.out.println(totalcost(cost,mydelivery));
		System.out.print("your delivery address is:");
		System.out.println(site(mysite));
		if(mymessage.equals("")) {
		}
		else {
			System.out.print("your message is:");
			System.out.println(mymessage);
		}
	}
	public String finalplace(int action,String commoditynumber) {
		this.commoditynumber=commoditynumber;
		if(action==1) {
			commoditynumber=generatenumber(commoditynumber);
		}
		return commoditynumber;
	}
	public String generatenumber(String commoditynumber) {
		this.commoditynumber=commoditynumber;
		for(int i=0;i<7;i++) {
			if(i<3) {
				int x=(int)(Math.random()*26);
				commoditynumber=commoditynumber+number[x];
			}
			else {
				int x=(int)(Math.random()*26);
				String y=Integer.toString(x);
				commoditynumber=commoditynumber+y;
			}
		}
		return commoditynumber;
	}
}
