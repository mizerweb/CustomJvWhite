package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class asb implements jj6 {
    public lj6 a;
    public o4h b;
    public boolean c;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.a = lj6Var;
    }

    public final boolean a(kj6 kj6Var) {
        boolean zI;
        dsb dsbVar = new dsb();
        if (dsbVar.a(kj6Var, true) && (dsbVar.a & 2) == 2) {
            int iMin = Math.min(dsbVar.e, 8);
            nmc nmcVar = new nmc(iMin);
            kj6Var.u(0, nmcVar.a, iMin);
            nmcVar.N(0);
            if (nmcVar.a() >= 5 && nmcVar.A() == 127 && nmcVar.C() == 1179402563) {
                this.b = new ax6();
                return true;
            }
            nmcVar.N(0);
            try {
                zI = t01.i(1, nmcVar, true);
            } catch (ParserException unused) {
                zI = false;
            }
            if (zI) {
                this.b = new dbj();
            } else {
                nmcVar.N(0);
                if (mhc.e(nmcVar, mhc.o)) {
                    this.b = new mhc();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        try {
            return a(kj6Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        o4h o4hVar = this.b;
        if (o4hVar != null) {
            csb csbVar = o4hVar.a;
            dsb dsbVar = (dsb) csbVar.d;
            dsbVar.a = 0;
            dsbVar.b = 0L;
            dsbVar.c = 0;
            dsbVar.d = 0;
            dsbVar.e = 0;
            ((nmc) csbVar.e).K(0);
            csbVar.a = -1;
            csbVar.b = false;
            if (j == 0) {
                o4hVar.d(!o4hVar.l);
                return;
            }
            if (o4hVar.h != 0) {
                long j3 = (((long) o4hVar.i) * j2) / 1000000;
                o4hVar.e = j3;
                esb esbVar = o4hVar.d;
                String str = vqi.a;
                esbVar.e(j3);
                o4hVar.h = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!a(kj6Var)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            kj6Var.q();
        }
        if (!this.c) {
            kyh kyhVarG = this.a.G(0, 1);
            this.a.D();
            o4h o4hVar = this.b;
            o4hVar.c = this.a;
            o4hVar.b = kyhVarG;
            o4hVar.d(true);
            this.c = true;
        }
        o4h o4hVar2 = this.b;
        csb csbVar = o4hVar2.a;
        o4hVar2.b.getClass();
        String str = vqi.a;
        int i = o4hVar2.h;
        if (i != 0) {
            if (i == 1) {
                kj6Var.E((int) o4hVar2.f);
                o4hVar2.h = 2;
                return 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                c.t();
                return 0;
            }
            long jB = o4hVar2.d.b(kj6Var);
            if (jB >= 0) {
                s8Var.a = jB;
                return 1;
            }
            if (jB < -1) {
                o4hVar2.a(-(jB + 2));
            }
            if (!o4hVar2.l) {
                xbf xbfVarC = o4hVar2.d.c();
                xbfVarC.getClass();
                o4hVar2.c.r(xbfVarC);
                o4hVar2.b.e(xbfVarC.h());
                o4hVar2.l = true;
            }
            if (o4hVar2.k <= 0 && !csbVar.b(kj6Var)) {
                o4hVar2.h = 3;
                return -1;
            }
            o4hVar2.k = 0L;
            nmc nmcVar = (nmc) csbVar.e;
            long jB2 = o4hVar2.b(nmcVar);
            if (jB2 >= 0) {
                long j = o4hVar2.g;
                if (j + jB2 >= o4hVar2.e) {
                    long j2 = (j * 1000000) / ((long) o4hVar2.i);
                    o4hVar2.b.f(nmcVar.c, nmcVar);
                    o4hVar2.b.a(j2, 1, nmcVar.c, 0, null);
                    o4hVar2.e = -1L;
                }
            }
            o4hVar2.g += jB2;
            return 0;
        }
        while (true) {
            boolean zB = csbVar.b(kj6Var);
            nmc nmcVar2 = (nmc) csbVar.e;
            if (!zB) {
                o4hVar2.h = 3;
                return -1;
            }
            long position = kj6Var.getPosition();
            long j3 = o4hVar2.f;
            o4hVar2.k = position - j3;
            if (!o4hVar2.c(nmcVar2, j3, o4hVar2.j)) {
                b87 b87Var = (b87) o4hVar2.j.b;
                o4hVar2.i = b87Var.G;
                if (!o4hVar2.m) {
                    o4hVar2.b.g(b87Var);
                    o4hVar2.m = true;
                }
                n21 n21Var = (n21) o4hVar2.j.c;
                if (n21Var == null) {
                    if (kj6Var.getLength() == -1) {
                        o4hVar2.d = new iw8(10);
                    } else {
                        dsb dsbVar = (dsb) csbVar.d;
                        o4hVar2.d = new tc5(o4hVar2, o4hVar2.f, kj6Var.getLength(), dsbVar.d + dsbVar.e, dsbVar.b, (dsbVar.a & 4) != 0);
                    }
                    o4hVar2.h = 2;
                    bArr = nmcVar2.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    nmcVar2.L(nmcVar2.c, Arrays.copyOf(bArr, Math.max(65025, nmcVar2.c)));
                    return 0;
                }
                o4hVar2.d = n21Var;
                o4hVar2.h = 2;
                bArr = nmcVar2.a;
                if (bArr.length == 65025) {
                    return 0;
                }
                nmcVar2.L(nmcVar2.c, Arrays.copyOf(bArr, Math.max(65025, nmcVar2.c)));
                return 0;
            }
            o4hVar2.f = kj6Var.getPosition();
        }
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
