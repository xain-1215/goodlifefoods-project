
public class healthycake extends item{
	private int cquantitys,cost;
	private String yourcake="";
	public void setCquantitys(int cquantitys) {
		this.cquantitys = cquantitys;
	}
	public int getCquantitys() {
		return cquantitys;
	}
	@Override
	void search() {
		// TODO �۰ʲ��ͪ���k Stub
		
	}
	//�̾ڿ�J���J�|�W�٧P�_�A�Y�s�b�A�h�̷ӹw�]�n�����B�p���O
	//�]���O�~�ӤF��H���O�A�ҥH�����n��@���H��k

	@Override
	public int cost(String yourcake,int cquantitys,int visual) {
		this.yourcake=yourcake;
		this.cquantitys=cquantitys;
		if(yourcake.equals(cakemember.cake1.toString())) {
			cost=cquantitys*100;
		}
		else if(yourcake.equals(cakemember.cake2.toString())){
			cost=cquantitys*150;
		}
		else if(yourcake.equals(cakemember.cake3.toString())) {
			cost=cquantitys*200;
		}
		else if(yourcake.equals(cakemember.cake4.toString())) {
			cost=cquantitys*250;
		}
		else if(yourcake.equals(cakemember.cake5.toString())) {
			cost=cquantitys*400;
		}
		return cost;
	}
}
