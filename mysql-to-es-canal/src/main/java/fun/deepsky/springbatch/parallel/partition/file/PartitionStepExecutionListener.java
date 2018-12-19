package fun.deepsky.springbatch.parallel.partition.file;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class PartitionStepExecutionListener implements StepExecutionListener{

	private long start = 0;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		start = System.currentTimeMillis();
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "; " 
				+ "StepName=" + stepExecution.getStepName() + "; "
				+ "FileName=" 
				+ stepExecution.getExecutionContext().getString("fileName"));
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println(System.currentTimeMillis()-start);
		return null;
	}


}
