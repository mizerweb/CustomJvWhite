package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lt8 {
    public final q36 a;
    public boolean b;

    public lt8(fif fifVar) {
        m20 m20Var = new m20(2, this, lt8.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 26);
        q36 q36Var = new q36();
        q36Var.b = fifVar;
        q36Var.c = m20Var;
        int iE = fifVar.e();
        if (iE <= 64) {
            q36Var.a = iE != 64 ? (-1) << iE : 0L;
            q36Var.d = q36.e;
        } else {
            q36Var.a = 0L;
            int i = (iE - 1) >>> 6;
            long[] jArr = new long[i];
            if ((iE & 63) != 0) {
                jArr[i - 1] = (-1) << iE;
            }
            q36Var.d = jArr;
        }
        this.a = q36Var;
    }

    public final boolean a() {
        return this.b;
    }

    public final void b(int i) {
        q36 q36Var = this.a;
        if (i < 64) {
            q36Var.a = (1 << i) | q36Var.a;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = (long[]) q36Var.d;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    public final int c() {
        int iNumberOfTrailingZeros;
        q36 q36Var = this.a;
        m20 m20Var = (m20) q36Var.c;
        fif fifVar = (fif) q36Var.b;
        int iE = fifVar.e();
        do {
            long j = q36Var.a;
            if (j == -1) {
                if (iE <= 64) {
                    return -1;
                }
                long[] jArr = (long[]) q36Var.d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) m20Var.invoke(fifVar, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            q36Var.a |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) m20Var.invoke(fifVar, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
