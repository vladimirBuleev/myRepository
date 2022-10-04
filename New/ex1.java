package New;

public class ex1 {
    public static void main(String[] args) {
        Human me=new Human("Vladimir","Buleev","Dmitrievich",25);
        System.out.println(me);
        System.out.println(me.getName());
        Human Dasha=new Human();
        Dasha.setName("Darya");
        Dasha.setSurName("Rybakova");
        Dasha.setMiddleName("Dmitrievna");
        Dasha.setAge(24);
        System.out.println(Dasha);
        Book witcher=new Book("Witcher",1452,1986,"Andrzej Sapkowski");
        System.out.println(witcher);
        witcher.setBookName("The Withcer- The Last Wish");
        System.out.println(witcher);
        System.out.println(witcher.getPageAmount());
        Movie seven=new Movie("Seven",127,"David Fincher");
        System.out.println(seven);
        seven.setMovieName("game");
        System.out.println(seven.getMovieName());
        Calculator calc=new Calculator(5,3);
        System.out.println(calc.mult());
        calc.setX(20);
        calc.setY(10);
        System.out.println(calc.division());
        System.out.println(calc.x);
        int[][] array = {
                {1, 2, 4},
                {2, 0, 5},
                {3, 8, 2}
        };
        Matrix newMatrix=new Matrix(3,3);
        newMatrix.setArrayValue(2,2,10);
        System.out.println(newMatrix.getArrayValue(2,2));
        System.out.println(newMatrix);
        newMatrix.addAnotherArray(array);
        System.out.println(newMatrix);
        newMatrix.multiplyAnotherArray(array);
        System.out.println(newMatrix);
        System.out.println(newMatrix.getArrayValue(2,1));

    }
}
