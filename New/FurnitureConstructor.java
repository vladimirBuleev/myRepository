package New;
import New.Furniture;
public class FurnitureConstructor {
    public static void main(String[] args) {
        Furniture closet = new Furniture("SKÅNEVIK","Черный","Шкаф");
        Furniture table = new Furniture("IDÅSEN","Коричневый","Стол");
        Furniture chair = new Furniture("POÄNG","Бежевый","Стул");
        Furniture[] furnitures ={closet,table,chair};
        for( Furniture furniture:furnitures){
            furniture.result();
        }
    }
}
