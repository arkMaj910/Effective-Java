/*Design a NutritionFacts class

Build a class to represent nutritional info on a food label:  

Required: `servingSize`, `servings`  
Optional: `calories`, `fat`, `sodium`, `carbohydrate`

- All fields should be final and immutable.  
- The class should be constructed using the **Builder pattern** (inner static builder class).
- Include a `toString()` method for pretty printing.  */
package com.example.item_two;

class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {

        //Required
        private final int servingSize;
        private final int servings;

        //Optional
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

}

public class ProblemOne {

    public static void main(String[] args) {
        NutritionFacts nf = new NutritionFacts.Builder(4, 2)
                .calories(100).fat(59).sodium(30).carbohydrate(70).build();
        System.out.println(nf.getServingSize());
        System.out.println(nf.getServings());
        System.out.println(nf.getCalories());
        System.out.println(nf.getFat());
        System.out.println(nf.getSodium());
        System.out.println(nf.getCarbohydrate());
    }
}
