package com.sweets.sweets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SweetsController {
    @GetMapping("/sweetslist")
    public List<Cake> cakeList() {
        List<Cake> cakes = List.of(
                new Cake("Chocolate cake", "chocolate"),
                new Cake("Cheesecake", "cream cheese"),
                new Cake("Mont Blanc", "chestnut"));
        return cakes;
    }
}
