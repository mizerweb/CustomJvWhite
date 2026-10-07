package defpackage;

import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class edg {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final cdg i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public edg(float f, float f2, int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / HttpStatus.SC_BAD_REQUEST;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        this.i = z ? new bdg(this) : new ddg(this);
    }

    public final void a(int i, int i2) {
        cdg cdgVar = this.i;
        cdgVar.g(i2);
        Object objA = cdgVar.a();
        int i3 = this.b;
        System.arraycopy(objA, i * i3, cdgVar.n(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    public final void b() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0.0d;
        this.i.flush();
    }

    public final void c(ByteBuffer byteBuffer) {
        lvb.b0(this.k >= 0);
        int iRemaining = byteBuffer.remaining();
        cdg cdgVar = this.i;
        int iQ = cdgVar.q();
        int i = this.b;
        int iMin = Math.min(iRemaining / (iQ * i), this.k);
        cdgVar.c(iMin, byteBuffer);
        this.k -= iMin;
        System.arraycopy(cdgVar.n(), iMin * i, cdgVar.n(), 0, this.k * i);
    }

    public final int d() {
        lvb.b0(this.k >= 0);
        return this.i.q() * this.k * this.b;
    }

    public final int e() {
        return this.i.q() * this.j * this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        float f;
        int iK;
        double d;
        int i;
        int iRound;
        int i2;
        int iRound2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i6 = this.a;
        int i7 = 1;
        cdg cdgVar = this.i;
        int i8 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i9 = this.j;
            int i10 = this.h;
            if (i9 >= i10) {
                int i11 = 0;
                while (true) {
                    int i12 = this.o;
                    if (i12 > 0) {
                        int iMin = Math.min(i10, i12);
                        a(i11, iMin);
                        this.o -= iMin;
                        i11 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i7;
                        i = i10;
                    } else {
                        int i13 = i6 > 4000 ? i6 / y5g.CLOSE_SOCKET_CODE_TIMEOUT : i7;
                        int i14 = this.g;
                        int i15 = this.f;
                        if (i8 == i7 && i13 == i7) {
                            iK = cdgVar.f(i11, i15, i14);
                            f = f4;
                        } else {
                            cdgVar.e(i11, i13);
                            f = f4;
                            int iK2 = cdgVar.k(i15 / i13, i14 / i13);
                            if (i13 != i7) {
                                int i16 = iK2 * i13;
                                int i17 = i13 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                if (i18 >= i15) {
                                    i15 = i18;
                                }
                                if (i19 <= i14) {
                                    i14 = i19;
                                }
                                if (i8 == i7) {
                                    iK = cdgVar.f(i11, i15, i14);
                                } else {
                                    cdgVar.e(i11, i7);
                                    iK = cdgVar.k(i15, i14);
                                }
                            } else {
                                iK = iK2;
                            }
                        }
                        int i20 = cdgVar.h() ? this.p : iK;
                        cdgVar.m();
                        this.p = iK;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d4 = (((double) i20) / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - ((double) iRound2);
                                cdgVar = cdgVar;
                            } else {
                                d = d2;
                                double d5 = (((2.0d - d) * ((double) i20)) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.o = iRound3;
                                this.q = d5 - ((double) iRound3);
                                iRound2 = i20;
                            }
                            cdgVar.g(iRound2);
                            int i21 = i10;
                            int i22 = iRound2;
                            cdgVar.i(i22, this.b, this.k, i11, i11 + i20);
                            this.k += i22;
                            i11 = i20 + i22 + i11;
                            i = i21;
                            i2 = i7;
                        } else {
                            d = d2;
                            int i23 = i7;
                            i = i10;
                            if (d < 0.5d) {
                                double d6 = ((((double) i20) * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.q = d6 - ((double) iRound);
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i20)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.o = iRound4;
                                this.q = d7 - ((double) iRound4);
                                iRound = i20;
                            }
                            int i24 = i20 + iRound;
                            cdgVar.g(i24);
                            i2 = i23;
                            System.arraycopy(cdgVar.a(), i11 * i8, cdgVar.n(), this.k * i8, i20 * i8);
                            int i25 = i11;
                            cdgVar.i(iRound, this.b, this.k + i20, i20 + i11, i25);
                            this.k += i24;
                            i11 = i25 + iRound;
                        }
                    }
                    if (i11 + i > i9) {
                        break;
                    }
                    i10 = i;
                    f4 = f;
                    i7 = i2;
                    d2 = d;
                }
                int i26 = this.j - i11;
                System.arraycopy(cdgVar.a(), i11 * i8, cdgVar.a(), 0, i26 * i8);
                this.j = i26;
            }
            if (f != 1.0f || this.k == i5) {
            }
            long j3 = (long) (i6 / f);
            long j4 = i6;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i27 = this.k - i5;
            cdgVar.p(i27);
            System.arraycopy(cdgVar.n(), i5 * i8, cdgVar.o(), this.l * i8, i27 * i8);
            this.k = i5;
            this.l += i27;
            int i28 = 0;
            while (true) {
                i3 = this.l - 1;
                if (i28 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.m + 1;
                    j = i4;
                    long j5 = j * j3;
                    j2 = this.n;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i29 = i2;
                    cdgVar.g(i29);
                    cdgVar.l(i28, j4, j3);
                    this.n += i29;
                    this.k += i29;
                }
                int i30 = i2;
                this.m = i4;
                if (j == j4) {
                    this.m = 0;
                    lvb.b0(j2 == j3 ? i30 : 0);
                    this.n = 0;
                }
                i28++;
                i2 = i30;
            }
            if (i3 == 0) {
                return;
            }
            System.arraycopy(cdgVar.o(), i3 * i8, cdgVar.o(), 0, (this.l - i3) * i8);
            this.l -= i3;
            return;
        }
        a(0, this.j);
        this.j = 0;
        f = f4;
        i2 = 1;
        if (f != 1.0f) {
        }
    }

    public final void g() {
        int i = this.j;
        float f = this.c;
        float f2 = this.d;
        double d = f / f2;
        double d2 = this.e * f2;
        int i2 = this.o;
        int i3 = this.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + this.q) + ((double) this.l)) / d2) + 0.5d));
        this.q = 0.0d;
        int i4 = this.h * 2;
        cdg cdgVar = this.i;
        cdgVar.j(i4 + i);
        cdgVar.d(i * this.b, i4);
        this.j = i4 + this.j;
        f();
        if (this.k > i3) {
            this.k = Math.max(i3, 0);
        }
        this.j = 0;
        this.o = 0;
        this.l = 0;
    }

    public final void h(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        cdg cdgVar = this.i;
        int iQ = iRemaining / (cdgVar.q() * this.b);
        cdgVar.j(iQ);
        cdgVar.b(iRemaining, byteBuffer);
        this.j += iQ;
        f();
    }
}
