package fun.deepsky.springbatch.parallel.partition.db;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class PartitionStepExecutionListener implements StepExecutionListener{

	@Override
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "; " 
				+ "StepName=" + stepExecution.getStepName() + "; "
				+ "min:" 
				+ stepExecution.getExecutionContext().getInt("_minRecord")
				+ "max:"
				+ stepExecution.getExecutionContext().getInt("_maxRecord"));
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		return null;
	}


}
