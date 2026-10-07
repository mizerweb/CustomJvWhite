package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d2l {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!c2l.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
