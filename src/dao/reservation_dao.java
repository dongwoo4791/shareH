package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vo.reservation;



public class reservation_dao {
	private reservation_dao() {}
	private static reservation_dao instance=new reservation_dao();
	
	public static reservation_dao getInstance() {
		return instance;
	}
	
	public boolean insert(reservation reservation) {
		boolean flag=false;
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="insert into calendarmemo(calendarmemo_contents,calendarmemo_year,calendarmemo_month,calendarmemo_day) values(?,?,?,?)";
		try {
			conn=DBConn.getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1,reservation.getCalendarmemo_contents());
			ps.setInt(2,reservation.getCalendarmemo_year());
			ps.setInt(3,reservation.getCalendarmemo_month());
			ps.setInt(4,reservation.getCalendarmemo_day());
			int n=ps.executeUpdate();
			if(n==1) {
				flag=true;
				System.out.println("예약 등록 성공");
			}else {
				System.out.println("예약 등록 실패");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally{
			DBConn.close(conn, ps);
		}
		return flag;
	}
}