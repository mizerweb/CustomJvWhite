package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class wr7 implements r36 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final dc9 a;
    public final nmc b;
    public final boolean[] c = new boolean[4];
    public final ur7 d;
    public final hab e;
    public vr7 f;
    public long g;
    public String h;
    public kyh i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public wr7(dc9 dc9Var) {
        this.a = dc9Var;
        ur7 ur7Var = new ur7();
        ur7Var.e = new byte[np0.m];
        this.d = ur7Var;
        this.k = -9223372036854775807L;
        this.e = new hab(178);
        this.b = new nmc();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0232  */
    @Override // defpackage.r36
    public final void d(nmc nmcVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = nmcVar.b;
        int i6 = nmcVar.c;
        byte[] bArr = nmcVar.a;
        this.g += (long) nmcVar.a();
        this.i.f(nmcVar.a(), nmcVar);
        while (true) {
            int iB = xsg.b(bArr, i5, i6, this.c);
            ur7 ur7Var = this.d;
            hab habVar = this.e;
            if (iB == i6) {
                if (!this.j) {
                    ur7Var.b(i5, bArr, i6);
                }
                this.f.a(i5, bArr, i6);
                if (habVar != null) {
                    habVar.a(i5, bArr, i6);
                    return;
                }
                return;
            }
            int i7 = iB + 3;
            byte b = nmcVar.a[i7];
            int i8 = b & 255;
            int i9 = iB - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    ur7Var.b(i5, bArr, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = ur7Var.a;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            lvb.G0("H263Reader", "Unexpected start code value");
                            ur7Var.d = false;
                            ur7Var.b = 0;
                            ur7Var.a = 0;
                        } else {
                            ur7Var.a = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                c.t();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                ur7Var.b -= i10;
                                ur7Var.d = false;
                                kyh kyhVar = this.i;
                                int i12 = ur7Var.c;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf((byte[]) ur7Var.e, ur7Var.b);
                                mo2 mo2Var = new mo2(bArrCopyOf.length, bArrCopyOf);
                                mo2Var.u(i12);
                                mo2Var.u(4);
                                mo2Var.s();
                                mo2Var.t(8);
                                if (mo2Var.h()) {
                                    mo2Var.t(4);
                                    mo2Var.t(3);
                                }
                                int i13 = mo2Var.i(4);
                                if (i13 == 15) {
                                    int i14 = mo2Var.i(8);
                                    int i15 = mo2Var.i(8);
                                    if (i15 == 0) {
                                        lvb.G0("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = i14 / i15;
                                    }
                                } else if (i13 < 7) {
                                    f = l[i13];
                                } else {
                                    lvb.G0("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (mo2Var.h()) {
                                    mo2Var.t(2);
                                    mo2Var.t(1);
                                    if (mo2Var.h()) {
                                        mo2Var.t(15);
                                        mo2Var.s();
                                        mo2Var.t(15);
                                        mo2Var.s();
                                        mo2Var.t(15);
                                        mo2Var.s();
                                        mo2Var.t(3);
                                        mo2Var.t(11);
                                        mo2Var.s();
                                        mo2Var.t(15);
                                        mo2Var.s();
                                    }
                                }
                                if (mo2Var.i(2) != 0) {
                                    lvb.G0("H263Reader", "Unhandled video object layer shape");
                                }
                                mo2Var.s();
                                int i16 = mo2Var.i(16);
                                mo2Var.s();
                                if (mo2Var.h()) {
                                    if (i16 == 0) {
                                        lvb.G0("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i17 = 0;
                                        for (int i18 = i16 - 1; i18 > 0; i18 >>= 1) {
                                            i17++;
                                        }
                                        mo2Var.t(i17);
                                    }
                                }
                                mo2Var.s();
                                int i19 = mo2Var.i(13);
                                mo2Var.s();
                                int i20 = mo2Var.i(13);
                                mo2Var.s();
                                mo2Var.s();
                                a87 a87Var = new a87();
                                a87Var.a = str;
                                a87Var.l = uya.n("video/mp2t");
                                a87Var.m = uya.n("video/mp4v-es");
                                a87Var.t = i19;
                                a87Var.u = i20;
                                a87Var.z = f;
                                a87Var.p = Collections.singletonList(bArrCopyOf);
                                ewi.n(a87Var, kyhVar);
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            lvb.G0("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            ur7Var.d = false;
                            ur7Var.b = 0;
                            ur7Var.a = 0;
                        } else {
                            i4 = 0;
                            ur7Var.c = ur7Var.b;
                            ur7Var.a = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            lvb.G0("H263Reader", "Unexpected start code value");
                            ur7Var.d = false;
                            ur7Var.b = 0;
                            ur7Var.a = 0;
                        } else {
                            ur7Var.a = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        ur7Var.a = 1;
                        ur7Var.d = true;
                    }
                }
                ur7Var.b(i4, ur7.f, 3);
            }
            this.f.a(i5, bArr, iB);
            if (habVar == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    habVar.a(i5, bArr, iB);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (habVar.b(i3)) {
                    int iP = xsg.p(habVar.e, habVar.d);
                    String str2 = vqi.a;
                    byte[] bArr2 = habVar.d;
                    nmc nmcVar2 = this.b;
                    nmcVar2.L(iP, bArr2);
                    this.a.C(this.k, nmcVar2);
                }
                if (i8 == 178) {
                    z = true;
                    if (nmcVar.a[iB + 2] == 1) {
                        habVar.d(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i21 = i - iB;
            this.f.b(i21, this.g - ((long) i21), this.j);
            vr7 vr7Var = this.f;
            long j = this.k;
            vr7Var.e = i8;
            vr7Var.d = false;
            vr7Var.b = (i8 == 182 || i8 == 179) ? z : false;
            vr7Var.c = i8 == 182 ? z : false;
            vr7Var.f = 0;
            vr7Var.h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.r36
    public final void f() {
        xsg.a(this.c);
        ur7 ur7Var = this.d;
        ur7Var.d = false;
        ur7Var.b = 0;
        ur7Var.a = 0;
        vr7 vr7Var = this.f;
        if (vr7Var != null) {
            vr7Var.b = false;
            vr7Var.c = false;
            vr7Var.d = false;
            vr7Var.e = -1;
        }
        hab habVar = this.e;
        if (habVar != null) {
            habVar.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(0, this.g, this.j);
            vr7 vr7Var = this.f;
            vr7Var.b = false;
            vr7Var.c = false;
            vr7Var.d = false;
            vr7Var.e = -1;
        }
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.h = m5iVar.e;
        m5iVar.b();
        kyh kyhVarG = lj6Var.G(m5iVar.d, 2);
        this.i = kyhVarG;
        this.f = new vr7(kyhVarG);
        this.a.E(lj6Var, m5iVar);
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.k = j;
    }
}
