package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DBConnector;


public class GoEmailDAO {

	/**
	 * データベースへの接続
	 */
	private Connection con;
	
	/**
	 * メールアドレス
	 */
	private String email;
	
	/**
	 * Q3のデータベースのuserのテーブルにメールアドレスを入力するメソッド
	 * @param email メールアドレス
	 * @return res true/false 登録が出来ればtrue、無ければfalseを返します。
	 */
	public boolean insertEmail(String email){
		boolean res = false;
		int count = 0;
		try {
			con = DBConnector.getConnection("Q3");
			String sql = "INSERT INTO user(email) values(?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			count +=ps.executeUpdate();
			if(count>0){
				res=true;
			}
		} catch (Exception e) {
			res=false;
		}
		return res;
			
		} 
	}
	
