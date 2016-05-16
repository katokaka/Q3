package dao;

import java.sql.Connection;

import com.internousdev.util.DBConnector;

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
     * @param post 郵便番号
     * @return res true/false 登録が出来ればtrue、無ければfalseを返します。
     */
    public boolean insertPost(int postInt){
    	boolean res = false;
    	try {
			con= DBConnector.getConnection("Q3");
			
				
			}
    		
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    }
    
}
