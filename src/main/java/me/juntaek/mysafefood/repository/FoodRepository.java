package me.juntaek.mysafefood.repository;

import lombok.RequiredArgsConstructor;
import me.juntaek.mysafefood.domain.Food;
import me.juntaek.mysafefood.table.FOOD;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class FoodRepository {
    private final JdbcTemplate jdbc;

    private RowMapper<FOOD> foodMapper = BeanPropertyRowMapper.newInstance(FOOD.class);

    public List<Food> findAll() {
        StringBuilder query = new StringBuilder(" ");
        query.append("SELECT * ");
        query.append("FROM FOOD ");
        List<FOOD> FOOD_LIST = jdbc.query(query.toString(), foodMapper);
        return FOOD_LIST.stream()
                .map(FOOD::toFood)
                .collect(Collectors.toList());
    }
}
