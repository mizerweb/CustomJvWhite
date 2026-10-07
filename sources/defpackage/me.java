package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class me implements r36 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public kyh h;
    public kyh i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public kyh v;
    public long w;
    public final mo2 b = new mo2(7, new byte[7]);
    public final nmc c = new nmc(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = np0.n;

    public me(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.r36
    public final void d(nmc nmcVar) throws ParserException {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.h.getClass();
        String str = vqi.a;
        while (nmcVar.a() > 0) {
            int i7 = this.j;
            byte b2 = -1;
            nmc nmcVar2 = this.c;
            int i8 = 3;
            mo2 mo2Var = this.b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = nmcVar.a;
                int i12 = nmcVar.b;
                int i13 = nmcVar.c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        int i16 = bArr[i12];
                        int i17 = i16 & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i17) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i18 = i12 - 1;
                                nmcVar.N(i12);
                                byte[] bArr2 = mo2Var.b;
                                if (nmcVar.a() < i11) {
                                    b = -1;
                                } else {
                                    nmcVar.k(i9, bArr2, i11);
                                    mo2Var.q(i10);
                                    int i19 = mo2Var.i(i11);
                                    int i20 = this.o;
                                    if (i20 == -1 || i19 == i20) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = mo2Var.b;
                                            if (nmcVar.a() >= i11) {
                                                nmcVar.k(i9, bArr3, i11);
                                                mo2Var.q(2);
                                                i4 = 4;
                                                if (mo2Var.i(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    nmcVar.N(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = mo2Var.b;
                                        if (nmcVar.a() >= i4) {
                                            nmcVar.k(i9, bArr4, i4);
                                            mo2Var.q(14);
                                            int i21 = mo2Var.i(13);
                                            if (i21 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = nmcVar.a;
                                                int i22 = nmcVar.c;
                                                int i23 = i18 + i21;
                                                if (i23 < i22) {
                                                    byte b3 = bArr5[i23];
                                                    b = -1;
                                                    if (b3 == -1) {
                                                        int i24 = i23 + 1;
                                                        if (i24 != i22) {
                                                            int i25 = bArr5[i24];
                                                            if ((((65280 | ((i25 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i25 & 8) >> 3) == i19) {
                                                            }
                                                        }
                                                    } else if (b3 == 73 && ((i5 = i23 + 1) == i22 || (bArr5[i5] == 68 && ((i6 = i23 + 2) == i22 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (i16 & 8) >> 3;
                            this.m = (i16 & 1) == 0;
                            if (this.n) {
                                this.j = i15;
                                this.k = 0;
                            } else {
                                this.j = 1;
                                this.k = 0;
                            }
                            nmcVar.N(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i26 = this.l;
                        int i27 = i17 | i26;
                        if (i27 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 768;
                        } else if (i27 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = np0.o;
                        } else if (i27 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 1024;
                        } else if (i27 != 1075) {
                            c = 256;
                            if (i26 != 256) {
                                this.l = np0.n;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            nmcVar2.N(0);
                            nmcVar.N(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        nmcVar.N(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = nmcVar2.a;
                    int iMin = Math.min(nmcVar.a(), 10 - this.k);
                    nmcVar.k(this.k, bArr6, iMin);
                    int i28 = this.k + iMin;
                    this.k = i28;
                    if (i28 == 10) {
                        this.i.f(10, nmcVar2);
                        nmcVar2.N(6);
                        kyh kyhVar = this.i;
                        int iZ = nmcVar2.z() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = kyhVar;
                        this.w = 0L;
                        this.t = iZ;
                    }
                } else if (i7 == 3) {
                    int i29 = this.m ? 7 : 5;
                    byte[] bArr7 = mo2Var.b;
                    int iMin2 = Math.min(nmcVar.a(), i29 - this.k);
                    nmcVar.k(this.k, bArr7, iMin2);
                    int i30 = this.k + iMin2;
                    this.k = i30;
                    if (i30 == i29) {
                        mo2Var.q(0);
                        if (this.r) {
                            mo2Var.t(10);
                        } else {
                            int i31 = mo2Var.i(2) + 1;
                            if (i31 != 2) {
                                lvb.G0("AdtsReader", "Detected audio object type: " + i31 + ", but assuming AAC LC.");
                                i31 = 2;
                            }
                            mo2Var.t(5);
                            int i32 = mo2Var.i(3);
                            int i33 = this.p;
                            byte[] bArr8 = {(byte) (((i31 << 3) & 248) | ((i33 >> 1) & 7)), (byte) (((i32 << 3) & 120) | ((i33 << 7) & np0.m))};
                            d dVarD = ax.d(new mo2(2, bArr8), false);
                            a87 a87Var = new a87();
                            a87Var.a = this.g;
                            a87Var.l = uya.n(this.f);
                            a87Var.m = uya.n("audio/mp4a-latm");
                            a87Var.j = dVarD.a;
                            a87Var.E = dVarD.c;
                            a87Var.F = dVarD.b;
                            a87Var.p = Collections.singletonList(bArr8);
                            a87Var.d = this.d;
                            a87Var.f = this.e;
                            b87 b87Var = new b87(a87Var);
                            this.s = 1024000000 / ((long) b87Var.G);
                            this.h.g(b87Var);
                            this.r = true;
                        }
                        mo2Var.t(4);
                        int i34 = mo2Var.i(13);
                        int i35 = i34 - 7;
                        if (this.m) {
                            i35 = i34 - 9;
                        }
                        kyh kyhVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = kyhVar2;
                        this.w = j;
                        this.t = i35;
                    }
                } else {
                    if (i7 != 4) {
                        c.t();
                        return;
                    }
                    int iMin3 = Math.min(nmcVar.a(), this.t - this.k);
                    this.v.f(iMin3, nmcVar);
                    int i36 = this.k + iMin3;
                    this.k = i36;
                    if (i36 == this.t) {
                        lvb.b0(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = np0.n;
                    }
                }
            } else if (nmcVar.a() != 0) {
                mo2Var.b[0] = nmcVar.a[nmcVar.b];
                mo2Var.q(2);
                int i37 = mo2Var.i(4);
                int i38 = this.p;
                if (i38 == -1 || i37 == i38) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = i37;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = np0.n;
                }
            }
        }
    }

    @Override // defpackage.r36
    public final void f() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = np0.n;
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.g = m5iVar.e;
        m5iVar.b();
        kyh kyhVarG = lj6Var.G(m5iVar.d, 1);
        this.h = kyhVarG;
        this.v = kyhVarG;
        if (!this.a) {
            this.i = new nm5();
            return;
        }
        m5iVar.a();
        m5iVar.b();
        kyh kyhVarG2 = lj6Var.G(m5iVar.d, 5);
        this.i = kyhVarG2;
        a87 a87Var = new a87();
        m5iVar.b();
        a87Var.a = m5iVar.e;
        a87Var.l = uya.n(this.f);
        a87Var.m = uya.n("application/id3");
        ewi.n(a87Var, kyhVarG2);
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.u = j;
    }
}
