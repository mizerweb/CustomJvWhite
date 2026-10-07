package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ko8 {
    public static final jo8 a = new jo8();

    public static BigInteger a(String str) {
        int length = str.length();
        a.getClass();
        try {
            int i = 0;
            int iC = h0.c(str.length(), 0, length);
            char cCharAt = str.charAt(0);
            boolean z = cCharAt == '-';
            if (z || cCharAt == '+') {
                if (h0.a(1, iC, str) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
                i = 1;
            }
            return jo8.f(str, i, iC, z);
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }
}
