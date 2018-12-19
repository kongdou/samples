/**
 * 
 */
package fun.deepsky.springbatch.parallel.partition.step;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements
		ItemProcessor<CreditBill, DestinationCreditBill> {

	public DestinationCreditBill process(CreditBill bill) throws Exception {
		DestinationCreditBill destCreditBill = new DestinationCreditBill();
		destCreditBill.setAccountID(bill.getAccountID());
		destCreditBill.setAddress(bill.getAddress());
		destCreditBill.setAmount(bill.getAmount());
		destCreditBill.setDate(bill.getDate());
		destCreditBill.setId(bill.getId());
		destCreditBill.setName(bill.getName());
		return destCreditBill;
	}
}
