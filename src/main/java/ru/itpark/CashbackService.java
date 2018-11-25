package ru.itpark;

public class CashbackService {

    public int calculateCashback(int regularPurchase, int increasedCashback, int specialCategory) {
        int percentRegularPurchase = 1;
        int percentInareasedCashback = 5;
        int percentSpecialCategory = 30;
        int maxCashback = 3_000;

        int result = (regularPurchase * percentRegularPurchase
                + increasedCashback * percentInareasedCashback
                + specialCategory * percentSpecialCategory) / 100;

        if (result > maxCashback) {
            result = maxCashback;
        }

        return result;

    }
}
