package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kpb {
    public static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String b = String.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);

    static {
        Pattern.compile("[+-]?[0-9]*[\\.]?[0-9]+([eE][+-]?[0-9]+)?");
        Pattern.compile("[+-]?[0-9]+[\\.]");
    }

    public static BigDecimal a(String str, boolean z) {
        if (z) {
            try {
                return io8.a(str);
            } catch (ArithmeticException | NumberFormatException e) {
                throw iel.a(e, str);
            }
        }
        try {
            return str.length() < 500 ? new BigDecimal(str) : io8.a(str);
        } catch (ArithmeticException e2) {
            e = e2;
            throw iel.a(e, str);
        } catch (NumberFormatException e3) {
            e = e3;
            throw iel.a(e, str);
        }
    }

    public static BigInteger b(String str, boolean z) {
        if (!z) {
            return new BigInteger(str);
        }
        try {
            return ko8.a(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000).concat(" [truncated]");
            }
            StringBuilder sbV = qt4.v("Value \"", str, "\" can not be represented as `java.math.BigInteger`, reason: ");
            sbV.append(e.getMessage());
            throw new NumberFormatException(sbV.toString());
        }
    }

    public static double c(int i, int i2, boolean z, char[] cArr) {
        return z ? Double.longBitsToDouble(oo8.a.i(cArr, i, i2)) : Double.parseDouble(new String(cArr, i, i2));
    }

    public static double d(String str, boolean z) {
        if (!z) {
            return Double.parseDouble(str);
        }
        mo8 mo8Var = oo8.a;
        return Double.longBitsToDouble(oo8.b.h(str.length(), str));
    }

    public static float e(int i, int i2, boolean z, char[] cArr) {
        return z ? Float.intBitsToFloat((int) po8.a.i(cArr, i, i2)) : Float.parseFloat(new String(cArr, i, i2));
    }

    public static float f(String str, boolean z) {
        if (!z) {
            return Float.parseFloat(str);
        }
        mo8 mo8Var = po8.a;
        return Float.intBitsToFloat((int) po8.b.h(str.length(), str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 2:
                return ((cArr[i] - '0') * 10) + i3;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            case 6:
                i3 += (cArr[i] - '0') * BuildConfig.FILE_LENGTH_TO_UPLOAD;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
                i3 += (cArr[i] - '0') * BuildConfig.FILE_LENGTH_TO_UPLOAD;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * 1000000;
                i++;
                i3 += (cArr[i] - '0') * BuildConfig.FILE_LENGTH_TO_UPLOAD;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * 1000000;
                i++;
                i3 += (cArr[i] - '0') * BuildConfig.FILE_LENGTH_TO_UPLOAD;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i3;
            default:
                return i3;
        }
    }

    public static long h(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) g(cArr, i, i3)) * 1000000000) + ((long) g(cArr, i + i3, 9));
    }
}
