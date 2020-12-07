package me.juntaek.mysafefood.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.juntaek.mysafefood.domain.Nutrient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NutrientDto {
    private double perOnceGram; // 1회제공량
    private double energyKcal; // 에너지(Kcal)
    private double energyKj; // 에너지(kj)
    private double protein; // 단백질(g)
    private double fat; // 지질(g)
    private double carbohydrate; // 탄수화물(g)
    private double totalSugar; // 총당류(g);
    private double natrium; // 나트륨(mg)
    private double cholesterol; // 콜레스테롤(mg)
    private double totalFattyAcid; // 총 포화지방산(g)
    private double transFat; // 트랜스 지방산(g)

    public static NutrientDto from(Nutrient nutrient) {
        return NutrientDto.builder()
                .perOnceGram(nutrient.getPerOnceGram())
                .energyKcal(nutrient.getEnergyKcal())
                .energyKj(nutrient.getEnergyKj())
                .protein(nutrient.getProtein())
                .fat(nutrient.getFat())
                .carbohydrate(nutrient.getCarbohydrate())
                .totalSugar(nutrient.getTotalSugar())
                .natrium(nutrient.getNatrium())
                .cholesterol(nutrient.getCholesterol())
                .totalFattyAcid(nutrient.getTotalFattyAcid())
                .transFat(nutrient.getTransFat())
                .build();
    }
}
