package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCachback() {
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashback(2_000, 2_000, 2_000);

            assertEquals(720, cashback);
        }
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashback(2_000, 2_000, 200_000);

            assertEquals(3000, cashback);
        }
    }
}