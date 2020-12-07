package me.juntaek.mysafefood.controller;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.dto.FoodDto;
import me.juntaek.mysafefood.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping("/")
    public String getFood(Model model) {
        List<FoodDto> foodDtos = foodService.getFoodDtos();
        model.addAttribute("foods", foodDtos);
        return "food";
    }

}
