package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			
//			ConnectionFactory factory = new ConnectionFactory();
//			conn = factory.getConnection();
			conn = new ConnectionFactory().getConnection();
			
			//3단계
//			String sql = "select * from t_test ";
			String sql = "select  to_char(hire_date, 'mm') as date1, count(*) from employees group by to_char(hire_date, 'mm') order by 1";
			pstmt = conn.prepareStatement(sql);
			
			//4단계
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
//				String name = rs.getString("name");
//				System.out.println(id + "(" + name + ")");
				String date = rs.getString(1);
				int count = rs.getInt(2);
				System.out.print(date + "\t");
				System.out.println(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

	}

}
