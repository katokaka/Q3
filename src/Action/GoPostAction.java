package Action;

import com.opensymphony.xwork2.ActionSupport;

public class GoPostAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -3488982771893295086L;

	/**
	 * 郵便番号
	 */
	private String post;	
	
	/**
	 * int型の郵便番号
	 */
	private int postInt;	

	/**
	 * 郵便番号登録画面へ遷移するためのメソッド
	 * @return SUCCESS 常にSUCCESSを返します。
	 */
	public String execute(){
		if(post.length()!=7){
			return ERROR;
		}
		try {
			postInt=Integer.parseInt(post);
		} catch (Exception e) {
			return ERROR;
		}
		
		//郵便番号をQ3データベースに登録できたかどうかを確認。
		if(){
			
		}
		
		return SUCCESS; 
	}




}
