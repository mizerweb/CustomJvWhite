package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class l5h {
    public static final DecimalFormat a;
    public static final DecimalFormat b;
    public static final DecimalFormat c;
    public static final DecimalFormat d;
    public static final DecimalFormat e;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        DecimalFormat decimalFormat2 = new DecimalFormat("#.#");
        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
        decimalFormat2.setRoundingMode(roundingMode2);
        b = decimalFormat2;
        DecimalFormat decimalFormat3 = new DecimalFormat("#");
        decimalFormat3.setRoundingMode(roundingMode2);
        c = decimalFormat3;
        DecimalFormat decimalFormat4 = new DecimalFormat("0.0");
        decimalFormat4.setRoundingMode(roundingMode);
        d = decimalFormat4;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setGroupingSeparator(' ');
        DecimalFormat decimalFormat5 = new DecimalFormat("#,###", decimalFormatSymbols);
        decimalFormat5.setGroupingUsed(true);
        e = decimalFormat5;
    }

    public static final String a(long j) {
        DecimalFormat decimalFormat = a;
        if (j >= 1000000000) {
            return zo5.o(decimalFormat.format(j / 1.0E9d), "B");
        }
        if (j >= 1000000) {
            return zo5.o(decimalFormat.format(j / 1000000.0d), "M");
        }
        if (j >= 1000) {
            return zo5.o(decimalFormat.format(j / 1000.0d), "K");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        return sb.toString();
    }
}
