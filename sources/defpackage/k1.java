package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, o1 o1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(o1Var, j, obj, obj2)) {
            if (unsafe.getObject(o1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
