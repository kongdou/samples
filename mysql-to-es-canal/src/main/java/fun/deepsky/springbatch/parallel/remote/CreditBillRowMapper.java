package fun.deepsky.springbatch.parallel.remote;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CreditBillRowMapper implements RowMapper<CreditBill> {

	public CreditBill mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("asdfasdf");
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