package fun.deepsky.samples.canal;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class PrpCengageFieldSetMapper implements FieldSetMapper<PrpCengage>{

	@Override
	public PrpCengage mapFieldSet(FieldSet fs) throws BindException {
		PrpCengage prpCengage = new PrpCengage();
		prpCengage.setClausecode(fs.readString("clausecode"));
		prpCengage.setClausename(fs.readString("clausename"));
		prpCengage.setClauses(fs.readString("clauses"));
		prpCengage.setEngageflag(fs.readString("engageflag"));
		prpCengage.setEngagetype(fs.readString("engagetype"));
		prpCengage.setFlag(fs.readString("flag"));
		prpCengage.setInserttimeforhis(fs.readString("inserttimeforhis"));
		prpCengage.setMax_count(fs.readString("max_count"));
		prpCengage.setOperatetimeforhis(fs.readString("operatetimeforhis"));
		prpCengage.setProposalno(fs.readString("proposalno"));
		prpCengage.setRiskcode(fs.readString("riskcode"));
		prpCengage.setSerialno(fs.readString("serialno"));
		
		return prpCengage;
	}

}
