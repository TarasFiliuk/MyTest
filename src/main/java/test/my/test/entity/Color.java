package test.my.test.entity;

public enum Color {

   RED("red"), BLUE("blue"), GREEN("green");

   private String value;

   private Color(String color) {
      this.value = color;
   }

   @Override
   public String toString() {
      return value;
   }

   public boolean isEqual(String value) {
      return this.value.equals(value);
   }
}
