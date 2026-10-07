package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o2b implements xbf {
    public final long a;
    public final p2b[] b;
    public final int c;

    public o2b(long j, p2b[] p2bVarArr, int i) {
        this.a = j;
        this.b = p2bVarArr;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009e A[SYNTHETIC] */
    @Override // defpackage.xbf
    public final wbf d(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        int i;
        long jMin2;
        zbf zbfVar;
        wbf wbfVar;
        lyh lyhVar;
        long[] jArr;
        int iA;
        int iA2;
        int iB;
        p2b[] p2bVarArr = this.b;
        int length = p2bVarArr.length;
        zbf zbfVar2 = zbf.c;
        if (length == 0) {
            return new wbf(zbfVar2, zbfVar2);
        }
        int i2 = this.c;
        if (i2 != -1) {
            lyh lyhVar2 = p2bVarArr[i2].b;
            int iA3 = lyhVar2.a(j);
            if (iA3 == -1) {
                iA3 = lyhVar2.b(j);
            }
            long[] jArr2 = lyhVar2.c;
            long[] jArr3 = lyhVar2.f;
            if (iA3 == -1) {
                return new wbf(zbfVar2, zbfVar2);
            }
            j3 = jArr3[iA3];
            j2 = jArr2[iA3];
            if (j3 < j && iA3 < lyhVar2.b - 1 && (iB = lyhVar2.b(j)) != -1 && iB != iA3) {
                j4 = jArr3[iB];
                jMin = jArr2[iB];
            }
            jMin2 = j2;
            for (i = 0; i < p2bVarArr.length; i++) {
                if (i != i2) {
                    lyhVar = p2bVarArr[i].b;
                    jArr = lyhVar.c;
                    iA = lyhVar.a(j3);
                    if (iA == -1) {
                        iA = lyhVar.b(j3);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iA2 = lyhVar.a(j4);
                        if (iA2 == -1) {
                            iA2 = lyhVar.b(j4);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            zbfVar = new zbf(j3, jMin2);
            if (j4 == -9223372036854775807L) {
                wbfVar = new wbf(zbfVar, zbfVar);
            } else {
                wbfVar = new wbf(zbfVar, new zbf(j4, jMin));
            }
            return wbfVar;
        }
        j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
        j3 = j;
        jMin = -1;
        j4 = -9223372036854775807L;
        jMin2 = j2;
        while (i < p2bVarArr.length) {
            if (i != i2) {
                lyhVar = p2bVarArr[i].b;
                jArr = lyhVar.c;
                iA = lyhVar.a(j3);
                if (iA == -1) {
                    iA = lyhVar.b(j3);
                }
                if (iA != -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j4 == -9223372036854775807L) {
                    iA2 = lyhVar.a(j4);
                    if (iA2 == -1) {
                        iA2 = lyhVar.b(j4);
                    }
                    if (iA2 == -1) {
                        jMin = Math.min(jArr[iA2], jMin);
                    }
                }
            }
        }
        zbfVar = new zbf(j3, jMin2);
        if (j4 == -9223372036854775807L) {
            wbfVar = new wbf(zbfVar, zbfVar);
        } else {
            wbfVar = new wbf(zbfVar, new zbf(j4, jMin));
        }
        return wbfVar;
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.a;
    }
}
