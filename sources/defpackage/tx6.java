package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tx6 {
    public static final float[] a;

    static {
        long[] jArr = q1f.a;
        int iF = q1f.f(0);
        int iMax = iF > 0 ? Math.max(7, q1f.e(iF)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}
