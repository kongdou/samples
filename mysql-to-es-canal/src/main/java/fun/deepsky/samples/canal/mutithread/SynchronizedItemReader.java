package fun.deepsky.samples.canal.mutithread;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class SynchronizedItemReader implements ItemReader<Engage>,ItemStream{

	private ItemReader<Engage> delegate;
	
	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
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

	@Override
	public Engage read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		Engage engage = delegate.read();
		if(engage != null) {
			System.out.println(Thread.currentThread().getName()+" read proposalno: "+engage.getProno());
		}
		return engage;
	}

	public ItemReader<Engage> getDelegate() {
		return delegate;
	}

	public void setDelegate(ItemReader<Engage> delegate) {
		this.delegate = delegate;
	}
}
