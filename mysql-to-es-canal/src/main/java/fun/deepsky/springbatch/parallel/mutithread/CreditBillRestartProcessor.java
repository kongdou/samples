package fun.deepsky.springbatch.parallel.mutithread;

import java.util.UUID;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreditBillRestartProcessor implements ItemProcessor<CreditBill, DestinationCreditBill>{

	private JdbcTemplate jdbcTemplate;
	/**
	 * 支持重启
	 */
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
		
		/**
		 * 标记当前记录已经被处理
		 */
		if(jdbcTemplate != null && item.getName().equals("tom")) {
			jdbcTemplate.update("update t_credit set flag = ? where id = ? ","true",item.getId());
		}
		
		return destCreditBill;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
