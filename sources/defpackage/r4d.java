package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r4d extends l0 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final ush[] l;
    public final Object[] m;
    public final HashMap n;

    public r4d(ush[] ushVarArr, Object[] objArr, e4g e4gVar) {
        super(e4gVar);
        int length = ushVarArr.length;
        this.l = ushVarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = ushVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            ush ushVar = ushVarArr[i];
            this.l[i2] = ushVar;
            this.k[i2] = iO;
            this.j[i2] = iH;
            iO += ushVar.o();
            iH += this.l[i2].h();
            this.n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
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

    public final r4d z(e4g e4gVar) {
        ush[] ushVarArr = this.l;
        ush[] ushVarArr2 = new ush[ushVarArr.length];
        for (int i = 0; i < ushVarArr.length; i++) {
            ushVarArr2[i] = new q4d(ushVarArr[i]);
        }
        return new r4d(ushVarArr2, this.m, e4gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r4d(List list, e4g e4gVar) {
        ush[] ushVarArr = new ush[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ushVarArr[i2] = ((e5a) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((e5a) it2.next()).a();
            i++;
        }
        this(ushVarArr, objArr, e4gVar);
    }
}
