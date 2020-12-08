package me.juntaek.mysafefood.persistence;

import me.juntaek.mysafefood.domain.Food;
import me.juntaek.mysafefood.repository.FoodRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FoodRepositoryTest {
    @Autowired private FoodRepository foodRepository;

    @Test
    void queryTest() {
        List<Food> all = foodRepository.searchFood(foodFilter);
        for (Food food : all) {
            System.out.println(food);
        }
    }


}