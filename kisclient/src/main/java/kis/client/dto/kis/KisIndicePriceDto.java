package kis.client.dto.kis;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KisIndicePriceDto {

    @JsonProperty("stck_bsop_date")
    private String indice_date;

    @JsonProperty("bstp_nmix_prpr")
    private String cur_price;

    @JsonProperty("bstp_nmix_hgpr")
    private String high_price;

    @JsonProperty("bstp_nmix_lwpr")
    private String low_price;

    @JsonProperty("acml_vol")
    private String acml_vol;

    @JsonProperty("acml_tr_pbmn")
    private String acml_vol_price;
}
