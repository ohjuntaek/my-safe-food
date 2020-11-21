package me.juntaek.mysafefood.domain;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Food {
    private Long id;
    private String sampleId; // SAMPLE_ID
    private String foodName; // 식품명
    private String maker; // 제조사
    private String investYear; // 조사년도
    private String category; // 식품분류
    private String detailCategory; // 식품상세분류
    private String foodCode; // 식품코드
    private String source; // 출처
    private Nutrient nutrient;
}
