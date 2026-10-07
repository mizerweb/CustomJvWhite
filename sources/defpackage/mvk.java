package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mvk {
    public static Object a(Object obj, Serializable serializable) {
        return obj != null ? obj : serializable;
    }

    public static long b(boolean z, boolean z2, boolean z3, boolean z4) {
        long j = z ? 1L : 0L;
        if (z2) {
            j |= 2;
        }
        if (z3) {
            j |= 4;
        }
        return z4 ? 8 | j : j;
    }
}
