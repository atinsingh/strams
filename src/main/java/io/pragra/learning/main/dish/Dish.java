package io.pragra.learning.main.dish;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Dish {
    private String name;
    private DishType type;
    private CusineType cusineType;
    private List<String> ingredient;
    private double price;
}
