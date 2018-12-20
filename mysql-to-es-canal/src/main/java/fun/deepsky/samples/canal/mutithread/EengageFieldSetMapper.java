package fun.deepsky.samples.canal.mutithread;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class EengageFieldSetMapper implements FieldSetMapper<Engage>{

	@Override
	public Engage mapFieldSet(FieldSet fs) throws BindException {
		Engage engage = new Engage();
		engage.setClausecode(fs.readString("clausecode"));
		engage.setClausename(fs.readString("clausename"));
		engage.setClauses(fs.readString("clauses"));
		engage.setEngageflag(fs.readString("engageflag"));
		engage.setEngagetype(fs.readString("engagetype"));
		engage.setFlag(fs.readString("flag"));
		engage.setInserttimeforhis(fs.readString("inserttimeforhis"));
		engage.setMax_count(fs.readString("max_count"));
		engage.setOperatetimeforhis(fs.readString("operatetimeforhis"));
		engage.setProno(fs.readString("prono"));
		engage.setRiskcode(fs.readString("riskcode"));
		engage.setSerialno(fs.readString("serialno"));
		
		return engage;
	}

}
