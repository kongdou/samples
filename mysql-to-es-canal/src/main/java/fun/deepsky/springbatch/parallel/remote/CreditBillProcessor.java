package fun.deepsky.springbatch.parallel.remote;


import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, DestinationCreditBill>{

	@Override
	public DestinationCreditBill process(CreditBill creditBill) throws Exception {
		System.out.println("CreditBillProcessor...");
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
