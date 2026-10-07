package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface f1b {
    default long now() {
        return nowNanos() / 1000000;
    }

    long nowNanos();
}
