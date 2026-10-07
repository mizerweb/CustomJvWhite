package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wcf extends d71 {
    public final transient byte[][] e;
    public final transient int[] f;

    public wcf(byte[][] bArr, int[] iArr) {
        super(d71.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.d71
    public final int a() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.d71
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d71)) {
            return false;
        }
        d71 d71Var = (d71) obj;
        return d71Var.a() == a() && n(a(), d71Var);
    }

    @Override // defpackage.d71
    public final String h() {
        byte[] bArrR = r();
        char[] cArr = new char[bArrR.length * 2];
        int i = 0;
        for (byte b : bArrR) {
            int i2 = i + 1;
            char[] cArr2 = p90.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // defpackage.d71
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.d71
    public final byte[] i() {
        return r();
    }

    @Override // defpackage.d71
    public final byte k(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        gm0.g(iArr[length], i, 1L);
        int iB = zqk.b(this, i);
        return bArr[iB][(i - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // defpackage.d71
    public final boolean m(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iB = zqk.b(this, i);
            while (i < i4) {
                int[] iArr = this.f;
                int i5 = iB == 0 ? 0 : iArr[iB - 1];
                int i6 = iArr[iB] - i5;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + iB];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iB];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iB++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.d71
    public final boolean n(int i, d71 d71Var) {
        if (a() - i >= 0) {
            int iB = zqk.b(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f;
                int i4 = iB == 0 ? 0 : iArr[iB - 1];
                int i5 = iArr[iB] - i4;
                byte[][] bArr = this.e;
                int i6 = iArr[bArr.length + iB];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (d71Var.m(i3, (i2 - i4) + i6, iMin, bArr[iB])) {
                    i3 += iMin;
                    i2 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.d71
    public final d71 o() {
        return new d71(r()).o();
    }

    @Override // defpackage.d71
    public final void q(l31 l31Var, int i) {
        int iB = zqk.b(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iB == 0 ? 0 : iArr[iB - 1];
            int i4 = iArr[iB] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iB];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            fcf fcfVar = new fcf(bArr[iB], i6, i6 + iMin, true, false);
            fcf fcfVar2 = l31Var.a;
            if (fcfVar2 == null) {
                fcfVar.g = fcfVar;
                fcfVar.f = fcfVar;
                l31Var.a = fcfVar;
            } else {
                fcfVar2.g.b(fcfVar);
            }
            i2 += iMin;
            iB++;
        }
        l31Var.b += (long) i;
    }

    public final byte[] r() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.d71
    public final String toString() {
        return new d71(r()).toString();
    }
}
