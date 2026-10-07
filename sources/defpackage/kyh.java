package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface kyh {
    void a(long j, int i, int i2, int i3, jyh jyhVar);

    void b(nmc nmcVar, int i, int i2);

    default int c(q25 q25Var, int i, boolean z) {
        return d(q25Var, i, z);
    }

    int d(q25 q25Var, int i, boolean z);

    default void e(long j) {
    }

    default void f(int i, nmc nmcVar) {
        b(nmcVar, i, 0);
    }

    void g(b87 b87Var);
}
