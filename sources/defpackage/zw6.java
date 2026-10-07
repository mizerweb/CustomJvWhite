package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class zw6 implements jj6 {
    public lj6 e;
    public kyh f;
    public lwa h;
    public bx6 i;
    public int j;
    public int k;
    public yw6 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final nmc b = new nmc(0, new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS]);
    public final boolean c = false;
    public final s8 d = new s8();
    public int g = 0;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.e = lj6Var;
        this.f = lj6Var.G(0, 1);
        lj6Var.D();
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        lwa lwaVarP = new vn7(18).p(kj6Var, d48.b, 0);
        if (lwaVarP != null) {
            int length = lwaVarP.a.length;
        }
        nmc nmcVar = new nmc(4);
        kj6Var.u(0, nmcVar.a, 4);
        return nmcVar.C() == 1716281667;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            yw6 yw6Var = this.l;
            if (yw6Var != null) {
                yw6Var.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.K(0);
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        bx6 bx6Var;
        xbf vk0Var;
        long j;
        long j2;
        boolean zA;
        int i = this.g;
        lwa lwaVar = null;
        int i2 = 1;
        int i3 = 0;
        if (i == 0) {
            kj6Var.q();
            long jY = kj6Var.y();
            lwa lwaVarP = new vn7(18).p(kj6Var, !this.c ? null : d48.b, 0);
            if (lwaVarP != null && lwaVarP.a.length != 0) {
                lwaVar = lwaVarP;
            }
            kj6Var.E((int) (kj6Var.y() - jY));
            this.h = lwaVar;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            kj6Var.u(0, bArr, bArr.length);
            kj6Var.q();
            this.g = 2;
            return 0;
        }
        int i4 = 4;
        int i5 = 3;
        if (i == 2) {
            nmc nmcVar = new nmc(4);
            kj6Var.readFully(nmcVar.a, 0, 4);
            if (nmcVar.C() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i6 = 7;
        int i7 = 6;
        if (i == 3) {
            int i8 = 0;
            bx6 bx6Var2 = this.i;
            boolean z = false;
            while (!z) {
                kj6Var.q();
                byte[] bArr2 = new byte[i4];
                mo2 mo2Var = new mo2(i4, bArr2);
                int i9 = i8;
                kj6Var.u(i9, bArr2, i4);
                boolean zH = mo2Var.h();
                int i10 = mo2Var.i(i6);
                int i11 = mo2Var.i(24) + i4;
                if (i10 == 0) {
                    byte[] bArr3 = new byte[38];
                    kj6Var.readFully(bArr3, i9, 38);
                    bx6Var2 = new bx6(i4, bArr3);
                } else {
                    if (bx6Var2 == null) {
                        ore.a();
                        return 0;
                    }
                    lwa lwaVar2 = bx6Var2.l;
                    if (i10 == i5) {
                        nmc nmcVar2 = new nmc(i11);
                        kj6Var.readFully(nmcVar2.a, i9, i11);
                        bx6Var2 = new bx6(bx6Var2.a, bx6Var2.b, bx6Var2.c, bx6Var2.d, bx6Var2.e, bx6Var2.g, bx6Var2.h, bx6Var2.j, cyl.b(nmcVar2), bx6Var2.l);
                    } else {
                        if (i10 == i4) {
                            nmc nmcVar3 = new nmc(i11);
                            kj6Var.readFully(nmcVar3.a, 0, i11);
                            nmcVar3.O(i4);
                            lwa lwaVarG = t01.g(Arrays.asList((String[]) t01.h(nmcVar3, false, false).a));
                            if (lwaVar2 != null) {
                                lwaVarG = lwaVar2.b(lwaVarG);
                            }
                            bx6Var = new bx6(bx6Var2.a, bx6Var2.b, bx6Var2.c, bx6Var2.d, bx6Var2.e, bx6Var2.g, bx6Var2.h, bx6Var2.j, bx6Var2.k, lwaVarG);
                        } else if (i10 == i7) {
                            nmc nmcVar4 = new nmc(i11);
                            kj6Var.readFully(nmcVar4.a, 0, i11);
                            nmcVar4.O(4);
                            lwa lwaVar3 = new lwa(c98.r(ezc.d(nmcVar4)));
                            if (lwaVar2 != null) {
                                lwaVar3 = lwaVar2.b(lwaVar3);
                            }
                            bx6Var = new bx6(bx6Var2.a, bx6Var2.b, bx6Var2.c, bx6Var2.d, bx6Var2.e, bx6Var2.g, bx6Var2.h, bx6Var2.j, bx6Var2.k, lwaVar3);
                        } else {
                            kj6Var.E(i11);
                        }
                        bx6Var2 = bx6Var;
                    }
                }
                String str = vqi.a;
                this.i = bx6Var2;
                z = zH;
                i4 = 4;
                i5 = 3;
                i6 = 7;
                i7 = 6;
                i8 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b87 b87VarC = this.i.c(bArr, this.h);
            kyh kyhVar = this.f;
            a87 a87VarA = b87VarC.a();
            a87VarA.l = uya.n("audio/flac");
            ewi.n(a87VarA, kyhVar);
            this.f.e(this.i.b());
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            kj6Var.q();
            nmc nmcVar5 = new nmc(2);
            kj6Var.u(0, nmcVar5.a, 2);
            int iH = nmcVar5.H();
            if ((iH >> 2) != 16382) {
                kj6Var.q();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            kj6Var.q();
            this.k = iH;
            lj6 lj6Var = this.e;
            String str2 = vqi.a;
            long position = kj6Var.getPosition();
            long length = kj6Var.getLength();
            this.i.getClass();
            bx6 bx6Var3 = this.i;
            xp9 xp9Var = bx6Var3.k;
            if (xp9Var != null && ((long[]) xp9Var.b).length > 0) {
                vk0Var = new vk0(bx6Var3, position, 1);
                i3 = 0;
            } else if (length == -1 || bx6Var3.j <= 0) {
                i3 = 0;
                vk0Var = new vk0(bx6Var3.b());
            } else {
                int i12 = this.k;
                int i13 = bx6Var3.c;
                oo6 oo6Var = new oo6(i2, bx6Var3);
                xw6 xw6Var = new xw6(bx6Var3, i12);
                long jB = bx6Var3.b();
                long j4 = bx6Var3.j;
                int i14 = bx6Var3.d;
                if (i14 > 0) {
                    j = ((((long) i14) + ((long) i13)) / 2) + 1;
                } else {
                    int i15 = bx6Var3.a;
                    j = 64 + (((((i15 != bx6Var3.b || i15 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i15) * ((long) bx6Var3.g)) * ((long) bx6Var3.h)) / 8);
                }
                yw6 yw6Var = new yw6(oo6Var, xw6Var, jB, j4, position, length, j, Math.max(6, i13));
                this.l = yw6Var;
                vk0Var = yw6Var.a;
            }
            lj6Var.r(vk0Var);
            this.g = 5;
            return i3;
        }
        if (i != 5) {
            c.t();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        yw6 yw6Var2 = this.l;
        if (yw6Var2 != null && yw6Var2.c != null) {
            return yw6Var2.b(kj6Var, s8Var);
        }
        if (this.n == -1) {
            bx6 bx6Var4 = this.i;
            kj6Var.q();
            kj6Var.z(1);
            byte[] bArr4 = new byte[1];
            kj6Var.u(0, bArr4, 1);
            boolean z2 = (bArr4[0] & 1) == 1;
            kj6Var.z(2);
            i6 = z2 ? 7 : 6;
            nmc nmcVar6 = new nmc(i6);
            byte[] bArr5 = nmcVar6.a;
            int i16 = 0;
            while (i16 < i6) {
                int iB = kj6Var.B(i16, bArr5, i6 - i16);
                if (iB == -1) {
                    break;
                }
                i16 += iB;
            }
            nmcVar6.M(i16);
            kj6Var.q();
            try {
                long jI = nmcVar6.I();
                if (!z2) {
                    jI *= (long) bx6Var4.b;
                }
                long j5 = bx6Var4.j;
                if (j5 == 0 || jI <= j5) {
                    j3 = jI;
                } else {
                    i2 = 0;
                }
            } catch (NumberFormatException unused) {
            }
            if (i2 == 0) {
                throw ParserException.a(null, null);
            }
            this.n = j3;
        } else {
            nmc nmcVar7 = this.b;
            int i17 = nmcVar7.c;
            if (i17 < 32768) {
                int i18 = kj6Var.read(nmcVar7.a, i17, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS - i17);
                i2 = i18 != -1 ? 0 : 1;
                if (i2 == 0) {
                    nmcVar7.M(i17 + i18);
                } else if (nmcVar7.a() == 0) {
                    long j6 = this.n * 1000000;
                    bx6 bx6Var5 = this.i;
                    String str3 = vqi.a;
                    this.f.a(j6 / ((long) bx6Var5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                i2 = 0;
            }
            int i19 = nmcVar7.b;
            int i20 = this.m;
            int i21 = this.j;
            if (i20 < i21) {
                nmcVar7.O(Math.min(i21 - i20, nmcVar7.a()));
            }
            this.i.getClass();
            int i22 = nmcVar7.b;
            while (true) {
                int i23 = nmcVar7.c - 16;
                s8 s8Var2 = this.d;
                if (i22 > i23) {
                    if (i2 != 0) {
                        while (true) {
                            int i24 = nmcVar7.c;
                            if (i22 <= i24 - this.j) {
                                nmcVar7.N(i22);
                                try {
                                    zA = ayl.a(nmcVar7, this.i, this.k, s8Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (nmcVar7.b > nmcVar7.c) {
                                    zA = false;
                                }
                                if (zA) {
                                    nmcVar7.N(i22);
                                    j2 = s8Var2.a;
                                    break;
                                }
                                i22++;
                            } else {
                                nmcVar7.N(i24);
                            }
                        }
                    } else {
                        nmcVar7.N(i22);
                    }
                    j2 = -1;
                    break;
                }
                nmcVar7.N(i22);
                if (ayl.a(nmcVar7, this.i, this.k, s8Var2)) {
                    nmcVar7.N(i22);
                    j2 = s8Var2.a;
                    break;
                }
                i22++;
            }
            int i25 = nmcVar7.b - i19;
            nmcVar7.N(i19);
            this.f.f(i25, nmcVar7);
            int i26 = this.m + i25;
            this.m = i26;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                bx6 bx6Var6 = this.i;
                String str4 = vqi.a;
                this.f.a(j7 / ((long) bx6Var6.e), 1, i26, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = nmcVar7.a.length - nmcVar7.c;
            if (nmcVar7.a() < 16 && length2 < 16) {
                int iA = nmcVar7.a();
                byte[] bArr6 = nmcVar7.a;
                System.arraycopy(bArr6, nmcVar7.b, bArr6, 0, iA);
                nmcVar7.N(0);
                nmcVar7.M(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
