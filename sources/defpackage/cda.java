package defpackage;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cda extends e84 {
    public static final ry9 s;
    public final ur0[] k;
    public final ArrayList l;
    public final ush[] m;
    public final ArrayList n;
    public final ou7 o;
    public int p;
    public long[][] q;
    public MergingMediaSource$IllegalMergeException r;

    static {
        by9 by9Var = new by9();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        List list = Collections.EMPTY_LIST;
        ghe gheVar2 = ghe.e;
        hy9 hy9Var = new hy9();
        s = new ry9("MergingMediaSource", new dy9(by9Var), null, new iy9(hy9Var), b0a.K, ly9.d);
    }

    public cda(ur0... ur0VarArr) {
        ou7 ou7Var = new ou7(22);
        this.k = ur0VarArr;
        this.o = ou7Var;
        this.n = new ArrayList(Arrays.asList(ur0VarArr));
        this.p = -1;
        this.l = new ArrayList(ur0VarArr.length);
        for (int i = 0; i < ur0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new ush[ur0VarArr.length];
        this.q = new long[0][];
        new HashMap();
        oc9.p(8, "expectedKeys");
        oc9.p(2, "expectedValuesPerKey");
        new e7b(u44.b(8)).g = new d7b();
    }

    @Override // defpackage.e84
    public final void A(Object obj, ur0 ur0Var, ush ushVar) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = ushVar.h();
        } else if (ushVar.h() != this.p) {
            this.r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.q.length;
        ush[] ushVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, ushVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(ur0Var);
        ushVarArr[num.intValue()] = ushVar;
        if (arrayList.isEmpty()) {
            p(ushVarArr[0]);
        }
    }

    @Override // defpackage.ur0
    public final boolean c(ry9 ry9Var) {
        ur0[] ur0VarArr = this.k;
        return ur0VarArr.length > 0 && ur0VarArr[0].c(ry9Var);
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        ur0[] ur0VarArr = this.k;
        int length = ur0VarArr.length;
        u0a[] u0aVarArr = new u0a[length];
        ush[] ushVarArr = this.m;
        int iB = ushVarArr[0].b(x4aVar.a);
        for (int i = 0; i < length; i++) {
            x4a x4aVarA = x4aVar.a(ushVarArr[i].l(iB));
            u0aVarArr[i] = ur0VarArr[i].e(x4aVarA, qfVar, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new bda(x4aVarA, u0aVarArr[i]));
        }
        return new ada(this.o, this.q[iB], u0aVarArr);
    }

    @Override // defpackage.ur0
    public final ry9 k() {
        ur0[] ur0VarArr = this.k;
        return ur0VarArr.length > 0 ? ur0VarArr[0].k() : s;
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void m() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.m();
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.j = v1iVar;
        this.i = vqi.p(null);
        int i = 0;
        while (true) {
            ur0[] ur0VarArr = this.k;
            if (i >= ur0VarArr.length) {
                return;
            }
            B(Integer.valueOf(i), ur0VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        ada adaVar = (ada) u0aVar;
        int i = 0;
        while (true) {
            ur0[] ur0VarArr = this.k;
            if (i >= ur0VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = adaVar.b;
            u0a[] u0aVarArr = adaVar.a;
            u0a u0aVar2 = zArr[i] ? ((dsh) u0aVarArr[i]).a : u0aVarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((bda) list.get(i2)).b.equals(u0aVar2)) {
                    list.remove(i2);
                    break;
                }
            }
            ur0VarArr[i].q(adaVar.b[i] ? ((dsh) u0aVarArr[i]).a : u0aVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void s() {
        super.s();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.ur0
    public final void v(ry9 ry9Var) {
        this.k[0].v(ry9Var);
    }

    @Override // defpackage.e84
    public final x4a x(Object obj, x4a x4aVar) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((bda) list.get(i)).a.equals(x4aVar)) {
                return ((bda) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }
}
