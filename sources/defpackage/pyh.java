package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pyh {
    public static final pyh d = new pyh(new oyh());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = vqi.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public pyh(oyh oyhVar) {
        this.a = oyhVar.a;
        this.b = oyhVar.b;
        this.c = oyhVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pyh.class == obj.getClass()) {
            pyh pyhVar = (pyh) obj;
            if (this.a == pyhVar.a && this.b == pyhVar.b && this.c == pyhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
