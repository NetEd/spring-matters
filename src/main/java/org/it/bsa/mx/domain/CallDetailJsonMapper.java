package org.it.bsa.mx.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CallDetailJsonMapper implements RowMapper<CallDetailRecord> {
	
	public CallDetailRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("*** [CallDetailJsonMapper] ***");
		int i = rs.getInt("PH_NUM");
		CallDetailRecord cdr = new CallDetailRecord();
		cdr.setData(rs.getString("DATA"));
		cdr.setPhoneNumber(rs.getInt("PH_NUM"));
		System.out.println("*** [CallDetailJsonMapper]" + cdr.toString());
		return cdr;
	
	}
	
	
}
