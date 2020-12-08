package me.juntaek.mysafefood.service;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.domain.Food;
import me.juntaek.mysafefood.dto.FoodDto;
import me.juntaek.mysafefood.dto.form.FoodFilter;
import me.juntaek.mysafefood.repository.FoodRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    public List<FoodDto> searchFoodDtos(@Nullable FoodFilter foodFilter) {
        List<Food> foods = foodRepository.searchFood(foodFilter);
        return foods.stream()
                .map(FoodDto::from)
                .collect(Collectors.toList());
    }
}
