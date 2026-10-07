package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f4 implements jj6 {
    public final g4 a = new g4("audio/ac3");
    public final nmc b = new nmc(2786);
    public boolean c;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.a.h(lj6Var, new m5i(0, 1));
        lj6Var.D();
        lj6Var.r(new vk0(-9223372036854775807L));
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        int iC;
        nmc nmcVar = new nmc(10);
        int i = 0;
        while (true) {
            kj6Var.u(0, nmcVar.a, 10);
            nmcVar.N(0);
            if (nmcVar.D() != 4801587) {
                break;
            }
            nmcVar.O(3);
            int iZ = nmcVar.z();
            i += iZ + 10;
            kj6Var.z(iZ);
        }
        kj6Var.q();
        kj6Var.z(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            kj6Var.u(0, nmcVar.a, 6);
            nmcVar.N(0);
            if (nmcVar.H() != 2935) {
                kj6Var.q();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                kj6Var.z(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = nmcVar.a;
                if (bArr.length < 6) {
                    iC = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iC = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iC = t01.c((b & 192) >> 6, b & 63);
                }
                if (iC == -1) {
                    return false;
                }
                kj6Var.z(iC - 6);
            }
        }
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.c = false;
        this.a.f();
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        nmc nmcVar = this.b;
        int i = kj6Var.read(nmcVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        nmcVar.N(0);
        nmcVar.M(i);
        boolean z = this.c;
        g4 g4Var = this.a;
        if (!z) {
            g4Var.o = 0L;
            this.c = true;
        }
        g4Var.d(nmcVar);
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
