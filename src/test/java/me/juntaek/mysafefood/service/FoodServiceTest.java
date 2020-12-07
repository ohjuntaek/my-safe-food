package me.juntaek.mysafefood.service;

import me.juntaek.mysafefood.dto.FoodDto;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FoodServiceTest {
    @Autowired private FoodService foodService;

    @DisplayName("전체를 조회한다.")
    void findAllTest() {
        List<FoodDto> foodDtos = foodService.getFoodDtos();

        for (FoodDto foodDto : foodDtos) {
            System.out.println(foodDto);
        }
    }
}