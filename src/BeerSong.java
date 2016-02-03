public class BeerSong {

    public static void main(String[] args) {
        int i =99;
        Ninety_Nine_Bottles_of_Beer(i);

        }
    public static int Ninety_Nine_Bottles_of_Beer(int i){
        if (i!=0) {
            while (i != 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer take one down, pass it around, ");
                i--;
                if(i!=1) {
                    System.out.println(i + " bottles of beer on the wall.");
                }
                else{
                    System.out.println("1 bottle of beer on the wall.");
                    System.out.println("1 bottle of beer on the wall, 1 bottle of beer, take one down, pass it around, no more bottles of beer on the wall.");
                }

            }
        }
        return i;
    }
    }
