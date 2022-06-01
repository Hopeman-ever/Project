package com.hopeman.reggie.dto;

import com.hopeman.reggie.entity.Setmeal;
import com.hopeman.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
