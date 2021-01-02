package me.juntaek.mysafefood.controller;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.dto.FoodDto;
import me.juntaek.mysafefood.dto.form.FoodCondition;
import me.juntaek.mysafefood.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Controller
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping("/food")
    public String getFood(HttpServletRequest request, Model model, FoodCondition foodCondition) {
        List<FoodDto> foodDtos = foodService.getFoodDtos(foodCondition);
        Map<String, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        if (inputFlashMap != null) {
            foodDtos = (List<FoodDto>) inputFlashMap.get("searchFoods");
        }
        model.addAttribute("foods", foodDtos);
        model.addAttribute("foodCondition", new FoodCondition());
        return "food";
    }

    @PostMapping("/food")
    public RedirectView searchFoods(FoodCondition foodCondition, RedirectAttributes redirectAttributes) {
        List<FoodDto> foodDtos = foodService.getFoodDtos(foodCondition);

        redirectAttributes.addFlashAttribute("searchFoods", foodDtos);

        return new RedirectView("/food", true);
    }
}
