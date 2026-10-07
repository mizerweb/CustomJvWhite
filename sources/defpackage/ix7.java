package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ix7 extends ft9 {
    public static final AtomicInteger Y = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public ri C;
    public fy7 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public c98 I;
    public boolean J;
    public long K;
    public boolean X;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final u25 p;
    public final a35 q;
    public final ri r;
    public final boolean s;
    public final boolean t;
    public final dth u;
    public final ab5 v;
    public final List w;
    public final wu5 x;
    public final d48 y;
    public final nmc z;

    public ix7(ab5 ab5Var, u25 u25Var, a35 a35Var, b87 b87Var, boolean z, u25 u25Var2, a35 a35Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, dth dthVar, wu5 wu5Var, ri riVar, d48 d48Var, nmc nmcVar, boolean z6, boolean z7, z3d z3dVar) {
        super(u25Var, a35Var, b87Var, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = a35Var2;
        this.p = u25Var2;
        this.F = a35Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = dthVar;
        this.t = z4;
        this.v = ab5Var;
        this.w = list;
        this.x = wu5Var;
        this.r = riVar;
        this.y = d48Var;
        this.z = nmcVar;
        this.X = z6;
        this.n = z7;
        a98 a98Var = c98.b;
        this.I = ghe.e;
        this.k = Y.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (n1g.b0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.ft9
    public final boolean b() {
        throw null;
    }

    public final void c(u25 u25Var, a35 a35Var, boolean z, boolean z2) {
        a35 a35VarD;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            a35VarD = a35Var;
        } else {
            a35VarD = a35Var.d(i);
            z3 = false;
        }
        try {
            qa5 qa5VarG = g(u25Var, a35VarD, z2);
            if (z3) {
                qa5VarG.k(this.E, false);
            }
            while (!this.G && ((jj6) this.C.b).l(qa5VarG, ri.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((jj6) this.C.b).g(0L, 0L);
                        j = qa5VarG.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (qa5VarG.d - a35Var.f);
                    throw th;
                }
            }
            j = qa5VarG.d;
            this.E = (int) (j - a35Var.f);
            gz8.a(u25Var);
        } catch (Throwable th2) {
            gz8.a(u25Var);
            throw th2;
        }
    }

    public final int e(int i) {
        lvb.b0(!this.X);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[PHI: r16 r35
  0x0084: PHI (r16v1 long) = (r16v0 long), (r16v3 long), (r16v3 long) binds: [B:40:0x00d6, B:22:0x0082, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r35v2 qa5) = (r35v1 qa5), (r35v4 qa5), (r35v4 qa5) binds: [B:40:0x00d6, B:22:0x0082, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object, jj6] */
    /* JADX WARN: Type inference failed for: r19v2, types: [jj6] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, jj6] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    public final qa5 g(u25 u25Var, a35 a35Var, boolean z) throws IOException {
        int i;
        qa5 qa5Var;
        long j;
        long jU;
        ri riVar;
        dth dthVar;
        ?? f4Var;
        boolean zB;
        lhb lhbVar;
        boolean z2;
        Object obj;
        jwa jwaVar;
        int i2;
        b8h b8hVar;
        List list;
        Object sb7Var;
        List listSingletonList;
        int i3;
        jj6 i2bVar;
        jwa jwaVar2;
        long jF = u25Var.f(a35Var);
        long j2 = this.g;
        dth dthVar2 = this.u;
        if (z) {
            try {
                dthVar2.g(j2, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        qa5 qa5Var2 = new qa5(u25Var, a35Var.f, jF);
        if (this.C == null) {
            nmc nmcVar = this.z;
            qa5Var2.f = 0;
            try {
                nmcVar.K(10);
                qa5Var2.m(nmcVar.a, 0, 10, false);
                if (nmcVar.D() != 4801587) {
                    qa5Var = null;
                    jU = -9223372036854775807L;
                    j = -9223372036854775807L;
                } else {
                    nmcVar.O(3);
                    int iZ = nmcVar.z();
                    int i4 = iZ + 10;
                    qa5Var = null;
                    byte[] bArr = nmcVar.a;
                    j = -9223372036854775807L;
                    if (i4 > bArr.length) {
                        nmcVar.K(i4);
                        System.arraycopy(bArr, 0, nmcVar.a, 0, 10);
                    }
                    qa5Var2.m(nmcVar.a, 10, iZ, false);
                    lwa lwaVarE = this.y.e(iZ, nmcVar.a);
                    if (lwaVarE == null) {
                        jU = j;
                    } else {
                        jwa[] jwaVarArr = lwaVarE.a;
                        int length = jwaVarArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                jwaVar2 = null;
                                break;
                            }
                            jwa jwaVar3 = jwaVarArr[i5];
                            if (bid.class.isAssignableFrom(jwaVar3.getClass())) {
                                jwaVar2 = (jwa) bid.class.cast(jwaVar3);
                                if (!((bid) jwaVar2).b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    jwaVar2 = null;
                                }
                            } else {
                                jwaVar2 = null;
                            }
                            if (jwaVar2 != null) {
                                break;
                            }
                            i5++;
                        }
                        bid bidVar = (bid) jwaVar2;
                        if (bidVar == null) {
                            jU = j;
                        } else {
                            System.arraycopy(bidVar.c, 0, nmcVar.a, 0, 8);
                            nmcVar.N(0);
                            nmcVar.M(8);
                            jU = nmcVar.u() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                qa5Var = null;
                j = -9223372036854775807L;
            }
            qa5Var2.f = 0;
            ri riVar2 = this.r;
            if (riVar2 == null) {
                Uri uri = a35Var.a;
                Map mapP = u25Var.p();
                ab5 ab5Var = this.v;
                ab5Var.getClass();
                b87 b87Var = this.d;
                int iB = uxl.b(b87Var.n);
                int iC = uxl.c(mapP);
                int iD = uxl.d(uri);
                ArrayList arrayList = new ArrayList(7);
                ab5.a(iB, arrayList);
                ab5.a(iC, arrayList);
                ab5.a(iD, arrayList);
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    ab5.a(ab5.c[i6], arrayList);
                    i6++;
                }
                qa5Var2.f = 0;
                ?? r19 = qa5Var;
                int i8 = 0;
                while (true) {
                    int size = arrayList.size();
                    dth dthVar3 = this.u;
                    if (i8 >= size) {
                        j2 = j2;
                        i = 0;
                        r19.getClass();
                        riVar = new ri((jj6) r19, b87Var, dthVar3, ab5Var.a, ab5Var.b);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                    int i9 = i8;
                    if (iIntValue == 0) {
                        dthVar = dthVar3;
                        j2 = j2;
                        arrayList = arrayList;
                        f4Var = new f4();
                    } else if (iIntValue == 1) {
                        dthVar = dthVar3;
                        j2 = j2;
                        arrayList = arrayList;
                        f4Var = new h4();
                    } else if (iIntValue == 2) {
                        dthVar = dthVar3;
                        j2 = j2;
                        arrayList = arrayList;
                        f4Var = new le(0);
                    } else if (iIntValue != 7) {
                        List list2 = this.w;
                        xr8 xr8Var = b8h.P0;
                        if (iIntValue == 8) {
                            lhb lhbVar2 = ab5Var.a;
                            boolean z3 = ab5Var.b;
                            lwa lwaVar = b87Var.l;
                            if (lwaVar == null) {
                                lhbVar = lhbVar2;
                                z2 = z3;
                            } else {
                                jwa[] jwaVarArr2 = lwaVar.a;
                                int length2 = jwaVarArr2.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length2) {
                                        lhbVar = lhbVar2;
                                        z2 = z3;
                                        obj = qa5Var;
                                        break;
                                    }
                                    lhbVar = lhbVar2;
                                    jwa jwaVar4 = jwaVarArr2[i10];
                                    z2 = z3;
                                    jwa[] jwaVarArr3 = jwaVarArr2;
                                    if (hy7.class.isAssignableFrom(jwaVar4.getClass())) {
                                        jwaVar = (jwa) hy7.class.cast(jwaVar4);
                                        if (((hy7) jwaVar).c.isEmpty()) {
                                            obj = jwaVar;
                                            obj = qa5Var;
                                        }
                                    } else {
                                        obj = jwaVar;
                                        obj = qa5Var;
                                    }
                                    if (obj != null) {
                                        break;
                                    }
                                    i10++;
                                    lhbVar2 = lhbVar;
                                    z3 = z2;
                                    jwaVarArr2 = jwaVarArr3;
                                }
                                i2 = obj != null ? 4 : 0;
                                if (z2) {
                                    b8hVar = lhbVar;
                                } else {
                                    i2 |= 32;
                                    b8hVar = xr8Var;
                                }
                                int i11 = i2;
                                if (list2 != null) {
                                    list = list2;
                                } else {
                                    list = ghe.e;
                                }
                                dthVar = dthVar3;
                                sb7Var = new sb7(b8hVar, i11, dthVar3, list, null);
                            }
                            if (z2) {
                                i2 |= 32;
                                b8hVar = xr8Var;
                            } else {
                                b8hVar = lhbVar;
                            }
                            int i12 = i2;
                            if (list2 != null) {
                                list = list2;
                            } else {
                                list = ghe.e;
                            }
                            dthVar = dthVar3;
                            sb7Var = new sb7(b8hVar, i12, dthVar3, list, null);
                        } else if (iIntValue == 11) {
                            lhb lhbVar3 = ab5Var.a;
                            boolean z4 = ab5Var.b;
                            if (list2 != null) {
                                i3 = 48;
                                listSingletonList = list2;
                            } else {
                                a87 a87Var = new a87();
                                a87Var.m = uya.n("application/cea-608");
                                listSingletonList = Collections.singletonList(new b87(a87Var));
                                i3 = 16;
                            }
                            String str = b87Var.k;
                            dthVar = dthVar3;
                            if (!TextUtils.isEmpty(str)) {
                                if (uya.b(str, "audio/mp4a-latm") == null) {
                                    i3 |= 2;
                                }
                                if (uya.b(str, "video/avc") == null) {
                                    i3 |= 4;
                                }
                            }
                            sb7Var = new k5i(2, !z4 ? 1 : 0, !z4 ? xr8Var : lhbVar3, dthVar, new we5(i3, listSingletonList));
                        } else if (iIntValue != 13) {
                            f4Var = qa5Var;
                            dthVar = dthVar3;
                            j2 = j2;
                            arrayList = arrayList;
                        } else {
                            j2 = j2;
                            arrayList = arrayList;
                            dthVar = dthVar3;
                            f4Var = new xuj(b87Var.d, dthVar3, ab5Var.a, ab5Var.b);
                        }
                        f4Var = sb7Var;
                    } else {
                        dthVar = dthVar3;
                        j2 = j2;
                        arrayList = arrayList;
                        f4Var = new i2b(0, 0L);
                    }
                    f4Var.getClass();
                    try {
                        zB = f4Var.b(qa5Var2);
                        i = 0;
                        qa5Var2.f = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        qa5Var2.f = 0;
                        zB = false;
                    } catch (Throwable th) {
                        qa5Var2.f = 0;
                        throw th;
                    }
                    if (zB) {
                        riVar = new ri((jj6) f4Var, b87Var, dthVar, ab5Var.a, ab5Var.b);
                        break;
                    }
                    b87 b87Var2 = b87Var;
                    if (r19 == 0 && (iIntValue == iB || iIntValue == iC || iIntValue == iD || iIntValue == 11)) {
                        r19 = f4Var;
                    }
                    i8 = i9 + 1;
                    b87Var = b87Var2;
                    arrayList = arrayList;
                    j2 = j2;
                    r19 = r19;
                }
            } else {
                jj6 jj6Var = (jj6) riVar2.b;
                lvb.b0(!((jj6Var instanceof k5i) || (jj6Var instanceof sb7)));
                if (jj6Var instanceof xuj) {
                    i2bVar = new xuj(((b87) riVar2.c).d, (dth) riVar2.d, (b8h) riVar2.e, riVar2.a);
                } else if (jj6Var instanceof le) {
                    i2bVar = new le(0);
                } else if (jj6Var instanceof f4) {
                    i2bVar = new f4();
                } else if (jj6Var instanceof h4) {
                    i2bVar = new h4();
                } else {
                    if (!(jj6Var instanceof i2b)) {
                        ore.k("Unexpected extractor type for recreation: ".concat(jj6Var.getClass().getSimpleName()));
                        return qa5Var;
                    }
                    i2bVar = new i2b(0);
                }
                riVar = new ri(i2bVar, (b87) riVar2.c, (dth) riVar2.d, (b8h) riVar2.e, riVar2.a);
                j2 = j2;
                i = 0;
            }
            ri riVar3 = riVar;
            this.C = riVar3;
            jj6 jj6Var2 = (jj6) riVar3.b;
            if ((jj6Var2 instanceof le) || (jj6Var2 instanceof f4) || (jj6Var2 instanceof h4) || (jj6Var2 instanceof i2b)) {
                fy7 fy7Var = this.D;
                long jB = jU != j ? dthVar2.b(jU) : j2;
                if (fy7Var.u1 != jB) {
                    fy7Var.u1 = jB;
                    ey7[] ey7VarArr = fy7Var.v;
                    int length3 = ey7VarArr.length;
                    for (int i13 = i; i13 < length3; i13++) {
                        ey7 ey7Var = ey7VarArr[i13];
                        if (ey7Var.F != jB) {
                            ey7Var.F = jB;
                            ey7Var.z = true;
                        }
                    }
                }
            } else {
                fy7 fy7Var2 = this.D;
                if (fy7Var2.u1 != 0) {
                    fy7Var2.u1 = 0L;
                    ey7[] ey7VarArr2 = fy7Var2.v;
                    int length4 = ey7VarArr2.length;
                    for (int i14 = i; i14 < length4; i14++) {
                        ey7 ey7Var2 = ey7VarArr2[i14];
                        if (ey7Var2.F != 0) {
                            ey7Var2.F = 0L;
                            ey7Var2.z = true;
                        }
                    }
                }
            }
            this.D.x.clear();
            ((jj6) this.C.b).A(this.D);
        } else {
            i = 0;
        }
        fy7 fy7Var3 = this.D;
        wu5 wu5Var = fy7Var3.v1;
        wu5 wu5Var2 = this.x;
        if (!Objects.equals(wu5Var, wu5Var2)) {
            fy7Var3.v1 = wu5Var2;
            int i15 = i;
            while (true) {
                ey7[] ey7VarArr3 = fy7Var3.v;
                if (i15 >= ey7VarArr3.length) {
                    break;
                }
                if (fy7Var3.n1[i15]) {
                    ey7 ey7Var3 = ey7VarArr3[i15];
                    ey7Var3.I = wu5Var2;
                    ey7Var3.z = true;
                }
                i15++;
            }
        }
        return qa5Var2;
    }

    @Override // defpackage.y99
    public final void load() {
        ri riVar;
        this.D.getClass();
        if (this.C == null && (riVar = this.r) != null) {
            jj6 jj6Var = (jj6) riVar.b;
            if ((jj6Var instanceof k5i) || (jj6Var instanceof sb7)) {
                this.C = riVar;
                this.F = false;
            }
        }
        a35 a35Var = this.q;
        u25 u25Var = this.p;
        if (this.F) {
            u25Var.getClass();
            a35Var.getClass();
            c(u25Var, a35Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // defpackage.y99
    public final void z() {
        this.G = true;
    }
}
