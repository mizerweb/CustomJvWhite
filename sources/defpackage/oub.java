package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface oub {
    Long a();

    boolean b();

    long c();

    void d();

    void dismiss();

    default boolean e() {
        Long lA = a();
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        if (jLongValue == Long.MIN_VALUE) {
            return true;
        }
        long jC = c() - jLongValue;
        ghb ghbVar = ew5.b;
        return jC > ew5.g(qe7.O(24, lw5.HOURS));
    }

    void f();

    r8e getState();
}
