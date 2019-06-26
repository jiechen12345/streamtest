package com.example.data.entity;

import com.example.data.entity.base.BaseAutoIdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * Created by JieChen on 2019/6/26.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Apple extends BaseAutoIdEntity {
    private String color;
    private BigDecimal weight;
    private BigDecimal price;
}
