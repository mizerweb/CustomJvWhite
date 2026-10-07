package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e08 {
    public final l31 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = np0.r;
    public bu7[] e = new bu7[8];
    public int f = 7;

    public e08(l31 l31Var) {
        this.a = l31Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            bu7[] bu7VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(bu7VarArr, i5, bu7VarArr, i5 + i3, this.g);
            bu7[] bu7VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(bu7VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(bu7 bu7Var) {
        int i = bu7Var.c;
        int i2 = this.d;
        if (i > i2) {
            bu7[] bu7VarArr = this.e;
            Arrays.fill(bu7VarArr, 0, bu7VarArr.length, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        bu7[] bu7VarArr2 = this.e;
        if (i3 > bu7VarArr2.length) {
            bu7[] bu7VarArr3 = new bu7[bu7VarArr2.length * 2];
            System.arraycopy(bu7VarArr2, 0, bu7VarArr3, bu7VarArr2.length, bu7VarArr2.length);
            this.f = this.e.length - 1;
            this.e = bu7VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = bu7Var;
        this.g++;
        this.h += i;
    }

    public final void c(d71 d71Var) throws EOFException {
        int[] iArr = q28.a;
        int iA = d71Var.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iA; i++) {
            byte bK = d71Var.k(i);
            byte[] bArr = uqi.a;
            j2 += (long) q28.b[bK & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iA2 = d71Var.a();
        l31 l31Var = this.a;
        if (i2 >= iA2) {
            e(d71Var.a(), 127, 0);
            l31Var.o0(d71Var);
            return;
        }
        l31 l31Var2 = new l31();
        int[] iArr2 = q28.a;
        int iA3 = d71Var.a();
        int i3 = 0;
        for (int i4 = 0; i4 < iA3; i4++) {
            byte bK2 = d71Var.k(i4);
            byte[] bArr2 = uqi.a;
            int i5 = bK2 & 255;
            int i6 = q28.a[i5];
            byte b = q28.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                l31Var2.t0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            l31Var2.t0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        d71 d71VarF0 = l31Var2.f0(l31Var2.b);
        e(d71VarF0.a(), 127, np0.m);
        l31Var.o0(d71VarF0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bu7 bu7Var = (bu7) arrayList.get(i2);
            d71 d71VarO = bu7Var.a.o();
            d71 d71Var = bu7Var.b;
            Integer num = (Integer) f08.b.get(d71VarO);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    bu7[] bu7VarArr = f08.a;
                    if (cqk.d(bu7VarArr[iIntValue].b, d71Var)) {
                        length = length2;
                    } else if (cqk.d(bu7VarArr[length2].b, d71Var)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    if (cqk.d(this.e[i3].a, d71VarO)) {
                        if (cqk.d(this.e[i3].b, d71Var)) {
                            length2 = f08.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + f08.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, np0.m);
            } else if (length == -1) {
                this.a.t0(64);
                c(d71VarO);
                c(d71Var);
                b(bu7Var);
            } else {
                d71 d71Var2 = bu7.d;
                d71VarO.getClass();
                if (!d71VarO.n(d71Var2.a(), d71Var2) || cqk.d(bu7.i, d71VarO)) {
                    e(length, 63, 64);
                    c(d71Var);
                    b(bu7Var);
                } else {
                    e(length, 15, 0);
                    c(d71Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        l31 l31Var = this.a;
        if (i < i2) {
            l31Var.t0(i | i3);
            return;
        }
        l31Var.t0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            l31Var.t0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        l31Var.t0(i4);
    }
}
