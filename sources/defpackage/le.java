package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class le implements jj6 {
    public final int a;
    public final me b;
    public final nmc c;
    public final nmc d;
    public final mo2 e;
    public lj6 f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public le(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new me(null, 0, "audio/mp4a-latm", true);
        this.c = new nmc(np0.q);
        this.i = -1;
        this.h = -1L;
        nmc nmcVar = new nmc(10);
        this.d = nmcVar;
        byte[] bArr = nmcVar.a;
        this.e = new mo2(bArr.length, bArr);
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.f = lj6Var;
        this.b.h(lj6Var, new m5i(0, 1));
        lj6Var.D();
    }

    public final int a(kj6 kj6Var) {
        int i = 0;
        while (true) {
            nmc nmcVar = this.d;
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
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        int iA = a(kj6Var);
        int i = iA;
        int i2 = 0;
        int i3 = 0;
        do {
            nmc nmcVar = this.d;
            kj6Var.u(0, nmcVar.a, 2);
            nmcVar.N(0);
            if ((nmcVar.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                kj6Var.u(0, nmcVar.a, 4);
                mo2 mo2Var = this.e;
                mo2Var.q(14);
                int i4 = mo2Var.i(13);
                if (i4 <= 6) {
                    i++;
                    kj6Var.q();
                    kj6Var.z(i);
                } else {
                    kj6Var.z(i4 - 6);
                    i3 += i4;
                }
            } else {
                i++;
                kj6Var.q();
                kj6Var.z(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iA < 8192);
        return false;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.k = false;
        this.b.f();
        this.g = j2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0102  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        int i;
        boolean z;
        this.f.getClass();
        long length = kj6Var.getLength();
        int i2 = this.a;
        int i3 = i2 & 2;
        if (i3 != 0 || ((i2 & 1) != 0 && length != -1)) {
            mo2 mo2Var = this.e;
            nmc nmcVar = this.d;
            if (!this.j) {
                this.i = -1;
                kj6Var.q();
                long j = 0;
                if (kj6Var.getPosition() == 0) {
                    a(kj6Var);
                }
                int i4 = 0;
                for (int i5 = 0; kj6Var.m(nmcVar.a, i5, 2, true); i5 = 0) {
                    try {
                        nmcVar.N(i5);
                        if (((nmcVar.H() & 65526) == 65520 ? 1 : i5) == 0) {
                            i4 = i5;
                            break;
                        }
                        if (!kj6Var.m(nmcVar.a, i5, 4, true)) {
                            break;
                        }
                        mo2Var.q(14);
                        int i6 = mo2Var.i(13);
                        if (i6 <= 6) {
                            this.j = true;
                            throw ParserException.a(null, "Malformed ADTS stream");
                        }
                        j += (long) i6;
                        i4++;
                        if (i4 == 1000 || !kj6Var.I(i6 - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                kj6Var.q();
                if (i4 > 0) {
                    this.i = (int) (j / ((long) i4));
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        nmc nmcVar2 = this.c;
        int i7 = kj6Var.read(nmcVar2.a, 0, np0.q);
        boolean z2 = i7 == -1;
        boolean z3 = this.l;
        me meVar = this.b;
        if (!z3) {
            boolean z4 = (i2 & 1) != 0 && this.i > 0;
            i = -1;
            if (!z4 || meVar.s != -9223372036854775807L || z2) {
                if (z4) {
                    long j2 = meVar.s;
                    if (j2 != -9223372036854775807L) {
                        lj6 lj6Var = this.f;
                        boolean z5 = i3 != 0;
                        int i8 = this.i;
                        lj6Var.r(new if4(length, this.h, (int) ((((long) i8) * 8000000) / j2), i8, z5, true));
                    } else {
                        this.f.r(new vk0(-9223372036854775807L));
                    }
                } else {
                    this.f.r(new vk0(-9223372036854775807L));
                }
                z = true;
                this.l = true;
            }
            if (z2) {
                return i;
            }
            nmcVar2.N(0);
            nmcVar2.M(i7);
            if (!this.k) {
                meVar.u = this.g;
                this.k = z;
            }
            meVar.d(nmcVar2);
            return 0;
        }
        i = -1;
        i = i;
        meVar = meVar;
        z = true;
        if (z2) {
            return i;
        }
        nmcVar2.N(0);
        nmcVar2.M(i7);
        if (!this.k) {
            meVar.u = this.g;
            this.k = z;
        }
        meVar.d(nmcVar2);
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
