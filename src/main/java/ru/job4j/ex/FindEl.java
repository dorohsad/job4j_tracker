package ru.job4j.ex;

public class FindEl {
    public static void main(String[] args) {
        String[] values = {"One", "Two", "Three"};
        String notFound = "OneTwo";
        int index = -1;
        try {
            index = FindEl.indexOf(values, notFound);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print("Индекс элемента: " + index);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }
}
