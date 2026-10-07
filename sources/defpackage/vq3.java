package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class vq3 implements xbf {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public vq3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        long[] jArr = this.e;
        int iF = vqi.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        zbf zbfVar = new zbf(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new wbf(zbfVar, zbfVar);
        }
        int i = iF + 1;
        return new wbf(zbfVar, new zbf(jArr[i], jArr2[i]));
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
