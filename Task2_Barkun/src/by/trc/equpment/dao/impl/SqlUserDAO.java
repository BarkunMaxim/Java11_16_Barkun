package by.trc.equpment.dao.impl;

import by.trc.equpment.dao.UserDAO;
import by.trc.equpment.bean.User;
import by.trc.equpment.dao.exception.DAOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlUserDAO implements UserDAO{
	@Override
	public void singIn(String login,String password) throws DAOException{
		Connection con=null;
		Statement st = null;
		ResultSet rs = null;
		try{
			Class.forName("org.git.mm.mysql.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/maxim","root","Vfrcbv11");
			st = con.createStatement();
		    rs = st.executeQuery("Select login, password from user where login="+login+","+"password="+password);
		    rs.next();
			System.out.println(rs.getString(1));
		}catch(ClassNotFoundException e){
		}catch(SQLException e){
		}finally{
			try{
				if(con != null){con.close();}
			}catch(SQLException e){}
		}
	}
	
	@Override
	public void registration(User user) throws DAOException{
		Connection con=null;
		try{
			Class.forName("org.git.mm.mysql.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/maxim","root","Vfrcbv11");
			String sql = "INSERT INTO user(login,password) VALUES(?,?);";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getLogin());
			ps.setString(2,user.getPassword());
			ps.executeUpdate();
		}catch(ClassNotFoundException e){
		}catch(SQLException e){
		}finally{
			try{
				if(con != null){con.close();}
			}catch(SQLException e){}
		}
	}

}
