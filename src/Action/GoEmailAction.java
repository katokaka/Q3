package Action;

import com.opensymphony.xwork2.ActionSupport;

import dao.GoEmailDAO;
import dao.GoPostDAO;

public class GoEmailAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -7241399804952934607L;

	/**
	 * メールアドレス
	 */
	private String email;	

	/**
	 * メールアドレス画面へ遷移するためのメソッド
	 * @return res を返します。
	 */
	public String execute(){
		String res = "error";
		if(email==null){
			res="requiredError";
			return res;
		}
		if(!email.matches("＠")){
			return ERROR;
		}
		//メールアドレスをQ3データベースに登録できたかどうかを確認。
		GoEmailDAO dao = new GoEmailDAO();
		if(!dao.insertEmail(email)){
			res="dupulicatedError";
			return res;
		}
		return SUCCESS; 
	}
	
	
	
	
}
