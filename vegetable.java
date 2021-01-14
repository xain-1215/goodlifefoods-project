
public class vegetable extends item{
	private int vquantitys,vweights,cost;
	private String yourvegetable="";
	public void setVquantitys(int vquantitys) {
		this.vquantitys = vquantitys;
	}
	public int getVquantitys(int choose) {
		return vquantitys;
	}
	public void setVweights(int vweights) {
		this.vweights = vweights;
	}
	public int getVweights(int choose) {
		return vweights;
	}

	@Override
	void search() {
		// TODO 自動產生的方法 Stub
		
	}
	//依據輸入的蔬菜名稱判斷，若存在，則依照預設好的金額計算花費
	//因為是繼承了抽象類別，所以必須要實作其抽象方法

	@Override
	public int cost(String yourvegetable,int vquantitys,int vweights) {
		this.yourvegetable=yourvegetable;
		this.vquantitys=vquantitys;
		this.vweights=vweights;
		if(yourvegetable.equals(vegetablemember.brocoli.toString())&&vquantitys!=0) {
			cost=vquantitys*20;
		}
		else if(yourvegetable.equals(vegetablemember.cabbage.toString())&&vquantitys!=0) {
			cost=vquantitys*25;
		}
		else if(yourvegetable.equals(vegetablemember.clery.toString())&&vquantitys!=0) {
			cost=vquantitys*30;
		}
		else if(yourvegetable.equals(vegetablemember.ginger.toString())&&vquantitys!=0) {
			cost=vquantitys*40;
		}
		else if(yourvegetable.equals(vegetablemember.mint.toString())&&vquantitys!=0) {
			cost=vquantitys*45;
		}
		else if(yourvegetable.equals(vegetablemember.onion.toString())&&vquantitys!=0) {
			cost=vquantitys*50;
		}
		else if(yourvegetable.equals(vegetablemember.potato.toString())&&vquantitys!=0) {
			cost=vquantitys*60;
		}
		else if(yourvegetable.equals(vegetablemember.pumpkin.toString())&&vquantitys!=0) {
			cost=vquantitys*65;
		}
		else if(yourvegetable.equals(vegetablemember.rosemary.toString())&&vquantitys!=0) {
			cost=vquantitys*70;
		}
		else if(yourvegetable.equals(vegetablemember.brocoli.toString())&&vweights!=0) {
			cost=vweights*60;
		}
		else if(yourvegetable.equals(vegetablemember.cabbage.toString())&&vweights!=0) {
			cost=vweights*105;
		}
		else if(yourvegetable.equals(vegetablemember.clery.toString())&&vweights!=0) {
			cost=vweights*150;
		}
		else if(yourvegetable.equals(vegetablemember.ginger.toString())&&vweights!=0) {
			cost=vweights*75;
		}
		else if(yourvegetable.equals(vegetablemember.mint.toString())&&vweights!=0) {
			cost=vweights*65;
		}
		else if(yourvegetable.equals(vegetablemember.onion.toString())&&vweights!=0) {
			cost=vweights*50;
		}
		else if(yourvegetable.equals(vegetablemember.potato.toString())&&vweights!=0) {
			cost=vweights*60;
		}
		else if(yourvegetable.equals(vegetablemember.pumpkin.toString())&&vweights!=0) {
			cost=vweights*140;
		}
		else if(yourvegetable.equals(vegetablemember.rosemary.toString())&&vweights!=0) {
			cost=vweights*90;
		}
		return cost;
	}

}
