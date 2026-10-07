package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a56 {
    public final v56 a;

    public a56(v56 v56Var) {
        this.a = v56Var;
    }

    public final w56 a(int i, int i2, CharSequence charSequence) {
        long j;
        int i3;
        v56 v56Var = this.a;
        if (v56Var == null) {
            return null;
        }
        long[] jArr = (long[]) v56Var.b;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = i; i4 >= 0 && i4 < jArr.length && i10 < i2; i10++) {
            char cCharAt = charSequence.charAt(i10);
            int i11 = i4 + 1;
            int i12 = (((int) jArr[i4]) + i11) - 1;
            while (true) {
                if (i11 > i12) {
                    j = 65535;
                    i3 = -(i11 + 1);
                    break;
                }
                i3 = i11 + ((i12 - i11) >>> 1);
                j = 65535;
                char c = (char) (jArr[i3] & 65535);
                if (c >= cCharAt) {
                    if (c <= cCharAt) {
                        break;
                    }
                    i12 = i3 - 1;
                } else {
                    i11 = i3 + 1;
                }
            }
            if (i3 <= 0) {
                break;
            }
            i5++;
            long j2 = jArr[i3];
            i4 = (int) ((j2 >>> 48) & j);
            if (i4 == 65535) {
                i4 = -1;
            }
            int i13 = (int) ((j2 >>> 40) & 255);
            if (i13 == 255) {
                i13 = -1;
            }
            int i14 = (int) ((j2 >>> 32) & 255);
            if (i14 == 255) {
                i14 = -1;
            }
            int i15 = (int) ((j2 >>> 24) & 255);
            if (i15 == 255) {
                i15 = -1;
            }
            if (i13 != -1 && i14 != -1 && i15 != -1) {
                i9 += i5;
                i7 = i14;
                i8 = i15;
                i6 = i13;
                i5 = 0;
            }
        }
        if (i6 == -1 || i7 == -1 || i8 == -1) {
            return null;
        }
        return new w56(i6, i7, i8, i9, 0);
    }
}
