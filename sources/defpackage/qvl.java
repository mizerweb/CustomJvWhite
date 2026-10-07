package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qvl {
    public static final boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return cqk.d(r5h.y1(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final String b(Collection collection) {
        return !collection.isEmpty() ? s5h.w0(ww3.z1(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static d46 c(int i) {
        Object next;
        y1 y1Var = new y1(0, d46.g);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((d46) next).a != i);
        d46 d46Var = (d46) next;
        return d46Var == null ? d46.CLASSIC : d46Var;
    }

    public static final String d(Collection collection) {
        return s5h.w0(ww3.z1(collection, ",", null, null, null, 62)).concat(s5h.w0(" }"));
    }

    public static final String e(Collection collection) {
        return s5h.w0(ww3.z1(collection, ",", null, null, null, 62)).concat(s5h.w0("},"));
    }
}
