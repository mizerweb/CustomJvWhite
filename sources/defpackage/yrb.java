package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class yrb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final byte p;
    public final byte q;
    public final byte r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public yrb(xrb xrbVar) {
        int i;
        int i2;
        boolean zH;
        ?? r8;
        int i3 = xrbVar.a;
        ByteBuffer byteBuffer = xrbVar.b;
        lvb.R(i3 == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        mo2 mo2Var = new mo2(iRemaining, bArr);
        this.e = mo2Var.i(3);
        mo2Var.s();
        boolean zH2 = mo2Var.h();
        this.a = zH2;
        if (zH2) {
            i2 = mo2Var.i(5);
            this.b = false;
            this.h = false;
            r8 = 0;
            i = 0;
        } else {
            if (mo2Var.h()) {
                mo2Var.t(64);
                if (mo2Var.h()) {
                    int i4 = 0;
                    while (!mo2Var.h()) {
                        i4++;
                    }
                    if (i4 < 32) {
                        mo2Var.t(i4);
                    }
                }
                boolean zH3 = mo2Var.h();
                this.b = zH3;
                if (zH3) {
                    mo2Var.t(47);
                }
            } else {
                this.b = false;
            }
            this.h = mo2Var.h();
            int i5 = mo2Var.i(5);
            int i6 = 0;
            int i7 = 0;
            boolean z = false;
            i = 0;
            while (i7 <= i5) {
                mo2Var.t(12);
                if (i7 == 0) {
                    i6 = mo2Var.i(5);
                    if (i6 > 7) {
                        zH = z;
                        zH = mo2Var.h();
                    }
                } else if (mo2Var.i(5) > 7) {
                    zH = z;
                    mo2Var.s();
                    zH = z;
                }
                zH = z;
                zH = z;
                if (this.b) {
                    mo2Var.s();
                }
                if (this.h && mo2Var.h()) {
                    if (i7 == 0) {
                        i = mo2Var.i(4);
                    } else {
                        mo2Var.t(4);
                    }
                }
                i7++;
                z = zH;
            }
            i2 = i6;
            r8 = z;
        }
        int i8 = mo2Var.i(4);
        int i9 = mo2Var.i(4);
        mo2Var.t(i8 + 1);
        mo2Var.t(i9 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = mo2Var.h();
        }
        if (this.c) {
            mo2Var.t(4);
            mo2Var.t(3);
        }
        mo2Var.t(3);
        if (this.a) {
            this.d = true;
        } else {
            mo2Var.t(4);
            boolean zH4 = mo2Var.h();
            if (zH4) {
                mo2Var.t(2);
            }
            if (mo2Var.h()) {
                this.d = true;
            } else {
                this.d = mo2Var.h();
            }
            if (this.d && !mo2Var.h()) {
                mo2Var.h();
            }
            if (zH4) {
                mo2Var.i(3);
            }
        }
        this.f = i2;
        this.g = r8;
        this.i = i;
        mo2Var.t(3);
        boolean zH5 = mo2Var.h();
        this.j = zH5;
        if (this.e == 2 && zH5) {
            this.k = mo2Var.h();
        } else {
            this.k = false;
        }
        if (this.e != 1) {
            this.l = mo2Var.h();
        } else {
            this.l = false;
        }
        if (mo2Var.h()) {
            this.p = (byte) mo2Var.i(8);
            this.q = (byte) mo2Var.i(8);
            this.r = (byte) mo2Var.i(8);
        } else {
            this.p = (byte) 0;
            this.q = (byte) 0;
            this.r = (byte) 0;
        }
        if (this.l) {
            mo2Var.s();
            this.m = false;
            this.n = false;
            this.o = 0;
        } else if (this.p == 1 && this.q == 13 && this.r == 0) {
            this.m = false;
            this.n = false;
            this.o = 0;
        } else {
            mo2Var.s();
            int i10 = this.e;
            if (i10 == 0) {
                this.m = true;
                this.n = true;
            } else if (i10 == 1) {
                this.m = false;
                this.n = false;
            } else if (this.k) {
                boolean zH6 = mo2Var.h();
                this.m = zH6;
                if (zH6) {
                    this.n = mo2Var.h();
                } else {
                    this.n = false;
                }
            } else {
                this.m = true;
                this.n = false;
            }
            if (this.m && this.n) {
                this.o = mo2Var.i(2);
            } else {
                this.o = 0;
            }
        }
        mo2Var.s();
    }
}
