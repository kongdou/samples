/**
 * 
 */
package fun.deepsky.springbatch.parallel.mutithread;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-11-16下午10:58:20
 */
public class ConsoleWriter implements ItemWriter<String> {

	public void write(List<? extends String> items) throws Exception {
		String result = "";
		for(String item : items){
			result+=(item+",");
		}
		System.out.println("Job Write Thread name: " + Thread.currentThread().getName()+" Result:"+result);
	}

}
