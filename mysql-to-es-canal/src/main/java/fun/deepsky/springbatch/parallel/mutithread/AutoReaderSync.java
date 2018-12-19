/**
 * 
 */
package fun.deepsky.springbatch.parallel.mutithread;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class AutoReaderSync implements ItemReader<String> {
	private int count = 0;
	private int maxCount = 30;
	
	/**
	 * 线程安全
	 */
	public  synchronized String  read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		
		if(count > maxCount){
			return null;
		}else{
			int temp = ++count;
			System.out.println("Job Read Thread name: " + Thread.currentThread().getName()+"  Read:"+temp);
			return temp +"";
		}
	}
	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

}
