package fun.deepsky.springbatch.parallel.mutithread;


import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class SynchronizedItemReader implements ItemReader<CreditBill>,ItemStream{

	private ItemReader<CreditBill> delegate;
	
	@Override
	public synchronized CreditBill read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		CreditBill creditBill = delegate.read();
		if(creditBill != null) {
			System.out.println(Thread.currentThread().getName()+" read credit: "+creditBill.getId());
		}
		return creditBill;
	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		if(this.delegate instanceof ItemStream) {
			((ItemStream)this.delegate).open(executionContext);
		}
		
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		if(this.delegate instanceof ItemStream) {
			((ItemStream)this.delegate).update(executionContext);
		}
	}

	@Override
	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		if(this.delegate instanceof ItemStream) {
			((ItemStream)this.delegate).close();
		}
	}

	public ItemReader<CreditBill> getDelegate() {
		return delegate;
	}

	public void setDelegate(ItemReader<CreditBill> delegate) {
		this.delegate = delegate;
	}
	
	
	
	

}
