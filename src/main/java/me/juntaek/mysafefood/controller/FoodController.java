package me.juntaek.mysafefood.controller;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.dto.FoodDto;
import me.juntaek.mysafefood.dto.form.FoodFilter;
import me.juntaek.mysafefood.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping("/food")
    public String getFood(Model model) {
        List<FoodDto> foodDtos = foodService.searchFoodDtos(null);
        model.addAttribute("foods", foodDtos);
        model.addAttribute("foodFilter", new FoodFilter());
        return "food";
    }

    @PostMapping("/food")
    public List<FoodDto> searchFoods(FoodFilter foodFilter) {
        return foodService.searchFoodDtos(foodFilter);
    }
}
