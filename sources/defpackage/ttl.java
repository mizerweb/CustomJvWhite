package defpackage;

import java.time.Duration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ttl {
    public static o9h a(String str, int i, lx2 lx2Var) {
        char cCharAt;
        int i2;
        boolean z = true;
        boolean z2 = str.length() > 0 && str.charAt(0) == '/';
        if (lx2Var == lx2.a) {
            if (!xoh.d.matcher(str).matches()) {
                if (!z2) {
                }
                return o9h.c;
            }
            return o9h.d;
        }
        if (!z2 && !xoh.b.matcher(str).matches() && !xoh.e.matcher(str).matches()) {
            if (!xoh.f.matcher(str).matches()) {
                if (str.length() > 0 && str.charAt(0) == '@') {
                    if (ch3.r(str)) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i3 = 0; i3 < str.length(); i3++) {
                            if (str.charAt(i3) == '@') {
                                i2++;
                            }
                        }
                    }
                    if (i2 == 1 && !r5h.M0(str, ' ') && !r5h.N0(str, '\n')) {
                        return o9h.a;
                    }
                }
                String strB = b(i, str);
                int i4 = i - 1;
                while (true) {
                    if (-1 >= i4) {
                        i4 = 0;
                        break;
                    }
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 == ' ' || cCharAt2 == '\n') {
                        i4 = -1;
                        break;
                    }
                    if (cCharAt2 == '@') {
                        break;
                    }
                    i4--;
                }
                if (strB.length() != 0) {
                    if (i4 != 0 && (cCharAt = str.charAt(i4 - 1)) != ' ' && cCharAt != '\n') {
                        z = false;
                    }
                    if (strB.charAt(0) == '@' && z && !r5h.N0(strB, ' ') && !r5h.N0(strB, '\n')) {
                        return o9h.b;
                    }
                }
                return o9h.e;
            }
            return o9h.d;
        }
        return o9h.c;
    }

    public static String b(int i, String str) {
        if (str.length() == 0) {
            return str;
        }
        int i2 = i - 1;
        while (true) {
            if (-1 >= i2) {
                i2 = 0;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ' || cCharAt == '\n') {
                i2 = -1;
                break;
            }
            if (cCharAt == '@') {
                break;
            }
            i2--;
        }
        int length = str.length();
        while (true) {
            if (i >= length) {
                i = str.length();
                break;
            }
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == ' ' || cCharAt2 == '\n') {
                break;
            }
            i++;
        }
        return (i2 == i || i2 < 0 || i < 0) ? "" : str.substring(i2, i);
    }

    public static final long c(Duration duration) {
        return duration.toMillis();
    }
}
