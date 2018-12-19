package fun.deepsky.springbatch.parallel.mutithread;

import java.util.UUID;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, DestinationCreditBill>{

	@Override
	public DestinationCreditBill process(CreditBill item) throws Exception {
		System.out.println(Thread.currentThread().getName()+" processor credit: "+item.getId());
		DestinationCreditBill destCreditBill = new DestinationCreditBill();
		destCreditBill.setId(UUID.randomUUID()+"::"+item.getId());
		destCreditBill.setAccountID(item.getAccountID());
		destCreditBill.setAddress(item.getAddress());
		destCreditBill.setAmount(item.getAmount());
		destCreditBill.setDate(item.getDate());
		destCreditBill.setName(item.getName());
		return destCreditBill;
	}

}
