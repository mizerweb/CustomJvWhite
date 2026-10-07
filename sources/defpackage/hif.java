package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hif implements fif, j81 {
    public final String a;
    public final lvb b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final fif[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final fif[] k;
    public final ifh l;

    public hif(String str, lvb lvbVar, int i, List list, tr3 tr3Var) {
        this.a = str;
        this.b = lvbVar;
        this.c = i;
        this.d = tr3Var.b;
        ArrayList arrayList = tr3Var.c;
        this.e = ww3.R1(arrayList);
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = wk8.j(tr3Var.e);
        this.h = (List[]) tr3Var.f.toArray(new List[0]);
        ArrayList arrayList2 = tr3Var.g;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        rw rwVar = new rw(1, new d2(3, this.f));
        ArrayList arrayList3 = new ArrayList(yw3.W0(rwVar, 10));
        Iterator it2 = rwVar.iterator();
        while (true) {
            sv5 sv5Var = (sv5) it2;
            if (!sv5Var.b.hasNext()) {
                this.j = wm9.W0(arrayList3);
                this.k = wk8.j(list);
                this.l = new ifh(new ap9(27, this));
                return;
            }
            dd8 dd8Var = (dd8) sv5Var.next();
            arrayList3.add(new ylc(dd8Var.b, Integer.valueOf(dd8Var.a)));
        }
    }

    @Override // defpackage.j81
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.fif
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.fif
    public final lvb d() {
        return this.b;
    }

    @Override // defpackage.fif
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hif) {
            fif fifVar = (fif) obj;
            if (this.a.equals(fifVar.i()) && Arrays.equals(this.k, ((hif) obj).k)) {
                int iE = fifVar.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        fif[] fifVarArr = this.g;
                        if (cqk.d(fifVarArr[i2].i(), fifVar.h(i2).i()) && cqk.d(fifVarArr[i2].d(), fifVar.h(i2).d())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fif
    public final String f(int i) {
        return this.f[i];
    }

    @Override // defpackage.fif
    public final List g(int i) {
        return this.h[i];
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.fif
    public final String i() {
        return this.a;
    }

    @Override // defpackage.fif
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return ww3.z1(oc9.f0(0, this.c), ", ", this.a.concat("("), ")", new p7d(25, this), 24);
    }
}
