import java.io.*;
public class customer {
	//�b��s�b�A�i�H�̦��覡�hŪ�� �ç�X�q��s���h�l�ܥثe�q�檬�p
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
	//�Y��J���b�ᤣ�s�b�A�����n�إߤ@�ӷs�b��A����~�వ�U�q�檺�ʧ@
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
	//�g�J�q��s��
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
