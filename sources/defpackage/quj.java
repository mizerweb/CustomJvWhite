package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class quj {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final nmc a = new nmc();
    public final StringBuilder b = new StringBuilder();

    public static String a(nmc nmcVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = nmcVar.b;
        int i2 = nmcVar.c;
        while (i < i2 && !z) {
            char c2 = (char) nmcVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        nmcVar.O(i - nmcVar.b);
        return sb.toString();
    }

    public static String b(nmc nmcVar, StringBuilder sb) {
        c(nmcVar);
        if (nmcVar.a() == 0) {
            return null;
        }
        String strA = a(nmcVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) nmcVar.A());
    }

    public static void c(nmc nmcVar) {
        while (true) {
            for (boolean z = true; nmcVar.a() > 0 && z; z = false) {
                int i = nmcVar.b;
                byte[] bArr = nmcVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    nmcVar.O(1);
                } else {
                    int i2 = nmcVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            nmcVar.O(i2 - nmcVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
