package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rx0 {
    public static final int a;
    public static final int b;
    public static volatile qx0 c;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        a = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        b = 384;
    }

    public static final qx0 a() {
        if (c == null) {
            synchronized (rx0.class) {
                if (c == null) {
                    c = new qx0(b, a);
                }
            }
        }
        return c;
    }
}
