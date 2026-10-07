package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zr7 implements r36 {
    public final xtj a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public kyh j;
    public yr7 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final hab d = new hab(7);
    public final hab e = new hab(8);
    public final hab f = new hab(6);
    public long m = -9223372036854775807L;
    public final nmc o = new nmc();

    public zr7(xtj xtjVar, boolean z, boolean z2) {
        this.a = xtjVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
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
    public final void a(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        ake akeVar = (ake) this.a.d;
        if (!this.l || this.k.c) {
            hab habVar = this.d;
            habVar.b(i2);
            hab habVar2 = this.e;
            habVar2.b(i2);
            boolean z4 = this.l;
            boolean z5 = habVar.c;
            if (z4) {
                if (z5) {
                    oab oabVarN = xsg.n(3, habVar.d, habVar.e);
                    akeVar.d(oabVarN.s);
                    this.k.d.append(oabVarN.d, oabVarN);
                    habVar.c();
                } else if (habVar2.c) {
                    mo2 mo2Var = new mo2(habVar2.d, 4, habVar2.e);
                    int iM = mo2Var.m();
                    int iM2 = mo2Var.m();
                    mo2Var.s();
                    this.k.e.append(iM, new nab(iM, iM2, mo2Var.h()));
                    habVar2.c();
                }
            } else if (z5 && habVar2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(habVar.d, habVar.e));
                arrayList.add(Arrays.copyOf(habVar2.d, habVar2.e));
                oab oabVarN2 = xsg.n(3, habVar.d, habVar.e);
                int i8 = oabVarN2.s;
                mo2 mo2Var2 = new mo2(habVar2.d, 4, habVar2.e);
                int iM3 = mo2Var2.m();
                int iM4 = mo2Var2.m();
                mo2Var2.s();
                nab nabVar = new nab(iM3, iM4, mo2Var2.h());
                int i9 = oabVarN2.a;
                int i10 = oabVarN2.b;
                int i11 = oabVarN2.c;
                byte[] bArr = qu3.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                kyh kyhVar = this.j;
                a87 a87Var = new a87();
                a87Var.a = this.i;
                a87Var.l = uya.n("video/mp2t");
                a87Var.m = uya.n("video/avc");
                a87Var.j = str;
                a87Var.t = oabVarN2.e;
                a87Var.u = oabVarN2.f;
                a87Var.C = new ex3(oabVarN2.p, oabVarN2.q, oabVarN2.r, null, oabVarN2.h + 8, oabVarN2.i + 8);
                a87Var.z = oabVarN2.g;
                a87Var.p = arrayList;
                a87Var.o = i8;
                ewi.n(a87Var, kyhVar);
                this.l = true;
                akeVar.d(i8);
                this.k.d.append(oabVarN2.d, oabVarN2);
                this.k.e.append(iM3, nabVar);
                habVar.c();
                habVar2.c();
            }
        }
        hab habVar3 = this.f;
        if (habVar3.b(i2)) {
            int iP = xsg.p(habVar3.e, habVar3.d);
            byte[] bArr2 = habVar3.d;
            nmc nmcVar = this.o;
            nmcVar.L(iP, bArr2);
            nmcVar.N(4);
            akeVar.a(j2, nmcVar);
        }
        yr7 yr7Var = this.k;
        boolean z6 = this.l;
        if (yr7Var.i == 9) {
            if (z6 && yr7Var.o) {
                j3 = yr7Var.j;
                i3 = i + ((int) (j - j3));
                j4 = yr7Var.q;
                if (j4 != -9223372036854775807L) {
                    j5 = yr7Var.p;
                    if (j3 != j5) {
                        yr7Var.a.a(j4, yr7Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            yr7Var.p = yr7Var.j;
            yr7Var.q = yr7Var.l;
            yr7Var.r = false;
            yr7Var.o = true;
        } else if (yr7Var.c) {
            xr7 xr7Var = yr7Var.n;
            xr7 xr7Var2 = yr7Var.m;
            if (xr7Var.a) {
                if (xr7Var2.a) {
                    oab oabVar = xr7Var.c;
                    oabVar.getClass();
                    oab oabVar2 = xr7Var2.c;
                    oabVar2.getClass();
                    int i12 = oabVar2.m;
                    if (xr7Var.f != xr7Var2.f || xr7Var.g != xr7Var2.g || xr7Var.h != xr7Var2.h || ((xr7Var.i && xr7Var2.i && xr7Var.j != xr7Var2.j) || (((i5 = xr7Var.d) != (i6 = xr7Var2.d) && (i5 == 0 || i6 == 0)) || (((i7 = oabVar.m) == 0 && i12 == 0 && (xr7Var.m != xr7Var2.m || xr7Var.n != xr7Var2.n)) || ((i7 == 1 && i12 == 1 && (xr7Var.o != xr7Var2.o || xr7Var.p != xr7Var2.p)) || (z3 = xr7Var.k) != xr7Var2.k || (z3 && xr7Var.l != xr7Var2.l)))))) {
                        if (z6) {
                            j3 = yr7Var.j;
                            i3 = i + ((int) (j - j3));
                            j4 = yr7Var.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = yr7Var.p;
                                if (j3 != j5) {
                                    yr7Var.a.a(j4, yr7Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        yr7Var.p = yr7Var.j;
                        yr7Var.q = yr7Var.l;
                        yr7Var.r = false;
                        yr7Var.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = yr7Var.j;
                        i3 = i + ((int) (j - j3));
                        j4 = yr7Var.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = yr7Var.p;
                            if (j3 != j5) {
                                yr7Var.a.a(j4, yr7Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    yr7Var.p = yr7Var.j;
                    yr7Var.q = yr7Var.l;
                    yr7Var.r = false;
                    yr7Var.o = true;
                }
            }
        }
        if (yr7Var.b) {
            xr7 xr7Var3 = yr7Var.n;
            z = xr7Var3.b && ((i4 = xr7Var3.e) == 7 || i4 == 2);
        } else {
            z = yr7Var.s;
        }
        boolean z7 = yr7Var.r;
        int i13 = yr7Var.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        yr7Var.r = z8;
        yr7Var.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void b(int i, byte[] bArr, int i2) {
        boolean zH;
        boolean zH2;
        boolean z;
        boolean z2;
        int iM;
        int i3;
        int i4;
        int i5;
        int iN;
        int iN2;
        if (!this.l || this.k.c) {
            this.d.a(i, bArr, i2);
            this.e.a(i, bArr, i2);
        }
        this.f.a(i, bArr, i2);
        yr7 yr7Var = this.k;
        SparseArray sparseArray = yr7Var.e;
        mo2 mo2Var = yr7Var.f;
        if (yr7Var.k) {
            int i6 = i2 - i;
            byte[] bArr2 = yr7Var.g;
            int length = bArr2.length;
            int i7 = yr7Var.h + i6;
            if (length < i7) {
                yr7Var.g = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i, yr7Var.g, yr7Var.h, i6);
            int i8 = yr7Var.h + i6;
            yr7Var.h = i8;
            mo2Var.b = yr7Var.g;
            mo2Var.d = 0;
            mo2Var.c = i8;
            mo2Var.e = 0;
            mo2Var.a();
            if (mo2Var.d(8)) {
                mo2Var.s();
                int i9 = mo2Var.i(2);
                mo2Var.t(5);
                if (mo2Var.e()) {
                    mo2Var.m();
                    if (mo2Var.e()) {
                        int iM2 = mo2Var.m();
                        if (!yr7Var.c) {
                            yr7Var.k = false;
                            xr7 xr7Var = yr7Var.n;
                            xr7Var.e = iM2;
                            xr7Var.b = true;
                            return;
                        }
                        if (mo2Var.e()) {
                            int iM3 = mo2Var.m();
                            if (sparseArray.indexOfKey(iM3) < 0) {
                                yr7Var.k = false;
                                return;
                            }
                            nab nabVar = (nab) sparseArray.get(iM3);
                            SparseArray sparseArray2 = yr7Var.d;
                            int i10 = nabVar.a;
                            boolean z3 = nabVar.b;
                            oab oabVar = (oab) sparseArray2.get(i10);
                            boolean z4 = oabVar.j;
                            int i11 = oabVar.n;
                            int i12 = oabVar.l;
                            if (z4) {
                                if (!mo2Var.d(2)) {
                                    return;
                                } else {
                                    mo2Var.t(2);
                                }
                            }
                            if (mo2Var.d(i12)) {
                                int i13 = mo2Var.i(i12);
                                if (!oabVar.k) {
                                    if (mo2Var.d(1)) {
                                        zH = mo2Var.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!mo2Var.d(1)) {
                                                return;
                                            }
                                            zH2 = mo2Var.h();
                                            z = true;
                                        }
                                        if (yr7Var.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iM = 0;
                                        } else if (!mo2Var.e()) {
                                            return;
                                        } else {
                                            iM = mo2Var.m();
                                        }
                                        i3 = oabVar.m;
                                        if (i3 != 0) {
                                            if (mo2Var.d(i11)) {
                                                i4 = mo2Var.i(i11);
                                                if (!z3 && !zH) {
                                                    if (!mo2Var.e()) {
                                                        return;
                                                    }
                                                    iN2 = mo2Var.n();
                                                    i5 = 0;
                                                }
                                                iN = 0;
                                                xr7 xr7Var2 = yr7Var.n;
                                                xr7Var2.c = oabVar;
                                                xr7Var2.d = i9;
                                                xr7Var2.e = iM2;
                                                xr7Var2.f = i13;
                                                xr7Var2.g = iM3;
                                                xr7Var2.h = zH;
                                                xr7Var2.i = z;
                                                xr7Var2.j = zH2;
                                                xr7Var2.k = z2;
                                                xr7Var2.l = iM;
                                                xr7Var2.m = i4;
                                                xr7Var2.n = iN2;
                                                xr7Var2.o = i5;
                                                xr7Var2.p = iN;
                                                xr7Var2.a = true;
                                                xr7Var2.b = true;
                                                yr7Var.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || oabVar.o) {
                                            i4 = 0;
                                        } else {
                                            if (!mo2Var.e()) {
                                                return;
                                            }
                                            int iN3 = mo2Var.n();
                                            if (!z3 || zH) {
                                                i5 = iN3;
                                                i4 = 0;
                                                iN2 = 0;
                                                iN = 0;
                                            } else {
                                                if (!mo2Var.e()) {
                                                    return;
                                                }
                                                iN = mo2Var.n();
                                                iN2 = 0;
                                                i5 = iN3;
                                                i4 = 0;
                                            }
                                        }
                                        xr7 xr7Var3 = yr7Var.n;
                                        xr7Var3.c = oabVar;
                                        xr7Var3.d = i9;
                                        xr7Var3.e = iM2;
                                        xr7Var3.f = i13;
                                        xr7Var3.g = iM3;
                                        xr7Var3.h = zH;
                                        xr7Var3.i = z;
                                        xr7Var3.j = zH2;
                                        xr7Var3.k = z2;
                                        xr7Var3.l = iM;
                                        xr7Var3.m = i4;
                                        xr7Var3.n = iN2;
                                        xr7Var3.o = i5;
                                        xr7Var3.p = iN;
                                        xr7Var3.a = true;
                                        xr7Var3.b = true;
                                        yr7Var.k = false;
                                        i5 = 0;
                                        iN2 = 0;
                                        iN = 0;
                                        xr7 xr7Var4 = yr7Var.n;
                                        xr7Var4.c = oabVar;
                                        xr7Var4.d = i9;
                                        xr7Var4.e = iM2;
                                        xr7Var4.f = i13;
                                        xr7Var4.g = iM3;
                                        xr7Var4.h = zH;
                                        xr7Var4.i = z;
                                        xr7Var4.j = zH2;
                                        xr7Var4.k = z2;
                                        xr7Var4.l = iM;
                                        xr7Var4.m = i4;
                                        xr7Var4.n = iN2;
                                        xr7Var4.o = i5;
                                        xr7Var4.p = iN;
                                        xr7Var4.a = true;
                                        xr7Var4.b = true;
                                        yr7Var.k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z = zH2;
                                if (yr7Var.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iM = 0;
                                } else if (!mo2Var.e()) {
                                    return;
                                } else {
                                    iM = mo2Var.m();
                                }
                                i3 = oabVar.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    i4 = 0;
                                } else {
                                    if (mo2Var.d(i11)) {
                                        return;
                                    }
                                    i4 = mo2Var.i(i11);
                                    if (!z3) {
                                    }
                                }
                                i5 = 0;
                                iN2 = 0;
                                iN = 0;
                                xr7 xr7Var5 = yr7Var.n;
                                xr7Var5.c = oabVar;
                                xr7Var5.d = i9;
                                xr7Var5.e = iM2;
                                xr7Var5.f = i13;
                                xr7Var5.g = iM3;
                                xr7Var5.h = zH;
                                xr7Var5.i = z;
                                xr7Var5.j = zH2;
                                xr7Var5.k = z2;
                                xr7Var5.l = iM;
                                xr7Var5.m = i4;
                                xr7Var5.n = iN2;
                                xr7Var5.o = i5;
                                xr7Var5.p = iN;
                                xr7Var5.a = true;
                                xr7Var5.b = true;
                                yr7Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void c(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        yr7 yr7Var = this.k;
        boolean z = this.n;
        yr7Var.i = i;
        yr7Var.l = j2;
        yr7Var.j = j;
        yr7Var.s = z;
        if (!yr7Var.b || i != 1) {
            if (!yr7Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        xr7 xr7Var = yr7Var.m;
        yr7Var.m = yr7Var.n;
        yr7Var.n = xr7Var;
        xr7Var.b = false;
        xr7Var.a = false;
        yr7Var.h = 0;
        yr7Var.k = true;
    }

    @Override // defpackage.r36
    public final void d(nmc nmcVar) {
        int i;
        this.j.getClass();
        String str = vqi.a;
        int i2 = nmcVar.b;
        int i3 = nmcVar.c;
        byte[] bArr = nmcVar.a;
        this.g += (long) nmcVar.a();
        this.j.f(nmcVar.a(), nmcVar);
        while (true) {
            int iB = xsg.b(bArr, i2, i3, this.h);
            if (iB == i3) {
                this.b(i2, bArr, i3);
                return;
            }
            int i4 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i5 = iB - i2;
            if (i5 > 0) {
                this.b(i2, bArr, iB);
            }
            int i6 = i3 - iB;
            long j = this.g - ((long) i6);
            zr7 zr7Var = this;
            zr7Var.a(i6, i5 < 0 ? -i5 : 0, j, this.m);
            zr7Var.c(i4, j, zr7Var.m);
            i2 = iB + i;
            this = zr7Var;
        }
    }

    @Override // defpackage.r36
    public final void f() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        xsg.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        ((ake) this.a.d).c(0);
        yr7 yr7Var = this.k;
        if (yr7Var != null) {
            yr7Var.k = false;
            yr7Var.o = false;
            xr7 xr7Var = yr7Var.n;
            xr7Var.b = false;
            xr7Var.a = false;
        }
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
        this.j.getClass();
        String str = vqi.a;
        if (z) {
            ((ake) this.a.d).c(0);
            a(0, 0, this.g, this.m);
            c(9, this.g, this.m);
            a(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.i = m5iVar.e;
        m5iVar.b();
        kyh kyhVarG = lj6Var.G(m5iVar.d, 2);
        this.j = kyhVarG;
        this.k = new yr7(kyhVarG, this.b, this.c);
        this.a.u(lj6Var, m5iVar);
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }
}
