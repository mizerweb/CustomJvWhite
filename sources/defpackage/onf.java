package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface onf {
    static boolean a(int i) {
        return i == 2 || i == 3;
    }

    default boolean isConnected() {
        return ((rnf) this).q >= 2;
    }
}
