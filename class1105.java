public class class1105 {
    public static void main(String[] args){


//        int count = 0;
//        bar: // Label構文
//        if(3 > 2){
//            System.out.println(count++ + "回　実行");
//            continue bar;

//        int count = 0;
//        bar:
//        for(int i = 0; i < 2; i++){
//            for(int j = 0; j < 2; j++){
//                for(int k = 0; k < 2; k++){
//                    System.out.println(i + j +k);
//                }
//            }
//
//        }

//        int img[][][] = {
//                { {100, 200}, {1,78} },
//                { {-1, -2} , {300, 0} },
//                { {50, 70} , {7, 90} },
//        };
//        boolean isFound = false;
//
//        bar:
//        for(int i = 0 ; i < 3 ; i++) {
//            for(int j = 0 ; j < 2 ; j++) {
//                for(int k = 0 ; k < 2 ; k++) {
//                    System.out.print(img[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println("-----------------");
//
//
//
//        }

        int img[][][] = {
                {{100, 200}, {1, 78}},
                {{-1, -2}, {300, 0}},
                {{50, 70}, {7, 90}}
        };

        // Flag variable
        boolean isFound = false;

        bar:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(img[i][j][k] + "\t");

                    if(img[i][j][k] == 78) {
                        isFound = true;
                        break;
                    }
                }
                System.out.println();
            }
            System.out.println("-----------------");

        }

        if(isFound) {
            System.out.println("78을 찾았습니다.");
        } else {
            System.out.println("78이 존재하지 않습니다.");
        }
    }
}

