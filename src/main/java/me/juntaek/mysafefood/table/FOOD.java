package me.juntaek.mysafefood.table;

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
public class FOOD {
    private long ID;
    private String SAMPLE_ID;
    private String FOOD_NAME;
    private String MAKER;
    private String INVEST_YEAR;
    private String CATEGORY;
    private String DETAIL_CATEGORY;
    private String FOOD_CODE;
    private String SOURCE;
    // Nutrient
    private double PER_ONCE_GRAM;
    private double ENERGY_KCAL;
    private double ENERGY_KJ;
    private double PROTEIN;
    private double FAT;
    private double CARBOHYDRATE;
    private double TOTAL_SUGAR;
    private double NATRIUM;
    private double CHOLESTEROL;
    private double TOTAL_FATTY_ACID;
    private double TRANS_FAT;

    public Food toFood() {
        Nutrient nutrient = toNutrient();
        return Food.builder()
                .id(ID)
                .sampleId(SAMPLE_ID)
                .foodName(FOOD_NAME)
                .maker(MAKER)
                .investYear(INVEST_YEAR)
                .category(CATEGORY)
                .detailCategory(DETAIL_CATEGORY)
                .foodCode(FOOD_CODE)
                .source(SOURCE)
                .nutrient(nutrient)
                .build();
    }

    private Nutrient toNutrient() {
        return Nutrient.builder()
                .perOnceGram(PER_ONCE_GRAM)
                .energyKcal(ENERGY_KCAL)
                .energyKj(ENERGY_KJ)
                .protein(PROTEIN)
                .fat(FAT)
                .carbohydrate(CARBOHYDRATE)
                .totalSugar(TOTAL_SUGAR)
                .natrium(NATRIUM)
                .cholesterol(CHOLESTEROL)
                .totalFattyAcid(TOTAL_FATTY_ACID)
                .transFat(TRANS_FAT)
                .build();
    }
}
