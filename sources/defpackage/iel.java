package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iel {
    public static NumberFormatException a(RuntimeException runtimeException, String str) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        int length = str.length();
        return new NumberFormatException(qv1.l("Value ", length <= 1000 ? c0a.o("\"", str, "\"") : String.format("\"%s\" (truncated to %d chars (from %d))", str.substring(0, 1000), 1000, Integer.valueOf(length)), " can not be deserialized as `java.math.BigDecimal`, reason:  ", message));
    }

    public static NumberFormatException b(RuntimeException runtimeException, char[] cArr, int i, int i2) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(qv1.l("Value ", i2 <= 1000 ? c0a.o("\"", new String(cArr, i, i2), "\"") : String.format("\"%s\" (truncated to %d chars (from %d))", new String(cArr, i, 1000), 1000, Integer.valueOf(i2)), " can not be deserialized as `java.math.BigDecimal`, reason:  ", message));
    }

    public static final boolean c(wx8 wx8Var) {
        return wx8Var == null || r5h.X0(wx8Var.a);
    }

    public static BigDecimal d(char[] cArr, int i, int i2) {
        try {
            return i2 < 500 ? new BigDecimal(cArr, i, i2) : io8.b(cArr, i, i2);
        } catch (ArithmeticException e) {
            e = e;
            throw b(e, cArr, i, i2);
        } catch (NumberFormatException e2) {
            e = e2;
            throw b(e, cArr, i, i2);
        }
    }
}
