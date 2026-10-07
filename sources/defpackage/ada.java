package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ada implements u0a, t0a {
    public final u0a[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ou7 d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public t0a g;
    public iyh h;
    public u0a[] i;
    public g84 j;

    public ada(ou7 ou7Var, long[] jArr, u0a... u0aVarArr) {
        this.d = ou7Var;
        this.a = u0aVarArr;
        ou7Var.getClass();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        this.j = new g84(gheVar, gheVar);
        this.c = new IdentityHashMap();
        this.i = new u0a[0];
        this.b = new boolean[u0aVarArr.length];
        for (int i = 0; i < u0aVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new dsh(u0aVarArr[i], j);
            }
        }
    }

    @Override // defpackage.t0a
    public final void C(u0a u0aVar) {
        ArrayList arrayList = this.e;
        arrayList.remove(u0aVar);
        if (arrayList.isEmpty()) {
            u0a[] u0aVarArr = this.a;
            int i = 0;
            for (u0a u0aVar2 : u0aVarArr) {
                i += u0aVar2.t().a;
            }
            hyh[] hyhVarArr = new hyh[i];
            int i2 = 0;
            for (int i3 = 0; i3 < u0aVarArr.length; i3++) {
                iyh iyhVarT = u0aVarArr[i3].t();
                int i4 = iyhVarT.a;
                int i5 = 0;
                while (i5 < i4) {
                    hyh hyhVarA = iyhVarT.a(i5);
                    int i6 = hyhVarA.a;
                    b87[] b87VarArr = new b87[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        b87 b87Var = hyhVarA.d[i7];
                        a87 a87VarA = b87Var.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = b87Var.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a87VarA.a = sb.toString();
                        b87VarArr[i7] = new b87(a87VarA);
                    }
                    hyh hyhVar = new hyh(i3 + ":" + hyhVarA.b, b87VarArr);
                    this.f.put(hyhVar, hyhVarA);
                    hyhVarArr[i2] = hyhVar;
                    i5++;
                    i2++;
                }
            }
            this.h = new iyh(hyhVarArr);
            t0a t0aVar = this.g;
            t0aVar.getClass();
            t0aVar.C(this);
        }
    }

    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[rg6VarArr.length];
        int[] iArr2 = new int[rg6VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = rg6VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            xye xyeVar = xyeVarArr[i2];
            Integer num = xyeVar == null ? null : (Integer) identityHashMap.get(xyeVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            rg6 rg6Var = rg6VarArr[i2];
            if (rg6Var != null) {
                String str = rg6Var.m().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = rg6VarArr.length;
        xye[] xyeVarArr2 = new xye[length2];
        xye[] xyeVarArr3 = new xye[rg6VarArr.length];
        rg6[] rg6VarArr2 = new rg6[rg6VarArr.length];
        u0a[] u0aVarArr = this.a;
        ArrayList arrayList = new ArrayList(u0aVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < u0aVarArr.length) {
            int i4 = i;
            while (i4 < rg6VarArr.length) {
                xyeVarArr3[i4] = iArr[i4] == i3 ? xyeVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    rg6 rg6Var2 = rg6VarArr[i4];
                    rg6Var2.getClass();
                    hyh hyhVar = (hyh) this.f.get(rg6Var2.m());
                    hyhVar.getClass();
                    rg6VarArr2[i4] = new zca(rg6Var2, hyhVar);
                } else {
                    rg6VarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            u0a[] u0aVarArr2 = u0aVarArr;
            int i5 = i3;
            long jA = u0aVarArr2[i3].a(rg6VarArr2, zArr, xyeVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jA;
            } else if (jA != j2) {
                ore.k("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < rg6VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    xye xyeVar2 = xyeVarArr3[i6];
                    xyeVar2.getClass();
                    xyeVarArr2[i6] = xyeVarArr3[i6];
                    identityHashMap.put(xyeVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    lvb.b0(xyeVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(u0aVarArr2[i5]);
            }
            i3 = i5 + 1;
            u0aVarArr = u0aVarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(xyeVarArr2, i7, xyeVarArr, i7, length2);
        this.i = (u0a[]) arrayList.toArray(new u0a[i7]);
        AbstractList abstractListF = j8f.f(new f4a(19), arrayList);
        this.d.getClass();
        this.j = new g84(arrayList, abstractListF);
        return j2;
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        u0a[] u0aVarArr = this.i;
        return (u0aVarArr.length > 0 ? u0aVarArr[0] : this.a[0]).c(j, ybfVar);
    }

    @Override // defpackage.vhf
    public final long e() {
        return this.j.e();
    }

    @Override // defpackage.u0a
    public final long g(long j) {
        long jG = this.i[0].g(j);
        int i = 1;
        while (true) {
            u0a[] u0aVarArr = this.i;
            if (i >= u0aVarArr.length) {
                return jG;
            }
            if (u0aVarArr[i].g(jG) != jG) {
                ore.k("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.j.i();
    }

    @Override // defpackage.u0a
    public final long k() {
        long j;
        u0a u0aVar;
        u0a[] u0aVarArr = this.i;
        int length = u0aVarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            u0a u0aVar2 = u0aVarArr[i];
            long jK = u0aVar2.k();
            if (jK == j2) {
                j = j2;
                if (j3 != j && u0aVar2.g(j3) != j3) {
                    ore.k("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                u0a[] u0aVarArr2 = this.i;
                int length2 = u0aVarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (u0aVar = u0aVarArr2[i2]) == u0aVar2) {
                        break;
                    }
                    if (u0aVar.g(jK) != jK) {
                        ore.k("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jK;
            } else {
                j = j2;
                if (jK != j3) {
                    ore.k("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.u0a
    public final void n() {
        for (u0a u0aVar : this.a) {
            u0aVar.n();
        }
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        t0a t0aVar = this.g;
        t0aVar.getClass();
        t0aVar.q(this);
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        this.g = t0aVar;
        ArrayList arrayList = this.e;
        u0a[] u0aVarArr = this.a;
        Collections.addAll(arrayList, u0aVarArr);
        for (u0a u0aVar : u0aVarArr) {
            u0aVar.s(this, j);
        }
    }

    @Override // defpackage.u0a
    public final iyh t() {
        iyh iyhVar = this.h;
        iyhVar.getClass();
        return iyhVar;
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.j.u(fa9Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u0a) arrayList.get(i)).u(fa9Var);
        }
        return false;
    }

    @Override // defpackage.vhf
    public final long v() {
        return this.j.v();
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        for (u0a u0aVar : this.i) {
            u0aVar.w(j, z);
        }
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        this.j.y(j);
    }
}
