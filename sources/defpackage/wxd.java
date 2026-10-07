package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class wxd implements jj6 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public yw6 i;
    public lj6 j;
    public boolean k;
    public final dth a = new dth(0);
    public final nmc c = new nmc(np0.r);
    public final SparseArray b = new SparseArray();
    public final uxd d = new uxd(0);

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.j = lj6Var;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        byte[] bArr = new byte[14];
        kj6Var.u(0, bArr, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        kj6Var.z(bArr[13] & 7);
        kj6Var.u(0, bArr, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        dth dthVar = this.a;
        synchronized (dthVar) {
            j3 = dthVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = dthVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            dthVar.f(j2);
        }
        yw6 yw6Var = this.i;
        if (yw6Var != null) {
            yw6Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            vxd vxdVar = (vxd) sparseArray.valueAt(i);
            vxdVar.f = false;
            vxdVar.a.f();
        }
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        char c;
        int i;
        r36 tr7Var;
        long j;
        this.j.getClass();
        long length = kj6Var.getLength();
        long j2 = -9223372036854775807L;
        uxd uxdVar = this.d;
        if (length != -1) {
            c = 3;
            if (!uxdVar.d) {
                dth dthVar = uxdVar.b;
                nmc nmcVar = uxdVar.c;
                if (!uxdVar.f) {
                    long length2 = kj6Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j3 = length2 - ((long) iMin);
                    if (kj6Var.getPosition() != j3) {
                        s8Var.a = j3;
                        return 1;
                    }
                    nmcVar.K(iMin);
                    kj6Var.q();
                    kj6Var.u(0, nmcVar.a, iMin);
                    int i2 = nmcVar.b;
                    for (int i3 = nmcVar.c - 4; i3 >= i2; i3--) {
                        if (uxd.b(i3, nmcVar.a) == 442) {
                            nmcVar.N(i3 + 4);
                            long jC = uxd.c(nmcVar);
                            if (jC != -9223372036854775807L) {
                                j2 = jC;
                                break;
                            }
                        }
                    }
                    uxdVar.h = j2;
                    uxdVar.f = true;
                    return 0;
                }
                if (uxdVar.h == -9223372036854775807L) {
                    uxdVar.a(kj6Var);
                    return 0;
                }
                if (uxdVar.e) {
                    long j4 = uxdVar.g;
                    if (j4 == -9223372036854775807L) {
                        uxdVar.a(kj6Var);
                        return 0;
                    }
                    uxdVar.i = dthVar.c(uxdVar.h) - dthVar.b(j4);
                    uxdVar.a(kj6Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, kj6Var.getLength());
                if (kj6Var.getPosition() != 0) {
                    s8Var.a = 0L;
                    return 1;
                }
                nmcVar.K(iMin2);
                kj6Var.q();
                kj6Var.u(0, nmcVar.a, iMin2);
                int i4 = nmcVar.c;
                for (int i5 = nmcVar.b; i5 < i4 - 3; i5++) {
                    if (uxd.b(i5, nmcVar.a) == 442) {
                        nmcVar.N(i5 + 4);
                        long jC2 = uxd.c(nmcVar);
                        if (jC2 != -9223372036854775807L) {
                            j = jC2;
                            uxdVar.g = j;
                            uxdVar.e = true;
                            return 0;
                        }
                    }
                }
                j = -9223372036854775807L;
                uxdVar.g = j;
                uxdVar.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = 4;
        } else {
            this.k = true;
            long j5 = uxdVar.i;
            if (j5 != -9223372036854775807L) {
                i = 4;
                yw6 yw6Var = new yw6(new zpe(18), new fik(uxdVar.b), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = yw6Var;
                this.j.r(yw6Var.a);
            } else {
                i = 4;
                this.j.r(new vk0(j5));
            }
        }
        yw6 yw6Var2 = this.i;
        if (yw6Var2 != null && yw6Var2.c != null) {
            return yw6Var2.b(kj6Var, s8Var);
        }
        kj6Var.q();
        long jY = length != -1 ? length - kj6Var.y() : -1L;
        if (jY != -1 && jY < 4) {
            return -1;
        }
        nmc nmcVar2 = this.c;
        if (!kj6Var.m(nmcVar2.a, 0, i, true)) {
            return -1;
        }
        nmcVar2.N(0);
        int iM = nmcVar2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            kj6Var.u(0, nmcVar2.a, 10);
            nmcVar2.N(9);
            kj6Var.E((nmcVar2.A() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            kj6Var.u(0, nmcVar2.a, 2);
            nmcVar2.N(0);
            kj6Var.E(nmcVar2.H() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            kj6Var.E(1);
            return 0;
        }
        int i6 = iM & 255;
        SparseArray sparseArray = this.b;
        vxd vxdVar = (vxd) sparseArray.get(i6);
        if (!this.e) {
            if (vxdVar == null) {
                if (i6 == 189) {
                    tr7Var = new g4("video/mp2p");
                    this.f = true;
                    this.h = kj6Var.getPosition();
                } else if ((iM & 224) == 192) {
                    tr7Var = new z2b(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = kj6Var.getPosition();
                } else if ((iM & 240) == 224) {
                    tr7Var = new tr7(null, "video/mp2p");
                    this.g = true;
                    this.h = kj6Var.getPosition();
                } else {
                    tr7Var = null;
                }
                if (tr7Var != null) {
                    tr7Var.h(this.j, new m5i(i6, np0.n));
                    vxdVar = new vxd(tr7Var, this.a);
                    sparseArray.put(i6, vxdVar);
                }
            }
            if (kj6Var.getPosition() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.D();
            }
        }
        kj6Var.u(0, nmcVar2.a, 2);
        nmcVar2.N(0);
        int iH = nmcVar2.H() + 6;
        if (vxdVar == null) {
            kj6Var.E(iH);
            return 0;
        }
        nmcVar2.K(iH);
        kj6Var.readFully(nmcVar2.a, 0, iH);
        nmcVar2.N(6);
        r36 r36Var = vxdVar.a;
        mo2 mo2Var = vxdVar.c;
        nmcVar2.k(0, mo2Var.b, 3);
        mo2Var.q(0);
        mo2Var.t(8);
        vxdVar.d = mo2Var.h();
        vxdVar.e = mo2Var.h();
        mo2Var.t(6);
        nmcVar2.k(0, mo2Var.b, mo2Var.i(8));
        mo2Var.q(0);
        dth dthVar2 = vxdVar.b;
        vxdVar.g = 0L;
        if (vxdVar.d) {
            mo2Var.t(4);
            long jI = ((long) mo2Var.i(3)) << 30;
            mo2Var.t(1);
            long jI2 = jI | ((long) (mo2Var.i(15) << 15));
            mo2Var.t(1);
            long jI3 = jI2 | ((long) mo2Var.i(15));
            mo2Var.t(1);
            if (!vxdVar.f && vxdVar.e) {
                mo2Var.t(4);
                long jI4 = ((long) mo2Var.i(3)) << 30;
                mo2Var.t(1);
                long jI5 = jI4 | ((long) (mo2Var.i(15) << 15));
                mo2Var.t(1);
                long jI6 = jI5 | ((long) mo2Var.i(15));
                mo2Var.t(1);
                dthVar2.b(jI6);
                vxdVar.f = true;
            }
            vxdVar.g = dthVar2.b(jI3);
        }
        r36Var.i(4, vxdVar.g);
        r36Var.d(nmcVar2);
        r36Var.g(false);
        nmcVar2.M(nmcVar2.a.length);
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
