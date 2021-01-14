import java.util.Scanner;
import java.util.*;
public class goodlifefood {
	public static void main(String[] args){
		customer customer=new customer();
		order order=new order();
		fruit fruit=new fruit();
		vegetable vegetable=new vegetable();
		healthycake healthycake=new healthycake();
		Scanner sc=new Scanner(System.in);
		
		
		 /*Map<String, String> map = 
                 new HashMap<String, String>();
		*/
		int action=0;
		int fcost = 0,vcost=0,hcost=0,cost=0;
		
		System.out.println("please enter your account");
		String account=sc.next();
		customer.assign(account);
		//System.out.println(map.get(account));
		//int noexist;
		//if(map.get(account)==null) {noexist=1;}
		System.out.println("*if you don't have account please enter 1 to assign*");
		int assign=sc.nextInt();
		if(assign==1) {//or if(assign==1&&noexist==1)
			System.out.println("please enter your new account");
			account=sc.next();
			customer.register(account);
			while(action==0) {

			
			System.out.println("now choose the fruit you want");
			for(fruitmember f:fruitmember.values()) {
				System.out.print(f+",");
			}
			System.out.println("");
			String yourfruit=sc.next();
			int choose=0;
			while(choose==0) {
			System.out.println("enter 1 to choose by quantity or enter 2 to choose fruit by weight");
			choose=sc.nextInt();
			if(choose==1) {
				System.out.println("enter the quantity you want");
				int quantity=sc.nextInt();
				fruit.setFquantitys(quantity);
				fcost=fruit.cost(yourfruit,quantity,0);
			}
			else if(choose==2){
				System.out.println("enter the weight you want(k.g)");
				int weight=sc.nextInt();
				fruit.setFweights(weight);
				fcost=fruit.cost(yourfruit,0,weight);
			}
			else {
				choose=0;
				System.out.println("pls enter the correct enters");

			}
			}
			
			System.out.println("now choose the vegetable you want");
			for(vegetablemember v:vegetablemember.values()) {
				System.out.print(v+",");
			}
			System.out.println("");
			String yourvegetable=sc.next();
			int choose2=0;
			while(choose2==0) {
			System.out.println("enter 1 to choose by quantity or enter 2 to choose vegetable by weight");
			choose2=sc.nextInt();
			if(choose2==1) {
				System.out.println("enter the quantity you want");
				int quantity=sc.nextInt();
				vegetable.setVquantitys(quantity);
				vcost=vegetable.cost(yourvegetable,quantity,0);
			}
			else if(choose2==2){
				System.out.println("enter the weight you want(k.g)");
				int weight=sc.nextInt();
				vegetable.setVweights(weight);
				vcost=vegetable.cost(yourvegetable,0,weight);
			}
			else {
				choose2=0;
				System.out.println("pls enter the correct enters");

			}
			}
			
			System.out.println("now choose the healthycake you want");
			for(cakemember c:cakemember.values()) {
				System.out.print(c+",");
			}
			System.out.println("");
			String yourhealthycake=sc.next(); 
			System.out.println("enter the quantity you want");
			int cquantity=sc.nextInt();
			healthycake.setCquantitys(cquantity);
			hcost=healthycake.cost(yourhealthycake,cquantity,0);
			
			cost=fcost+vcost+hcost;
			order.setCost(cost);
			int delivery=order.delivery(cost);
			if(cost>400) {
				System.out.println("now choose the site you want to deliver");
				for(sitelocate s:sitelocate.values()) {
					System.out.print(s+",");
				}
				System.out.println("");
				String site=sc.next();
				System.out.println("do you want add message?yes:pls enter 1/No:pls enter other");
				int messagechoose=sc.nextInt();
				String message="";
				if(messagechoose==1) {
					System.out.println("pls enter your message");
					message=sc.next();
					order.setMessage(message);
				}
				order.placeorder(cost, delivery, site,message);
				int chance=0;
				if(site.equals('*')) {
					chance=0;
				}
				else{
					System.out.println("do you want to change your order?Yes pls enter 0/NO pls enter other");
					chance=sc.nextInt();
				}
				if(chance==0) {
					order.change(action);
				}
				else {
					action=1;
				}
			} 
			
			else {
				System.out.println("the cost must be over $400 pls choose again");
			}
			}
			
			String ordernumber="";
			ordernumber=order.finalplace(action,ordernumber);
			customer.addordernumber(ordernumber);
			//map.put(account,oredernumber);

		}
		System.out.println("end");
	} 
}