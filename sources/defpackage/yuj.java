package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yuj {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(nmc nmcVar) {
        nmcVar.getClass();
        String strN = nmcVar.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = vqi.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                ore.p("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(nmc nmcVar) {
        int i = nmcVar.b;
        if (a(nmcVar)) {
            return;
        }
        nmcVar.N(i);
        throw ParserException.a(null, "Expected WEBVTT. Got " + nmcVar.n(StandardCharsets.UTF_8));
    }
}
