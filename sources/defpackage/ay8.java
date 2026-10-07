package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class ay8 implements r36 {
    public final String a;
    public final int b;
    public final nmc c;
    public final mo2 d;
    public kyh e;
    public String f;
    public b87 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public ay8(String str, int i) {
        this.a = str;
        this.b = i;
        nmc nmcVar = new nmc(1024);
        this.c = nmcVar;
        byte[] bArr = nmcVar.a;
        this.d = new mo2(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.r36
    public final void d(nmc nmcVar) throws ParserException {
        int i;
        boolean zH;
        this.e.getClass();
        while (nmcVar.a() > 0) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 != 1) {
                    nmc nmcVar2 = this.c;
                    mo2 mo2Var = this.d;
                    if (i2 == 2) {
                        int iA = ((this.k & (-225)) << 8) | nmcVar.A();
                        this.j = iA;
                        if (iA > nmcVar2.a.length) {
                            nmcVar2.K(iA);
                            byte[] bArr = nmcVar2.a;
                            mo2Var.getClass();
                            mo2Var.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i2 != 3) {
                            c.t();
                            return;
                        }
                        int iMin = Math.min(nmcVar.a(), this.j - this.i);
                        nmcVar.k(this.i, mo2Var.b, iMin);
                        int i3 = this.i + iMin;
                        this.i = i3;
                        if (i3 == this.j) {
                            mo2Var.q(0);
                            if (mo2Var.h()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int i4 = mo2Var.i(1);
                                int i5 = i4 == 1 ? mo2Var.i(1) : 0;
                                this.n = i5;
                                if (i5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 1) {
                                    mo2Var.i((mo2Var.i(2) + 1) * 8);
                                }
                                if (!mo2Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = mo2Var.i(6);
                                int i6 = mo2Var.i(4);
                                int i7 = mo2Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = mo2Var.g();
                                    int iB = mo2Var.b();
                                    d dVarD = ax.d(mo2Var, true);
                                    this.v = dVarD.a;
                                    this.s = dVarD.b;
                                    this.u = dVarD.c;
                                    int iB2 = iB - mo2Var.b();
                                    mo2Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    mo2Var.j(iB2, bArr2);
                                    a87 a87Var = new a87();
                                    a87Var.a = this.f;
                                    a87Var.l = uya.n("video/mp2t");
                                    a87Var.m = uya.n("audio/mp4a-latm");
                                    a87Var.j = this.v;
                                    a87Var.E = this.u;
                                    a87Var.F = this.s;
                                    a87Var.p = Collections.singletonList(bArr2);
                                    a87Var.d = this.a;
                                    a87Var.f = this.b;
                                    b87 b87Var = new b87(a87Var);
                                    if (!b87Var.equals(this.g)) {
                                        this.g = b87Var;
                                        this.t = 1024000000 / ((long) b87Var.G);
                                        this.e.g(b87Var);
                                    }
                                } else {
                                    int i8 = mo2Var.i((mo2Var.i(2) + 1) * 8);
                                    int iB3 = mo2Var.b();
                                    d dVarD2 = ax.d(mo2Var, true);
                                    this.v = dVarD2.a;
                                    this.s = dVarD2.b;
                                    this.u = dVarD2.c;
                                    mo2Var.t(i8 - (iB3 - mo2Var.b()));
                                }
                                int i9 = mo2Var.i(3);
                                this.p = i9;
                                if (i9 == 0) {
                                    mo2Var.t(8);
                                } else if (i9 == 1) {
                                    mo2Var.t(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    mo2Var.t(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        c.t();
                                        return;
                                    }
                                    mo2Var.t(1);
                                }
                                boolean zH2 = mo2Var.h();
                                this.q = zH2;
                                this.r = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.r = mo2Var.i((mo2Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = mo2Var.h();
                                            this.r = (this.r << 8) + ((long) mo2Var.i(8));
                                        } while (zH);
                                    }
                                }
                                if (mo2Var.h()) {
                                    mo2Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = mo2Var.i(8);
                                i10 += i;
                            } while (i == 255);
                            int iG2 = mo2Var.g();
                            if ((iG2 & 7) == 0) {
                                nmcVar2.N(iG2 >> 3);
                            } else {
                                mo2Var.j(i10 * 8, nmcVar2.a);
                                nmcVar2.N(0);
                            }
                            this.e.f(i10, nmcVar2);
                            lvb.b0(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i10, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                mo2Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iA2 = nmcVar.A();
                    if ((iA2 & 224) == 224) {
                        this.k = iA2;
                        this.h = 2;
                    } else if (iA2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (nmcVar.A() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.r36
    public final void f() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.e = lj6Var.G(m5iVar.d, 1);
        m5iVar.b();
        this.f = m5iVar.e;
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.l = j;
    }
}
