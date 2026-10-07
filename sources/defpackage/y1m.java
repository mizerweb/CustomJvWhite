package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y1m {
    public static final String a(String str) {
        if (b(str)) {
            return r5h.f1(str, "mailto:");
        }
        return c(str) ? r5h.f1(str, "tel:") : str;
    }

    public static final boolean b(String str) {
        return z5h.K0(str, "mailto:", false);
    }

    public static final boolean c(String str) {
        return z5h.K0(str, "tel:", false);
    }

    public static int d(String str) {
        return (str.equals("https") || z5h.K0(str, "https:", false)) ? 2 : 1;
    }
}
