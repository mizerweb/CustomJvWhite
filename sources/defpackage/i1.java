package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, o1 o1Var, long j, n1 n1Var, n1 n1Var2) {
        while (!unsafe.compareAndSwapObject(o1Var, j, n1Var, n1Var2)) {
            if (unsafe.getObject(o1Var, j) != n1Var) {
                return false;
            }
        }
        return true;
    }
}
