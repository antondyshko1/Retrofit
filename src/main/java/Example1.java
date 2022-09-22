import org.junit.jupiter.api.Test;

import java.util.*;

public class Example1 {
    /**
     * �������� Java-��������� ��� ������� �������� � ������ �������� � ������ �������
     */
    @Test
    public void Ex1(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("����������� ������ "+ list);
        list.add(0,"white");
        list.add(5,"blak");
        System.out.println("������ ���� ������� "+ list);
    }

    /**
     *  �������� Java-��������� ��� �������� ���� ��������� ������ ��������.
     */
    @Test
    public void ex2(){
      List<Integer>list= new ArrayList<>();
        List anotherList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.addAll(anotherList);
        System.out.println("���� ������ ����� "+ list);
        for(Integer i : list ){
            System.out.println(i);
        }
    }

    /**
     *  �������� Java-��������� ��� ���������� �������� (�� ���������� �������) �� ��������� ������ ��������.
     */
    @Test
    public void ex3(){
        List arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list =new ArrayList<>();
        list.addAll(arr);
        System.out.println(list.get(5));
    }
    /**
     * �������� Java-��������� ��� ���������� ������������� �������� ������� �� ��������� ��������.
     */
    @Test
    public void ex4 () {
        List arr = Arrays.asList(1,2,34,54,67,45,665,456,4);
        List<Integer> list = new ArrayList<>();
        list.addAll(arr);
        System.out.println("��������� �� ������ �������� "+ list);
        list.set(2,22);
        System.out.println("��������� ����� ������ ��������"+ list);
    }

    /**
     * �������� ��������� �� Java ��� �������� �������� �������� �� ������ ��������.
     */
    @Test
    public void ex5(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("����������� ������ "+ list);
        list.remove(2);
        System.out.println("������ ����� �������� 3 �������� "+ list);
    }

    /**
     * �������� ��������� �� Java ��� ������ �������� � ������ ��������
     */
    @Test
    public void ex6(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("����������� ������ "+ list);
        if(list.contains("orange")){
            System.out.println("������� ������");
        }
        else System.out.println("������� �� ������");
    }
    /**
     * �������� ��������� �� Java ��� ���������� ��������� ������ ��������.
     */
    @Test
    public void ex7 (){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        System.out.println("����������� ������ "+ list);
        Collections.sort(list);
        System.out.println("������ ����� ���������� " + list);
    }
    /**
     * �������� ��������� �� Java ��� ����������� ������ ������ �������� � ������.
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
        System.out.println("��������� 1: "+ list1 + "\n��������� 2: " + list2);
        list1.addAll(list2);
        System.out.println("��������� 1 ����� ���������� � ��� ��������� 2: "+ list1);

    }
    /**
     *  �������� ��������� �� Java ��� ������������� ��������� � ������ ��������.
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
        System.out.println("����������� ��������� " + list);
        Collections.shuffle(list);
        System.out.println("������������ ��������� "+ list);
    }

    /**
     *  �������� Java-��������� ��� ��������� ��������� � ������ ��������.
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
        System.out.println("����������� ��������� " + list);
        Collections.reverse(list);
        System.out.println("�������� ��������: "+list);
    }
    /**
     * �������� ��������� �� Java ��� ���������� ����� ������ ��������.
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
        System.out.println("����������� ��������� " + list);
        List<String>subList = list.subList(0,3);
        System.out.println("����� ��������: "+ subList);
    }
    /**
     * �������� ��������� �� Java ��� ��������� ���� ������� ��������.
     */
    @Test
    public void ex12(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a","c","b","D"));
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("�������� ����� ���������� \nlist1: " + list1+ "\nlist2: " + list2);
        boolean isEquals = list1.equals(list2);
        System.out.println(isEquals);
    }
    /**
     * �������� Java-���������, ���������� ��� �������� � ������ ��������.
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
        System.out.println("����������� ��������� " + list);
        for(String s : list) {
            System.out.println(s);
        }
        Collections.swap(list,0,5);
        for(String s : list){
            System.out.println(s);
        }

    }
    /**
     * �������� ��������� �� Java, ����� ������� ��������� �������� � ��������� ������ � HashMap.
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
     * �������� ��������� �� Java ��� �������� ���������� ����������� ����-�������� (������) �� �����.
     */
    @Test
    public void ex15(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("������ ���-����� : "+ map.size());
    }
    /**
     *  �������� ��������� �� Java, ����� ����������� ��� ������������� � ��������� ����� �� ������ �����.
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
        System.out.println("����������� ��� ����� map: " + map + "\nmap1: "+ map1);
        map.putAll(map1);
        System.out.println("����� map ����� ���������� � ��� map1: " + map);
    }
    /**
     * �������� ��������� �� Java, ����� ������� ��� ������������� � �����
     */
    @Test
    public void ex17(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("����������� ���-�����: " + map);
        map.clear();
        System.out.println("����� ����� �������� �������������: " + map);
    }
    /**
     *  �������� ��������� �� Java, ����� ���������, �������� �� ����� ������������� �������� ����� (�����) ��� ���.
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
        System.out.println("����� ����� : " + result);
        map.clear();
        result = map.isEmpty();
        System.out.println("����� ����� ����� ��������:" + result);
    }
    /**
     *  �������� ��������� �� Java, ����� �������� ������������� ����� ���������� HashMap.
     */
    @Test
    public void ex19(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("����������� ����� map: " + map);
        Map<Integer,String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println("����� �����"+ map2);
    }
    /**
     *  �������� ��������� �� Java, ����� ���������, �������� �� ����� ������������� ��� ���������� �����.
     */
    @Test
    public void ex20(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("����� �������� �������� ��� ������ 1?");
        if(map.containsKey(1)){
            System.out.println("��! " + map.get(1));
        }else System.out.println("����� �� �������� ������� � ����� ������ =(");
    }
    /**
     * �������� ��������� �� Java, ����� ���������, �������� �� ����� ������������� ��� ���������� ��������.
     */
    @Test
    public void ex21(){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"White");
        System.out.println("����� �������� ���� ��� ��������� Yellow?");
        if(map.containsValue("Yellow")){
            System.out.println("��! ");
        }else System.out.println("����� �� �������� ������ �������� =(");
    }
    /**
     * �������� ��������� �� Java ��� �������� ������ ������������� �����������, ������������ � �����
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
     * �������� ��������� �� Java, ����� �������� ����� ������, ������������ � ���� �����.
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
     * �������� ��������� �� Java, ����� �������� ������������� ������������� ��������, ������������ � ���� �����
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
     * ������� ��� ����� �� ����� � �������� � Set
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
