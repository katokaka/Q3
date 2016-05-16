package Action;

import com.opensymphony.xwork2.ActionSupport;

import dao.GoTelDAO;

public class GoTelAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -3439813435078708654L;

	/**
	 * 電話番号
	 */
	private String tel;
	
	/**
	 * int型の電話番号
	 */
	private int telInt;
	
	/**
	 * 郵便番号登録画面へ遷移するためのメソッド
	 * @return SUCCESS 常にSUCCESSを返します。
	 */
	public String execute(){
		String res =  "error";
		if(tel==null){
			res="requiredError";
			return res;
		}
		if(tel.length()!=10 || tel.length()!=11){
			return ERROR;
		}
		try {
			telInt=Integer.parseInt(tel);
		} catch (Exception e) {
			return ERROR;
		}
		
		//郵便番号をQ3データベースに登録できたかどうかを確認。
		GoTelDAO dao = new GoTelDAO();
		if(!dao.insertTel(telInt)){
			res="dupulicatedError";
			return res;
		}
		return SUCCESS; 
	}
}
