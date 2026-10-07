package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import java.math.BigInteger;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pmc extends iu8 {
    public static final byte[] c = new byte[0];
    public static final BigInteger d;
    public static final BigInteger e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigDecimal h;
    public static final BigDecimal i;
    public static final BigDecimal j;
    public static final BigDecimal k;
    public cv8 b;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        d = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        e = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
        g = bigIntegerValueOf4;
        h = new BigDecimal(bigIntegerValueOf3);
        i = new BigDecimal(bigIntegerValueOf4);
        j = new BigDecimal(bigIntegerValueOf);
        k = new BigDecimal(bigIntegerValueOf2);
    }

    public static final String Y(int i2) {
        char c2 = (char) i2;
        if (Character.isISOControl(c2)) {
            return c0a.k(i2, "(CTRL-CHAR, code ", ")");
        }
        if (i2 <= 255) {
            return "'" + c2 + "' (code " + i2 + ")";
        }
        return "'" + c2 + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
    }

    public static String o0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String r0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void D0(int i2) {
        String strConcat = "Illegal character (" + Y((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens";
        if (i2 == 30) {
            strConcat = strConcat.concat(" (consider enabling `JsonReadFeature.ALLOW_RS_CONTROL_CHAR` to allow use of Record Separators (\\u001E))");
        }
        throw new JsonParseException(this, strConcat);
    }

    public final int I0() {
        cv8 cv8Var = this.b;
        if (cv8Var == null) {
            return 0;
        }
        return cv8Var.d;
    }

    public final void P0(String str) throws InputCoercionException {
        throw new InputCoercionException(String.format("Numeric value (%s) out of range of long (%d - %s)", o0(str), Long.MIN_VALUE, Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD)), l(), null);
    }

    public abstract xt8 W();

    public abstract void k0();

    public final void t0(String str) {
        throw new JsonParseException(this, str);
    }

    public final void u0(String str) {
        throw new JsonEOFException(this, "Unexpected end-of-input".concat(str));
    }

    public final void v0(cv8 cv8Var) {
        String str;
        if (cv8Var != cv8.VALUE_STRING) {
            str = (cv8Var == cv8.VALUE_NUMBER_INT || cv8Var == cv8.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        } else {
            str = " in a String value";
        }
        u0(str);
        throw null;
    }

    public final void x0(int i2, String str) {
        if (i2 >= 0) {
            throw iu8.b(zo5.p(c0a.o("Unexpected character (", Y(i2), ")"), ": ", str), W());
        }
        u0(" in " + this.b);
        throw null;
    }

    public final void z0(int i2, String str) {
        throw iu8.b(zo5.p(c0a.o("Unexpected character (", Y(i2), ") in numeric value"), ": ", str), W());
    }
}
