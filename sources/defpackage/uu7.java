package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class uu7 implements jj6 {
    public lj6 b;
    public kj6 c;
    public gj2 d;
    public q2b e;
    public int g;
    public long h;
    public int i;
    public final nmc a = new nmc(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.b = lj6Var;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        return z0m.b(kj6Var, true);
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                q2b q2bVar = this.e;
                q2bVar.getClass();
                q2bVar.g(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                nmc nmcVar = this.a;
                if (i2 == 0) {
                    if (!kj6Var.t(nmcVar.a, 0, 8, true)) {
                        lj6 lj6Var = this.b;
                        lj6Var.getClass();
                        lj6Var.D();
                        this.b.r(new vk0(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    nmcVar.N(0);
                    this.h = nmcVar.C();
                    this.g = nmcVar.m();
                }
                if (this.h == 1) {
                    kj6Var.readFully(nmcVar.a, 8, 8);
                    this.i += 8;
                    this.h = nmcVar.G();
                }
                if (this.g == 1836086884) {
                    long position = kj6Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    n1b n1bVar = new n1b(0L, position - j, -9223372036854775807L, position, this.h - j);
                    lj6 lj6Var2 = this.b;
                    lj6Var2.getClass();
                    kyh kyhVarG = lj6Var2.G(1024, 4);
                    a87 a87Var = new a87();
                    a87Var.l = uya.n("image/heic");
                    a87Var.k = new lwa(n1bVar);
                    ewi.n(a87Var, kyhVarG);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                kj6Var.E((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        c.t();
                        return 0;
                    }
                    if (this.d == null || kj6Var != this.c) {
                        this.c = kj6Var;
                        this.d = new gj2(kj6Var, this.j);
                    }
                    q2b q2bVar = this.e;
                    q2bVar.getClass();
                    int iL = q2bVar.l(this.d, s8Var);
                    if (iL == 1) {
                        s8Var.a += this.j;
                    }
                    return iL;
                }
                if (this.e == null) {
                    this.e = new q2b(b8h.P0, 8);
                }
                gj2 gj2Var = new gj2(kj6Var, this.j);
                this.d = gj2Var;
                if (this.e.b(gj2Var)) {
                    q2b q2bVar2 = this.e;
                    long j2 = this.j;
                    lj6 lj6Var3 = this.b;
                    lj6Var3.getClass();
                    q2bVar2.A(new gj2(j2, lj6Var3, 11));
                    this.f = 3;
                } else {
                    lj6 lj6Var4 = this.b;
                    lj6Var4.getClass();
                    lj6Var4.D();
                    this.b.r(new vk0(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // defpackage.jj6
    public final void release() {
        q2b q2bVar = this.e;
        if (q2bVar != null) {
            q2bVar.getClass();
            this.e = null;
        }
    }
}
