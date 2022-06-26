package hello.mystudy.effectivejava.item2.source;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Sandwich {
    public enum Ingredient {EGG, HAM, ONION, BACON, TOMATO}
    final Set<Ingredient> ingredients;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Ingredient> ingredients = EnumSet.noneOf(Ingredient.class);

        public T addIngredient(Ingredient ingredient) {
            ingredients.add(Objects.requireNonNull(ingredient));
            return self();
        }

        protected abstract T self();

        abstract Sandwich build();
    }

    Sandwich(Builder<?> builder) {
        ingredients = builder.ingredients.clone();  //아이템 50 참조
    }
}
