package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class dsb {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final nmc g = new nmc(255);

    public final boolean a(kj6 kj6Var, boolean z) throws ParserException, EOFException {
        boolean zM;
        boolean zM2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        nmc nmcVar = this.g;
        nmcVar.K(27);
        try {
            zM = kj6Var.m(nmcVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zM = false;
        }
        if (zM && nmcVar.C() == 1332176723) {
            if (nmcVar.A() == 0) {
                this.a = nmcVar.A();
                this.b = nmcVar.p();
                nmcVar.r();
                nmcVar.r();
                nmcVar.r();
                int iA = nmcVar.A();
                this.c = iA;
                this.d = iA + 27;
                nmcVar.K(iA);
                try {
                    zM2 = kj6Var.m(nmcVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zM2 = false;
                }
                if (zM2) {
                    for (int i = 0; i < this.c; i++) {
                        int iA2 = nmcVar.A();
                        this.f[i] = iA2;
                        this.e += iA2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(kj6 kj6Var, long j) {
        boolean zM;
        lvb.R(kj6Var.getPosition() == kj6Var.y());
        nmc nmcVar = this.g;
        nmcVar.K(4);
        while (true) {
            if (j != -1 && kj6Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zM = kj6Var.m(nmcVar.a, 0, 4, true);
            } catch (EOFException unused) {
                zM = false;
            }
            if (!zM) {
                break;
            }
            nmcVar.N(0);
            if (nmcVar.C() == 1332176723) {
                kj6Var.q();
                return true;
            }
            kj6Var.E(1);
        }
        do {
            if (j != -1 && kj6Var.getPosition() >= j) {
                break;
            }
        } while (kj6Var.C(1) != -1);
        return false;
    }
}
