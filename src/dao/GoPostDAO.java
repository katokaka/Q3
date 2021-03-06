package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DBConnector;

public class GoPostDAO {

	/**
	 * データベースへの接続
	 */
	private Connection con;

	/**
	 * 郵便番号
	 */
	private int postInt;


	/**
	 * Q3のデータベースのuserのテーブルに郵便番号を入力するメソッド
	 * @param postInt 郵便番号
	 * @return res true/false 登録が出来ればtrue、無ければfalseを返します。
	 */
	public boolean insertPost(int postInt){
		boolean res = false;
		int count = 0;
		try {
			con= DBConnector.getConnection("Q3");
			String sql = "INSERT INTO user(post) values(?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, postInt);
			count +=ps.executeUpdate();
			if(count>0){
				res=true;
			}
		} catch (Exception e) {
			res=false;
		}
		return res;
	}

	public int getPostInt() {
		return postInt;
	}


	public void setPostInt(int postInt) {
		this.postInt = postInt;
	}
	
	
}
