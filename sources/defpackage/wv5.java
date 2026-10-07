package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.transformer.ExportException;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class wv5 implements r36 {
    public long a;
    public int c;
    public int e;
    public String f;
    public int h;
    public int i;
    public int j;
    public String l;
    public Object n;
    public Object p;
    public Object q;
    public int d = 0;
    public long b = -9223372036854775807L;
    public Object o = new AtomicInteger();
    public int k = -1;
    public int m = -1;
    public String g = "video/mp2t";

    public wv5(String str, int i, int i2) {
        this.n = new nmc(new byte[i2]);
        this.f = str;
        this.c = i;
    }

    public nh6 a() {
        return new nh6(((z88) this.n).h(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (ex3) this.o, this.i, this.j, this.k, this.l, (String) this.p, this.m, (ExportException) this.q);
    }

    public boolean b(nmc nmcVar, byte[] bArr, int i) {
        int iMin = Math.min(nmcVar.a(), i - this.e);
        nmcVar.k(this.e, bArr, iMin);
        int i2 = this.e + iMin;
        this.e = i2;
        return i2 == i;
    }

    public void c() {
        this.n = new z88(4);
        this.a = -9223372036854775807L;
        this.b = -1L;
        this.c = -2147483647;
        this.d = -1;
        this.e = -2147483647;
        this.f = null;
        this.h = -2147483647;
        this.o = null;
        this.i = -1;
        this.j = -1;
        this.k = 0;
        this.l = null;
        this.m = 0;
        this.q = null;
    }

    @Override // defpackage.r36
    public void d(nmc nmcVar) throws ParserException {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long jI0;
        int i9;
        long jI1;
        int i10;
        int i11;
        int i12;
        int i13;
        nmc nmcVar2 = (nmc) this.n;
        ((kyh) this.p).getClass();
        while (nmcVar.a() > 0) {
            switch (this.d) {
                case 0:
                    while (nmcVar.a() > 0) {
                        int i14 = this.h << 8;
                        this.h = i14;
                        int iA = i14 | nmcVar.A();
                        this.h = iA;
                        int iC = a05.c(iA);
                        this.j = iC;
                        if (iC != 0) {
                            byte[] bArr = nmcVar2.a;
                            int i15 = this.h;
                            bArr[0] = (byte) ((i15 >> 24) & 255);
                            bArr[1] = (byte) ((i15 >> 16) & 255);
                            bArr[2] = (byte) ((i15 >> 8) & 255);
                            bArr[3] = (byte) (i15 & 255);
                            this.e = 4;
                            this.h = 0;
                            if (iC != 3 && iC != 4) {
                                if (iC == 1) {
                                    this.d = 1;
                                } else {
                                    this.d = 2;
                                }
                            }
                            this.d = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(nmcVar, nmcVar2.a, 18)) {
                        byte[] bArr2 = nmcVar2.a;
                        if (((b87) this.q) == null) {
                            String str = this.l;
                            String str2 = this.f;
                            int i16 = this.c;
                            String str3 = this.g;
                            mo2 mo2VarD = a05.d(bArr2);
                            mo2VarD.t(60);
                            int i17 = a05.a[mo2VarD.i(6)];
                            int i18 = a05.b[mo2VarD.i(4)];
                            int i19 = mo2VarD.i(5);
                            int i20 = i19 >= 29 ? -1 : (a05.c[i19] * 1000) / 2;
                            mo2VarD.t(10);
                            int i21 = i17 + (mo2VarD.i(2) > 0 ? 1 : 0);
                            a87 a87Var = new a87();
                            a87Var.a = str;
                            a87Var.l = uya.n(str3);
                            a87Var.m = uya.n("audio/vnd.dts");
                            a87Var.h = i20;
                            a87Var.E = i21;
                            a87Var.F = i18;
                            a87Var.q = null;
                            a87Var.d = str2;
                            a87Var.f = i16;
                            b87 b87Var = new b87(a87Var);
                            this.q = b87Var;
                            ((kyh) this.p).g(b87Var);
                        }
                        this.i = a05.b(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[r15] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.a = k4m.b(vqi.g0(((b87) this.q).G, (((i2 >> 2) | i) + 1) * 32));
                            nmcVar2.N(0);
                            ((kyh) this.p).f(18, nmcVar2);
                            this.d = 6;
                        } else {
                            i = (bArr2[r15] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.a = k4m.b(vqi.g0(((b87) this.q).G, (((i2 >> 2) | i) + 1) * 32));
                        nmcVar2.N(0);
                        ((kyh) this.p).f(18, nmcVar2);
                        this.d = 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(nmcVar, nmcVar2.a, 7)) {
                        mo2 mo2VarD2 = a05.d(nmcVar2.a);
                        mo2VarD2.t(42);
                        this.k = mo2VarD2.i(mo2VarD2.h() ? 12 : 8) + 1;
                        this.d = 3;
                    }
                    break;
                case 3:
                    int i22 = 8;
                    if (b(nmcVar, nmcVar2.a, this.k)) {
                        mo2 mo2VarD3 = a05.d(nmcVar2.a);
                        mo2VarD3.t(40);
                        int i23 = mo2VarD3.i(2);
                        if (mo2VarD3.h()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        mo2VarD3.t(i4);
                        int i24 = mo2VarD3.i(i3) + 1;
                        boolean zH = mo2VarD3.h();
                        if (zH) {
                            i5 = mo2VarD3.i(2);
                            i6 = (mo2VarD3.i(3) + 1) * np0.o;
                            if (mo2VarD3.h()) {
                                mo2VarD3.t(36);
                            }
                            int i25 = mo2VarD3.i(3) + 1;
                            int i26 = mo2VarD3.i(3) + 1;
                            if (i25 != 1 || i26 != 1) {
                                throw ParserException.c("Multiple audio presentations or assets not supported");
                            }
                            int i27 = i23 + 1;
                            int i28 = mo2VarD3.i(i27);
                            int i29 = 0;
                            while (i29 < i27) {
                                if (((i28 >> i29) & 1) == 1) {
                                    mo2VarD3.t(i22);
                                }
                                i29++;
                                i22 = 8;
                            }
                            if (mo2VarD3.h()) {
                                mo2VarD3.t(2);
                                int i30 = (mo2VarD3.i(2) + 1) << 2;
                                int i31 = mo2VarD3.i(2) + 1;
                                for (int i32 = 0; i32 < i31; i32++) {
                                    mo2VarD3.t(i30);
                                }
                            }
                        } else {
                            i5 = -1;
                            i6 = 0;
                        }
                        mo2VarD3.t(i3);
                        mo2VarD3.t(12);
                        if (zH) {
                            if (mo2VarD3.h()) {
                                mo2VarD3.t(4);
                            }
                            if (mo2VarD3.h()) {
                                mo2VarD3.t(24);
                            }
                            if (mo2VarD3.h()) {
                                mo2VarD3.u(mo2VarD3.i(10) + 1);
                            }
                            mo2VarD3.t(5);
                            int i33 = a05.d[mo2VarD3.i(4)];
                            i7 = mo2VarD3.i(8) + 1;
                            i8 = i33;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (zH) {
                            if (i5 == 0) {
                                i9 = 32000;
                            } else if (i5 == 1) {
                                i9 = 44100;
                            } else {
                                if (i5 != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + i5);
                                }
                                i9 = 48000;
                            }
                            long j = i9;
                            String str4 = vqi.a;
                            jI0 = vqi.i0(i6, 1000000L, j, RoundingMode.DOWN);
                        } else {
                            jI0 = -9223372036854775807L;
                        }
                        e(new d("audio/vnd.dts.hd;profile=lbr", i7, i8, i24, jI0));
                        this.i = i24;
                        this.a = jI0 == -9223372036854775807L ? 0L : jI0;
                        nmcVar2.N(0);
                        ((kyh) this.p).f(this.k, nmcVar2);
                        this.d = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (b(nmcVar, nmcVar2.a, 6)) {
                        mo2 mo2VarD4 = a05.d(nmcVar2.a);
                        mo2VarD4.t(32);
                        int iH = a05.h(mo2VarD4, a05.i) + 1;
                        this.m = iH;
                        int i34 = this.e;
                        if (i34 > iH) {
                            int i35 = i34 - iH;
                            this.e = i34 - i35;
                            nmcVar.N(nmcVar.b - i35);
                        }
                        this.d = 5;
                    }
                    break;
                case 5:
                    if (b(nmcVar, nmcVar2.a, this.m)) {
                        byte[] bArr3 = nmcVar2.a;
                        AtomicInteger atomicInteger = (AtomicInteger) this.o;
                        mo2 mo2VarD5 = a05.d(bArr3);
                        int i36 = mo2VarD5.i(32) == 1078008818 ? 1 : 0;
                        int iH2 = a05.h(mo2VarD5, a05.e);
                        int i37 = iH2 + 1;
                        if (i36 == 0) {
                            jI1 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!mo2VarD5.h()) {
                                throw ParserException.c("Only supports full channel mask-based audio presentation");
                            }
                            int i38 = iH2 - 1;
                            int i39 = ((bArr3[i38] << 8) & 65535) | (bArr3[iH2] & 255);
                            String str5 = vqi.a;
                            int i40 = 65535;
                            for (int i41 = 0; i41 < i38; i41++) {
                                byte b4 = bArr3[i41];
                                int[] iArr = vqi.l;
                                int i42 = (((i40 << 4) & 65535) ^ iArr[(((b4 & 255) >> 4) ^ ((i40 >> 12) & 255)) & 255]) & 65535;
                                i40 = (((i42 << 4) & 65535) ^ iArr[((b4 & 15) ^ ((i42 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i39 != i40) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int i43 = mo2VarD5.i(2);
                            if (i43 != 0) {
                                if (i43 == 1) {
                                    i12 = 480;
                                } else {
                                    if (i43 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + i43);
                                    }
                                    i12 = 384;
                                }
                                i11 = 3;
                            } else {
                                i11 = 3;
                                i12 = np0.o;
                            }
                            int i44 = (mo2VarD5.i(i11) + 1) * i12;
                            int i45 = mo2VarD5.i(2);
                            if (i45 == 0) {
                                i13 = 32000;
                            } else if (i45 == 1) {
                                i13 = 44100;
                            } else {
                                if (i45 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + i45);
                                }
                                i13 = 48000;
                            }
                            if (mo2VarD5.h()) {
                                mo2VarD5.t(36);
                            }
                            i10 = i13 * (1 << mo2VarD5.i(2));
                            jI1 = vqi.i0(i44, 1000000L, i13, RoundingMode.DOWN);
                        }
                        int iH3 = 0;
                        for (int i46 = 0; i46 < i36; i46++) {
                            iH3 += a05.h(mo2VarD5, a05.f);
                        }
                        if (i36 != 0) {
                            atomicInteger.set(a05.h(mo2VarD5, a05.g));
                        }
                        int iH4 = iH3 + (atomicInteger.get() != 0 ? a05.h(mo2VarD5, a05.h) : 0) + i37;
                        long j2 = jI1;
                        d dVar = new d("audio/vnd.dts.uhd;profile=p2", 2, i10, iH4, j2);
                        if (this.j == 3) {
                            e(dVar);
                        }
                        this.i = iH4;
                        this.a = j2 == -9223372036854775807L ? 0L : j2;
                        nmcVar2.N(0);
                        ((kyh) this.p).f(this.m, nmcVar2);
                        this.d = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(nmcVar.a(), this.i - this.e);
                    ((kyh) this.p).f(iMin, nmcVar);
                    int i47 = this.e + iMin;
                    this.e = i47;
                    if (i47 == this.i) {
                        lvb.b0(this.b != -9223372036854775807L);
                        ((kyh) this.p).a(this.b, this.j == 4 ? 0 : 1, this.i, 0, null);
                        this.b += this.a;
                        this.d = 0;
                    }
                    break;
                default:
                    c.t();
                    return;
            }
        }
    }

    public void e(d dVar) {
        int i = dVar.b;
        String str = dVar.a;
        int i2 = dVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        b87 b87Var = (b87) this.q;
        if (b87Var != null && i2 == b87Var.F && i == b87Var.G && str.equals(b87Var.n)) {
            return;
        }
        b87 b87Var2 = (b87) this.q;
        a87 a87Var = b87Var2 == null ? new a87() : b87Var2.a();
        a87Var.a = this.l;
        a87Var.l = uya.n(this.g);
        a87Var.m = uya.n(str);
        a87Var.E = i2;
        a87Var.F = i;
        a87Var.d = this.f;
        a87Var.f = this.c;
        b87 b87Var3 = new b87(a87Var);
        this.q = b87Var3;
        ((kyh) this.p).g(b87Var3);
    }

    @Override // defpackage.r36
    public void f() {
        this.d = 0;
        this.e = 0;
        this.h = 0;
        this.b = -9223372036854775807L;
        ((AtomicInteger) this.o).set(0);
    }

    @Override // defpackage.r36
    public void g(boolean z) {
    }

    @Override // defpackage.r36
    public void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.l = m5iVar.e;
        m5iVar.b();
        this.p = lj6Var.G(m5iVar.d, 1);
    }

    @Override // defpackage.r36
    public void i(int i, long j) {
        this.b = j;
    }
}
