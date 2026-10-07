package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class qwh {
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;
    public static final Method j;
    public static boolean k;
    public final String a;
    public final String b;
    public final String c;

    static {
        try {
            d = beg.class.getDeclaredMethod("current", null);
            e = beg.class.getDeclaredMethod("getSpanContext", null);
            f = ceg.class.getDeclaredMethod("isValid", null);
            g = ceg.class.getDeclaredMethod("getTraceId", null);
            h = ceg.class.getDeclaredMethod("getSpanId", null);
            i = ceg.class.getDeclaredMethod("getTraceFlags", null);
            j = nwh.class.getDeclaredMethod("asHex", null);
            k = true;
        } catch (Exception unused) {
            k = false;
        }
    }

    public qwh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwh)) {
            return false;
        }
        qwh qwhVar = (qwh) obj;
        return cqk.d(this.a, qwhVar.a) && cqk.d(this.b, qwhVar.b) && cqk.d(this.c, qwhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("00-", this.a, "-", this.b, "-");
        sbQ.append(this.c);
        return sbQ.toString();
    }
}
