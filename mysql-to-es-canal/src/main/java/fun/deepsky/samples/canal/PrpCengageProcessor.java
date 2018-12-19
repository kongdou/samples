package fun.deepsky.samples.canal;

import java.util.UUID;

import org.springframework.batch.item.ItemProcessor;

public class PrpCengageProcessor implements ItemProcessor<PrpCengage, PrpCengage>{

	@Override
	public PrpCengage process(PrpCengage prpCengage) throws Exception {
		
		return prpCengage;
	}

}
