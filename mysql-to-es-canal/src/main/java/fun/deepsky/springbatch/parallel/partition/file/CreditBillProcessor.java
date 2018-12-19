package fun.deepsky.springbatch.parallel.partition.file;

import java.util.UUID;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, DestinationCreditBill>{

	@Override
	public DestinationCreditBill process(CreditBill creditBill) throws Exception {
		DestinationCreditBill destCreditBill = new DestinationCreditBill();
		destCreditBill.setId(creditBill.getId());
		destCreditBill.setAccountID(creditBill.getAccountID());
		destCreditBill.setAddress(creditBill.getAddress());
		destCreditBill.setAmount(creditBill.getAmount());
		destCreditBill.setDate(creditBill.getDate());
		destCreditBill.setName(creditBill.getName());
		return destCreditBill;
	}

}
