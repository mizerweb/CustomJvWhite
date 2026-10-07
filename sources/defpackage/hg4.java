package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class hg4 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public final of4 H;
    public final of4 I;
    public final of4 J;
    public final of4 K;
    public final of4 L;
    public final of4 M;
    public final of4 N;
    public final of4 O;
    public final of4[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public hg4 S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public wo2 b;
    public int b0;
    public wo2 c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public String j;
    public final float[] j0;
    public boolean k;
    public final hg4[] k0;
    public boolean l;
    public final hg4[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public cz7 d = null;
    public bti e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public hg4() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = 0;
        this.G = 0;
        of4 of4Var = new of4(this, 2);
        this.H = of4Var;
        of4 of4Var2 = new of4(this, 3);
        this.I = of4Var2;
        of4 of4Var3 = new of4(this, 4);
        this.J = of4Var3;
        of4 of4Var4 = new of4(this, 5);
        this.K = of4Var4;
        of4 of4Var5 = new of4(this, 6);
        this.L = of4Var5;
        of4 of4Var6 = new of4(this, 8);
        this.M = of4Var6;
        of4 of4Var7 = new of4(this, 9);
        this.N = of4Var7;
        of4 of4Var8 = new of4(this, 7);
        this.O = of4Var8;
        this.P = new of4[]{of4Var, of4Var3, of4Var2, of4Var4, of4Var5, of4Var8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new hg4[]{null, null};
        this.l0 = new hg4[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(of4Var);
        arrayList.add(of4Var2);
        arrayList.add(of4Var3);
        arrayList.add(of4Var4);
        arrayList.add(of4Var6);
        arrayList.add(of4Var7);
        arrayList.add(of4Var8);
        arrayList.add(of4Var5);
    }

    public static void D(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void E(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void m(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        D(i, 0, "      size", sb);
        D(i2, 0, "      min", sb);
        D(i3, Integer.MAX_VALUE, "      max", sb);
        D(i4, 0, "      matchMin", sb);
        D(i5, 0, "      matchDef", sb);
        E(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void n(StringBuilder sb, String str, of4 of4Var) {
        if (of4Var.f == null) {
            return;
        }
        p.j(sb, "    ", str, " : [ '");
        sb.append(of4Var.f);
        sb.append("'");
        if (of4Var.h != Integer.MIN_VALUE || of4Var.g != 0) {
            sb.append(",");
            sb.append(of4Var.g);
            if (of4Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(of4Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void A() {
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.S = null;
        this.D = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            of4 of4Var = (of4) arrayList.get(i);
            of4Var.c = false;
            of4Var.b = 0;
        }
    }

    public void C(vbf vbfVar) {
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.O.h();
        this.M.h();
        this.N.h();
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.H.i(i);
        this.J.i(i2);
        this.X = i;
        this.T = i2 - i;
        this.k = true;
    }

    public final void G(int i, int i2) {
        if (this.l) {
            return;
        }
        this.I.i(i);
        this.K.i(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.E) {
            this.L.i(i + this.Z);
        }
        this.l = true;
    }

    public final void H(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void I(int i) {
        this.o0[0] = i;
    }

    public final void J(int i) {
        this.o0[1] = i;
    }

    public final void K(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void L(boolean z, boolean z2) {
        int i;
        int i2;
        cz7 cz7Var = this.d;
        boolean z3 = z & cz7Var.g;
        bti btiVar = this.e;
        boolean z4 = z2 & btiVar.g;
        int i3 = cz7Var.h.g;
        int i4 = btiVar.h.g;
        int i5 = cz7Var.i.g;
        int i6 = btiVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void M(b29 b29Var, boolean z) {
        int i;
        int i2;
        bti btiVar;
        cz7 cz7Var;
        b29Var.getClass();
        int iN = b29.n(this.H);
        int iN2 = b29.n(this.I);
        int iN3 = b29.n(this.J);
        int iN4 = b29.n(this.K);
        if (z && (cz7Var = this.d) != null) {
            uh5 uh5Var = cz7Var.h;
            if (uh5Var.j) {
                uh5 uh5Var2 = cz7Var.i;
                if (uh5Var2.j) {
                    iN = uh5Var.g;
                    iN3 = uh5Var2.g;
                }
            }
        }
        if (z && (btiVar = this.e) != null) {
            uh5 uh5Var3 = btiVar.h;
            if (uh5Var3.j) {
                uh5 uh5Var4 = btiVar.i;
                if (uh5Var4.j) {
                    iN2 = uh5Var3.g;
                    iN4 = uh5Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(ig4 ig4Var, b29 b29Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            sb8.i(ig4Var, b29Var, this);
            hashSet.remove(this);
            b(b29Var, ig4Var.S(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((of4) it.next()).d.a(ig4Var, b29Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((of4) it2.next()).d.a(ig4Var, b29Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((of4) it3.next()).d.a(ig4Var, b29Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((of4) it4.next()).d.a(ig4Var, b29Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((of4) it5.next()).d.a(ig4Var, b29Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
  0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x0670  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [hg4] */
    public void b(b29 b29Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        hg4 hg4Var;
        ig4 ig4Var;
        WeakReference weakReference;
        WeakReference weakReference2;
        hg4 hg4Var2;
        ig4 ig4Var2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        of4 of4Var;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        of4 of4Var2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        of4 of4Var3;
        int i20;
        of4 of4Var4;
        adg adgVar;
        adg adgVar2;
        adg adgVar3;
        boolean z10;
        ?? r3;
        ?? r4;
        int i21;
        adg adgVar4;
        adg adgVar5;
        adg adgVar6;
        int i22;
        int i23;
        boolean z11;
        int i24;
        adg adgVar7;
        int i25;
        float f2;
        ?? r27;
        bti btiVar;
        boolean z12;
        cz7 cz7Var;
        int i26;
        int i27;
        boolean zV;
        int i28;
        boolean zW;
        cz7 cz7Var2;
        bti btiVar2;
        boolean z13;
        ArrayList arrayList;
        int size;
        int i29;
        HashSet hashSet2;
        b29 b29Var2 = b29Var;
        of4 of4Var5 = this.H;
        adg adgVarK = b29Var2.k(of4Var5);
        of4 of4Var6 = this.J;
        adg adgVarK2 = b29Var2.k(of4Var6);
        of4 of4Var7 = this.I;
        adg adgVarK3 = b29Var2.k(of4Var7);
        of4 of4Var8 = this.K;
        adg adgVarK4 = b29Var2.k(of4Var8);
        of4 of4Var9 = this.L;
        adg adgVarK5 = b29Var2.k(of4Var9);
        hg4 hg4Var3 = this.S;
        if (hg4Var3 != null) {
            int[] iArr2 = hg4Var3.o0;
            i = 0;
            i3 = iArr2[0] == 2 ? 1 : 0;
            int i30 = iArr2[1] == 2 ? 1 : 0;
            int i31 = this.q;
            if (i31 != 1) {
                if (i31 == 2) {
                    i3 = 0;
                } else if (i31 != 3) {
                }
                i2 = i30;
            } else {
                i2 = 0;
            }
            i4 = this.f0;
            zArr = this.R;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i6 = i3;
                i29 = i;
                while (true) {
                    if (i29 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i32 = size;
                    hashSet2 = ((of4) arrayList.get(i29)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i32;
                }
            } else {
                i6 = i3;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    b29Var2.d(adgVarK, this.X);
                    b29Var2.d(adgVarK2, this.X + this.T);
                    if (i6 != 0 && (hg4Var2 = this.S) != null) {
                        ig4Var2 = (ig4) hg4Var2;
                        weakReference3 = ig4Var2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || of4Var5.c() > ((of4) ig4Var2.G0.get()).c()) {
                            ig4Var2.G0 = new WeakReference(of4Var5);
                        }
                        weakReference4 = ig4Var2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || of4Var6.c() > ((of4) ig4Var2.I0.get()).c()) {
                            ig4Var2.I0 = new WeakReference(of4Var6);
                        }
                    }
                }
                if (this.l) {
                    b29Var2.d(adgVarK3, this.Y);
                    b29Var2.d(adgVarK4, this.Y + this.U);
                    hashSet = of4Var9.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        b29Var2.d(adgVarK5, this.Y + this.Z);
                    }
                    if (i5 != 0 && (hg4Var = this.S) != null) {
                        ig4Var = (ig4) hg4Var;
                        weakReference = ig4Var.F0;
                        if (weakReference != null || weakReference.get() == null || of4Var7.c() > ((of4) ig4Var.F0.get()).c()) {
                            ig4Var.F0 = new WeakReference(of4Var7);
                        }
                        weakReference2 = ig4Var.H0;
                        if (weakReference2 != null || weakReference2.get() == null || of4Var8.c() > ((of4) ig4Var.H0.get()).c()) {
                            ig4Var.H0 = new WeakReference(of4Var8);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r12 = i;
                    this.k = r12;
                    this.l = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (cz7Var2 = this.d) == null || (btiVar2 = this.e) == null) {
                of4Var = of4Var9;
                zArr3 = zArr2;
            } else {
                of4Var = of4Var9;
                uh5 uh5Var = cz7Var2.h;
                zArr3 = zArr2;
                if (uh5Var.j && cz7Var2.i.j && btiVar2.h.j && btiVar2.i.j) {
                    b29Var2.d(adgVarK, uh5Var.g);
                    b29Var2.d(adgVarK2, this.d.i.g);
                    b29Var2.d(adgVarK3, this.e.h.g);
                    b29Var2.d(adgVarK4, this.e.i.g);
                    b29Var2.d(adgVarK5, this.e.k.g);
                    if (this.S == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !v()) {
                            b29Var2.f(b29Var2.k(this.S.J), adgVarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || w()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            b29Var2.f(b29Var2.k(this.S.K), adgVarK4, 0, 8);
                        }
                    }
                    this.k = z13;
                    this.l = z13;
                    return;
                }
            }
            if (this.S != null) {
                if (u(0)) {
                    ((ig4) this.S).N(this, 0);
                    zV = true;
                    i28 = 1;
                } else {
                    zV = v();
                    i28 = 1;
                }
                if (u(i28)) {
                    ((ig4) this.S).N(this, i28);
                    zW = true;
                } else {
                    zW = w();
                }
                if (zV && i6 != 0 && this.f0 != 8 && of4Var5.f == null && of4Var6.f == null) {
                    b29Var2.f(b29Var2.k(this.S.J), adgVarK2, 0, 1);
                }
                if (!zW && i5 != 0 && this.f0 != 8 && of4Var7.f == null && of4Var8.f == null && of4Var == null) {
                    b29Var2.f(b29Var2.k(this.S.K), adgVarK4, 0, 1);
                }
                z4 = zW;
                z3 = zV;
            } else {
                of4Var5 = of4Var5;
                z3 = false;
                z4 = false;
            }
            i7 = this.T;
            i8 = this.a0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.U;
            i10 = this.b0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.o0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i33 = this.W;
            this.A = i33;
            f = this.V;
            this.B = f;
            i14 = this.r;
            i15 = this.s;
            if (f > 0.0f) {
                of4Var2 = of4Var8;
                if (this.f0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i27 = i15;
                    } else {
                        i27 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i27 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.A = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                of4Var = of4Var;
                                i16 = i11;
                                i17 = 4;
                                z7 = false;
                            }
                            i18 = i27;
                            int[] iArr3 = this.t;
                            iArr3[0] = i17;
                            iArr3[1] = i18;
                            if (z7) {
                                int i34 = this.A;
                                i19 = -1;
                                if (i34 != 0) {
                                }
                                if (z7) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (iArr[0] == 2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i8 = 0;
                                }
                                of4Var3 = this.O;
                                boolean z14 = !of4Var3.f();
                                char c = '\b';
                                boolean z15 = zArr[0];
                                boolean z16 = zArr[1];
                                i20 = this.o;
                                int[] iArr4 = this.C;
                                if (i20 != 2) {
                                    of4Var4 = of4Var;
                                    adgVar = adgVarK;
                                    adgVar2 = adgVarK2;
                                    adgVar3 = adgVarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                } else {
                                    of4Var4 = of4Var;
                                    adgVar = adgVarK;
                                    adgVar2 = adgVarK2;
                                    adgVar3 = adgVarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                }
                                if (z) {
                                    adgVar4 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x058a: MOVE (r5v1 'adgVar4' adg) = (r33v0 adg) in method: hg4.b(b29, boolean):void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 adg
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1910
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hg4.b(b29, boolean):void");
                                }

                                public boolean c() {
                                    return this.f0 != 8;
                                }

                                /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
                                /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
                                /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
                                /* JADX WARN: Code duplicated, block: B:231:0x0402  */
                                /* JADX WARN: Code duplicated, block: B:240:0x041f  */
                                /* JADX WARN: Code duplicated, block: B:257:0x0452  */
                                /* JADX WARN: Code duplicated, block: B:259:0x0458  */
                                /* JADX WARN: Code duplicated, block: B:270:0x046d  */
                                /* JADX WARN: Code duplicated, block: B:275:0x0477  */
                                /* JADX WARN: Code duplicated, block: B:277:0x047b  */
                                /* JADX WARN: Code duplicated, block: B:278:0x047d  */
                                /* JADX WARN: Code duplicated, block: B:281:0x0485  */
                                /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
  0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
                                /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
                                /* JADX WARN: Code duplicated, block: B:294:0x04af  */
                                /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
                                /* JADX WARN: Code duplicated, block: B:337:0x0521  */
                                public final void d(b29 b29Var, boolean z, boolean z2, boolean z3, boolean z4, adg adgVar, adg adgVar2, int i, boolean z5, of4 of4Var, of4 of4Var2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
                                    boolean z12;
                                    boolean z13;
                                    int iMin;
                                    boolean z14;
                                    int i10;
                                    int i11;
                                    boolean z15;
                                    adg adgVarK;
                                    adg adgVarK2;
                                    of4 of4Var3;
                                    adg adgVar3;
                                    int i12;
                                    int i13;
                                    boolean z16;
                                    boolean z17;
                                    boolean z18;
                                    boolean z19;
                                    hg4 hg4Var;
                                    boolean z20;
                                    int iMin2;
                                    boolean z21;
                                    int i14;
                                    int iD;
                                    int i15;
                                    int i16;
                                    HashSet hashSet;
                                    boolean z22;
                                    int i17;
                                    int i18;
                                    int i19;
                                    int i20;
                                    int i21;
                                    boolean z23;
                                    boolean z24;
                                    int i22;
                                    b29Var = b29Var;
                                    int i23 = i8;
                                    int i24 = i9;
                                    adg adgVarK3 = b29Var.k(of4Var);
                                    adg adgVarK4 = b29Var.k(of4Var2);
                                    adg adgVarK5 = b29Var.k(of4Var.f);
                                    adg adgVarK6 = b29Var.k(of4Var2.f);
                                    boolean zF = of4Var.f();
                                    boolean zF2 = of4Var2.f();
                                    boolean zF3 = this.O.f();
                                    int i25 = zF2 ? (zF ? 1 : 0) + 1 : zF ? 1 : 0;
                                    if (zF3) {
                                        i25++;
                                    }
                                    int i26 = i25;
                                    int i27 = z6 ? 3 : i6;
                                    int iD2 = qt4.D(i);
                                    boolean z25 = (iD2 == 0 || iD2 == 1 || iD2 != 2 || i27 == 4) ? false : true;
                                    int i28 = this.h;
                                    if (i28 == -1 || !z) {
                                        i28 = i3;
                                        z12 = z25;
                                    } else {
                                        this.h = -1;
                                        z12 = false;
                                    }
                                    int i29 = this.i;
                                    if (i29 == -1 || z) {
                                        z13 = z12;
                                    } else {
                                        this.i = -1;
                                        i28 = i29;
                                        z13 = false;
                                    }
                                    boolean z26 = z13;
                                    if (this.f0 == 8) {
                                        z14 = false;
                                        iMin = 0;
                                    } else {
                                        iMin = i28;
                                        z14 = z26;
                                    }
                                    if (z11) {
                                        if (!zF && !zF2 && !zF3) {
                                            b29Var.d(adgVarK3, i2);
                                        } else if (zF && !zF2) {
                                            i10 = 8;
                                            b29Var.e(adgVarK3, adgVarK5, of4Var.d(), 8);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = 8;
                                    }
                                    if (z14 != 0) {
                                        if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                                            if (i23 == -2) {
                                                i23 = iMin;
                                            }
                                            if (i24 == -2) {
                                                i24 = iMin;
                                            }
                                            if (iMin > 0 && i27 != 1) {
                                                iMin = 0;
                                            }
                                            if (i23 > 0) {
                                                b29Var.f(adgVarK4, adgVarK3, i23, 8);
                                                iMin = Math.max(iMin, i23);
                                            }
                                            if (i24 > 0) {
                                                if (!z2 || i27 != 1) {
                                                    b29Var.g(adgVarK4, adgVarK3, i24, 8);
                                                }
                                                iMin = Math.min(iMin, i24);
                                            }
                                            if (i27 == 1) {
                                                if (z2) {
                                                    b29Var.e(adgVarK4, adgVarK3, iMin, 8);
                                                } else if (z8) {
                                                    b29Var.e(adgVarK4, adgVarK3, iMin, 5);
                                                    b29Var.g(adgVarK4, adgVarK3, iMin, 8);
                                                } else {
                                                    b29Var.e(adgVarK4, adgVarK3, iMin, 5);
                                                    b29Var.g(adgVarK4, adgVarK3, iMin, 8);
                                                }
                                            } else if (i27 == 2) {
                                                int i30 = of4Var.e;
                                                if (i30 == 3 || i30 == 5) {
                                                    adgVarK = b29Var.k(this.S.g(3));
                                                    adgVarK2 = b29Var.k(this.S.g(5));
                                                } else {
                                                    adgVarK = b29Var.k(this.S.g(2));
                                                    adgVarK2 = b29Var.k(this.S.g(4));
                                                }
                                                ow owVarL = b29Var.l();
                                                int i31 = i23;
                                                owVarL.d.g(adgVarK4, -1.0f);
                                                owVarL.d.g(adgVarK3, 1.0f);
                                                owVarL.d.g(adgVarK2, f2);
                                                owVarL.d.g(adgVarK, -f2);
                                                b29Var.c(owVarL);
                                                if (z2) {
                                                    z14 = false;
                                                }
                                                z15 = z4;
                                                i11 = i31;
                                            } else {
                                                i11 = i23;
                                                z15 = true;
                                            }
                                        } else {
                                            int iMax = Math.max(i23, iMin);
                                            if (i24 > 0) {
                                                iMax = Math.min(i24, iMax);
                                            }
                                            b29Var.e(adgVarK4, adgVarK3, iMax, 8);
                                            z15 = z4;
                                            i11 = i23;
                                            z14 = false;
                                        }
                                        if (z11 || z8) {
                                            boolean z27 = z15;
                                            if (i26 >= 2 && z2 && z27) {
                                                b29Var.f(adgVarK3, adgVar, 0, 8);
                                                of4 of4Var4 = this.L;
                                                boolean z28 = z || of4Var4.f == null;
                                                if (!z && (of4Var3 = of4Var4.f) != null) {
                                                    hg4 hg4Var2 = of4Var3.d;
                                                    if (hg4Var2.V != 0.0f) {
                                                        int[] iArr = hg4Var2.o0;
                                                        if (iArr[0] == 3 && iArr[1] == 3) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                    } else {
                                                        z28 = false;
                                                    }
                                                }
                                                if (z28) {
                                                    b29Var.f(adgVar2, adgVarK4, 0, 8);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        if (zF || zF2 || zF3) {
                                            if (zF && !zF2) {
                                                of4Var2 = of4Var2;
                                                adgVarK4 = adgVarK4;
                                                z15 = z15;
                                                adgVar3 = adgVarK6;
                                                z20 = z2;
                                                i22 = (z2 && (of4Var.f.d instanceof tp0)) ? 8 : 5;
                                            } else if (zF || !zF2) {
                                                adgVar3 = adgVarK6;
                                                if (zF && zF2) {
                                                    hg4 hg4Var3 = of4Var.f.d;
                                                    hg4 hg4Var4 = of4Var2.f.d;
                                                    z15 = z15;
                                                    hg4 hg4Var5 = this.S;
                                                    int i32 = 6;
                                                    if (z14) {
                                                        if (i27 == 0) {
                                                            if (i24 != 0 || i11 != 0) {
                                                                i20 = 5;
                                                                i21 = 5;
                                                                z23 = true;
                                                                z24 = false;
                                                                z17 = true;
                                                            } else if (adgVarK5.f && adgVar3.f) {
                                                                b29Var.e(adgVarK3, adgVarK5, of4Var.d(), 8);
                                                                b29Var.e(adgVarK4, adgVar3, -of4Var2.d(), 8);
                                                                return;
                                                            } else {
                                                                i20 = 8;
                                                                i21 = 8;
                                                                z23 = false;
                                                                z24 = true;
                                                                z17 = false;
                                                            }
                                                            if ((hg4Var3 instanceof tp0) || (hg4Var4 instanceof tp0)) {
                                                                b29Var = b29Var;
                                                                i27 = i27;
                                                                adgVarK3 = adgVarK3;
                                                                adgVarK4 = adgVarK4;
                                                                z18 = z24;
                                                                adgVar2 = adgVar2;
                                                                i12 = i20;
                                                                adgVarK5 = adgVarK5;
                                                                i32 = 6;
                                                                z16 = z23;
                                                                i13 = 4;
                                                            } else {
                                                                b29Var = b29Var;
                                                                adgVarK3 = adgVarK3;
                                                                adgVarK4 = adgVarK4;
                                                                z18 = z24;
                                                                i12 = i20;
                                                                adgVarK5 = adgVarK5;
                                                                i32 = 6;
                                                                z16 = z23;
                                                                i13 = i21;
                                                                i27 = i27;
                                                                adgVar2 = adgVar2;
                                                            }
                                                        } else {
                                                            if (i27 == 2) {
                                                                if ((hg4Var3 instanceof tp0) || (hg4Var4 instanceof tp0)) {
                                                                    i12 = 5;
                                                                } else {
                                                                    b29Var = b29Var;
                                                                    i27 = i27;
                                                                    adgVarK3 = adgVarK3;
                                                                    adgVarK4 = adgVarK4;
                                                                    adgVarK5 = adgVarK5;
                                                                    i32 = 6;
                                                                    i12 = 5;
                                                                    i13 = 5;
                                                                }
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = false;
                                                                adgVar2 = adgVar2;
                                                            } else if (i27 == 1) {
                                                                i12 = 8;
                                                            } else if (i27 == 3) {
                                                                i27 = i27;
                                                                if (this.A != -1) {
                                                                    if (z6) {
                                                                        if (i7 == 2 || i7 == 1) {
                                                                            i18 = 5;
                                                                            i19 = 4;
                                                                        } else {
                                                                            i18 = 8;
                                                                            i19 = 5;
                                                                        }
                                                                        i13 = i19;
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    } else {
                                                                        if (i24 > 0) {
                                                                            b29Var = b29Var;
                                                                            adgVar2 = adgVar2;
                                                                            adgVarK3 = adgVarK3;
                                                                            adgVarK4 = adgVarK4;
                                                                            adgVarK5 = adgVarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                        } else if (i24 != 0 || i11 != 0) {
                                                                            b29Var = b29Var;
                                                                            adgVar2 = adgVar2;
                                                                            adgVarK3 = adgVarK3;
                                                                            adgVarK4 = adgVarK4;
                                                                            adgVarK5 = adgVarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                            i13 = 4;
                                                                        } else if (z9) {
                                                                            i18 = (hg4Var3 == hg4Var5 || hg4Var4 == hg4Var5) ? 5 : 4;
                                                                            i13 = 4;
                                                                            z16 = true;
                                                                            z17 = true;
                                                                            z18 = true;
                                                                        } else {
                                                                            b29Var = b29Var;
                                                                            adgVar2 = adgVar2;
                                                                            adgVarK3 = adgVarK3;
                                                                            adgVarK4 = adgVarK4;
                                                                            adgVarK5 = adgVarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                            i13 = 8;
                                                                        }
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    }
                                                                    i12 = i18;
                                                                    b29Var = b29Var;
                                                                } else if (z9) {
                                                                    b29Var = b29Var;
                                                                    adgVar2 = adgVar2;
                                                                    adgVarK3 = adgVarK3;
                                                                    adgVarK4 = adgVarK4;
                                                                    adgVarK5 = adgVarK5;
                                                                    i12 = 8;
                                                                    i32 = z2 ? 5 : 4;
                                                                } else {
                                                                    b29Var = b29Var;
                                                                    adgVar2 = adgVar2;
                                                                    adgVarK3 = adgVarK3;
                                                                    adgVarK4 = adgVarK4;
                                                                    adgVarK5 = adgVarK5;
                                                                    i12 = 8;
                                                                    i32 = 8;
                                                                }
                                                                i13 = 5;
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = true;
                                                            } else {
                                                                i12 = 5;
                                                                i13 = 4;
                                                                z16 = false;
                                                                z17 = false;
                                                            }
                                                            i13 = 4;
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = false;
                                                            adgVar2 = adgVar2;
                                                        }
                                                        if (z17 || adgVarK5 != adgVar3 || hg4Var3 == hg4Var5) {
                                                            z19 = true;
                                                        } else {
                                                            z17 = false;
                                                            z19 = false;
                                                        }
                                                        if (z16) {
                                                            if (z14 && !z7 && !z9 && adgVarK5 == adgVar && adgVar3 == adgVar2) {
                                                                i32 = 8;
                                                                z20 = false;
                                                                i17 = 8;
                                                                z22 = false;
                                                            } else {
                                                                z20 = z2;
                                                                z22 = z19;
                                                                i17 = i12;
                                                            }
                                                            adg adgVar4 = adgVarK5;
                                                            hg4Var = hg4Var4;
                                                            b29Var.b(adgVarK3, adgVar4, of4Var.d(), f, adgVar3, adgVarK4, of4Var2.d(), i32);
                                                            adgVarK5 = adgVar4;
                                                            i12 = i17;
                                                            z19 = z22;
                                                        } else {
                                                            hg4Var = hg4Var4;
                                                            z20 = z2;
                                                        }
                                                        if (this.f0 != 8 && ((hashSet = of4Var2.a) == null || hashSet.size() <= 0)) {
                                                            return;
                                                        }
                                                        if (z17) {
                                                            if (z20 && adgVarK5 != adgVar3 && !z14 && ((hg4Var3 instanceof tp0) || (hg4Var instanceof tp0))) {
                                                                i12 = 6;
                                                            }
                                                            b29Var.f(adgVarK3, adgVarK5, of4Var.d(), i12);
                                                            b29Var.g(adgVarK4, adgVar3, -of4Var2.d(), i12);
                                                        }
                                                        if (z20 || !z10 || (hg4Var3 instanceof tp0) || (hg4Var instanceof tp0) || hg4Var == hg4Var5) {
                                                            iMin2 = i13;
                                                            z21 = z19;
                                                        } else {
                                                            iMin2 = 6;
                                                            i12 = 6;
                                                            z21 = true;
                                                        }
                                                        if (z21) {
                                                            if (z18 && (!z9 || z3)) {
                                                                if (hg4Var3 != hg4Var5 && hg4Var != hg4Var5) {
                                                                    i32 = iMin2;
                                                                }
                                                                if ((hg4Var3 instanceof or7) || (hg4Var instanceof or7)) {
                                                                    i32 = 5;
                                                                }
                                                                if ((hg4Var3 instanceof tp0) || (hg4Var instanceof tp0)) {
                                                                    i32 = 5;
                                                                }
                                                                if (z9) {
                                                                    i16 = 5;
                                                                } else {
                                                                    i16 = i32;
                                                                }
                                                                iMin2 = Math.max(i16, iMin2);
                                                            }
                                                            if (z20) {
                                                                iMin2 = Math.min(i12, iMin2);
                                                                if (z6 || z9 || !(hg4Var3 == hg4Var5 || hg4Var == hg4Var5)) {
                                                                    i15 = iMin2;
                                                                } else {
                                                                    i15 = 4;
                                                                }
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                            b29Var.e(adgVarK3, adgVarK5, of4Var.d(), i15);
                                                            b29Var.e(adgVarK4, adgVar3, -of4Var2.d(), i15);
                                                        }
                                                        if (z20) {
                                                            if (adgVar == adgVarK5) {
                                                                iD = of4Var.d();
                                                            } else {
                                                                iD = 0;
                                                            }
                                                            if (adgVarK5 != adgVar) {
                                                                b29Var.f(adgVarK3, adgVar, iD, 5);
                                                            }
                                                        }
                                                        if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                                            i14 = 5;
                                                        } else if (z14 && i27 == 3) {
                                                            b29Var.f(adgVarK4, adgVarK3, 0, 8);
                                                            i14 = 5;
                                                        } else {
                                                            i14 = 5;
                                                            b29Var.f(adgVarK4, adgVarK3, 0, 5);
                                                        }
                                                    } else {
                                                        if (adgVarK5.f && adgVar3.f) {
                                                            b29Var.b(adgVarK3, adgVarK5, of4Var.d(), f, adgVar3, adgVarK4, of4Var2.d(), 8);
                                                            if (z2 && z15) {
                                                                int iD3 = of4Var2.f != null ? of4Var2.d() : 0;
                                                                if (adgVar3 != adgVar2) {
                                                                    b29Var.f(adgVar2, adgVarK4, iD3, 5);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        i12 = 5;
                                                        i13 = 4;
                                                        z16 = true;
                                                        z17 = true;
                                                    }
                                                    z18 = false;
                                                    if (z17) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    if (z16) {
                                                        if (z14) {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        } else {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        }
                                                        adg adgVar5 = adgVarK5;
                                                        hg4Var = hg4Var4;
                                                        b29Var.b(adgVarK3, adgVar5, of4Var.d(), f, adgVar3, adgVarK4, of4Var2.d(), i32);
                                                        adgVarK5 = adgVar5;
                                                        i12 = i17;
                                                        z19 = z22;
                                                    } else {
                                                        hg4Var = hg4Var4;
                                                        z20 = z2;
                                                    }
                                                    if (this.f0 != 8) {
                                                    }
                                                    if (z17) {
                                                        if (z20) {
                                                            i12 = 6;
                                                        }
                                                        b29Var.f(adgVarK3, adgVarK5, of4Var.d(), i12);
                                                        b29Var.g(adgVarK4, adgVar3, -of4Var2.d(), i12);
                                                    }
                                                    if (z20) {
                                                        iMin2 = i13;
                                                        z21 = z19;
                                                    } else {
                                                        iMin2 = i13;
                                                        z21 = z19;
                                                    }
                                                    if (z21) {
                                                        if (z18) {
                                                            if (hg4Var3 != hg4Var5) {
                                                                i32 = iMin2;
                                                            }
                                                            if (hg4Var3 instanceof or7) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (hg4Var3 instanceof tp0) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (z9) {
                                                                i16 = 5;
                                                            } else {
                                                                i16 = i32;
                                                            }
                                                            iMin2 = Math.max(i16, iMin2);
                                                        }
                                                        if (z20) {
                                                            iMin2 = Math.min(i12, iMin2);
                                                            if (z6) {
                                                                i15 = iMin2;
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                        } else {
                                                            i15 = iMin2;
                                                        }
                                                        b29Var.e(adgVarK3, adgVarK5, of4Var.d(), i15);
                                                        b29Var.e(adgVarK4, adgVar3, -of4Var2.d(), i15);
                                                    }
                                                    if (z20) {
                                                        if (adgVar == adgVarK5) {
                                                            iD = of4Var.d();
                                                        } else {
                                                            iD = 0;
                                                        }
                                                        if (adgVarK5 != adgVar) {
                                                            b29Var.f(adgVarK3, adgVar, iD, 5);
                                                        }
                                                    }
                                                    if (z20) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 5;
                                                    }
                                                }
                                                i22 = i14;
                                            } else {
                                                adgVar3 = adgVarK6;
                                                b29Var.e(adgVarK4, adgVar3, -of4Var2.d(), 8);
                                                if (z2) {
                                                    b29Var.f(adgVarK3, adgVar, 0, 5);
                                                    of4Var2 = of4Var2;
                                                    i14 = 5;
                                                    adgVarK4 = adgVarK4;
                                                    z15 = z15;
                                                }
                                                z20 = z2;
                                                i22 = i14;
                                            }
                                            if (z20 || !z15) {
                                                return;
                                            }
                                            int iD4 = of4Var2.f != null ? of4Var2.d() : 0;
                                            if (adgVar3 != adgVar2) {
                                                b29Var.f(adgVar2, adgVarK4, iD4, i22);
                                                return;
                                            }
                                            return;
                                        }
                                        adgVar3 = adgVarK6;
                                        i14 = 5;
                                        z20 = z2;
                                        i22 = i14;
                                        if (z20) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (z5) {
                                        b29Var.e(adgVarK4, adgVarK3, 0, 3);
                                        if (i4 > 0) {
                                            b29Var.f(adgVarK4, adgVarK3, i4, i10);
                                        }
                                        if (i5 < Integer.MAX_VALUE) {
                                            b29Var.g(adgVarK4, adgVarK3, i5, i10);
                                        }
                                    } else {
                                        b29Var.e(adgVarK4, adgVarK3, iMin, i10);
                                    }
                                    z15 = z4;
                                    i11 = i23;
                                    if (z11) {
                                    }
                                    boolean z29 = z15;
                                    if (i26 >= 2) {
                                    }
                                }

                                public final void e(b29 b29Var) {
                                    b29Var.k(this.H);
                                    b29Var.k(this.I);
                                    b29Var.k(this.J);
                                    b29Var.k(this.K);
                                    if (this.Z > 0) {
                                        b29Var.k(this.L);
                                    }
                                }

                                public final void f() {
                                    if (this.d == null) {
                                        this.d = new cz7(this);
                                    }
                                    if (this.e == null) {
                                        this.e = new bti(this);
                                    }
                                }

                                public of4 g(int i) {
                                    switch (qt4.D(i)) {
                                        case 0:
                                            return null;
                                        case 1:
                                            return this.H;
                                        case 2:
                                            return this.I;
                                        case 3:
                                            return this.J;
                                        case 4:
                                            return this.K;
                                        case 5:
                                            return this.L;
                                        case 6:
                                            return this.O;
                                        case 7:
                                            return this.M;
                                        case 8:
                                            return this.N;
                                        default:
                                            c.e(qv1.w(i));
                                            return null;
                                    }
                                }

                                public final int h(int i) {
                                    int[] iArr = this.o0;
                                    if (i == 0) {
                                        return iArr[0];
                                    }
                                    if (i == 1) {
                                        return iArr[1];
                                    }
                                    return 0;
                                }

                                public final int i() {
                                    if (this.f0 == 8) {
                                        return 0;
                                    }
                                    return this.U;
                                }

                                public final hg4 j(int i) {
                                    of4 of4Var;
                                    of4 of4Var2;
                                    if (i != 0) {
                                        if (i == 1 && (of4Var2 = (of4Var = this.K).f) != null && of4Var2.f == of4Var) {
                                            return of4Var2.d;
                                        }
                                        return null;
                                    }
                                    of4 of4Var3 = this.J;
                                    of4 of4Var4 = of4Var3.f;
                                    if (of4Var4 == null || of4Var4.f != of4Var3) {
                                        return null;
                                    }
                                    return of4Var4.d;
                                }

                                public final hg4 k(int i) {
                                    of4 of4Var;
                                    of4 of4Var2;
                                    if (i != 0) {
                                        if (i == 1 && (of4Var2 = (of4Var = this.I).f) != null && of4Var2.f == of4Var) {
                                            return of4Var2.d;
                                        }
                                        return null;
                                    }
                                    of4 of4Var3 = this.H;
                                    of4 of4Var4 = of4Var3.f;
                                    if (of4Var4 == null || of4Var4.f != of4Var3) {
                                        return null;
                                    }
                                    return of4Var4.d;
                                }

                                public void l(StringBuilder sb) {
                                    sb.append("  " + this.j + ":{\n");
                                    StringBuilder sb2 = new StringBuilder("    actualWidth:");
                                    sb2.append(this.T);
                                    sb.append(sb2.toString());
                                    sb.append("\n");
                                    sb.append("    actualHeight:" + this.U);
                                    sb.append("\n");
                                    sb.append("    actualLeft:" + this.X);
                                    sb.append("\n");
                                    sb.append("    actualTop:" + this.Y);
                                    sb.append("\n");
                                    n(sb, "left", this.H);
                                    n(sb, "top", this.I);
                                    n(sb, "right", this.J);
                                    n(sb, "bottom", this.K);
                                    n(sb, "baseline", this.L);
                                    n(sb, "centerX", this.M);
                                    n(sb, "centerY", this.N);
                                    int i = this.T;
                                    int i2 = this.a0;
                                    int[] iArr = this.C;
                                    int i3 = iArr[0];
                                    int i4 = this.u;
                                    int i5 = this.r;
                                    float f = this.w;
                                    float[] fArr = this.j0;
                                    float f2 = fArr[0];
                                    m(sb, "    width", i, i2, i3, i4, i5, f);
                                    int i6 = this.U;
                                    int i7 = this.b0;
                                    int i8 = iArr[1];
                                    int i9 = this.x;
                                    int i10 = this.s;
                                    float f3 = this.z;
                                    float f4 = fArr[1];
                                    m(sb, "    height", i6, i7, i8, i9, i10, f3);
                                    float f5 = this.V;
                                    int i11 = this.W;
                                    if (f5 != 0.0f) {
                                        sb.append("    dimensionRatio");
                                        sb.append(" :  [");
                                        sb.append(f5);
                                        sb.append(",");
                                        sb.append(i11);
                                        sb.append("");
                                        sb.append("],\n");
                                    }
                                    E(sb, "    horizontalBias", this.c0, 0.5f);
                                    E(sb, "    verticalBias", this.d0, 0.5f);
                                    D(this.h0, 0, "    horizontalChainStyle", sb);
                                    D(this.i0, 0, "    verticalChainStyle", sb);
                                    sb.append("  }");
                                }

                                public final int o() {
                                    if (this.f0 == 8) {
                                        return 0;
                                    }
                                    return this.T;
                                }

                                public final int p() {
                                    hg4 hg4Var = this.S;
                                    return (hg4Var == null || !(hg4Var instanceof ig4)) ? this.X : ((ig4) hg4Var).w0 + this.X;
                                }

                                public final int q() {
                                    hg4 hg4Var = this.S;
                                    return (hg4Var == null || !(hg4Var instanceof ig4)) ? this.Y : ((ig4) hg4Var).x0 + this.Y;
                                }

                                /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
                                /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
                                public final boolean r(int i) {
                                    if (i == 0) {
                                        if ((this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                                        return true;
                                    }
                                    return false;
                                }

                                public final boolean s(int i, int i2) {
                                    of4 of4Var;
                                    of4 of4Var2;
                                    of4 of4Var3;
                                    of4 of4Var4;
                                    if (i == 0) {
                                        of4 of4Var5 = this.H;
                                        of4 of4Var6 = of4Var5.f;
                                        if (of4Var6 == null || !of4Var6.c || (of4Var4 = (of4Var3 = this.J).f) == null || !of4Var4.c) {
                                            return false;
                                        }
                                        return (of4Var4.c() - of4Var3.d()) - (of4Var5.d() + of4Var5.f.c()) >= i2;
                                    }
                                    of4 of4Var7 = this.I;
                                    of4 of4Var8 = of4Var7.f;
                                    if (of4Var8 == null || !of4Var8.c || (of4Var2 = (of4Var = this.K).f) == null || !of4Var2.c) {
                                        return false;
                                    }
                                    return (of4Var2.c() - of4Var.d()) - (of4Var7.d() + of4Var7.f.c()) >= i2;
                                }

                                public final void t(int i, int i2, int i3, int i4, hg4 hg4Var) {
                                    g(i).a(hg4Var.g(i2), i3, i4);
                                }

                                public String toString() {
                                    StringBuilder sbC = nbh.C("");
                                    sbC.append(this.g0 != null ? zo5.w(new StringBuilder("id: "), this.g0, " ") : "");
                                    sbC.append("(");
                                    sbC.append(this.X);
                                    sbC.append(", ");
                                    sbC.append(this.Y);
                                    sbC.append(") - (");
                                    sbC.append(this.T);
                                    sbC.append(" x ");
                                    return zo5.t(sbC, this.U, ")");
                                }

                                public final boolean u(int i) {
                                    of4 of4Var;
                                    of4 of4Var2;
                                    int i2 = i * 2;
                                    of4[] of4VarArr = this.P;
                                    of4 of4Var3 = of4VarArr[i2];
                                    of4 of4Var4 = of4Var3.f;
                                    return (of4Var4 == null || of4Var4.f == of4Var3 || (of4Var2 = (of4Var = of4VarArr[i2 + 1]).f) == null || of4Var2.f != of4Var) ? false : true;
                                }

                                public final boolean v() {
                                    of4 of4Var = this.H;
                                    of4 of4Var2 = of4Var.f;
                                    if (of4Var2 != null && of4Var2.f == of4Var) {
                                        return true;
                                    }
                                    of4 of4Var3 = this.J;
                                    of4 of4Var4 = of4Var3.f;
                                    return of4Var4 != null && of4Var4.f == of4Var3;
                                }

                                public final boolean w() {
                                    of4 of4Var = this.I;
                                    of4 of4Var2 = of4Var.f;
                                    if (of4Var2 != null && of4Var2.f == of4Var) {
                                        return true;
                                    }
                                    of4 of4Var3 = this.K;
                                    of4 of4Var4 = of4Var3.f;
                                    return of4Var4 != null && of4Var4.f == of4Var3;
                                }

                                public final boolean x() {
                                    return this.g && this.f0 != 8;
                                }

                                public boolean y() {
                                    if (this.k) {
                                        return true;
                                    }
                                    return this.H.c && this.J.c;
                                }

                                public boolean z() {
                                    if (this.l) {
                                        return true;
                                    }
                                    return this.I.c && this.K.c;
                                }
                            }
