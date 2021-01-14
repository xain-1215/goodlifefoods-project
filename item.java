
public abstract class item {
	abstract void search();//之後可以建立搜尋的方式確定物品是否存在
	public abstract int cost(String yourString,int quantity,int weight);//抽象方法:計算花費金額
}
