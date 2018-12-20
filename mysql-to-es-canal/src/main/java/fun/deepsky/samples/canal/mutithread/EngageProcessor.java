package fun.deepsky.samples.canal.mutithread;

import java.util.UUID;

import org.springframework.batch.item.ItemProcessor;

public class EngageProcessor implements ItemProcessor<Engage, Engage>{

	@Override
	public Engage process(Engage engage) throws Exception {
		return engage;
	}

}
