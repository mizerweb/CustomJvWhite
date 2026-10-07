package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ezl {
    public static k1i a(Byte b) {
        Object obj = null;
        if (b == null) {
            return null;
        }
        y1 y1Var = new y1(0, k1i.e);
        while (y1Var.hasNext()) {
            Object next = y1Var.next();
            if (((k1i) next).a == b.byteValue()) {
                obj = next;
                break;
            }
        }
        return (k1i) obj;
    }

    public static final boolean b(int i) {
        return 1 <= i && i < 101;
    }

    public static final boolean c(int i) {
        return i == -1;
    }

    public static final boolean d(int i) {
        return i == 0;
    }

    public static String e(int i) {
        if (c(i)) {
            return "Progress(indeterminate)";
        }
        return i == 0 ? "Progress(none)" : c0a.k(i, "Progress(", "%)");
    }
}
