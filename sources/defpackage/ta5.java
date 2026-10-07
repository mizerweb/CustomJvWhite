package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ta5 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final cbd a() {
        int i = a;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        return new cbd(4194304, i2, sparseIntArray, i);
    }
}
