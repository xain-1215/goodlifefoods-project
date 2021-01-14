import java.io.*;
public class customer {
	//帳戶存在，可以依此方式去讀檔 並找出訂單編號去追蹤目前訂單狀況
	public void assign(String account){
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\eclipse-workspace\\GoodLifeFoods\\src\\account.txt"), "UTF-8"));
			String str = null;
			int check=0;
			while((str = reader.readLine())!=null) {
				String[] token=str.split(" ");
				if(token[0].equals(account)) {
					System.out.println(str);
					check=1;
				}	
			}
			if(check==0) {
				System.out.println("no exist this account");
			}
			
		
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				reader.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//若輸入的帳戶不存在，必須要建立一個新帳戶，之後才能做下訂單的動作
	public void register(String account) {
		BufferedWriter fw = null;
		try {
			File file = new File("C:\\Users\\user\\eclipse-workspace\\GoodLifeFoods\\src\\account.txt");
			fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
			fw.append(account);
			fw.flush();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			if (fw != null) {
				try {
					fw.close();
				} 
			catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}
	//寫入訂單編號
	public void addordernumber(String ordernumber){
		BufferedWriter fw = null;
		try {
			File file = new File("C:\\Users\\user\\eclipse-workspace\\GoodLifeFoods\\src\\account.txt");
			fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
			fw.append(""+ordernumber+" \n");
			fw.flush();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			if (fw != null) {
				try {
					fw.close();
				} 
			catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}
}
