package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nw {
    public static final int a;

    static {
        Object poeVar;
        try {
            poeVar = y5h.B0(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        Integer num = (Integer) poeVar;
        a = num != null ? num.intValue() : 2097152;
    }
}
