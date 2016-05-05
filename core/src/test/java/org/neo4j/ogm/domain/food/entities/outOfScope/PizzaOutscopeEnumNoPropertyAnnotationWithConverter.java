package org.neo4j.ogm.domain.food.entities.outOfScope;

import org.neo4j.ogm.annotation.typeconversion.EnumString;
import org.neo4j.ogm.domain.food.outOfScopeEnum.Nutrient;

/**
 * Created by Mihai Raulea on 4/25/2016.
 */
public class PizzaOutscopeEnumNoPropertyAnnotationWithConverter extends PizzaOutscope{

    @EnumString(value = Nutrient.class)
    public Nutrient outscopeNutrient;

}