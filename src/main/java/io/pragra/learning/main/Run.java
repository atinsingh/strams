package io.pragra.learning.main;

import io.pragra.learning.main.dish.CusineType;
import io.pragra.learning.main.dish.Dish;
import io.pragra.learning.main.dish.DishType;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        addDishes(dishes);
        //System.out.println(dishes);


        List<Dish> list = dishes.stream().dropWhile(d -> d.getType() == DishType.NON_VEG).collect(Collectors.toList());

        System.out.println(list);


        Optional<Dish> first = dishes.stream()
                .filter(d -> d.getType() == DishType.VEG)
                .filter(d -> d.getCusineType() == CusineType.INDIAN).distinct().findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }

    }


    private static void addDishes(List<Dish> dishes) {
        dishes.add(
                Dish.builder()
                        .name("Butter Chicken")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Chicken","Butter","Salt","Onion","Spices"))
                        .type(DishType.NON_VEG)
                        .price(18.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Veg Briyani")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Vegetable","Rice","Salt","Onion","Spices"))
                        .type(DishType.VEG)
                        .price(14.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Veg Briyani")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Vegetable","Rice","Salt","Onion","Spices"))
                        .type(DishType.VEG)
                        .price(14.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Dosa")
                        .cusineType(CusineType.INDIAN)
                        .ingredient(Arrays.asList("Rice","Salt","Onion","Spices"))
                        .type(DishType.VEG)
                        .price(12.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Hakka Noodle")
                        .cusineType(CusineType.CHINESE)
                        .ingredient(Arrays.asList("Noodles","Salt","Onion","Spices"))
                        .type(DishType.VEG)
                        .price(12.99)
                        .build()
        );
        dishes.add(
                Dish.builder()
                        .name("Chilli Chicken")
                        .cusineType(CusineType.CHINESE)
                        .ingredient(Arrays.asList("Chicken","Soya Souce", "Salt","Onion","Spices"))
                        .type(DishType.NON_VEG)
                        .price(18.99)
                        .build()
        );
    }
}

