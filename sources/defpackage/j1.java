package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, o1 o1Var, long j, c1 c1Var, c1 c1Var2) {
        while (!unsafe.compareAndSwapObject(o1Var, j, c1Var, c1Var2)) {
            if (unsafe.getObject(o1Var, j) != c1Var) {
                return false;
            }
        }
        return true;
    }
}
