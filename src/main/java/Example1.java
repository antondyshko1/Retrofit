import org.junit.jupiter.api.Test;

import java.util.*;

public class Example1 {
    /**
     * Напишите Java-программу для вставки элемента в список массивов в первой позиции
     */
    @Test
    public void Ex1(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("изначальный список "+ list);
        list.add(0,"white");
        list.add(5,"blak");
        System.out.println("Список поле вставки "+ list);
    }

    /**
     *  Напишите Java-программу для итерации всех элементов списка массивов.
     */
    @Test
    public void ex2(){
      List<Integer>list= new ArrayList<>();
        List anotherList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.addAll(anotherList);
        System.out.println("Весь список сразу "+ list);
        for(Integer i : list ){
            System.out.println(i);
        }
    }

    /**
     *  Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов.
     */
    @Test
    public void ex3(){
        List arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list =new ArrayList<>();
        list.addAll(arr);
        System.out.println(list.get(5));
    }
    /**
     * Напишите Java-программу для обновления определенного элемента массива по заданному элементу.
     */
    @Test
    public void ex4 () {
        List arr = Arrays.asList(1,2,34,54,67,45,665,456,4);
        List<Integer> list = new ArrayList<>();
        list.addAll(arr);
        System.out.println("Коллекция до замены элемента "+ list);
        list.set(2,22);
        System.out.println("Коллекция после замены элемента"+ list);
    }

    /**
     * Напишите программу на Java для удаления третьего элемента из списка массивов.
     */
    @Test
    public void ex5(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("изначальный список "+ list);
        list.remove(2);
        System.out.println("Список после удаления 3 элемента "+ list);
    }

    /**
     * Напишите программу на Java для поиска элемента в списке массивов
     */
    @Test
    public void ex6(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("изначальный список "+ list);
        if(list.contains("orange")){
            System.out.println("Элемент найден");
        }
        else System.out.println("Элемент не найден");
    }
    /**
     * Напишите программу на Java для сортировки заданного списка массивов.
     */
    @Test
    public void ex7 (){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("изначальный список "+ list);
        Collections.sort(list);
        System.out.println("Сптсок после сортировки " + list);
    }
    /**
     * Напишите программу на Java для копирования одного списка массивов в другой.
     */
    @Test
    public void ex8 (){
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("orange");
        list1.add("yellow");
        list1.add("green");
        list1.add("blue");
        List<String>list2 = new ArrayList<>();
        list2.add("fgh");
        list2.add("ff");
        list2.add("aaaa");
        list2.add("abcde");
        list2.add("fuck");
        System.out.println("Коллекция 1: "+ list1 + "\nКоллекция 2: " + list2);
        list1.addAll(list2);
        System.out.println("Коллекция 1 после добавления в нее коллекцию 2: "+ list1);

    }
    /**
     *  Напишите программу на Java для перемешивания элементов в списке массивов.
     */
    @Test
    public void ex9(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("Изначальная коллекция " + list);
        Collections.shuffle(list);
        System.out.println("Перемешанная коллекция "+ list);
    }

    /**
     *  Напишите Java-программу для обращения элементов в списке массивов.
     */
    @Test
    public void ex10(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("Изначальная коллекция " + list);
        Collections.reverse(list);
        System.out.println("Обратная коллеция: "+list);
    }
    /**
     * Напишите программу на Java для извлечения части списка массивов.
     */
    @Test
    public void ex11(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("Изначальная коллекция " + list);
        List<String>subList = list.subList(0,3);
        System.out.println("Часть коллкции: "+ subList);
    }
    /**
     * Напишите программу на Java для сравнения двух списков массивов.
     */
    @Test
    public void ex12(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a","c","b","D"));
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("Коддекци после сортировки \nlist1: " + list1+ "\nlist2: " + list2);
        boolean isEquals = list1.equals(list2);
        System.out.println(isEquals);
    }
    /**
     * Напишите Java-программу, поменявшую два элемента в списке массивов.
     */
    @Test
    public void ex13(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("Изначальная коллекция " + list);
        for(String s : list) {
            System.out.println(s);
        }
        Collections.swap(list,0,5);
        for(String s : list){
            System.out.println(s);
        }

    }
    /**
     * Напишите программу на Java, чтобы связать указанное значение с указанным ключом в HashMap.
     */
    @Test
    public void ex14(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
      for(Map.Entry x : map.entrySet()){
          System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    /**
     * Напишите программу на Java для подсчета количества отображений ключ-значение (размер) на карте.
     */
    @Test
    public void ex15(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("Размер хэш-карты : "+ map.size());
    }
    /**
     *  Напишите программу на Java, чтобы скопировать все сопоставления с указанной карты на другую карту.
     */
    @Test
    public void ex16(){
        Map<Integer,String>map = new HashMap<>();
        Map<Integer,String>map1 = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        map1.put(6,"abc");
        map1.put(7,"aaa");
        map1.put(8,"bb");
        System.out.println("Изначальные хэш карты map: " + map + "\nmap1: "+ map1);
        map.putAll(map1);
        System.out.println("Карта map после добавления в нее map1: " + map);
    }
    /**
     * Напишите программу на Java, чтобы удалить все сопоставления с карты
     */
    @Test
    public void ex17(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("Изначальная хэш-карта: " + map);
        map.clear();
        System.out.println("Карта после удаления сопоставлений: " + map);
    }
    /**
     *  Напишите программу на Java, чтобы проверить, содержит ли карта сопоставления значения ключа (пусто) или нет.
     */
    @Test
    public void ex18(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        boolean result = map.isEmpty();
        System.out.println("Карта пуста : " + result);
        map.clear();
        result = map.isEmpty();
        System.out.println("карта пуста после удаления:" + result);
    }
    /**
     *  Напишите программу на Java, чтобы получить поверхностную копию экземпляра HashMap.
     */
    @Test
    public void ex19(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("Изначальная карта map: " + map);
        Map<Integer,String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println("Новая карта"+ map2);
    }
    /**
     *  Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного ключа.
     */
    @Test
    public void ex20(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("Карта содержит занчение под ключем 1?");
        if(map.containsKey(1)){
            System.out.println("Да! " + map.get(1));
        }else System.out.println("Карта не содержит занченя с таким ключем =(");
    }
    /**
     * Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного значения.
     */
    @Test
    public void ex21(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("Карта содержит ключ под значением Yellow?");
        if(map.containsValue("Yellow")){
            System.out.println("Да! ");
        }else System.out.println("Карта не содержит такого значения =(");
    }
    /**
     * Напишите программу на Java для создания набора представлений отображений, содержащихся в карте
     */
    @Test
    public void ex22(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println(map.entrySet());
    }
    /**
     * Напишите программу на Java, чтобы получить набор ключей, содержащихся в этой карте.
     */
    @Test
    public void ex23(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println(map.keySet());
    }
    /**
     * Напишите программу на Java, чтобы получить коллекционное представление значений, содержащихся в этой карте
     */
    @Test
    public void ex24(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println(map.values());
    }

    /**
     * Достать все ключи из карты и добавить в Set
     */
    @Test
    public void ex25(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        Set<Integer> keys = map.keySet();
        for (Integer k :keys){
            System.out.println(k);
        }
    }
}
