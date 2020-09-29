package com.company;

public class LuckySkyscraper {


    public static int toRealFloor(int fakeFloor) throws Exception {
        if (fakeFloor % 10 == 4 || fakeFloor % 100 == 13)
            throw new Exception("This floor can not be a fake floor because it ends with " + (fakeFloor % 10 == 4 ? "4" : "13"));

        int numbersEndingInForOrThirteen = 0;
        for (int i = 1; i <= fakeFloor; i++)
            numbersEndingInForOrThirteen = i % 10 == 4 || i % 100 == 13
                    ? numbersEndingInForOrThirteen + 1
                    : numbersEndingInForOrThirteen;
        return fakeFloor - numbersEndingInForOrThirteen;
    }

    public static int toFakeFloor(int realFloor) {

        int returnValue = 1;
        for (int i = 1; i <= realFloor; i++) {
            returnValue = returnValue % 100 == 13
                    ? returnValue + 1 : returnValue;
            returnValue = returnValue % 10 == 4
                    ? returnValue + 2 : returnValue + 1;
        }
        return returnValue - 1;
    }
}
