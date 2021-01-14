
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
		// TODO 自動產生的方法 Stub
		
	}
	//依據輸入的蛋糕名稱判斷，若存在，則依照預設好的金額計算花費
	//因為是繼承了抽象類別，所以必須要實作其抽象方法

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
