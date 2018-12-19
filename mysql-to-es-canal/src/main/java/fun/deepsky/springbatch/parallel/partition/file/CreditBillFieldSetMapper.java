package fun.deepsky.springbatch.parallel.partition.file;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class CreditBillFieldSetMapper implements FieldSetMapper<CreditBill>{

	@Override
	public CreditBill mapFieldSet(FieldSet fs) throws BindException {
		CreditBill creditBill = new CreditBill();
		creditBill.setId(fs.readString("id"));
		creditBill.setAccountID(fs.readString("accountID"));
		creditBill.setAmount(fs.readDouble("amount"));
		creditBill.setAddress(fs.readString("address"));
		creditBill.setDate(fs.readString("date"));
		creditBill.setName(fs.readString("name"));
		// TODO Auto-generated method stub
		return creditBill;
	}

}
