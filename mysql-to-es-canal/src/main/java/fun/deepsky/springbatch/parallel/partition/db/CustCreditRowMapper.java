package fun.deepsky.springbatch.parallel.partition.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustCreditRowMapper implements RowMapper<CreditBill>{

	public CreditBill mapRow(ResultSet rs, int rowNum) throws SQLException {
		CreditBill bill = new CreditBill();
		bill.setId(rs.getString("ID"));
		bill.setAccountID(rs.getString("ACCOUNTID"));
		bill.setAddress(rs.getString("ADDRESS"));
		bill.setAmount(rs.getDouble("AMOUNT"));
		bill.setDate(rs.getString("DATE"));
		bill.setName(rs.getString("NAME"));
		return bill;
	}

}
