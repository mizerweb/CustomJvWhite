package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface tq3 {
    long a();

    default boolean b(long j) {
        return a() <= j && j <= c();
    }

    long c();
}
