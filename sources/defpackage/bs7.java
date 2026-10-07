package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class bs7 implements r36 {
    public final xtj a;
    public String b;
    public kyh c;
    public as7 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final hab g = new hab(32);
    public final hab h = new hab(33);
    public final hab i = new hab(34);
    public final hab j = new hab(39);
    public final hab k = new hab(40);
    public long m = -9223372036854775807L;
    public final nmc n = new nmc();

    public bs7(xtj xtjVar) {
        this.a = xtjVar;
    }

    public final void a(int i, int i2, long j, long j2) {
        ake akeVar = (ake) this.a.d;
        as7 as7Var = this.d;
        boolean z = this.e;
        if (as7Var.j && as7Var.g) {
            as7Var.m = as7Var.c;
            as7Var.j = false;
        } else if (as7Var.h || as7Var.g) {
            if (z && as7Var.i) {
                as7Var.a(i + ((int) (j - as7Var.b)));
            }
            as7Var.k = as7Var.b;
            as7Var.l = as7Var.e;
            as7Var.m = as7Var.c;
            as7Var.i = true;
        }
        if (!this.e) {
            hab habVar = this.g;
            habVar.b(i2);
            hab habVar2 = this.h;
            habVar2.b(i2);
            hab habVar3 = this.i;
            habVar3.b(i2);
            if (habVar.c && habVar2.c && habVar3.c) {
                String str = this.b;
                int i3 = habVar.e;
                byte[] bArr = new byte[habVar2.e + i3 + habVar3.e];
                System.arraycopy(habVar.d, 0, bArr, 0, i3);
                System.arraycopy(habVar2.d, 0, bArr, habVar.e, habVar2.e);
                System.arraycopy(habVar3.d, 0, bArr, habVar.e + habVar2.e, habVar3.e);
                lab labVarL = xsg.l(habVar2.d, 3, habVar2.e, null);
                jab jabVar = labVarL.b;
                String strA = jabVar != null ? qu3.a(jabVar.a, jabVar.b, jabVar.c, jabVar.d, jabVar.e, jabVar.f) : null;
                a87 a87Var = new a87();
                a87Var.a = str;
                a87Var.l = uya.n("video/mp2t");
                a87Var.m = uya.n("video/hevc");
                a87Var.j = strA;
                a87Var.t = labVarL.f;
                a87Var.u = labVarL.g;
                a87Var.v = labVarL.h;
                a87Var.w = labVarL.i;
                a87Var.C = new ex3(labVarL.l, labVarL.m, labVarL.n, null, labVarL.d + 8, labVarL.e + 8);
                a87Var.z = labVarL.j;
                a87Var.o = labVarL.k;
                a87Var.D = labVarL.a + 1;
                a87Var.p = Collections.singletonList(bArr);
                b87 b87Var = new b87(a87Var);
                this.c.g(b87Var);
                int i4 = b87Var.p;
                lvb.b0(i4 != -1);
                akeVar.d(i4);
                this.e = true;
            }
        }
        hab habVar4 = this.j;
        boolean zB = habVar4.b(i2);
        nmc nmcVar = this.n;
        if (zB) {
            nmcVar.L(xsg.p(habVar4.e, habVar4.d), habVar4.d);
            nmcVar.O(5);
            akeVar.a(j2, nmcVar);
        }
        hab habVar5 = this.k;
        if (habVar5.b(i2)) {
            nmcVar.L(xsg.p(habVar5.e, habVar5.d), habVar5.d);
            nmcVar.O(5);
            akeVar.a(j2, nmcVar);
        }
    }

    public final void b(int i, byte[] bArr, int i2) {
        as7 as7Var = this.d;
        if (as7Var.f) {
            int i3 = as7Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                as7Var.g = (bArr[i4] & 128) != 0;
                as7Var.f = false;
            } else {
                as7Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, bArr, i2);
            this.h.a(i, bArr, i2);
            this.i.a(i, bArr, i2);
        }
        this.j.a(i, bArr, i2);
        this.k.a(i, bArr, i2);
    }

    public final void c(int i, int i2, long j, long j2) {
        as7 as7Var = this.d;
        boolean z = this.e;
        as7Var.g = false;
        as7Var.h = false;
        as7Var.e = j2;
        as7Var.d = 0;
        as7Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (as7Var.i && !as7Var.j) {
                if (z) {
                    as7Var.a(i);
                }
                as7Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                as7Var.h = !as7Var.j;
                as7Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        as7Var.c = z2;
        as7Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }

    @Override // defpackage.r36
    public final void d(nmc nmcVar) {
        int i;
        this.c.getClass();
        String str = vqi.a;
        while (nmcVar.a() > 0) {
            int i2 = nmcVar.b;
            int i3 = nmcVar.c;
            byte[] bArr = nmcVar.a;
            this.l += (long) nmcVar.a();
            this.c.f(nmcVar.a(), nmcVar);
            while (i2 < i3) {
                int iB = xsg.b(bArr, i2, i3, this.f);
                if (iB == i3) {
                    b(i2, bArr, i3);
                    return;
                }
                int i4 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i5 = iB;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    b(i2, bArr, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                a(i8, i7 < 0 ? -i7 : 0, j, this.m);
                c(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.r36
    public final void f() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        xsg.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        ((ake) this.a.d).c(0);
        as7 as7Var = this.d;
        if (as7Var != null) {
            as7Var.f = false;
            as7Var.g = false;
            as7Var.h = false;
            as7Var.i = false;
            as7Var.j = false;
        }
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
        this.c.getClass();
        String str = vqi.a;
        if (z) {
            ((ake) this.a.d).c(0);
            a(0, 0, this.l, this.m);
            c(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.b = m5iVar.e;
        m5iVar.b();
        kyh kyhVarG = lj6Var.G(m5iVar.d, 2);
        this.c = kyhVarG;
        this.d = new as7(kyhVarG);
        this.a.u(lj6Var, m5iVar);
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.m = j;
    }
}
