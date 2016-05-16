package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DBConnector;

public class GoTelDAO {
	
	/**
	 * データベースへの接続
	 */
	private Connection con;

	/**
	 * 電話番号
	 */
	private int telInt;

	/**
	 * Q3のデータベースのuserのテーブルに郵便番号を入力するメソッド
	 * @param twlInt 電話番号
	 * @return res true/false 登録が出来ればtrue、無ければfalseを返します。
	 */
	public boolean insertTel(int telInt){
		boolean res = false;
		int count = 0;
		try {
			con=DBConnector.getConnection("Q3");
			 String sql = "INSERT INTO user(tel) values(?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, telInt);
			count +=ps.executeUpdate();
			if(count>0){
				res=true;
			}
		} catch (Exception e) {
			res =false;
		}
		return res;
	}

	public int getTelInt() {
		return telInt;
	}

	public void setTelInt(int telInt) {
		this.telInt = telInt;
	}
	
}
