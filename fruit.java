
public class fruit extends item{
	private int fquantitys,fweights,cost;
	private String yourfruit="";
	public void setFquantitys(int fquantitys) {
		this.fquantitys = fquantitys;
	}
	public int getFquantitys(int choose) {
		return fquantitys;
	}
	public void setFweights(int fweights) {
		this.fweights = fweights;
	}
	public int getFweights(int choose) {
		return fweights;
	}

	@Override
	void search() {
		// TODO �۰ʲ��ͪ���k Stub
		
	}
	//�̾ڿ�J�����G�W�٧P�_�A�Y�s�b�A�h�̷ӹw�]�n�����B�p���O
	//�]���O�~�ӤF��H���O�A�ҥH�����n��@���H��k
	@Override
	public int cost(String yourfruit,int fquantitys,int fweights) {
		this.yourfruit=yourfruit;
		this.fquantitys=fquantitys;
		this.fweights=fweights;
		if(yourfruit.equals(fruitmember.apple.toString())&&fquantitys!=0) {
			cost=fquantitys*20;
		}
		else if(yourfruit.equals(fruitmember.banana.toString())&&fquantitys!=0) {
			cost=fquantitys*25;

		}
		else if(yourfruit.equals(fruitmember.grape.toString())&&fquantitys!=0) {
			cost=fquantitys*30;
		}
		else if(yourfruit.equals(fruitmember.guava.toString())&&fquantitys!=0) {
			cost=fquantitys*40;
		}
		else if(yourfruit.equals(fruitmember.lemon.toString())&&fquantitys!=0) {
			cost=fquantitys*45;
		}
		else if(yourfruit.equals(fruitmember.orange.toString())&&fquantitys!=0) {
			cost=fquantitys*50;
		}
		else if(yourfruit.equals(fruitmember.papaya.toString())&&fquantitys!=0) {
			cost=fquantitys*60;
		}
		else if(yourfruit.equals(fruitmember.strawberry.toString())&&fquantitys!=0) {
			cost=fquantitys*65;
		}
		else if(yourfruit.equals(fruitmember.watermelon.toString())&&fquantitys!=0) {
			cost=fquantitys*70;
		}
		else if(yourfruit.equals(fruitmember.apple.toString())&&fweights!=0) {
			cost=fweights*60;
		}
		else if(yourfruit.equals(fruitmember.banana.toString())&&fweights!=0) {
			cost=fweights*105;
		}
		else if(yourfruit.equals(fruitmember.grape.toString())&&fweights!=0) {
			cost=fweights*150;
		}
		else if(yourfruit.equals(fruitmember.guava.toString())&&fweights!=0) {
			cost=fweights*75;
		}
		else if(yourfruit.equals(fruitmember.lemon.toString())&&fweights!=0) {
			cost=fweights*65;
		}
		else if(yourfruit.equals(fruitmember.orange.toString())&&fweights!=0) {
			cost=fweights*50;
		}
		else if(yourfruit.equals(fruitmember.papaya.toString())&&fweights!=0) {
			cost=fweights*60;
		}
		else if(yourfruit.equals(fruitmember.strawberry.toString())&&fweights!=0) {
			cost=fweights*140;
		}
		else if(yourfruit.equals(fruitmember.watermelon.toString())&&fweights!=0) {
			cost=fweights*90;
		}


		return cost;
	}
}
