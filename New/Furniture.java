package New;

public class Furniture {
    String name;
    String color;
    String type;
    public  Furniture(String name,String color,String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
        public void result(){
            System.out.println("Вы собрали-"+type+" .Цвет-"+color+" и назвали это - "+name);
        }
    }

