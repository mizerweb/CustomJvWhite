package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h4 implements jj6 {
    public final g4 a = new g4(null, 0, 1, "audio/ac4");
    public final nmc b = new nmc(16384);
    public boolean c;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.a.h(lj6Var, new m5i(0, 1));
        lj6Var.D();
        lj6Var.r(new vk0(-9223372036854775807L));
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        int i;
        nmc nmcVar = new nmc(10);
        int i2 = 0;
        while (true) {
            kj6Var.u(0, nmcVar.a, 10);
            nmcVar.N(0);
            if (nmcVar.D() != 4801587) {
                break;
            }
            nmcVar.O(3);
            int iZ = nmcVar.z();
            i2 += iZ + 10;
            kj6Var.z(iZ);
        }
        kj6Var.q();
        kj6Var.z(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            kj6Var.u(0, nmcVar.a, 7);
            nmcVar.N(0);
            int iH = nmcVar.H();
            if (iH == 44096 || iH == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = nmcVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iH == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                kj6Var.z(i - 7);
            } else {
                kj6Var.q();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                kj6Var.z(i4);
                i3 = 0;
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
        int i = kj6Var.read(nmcVar.a, 0, 16384);
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
