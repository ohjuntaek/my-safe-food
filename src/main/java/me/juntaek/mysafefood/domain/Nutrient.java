package me.juntaek.mysafefood.domain;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Nutrient {
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
}
