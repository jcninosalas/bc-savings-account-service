package com.everis.demomongo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {

    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();
        return sdfDate.format(now);
    }

    public static String generateAccountNumber() {
        final String SAVINGS_ACCOUNT_PREFIX = "100-";
        Random random = new Random();
        return SAVINGS_ACCOUNT_PREFIX + random.nextInt(999999999);
    }
}
