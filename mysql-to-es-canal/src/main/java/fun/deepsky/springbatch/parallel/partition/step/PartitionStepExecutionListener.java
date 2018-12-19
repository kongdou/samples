package fun.deepsky.springbatch.parallel.partition.step;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class PartitionStepExecutionListener implements StepExecutionListener {
	@Override
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "; " 
				+ "StepName=" + stepExecution.getStepName() + "; "
				+ "FileName=" 
				+ stepExecution.getExecutionContext().getString("fileName"));
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		return stepExecution.getExitStatus();
	}
	
}
