package me.juntaek.mysafefood.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.juntaek.mysafefood.domain.Food;
import me.juntaek.mysafefood.domain.Nutrient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodDto {
    private String sampleId; // SAMPLE_ID
    private String foodName; // 식품명
    private String maker; // 제조사
    private String investYear; // 조사년도
    private String category; // 식품분류
    private String detailCategory; // 식품상세분류
    private String foodCode; // 식품코드
    private String source; // 출처
    private NutrientDto nutrient;

    public static FoodDto from(Food food) {
        return FoodDto.builder()
                .sampleId(food.getSampleId())
                .foodName(food.getFoodName())
                .maker(food.getMaker())
                .investYear(food.getInvestYear())
                .category(food.getCategory())
                .detailCategory(food.getDetailCategory())
                .foodCode(food.getFoodCode())
                .source(food.getSource())
                .nutrient(NutrientDto.from(food.getNutrient()))
                .build();
    }
}
