package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class x84 extends l0 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final ush[] l;
    public final Object[] m;
    public final HashMap n;

    public x84(ArrayList arrayList, e4g e4gVar) {
        super(e4gVar);
        int size = arrayList.size();
        this.j = new int[size];
        this.k = new int[size];
        this.l = new ush[size];
        this.m = new Object[size];
        this.n = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i = 0;
        while (it.hasNext()) {
            a94 a94Var = (a94) it.next();
            ush[] ushVarArr = this.l;
            ln9 ln9Var = a94Var.a.o;
            ushVarArr[i] = ln9Var;
            this.k[i] = iO;
            this.j[i] = iH;
            iO += ln9Var.e.o();
            iH += this.l[i].h();
            Object[] objArr = this.m;
            Object obj = a94Var.b;
            objArr[i] = obj;
            this.n.put(obj, Integer.valueOf(i));
            i++;
        }
        this.h = iO;
        this.i = iH;
    }

    @Override // defpackage.ush
    public final int h() {
        return this.i;
    }

    @Override // defpackage.ush
    public final int o() {
        return this.h;
    }

    @Override // defpackage.l0
    public final int q(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.l0
    public final int r(int i) {
        return vqi.e(this.j, i + 1, false, false);
    }

    @Override // defpackage.l0
    public final int s(int i) {
        return vqi.e(this.k, i + 1, false, false);
    }

    @Override // defpackage.l0
    public final Object t(int i) {
        return this.m[i];
    }

    @Override // defpackage.l0
    public final int u(int i) {
        return this.j[i];
    }

    @Override // defpackage.l0
    public final int v(int i) {
        return this.k[i];
    }

    @Override // defpackage.l0
    public final ush y(int i) {
        return this.l[i];
    }
}
