package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public interface ev5 {
    public static final cv5 a = new cv5();

    xu5 a(av5 av5Var, b87 b87Var);

    void b(Looper looper, z3d z3dVar);

    int c(b87 b87Var);

    default dv5 d(av5 av5Var, b87 b87Var) {
        return dv5.l0;
    }

    default void prepare() {
    }

    default void release() {
    }
}
