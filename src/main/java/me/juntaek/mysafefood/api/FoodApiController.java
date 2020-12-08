package me.juntaek.mysafefood.api;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food")
@RequiredArgsConstructor
public class FoodApiController {
    private final FoodService foodService;

}
