public class Lasagna {

    public static final int LASAGNA_TIME= 40;

    public static void main(String[] args) {

    }

    public int expectedMinutesInOven(){
        return LASAGNA_TIME;
    }

    public int remainingMinutesInOven(int lasagnaInOven){
        return LASAGNA_TIME - lasagnaInOven;
    }

    public int preparationTimeInMinutes(int prepTime){
        return prepTime * 2;
    }
    
    public int totalTimeInMinutes(int prepTime, int lasagnaInOven){
        return (prepTime * 2) + lasagnaInOven;
    }


    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
