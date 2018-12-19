package fun.deepsky.springbatch.parallel.mutithread;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class DestCreditBillItemPreparedStatementSetter implements
ItemPreparedStatementSetter<DestinationCreditBill>  {

	@Override
	public void setValues(DestinationCreditBill item, PreparedStatement ps) throws SQLException {
		ps.setString(1, item.getId());
		ps.setString(2, item.getAccountID());
		ps.setString(3, item.getName());
		ps.setDouble(4, item.getAmount());
		ps.setString(5, item.getDate());
		ps.setString(6, item.getAddress());
	}

}
