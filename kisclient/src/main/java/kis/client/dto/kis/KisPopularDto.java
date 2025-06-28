package kis.client.dto.kis;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KisPopularDto {

    @JsonProperty("hts_kor_isnm")
    private String stockName;

    @JsonProperty("mksc_shrn_iscd")
    private String stockCode;

    @JsonProperty("data_rank")
    private String rank;

    @JsonProperty("stck_prpr")
    private String price;

    @JsonProperty("prdy_vrss_sign")
    private String sign;

    @JsonProperty("prdy_vrss")
    private String changeAmount;

    @JsonProperty("prdy_ctrt")
    private String changeRate;

    private String stockImage;


}
