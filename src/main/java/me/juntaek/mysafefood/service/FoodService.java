package me.juntaek.mysafefood.service;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.domain.Food;
import me.juntaek.mysafefood.dto.FoodDto;
import me.juntaek.mysafefood.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    public List<FoodDto> getFoodDtos() {
        List<Food> foods = foodRepository.findAll();
        return foods.stream()
                .map(FoodDto::from)
                .collect(Collectors.toList());
    }
}
