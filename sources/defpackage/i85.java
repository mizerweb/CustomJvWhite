package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class i85 {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final cbd a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new cbd(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, a, -1);
    }
}
