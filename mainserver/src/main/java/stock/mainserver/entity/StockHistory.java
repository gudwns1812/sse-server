package stock.mainserver.entity;

import jakarta.persistence.*;
import lombok.*;
import stock.mainserver.global.auditing.BaseTimeEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Table(name = "stock_history")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class StockHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_history_seq")
    @SequenceGenerator(name = "stock_history_seq", sequenceName = "stock_history_seq", allocationSize = 1)
    private Long id;

    @Column(name = "stock_code", nullable = false)
    private String stockCode;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "date_type")
    private String type;

    @Column(name = "open_price")
    private String open;

    @Column(name = "high_price")
    private String high;

    @Column(name = "low_price")
    private String low;

    @Column(name = "close_price")
    private String close;

    @Column(name = "volume")
    private String volume;

    @Column(name = "volume_amount")
    private String volumeAmount;


    @Column(name = "prev_price")
    private Integer prevPrice;



    //== 비즈니스 메서드 ==//
    public void updateHistory(String type, String open, String high, String low, String close, String volume, String volumeAmount, Integer prevPrice) {
        this.type = type;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.volumeAmount = volumeAmount;
        this.prevPrice = prevPrice;
    }

}
