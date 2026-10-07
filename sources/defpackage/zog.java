package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zog extends a8j {
    public final long c;
    public final hog d;
    public final eog e;
    public final xhh f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ic6 l = new ic6(null);
    public final ic6 m = new ic6(null);
    public final mjg n;
    public final r8e o;
    public final mw p;
    public boolean q;

    public zog(long j, hog hogVar, eog eogVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.c = j;
        this.d = hogVar;
        this.e = eogVar;
        this.f = xhhVar;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        mjg mjgVarA = p90.a(z3g.c);
        this.n = mjgVarA;
        this.o = new r8e(mjgVarA);
        this.p = new mw(0);
        e9i.j0(e9i.T(new fz6(e9i.C(eogVar.e, hogVar.e, ((ldh) ny8Var.getValue()).i, yog.h), new j8g(this, (lq4) null, 10), 3), ((n0c) xhhVar).b()), this.b);
    }

    public final boolean B() {
        List list;
        hog hogVar = this.d;
        if (hogVar.a()) {
            return (((fog) hogVar.g.get()).a == 0 || (list = ((gog) hogVar.d.getValue()).a) == null || list.isEmpty()) ? false : true;
        }
        eog eogVar = this.e;
        Long l = (Long) eogVar.f.get();
        return (l == null || l.longValue() != 0) && !((Collection) eogVar.d.getValue()).isEmpty();
    }

    public final ArrayList C(List list, List list2) {
        List list3 = list;
        int i = 10;
        ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            emg emgVar = (emg) it.next();
            boolean zContains = list2.contains(emgVar);
            long j = emgVar.a;
            String str = emgVar.b;
            if (str == null) {
                str = "";
            }
            xnh xnhVar = new xnh(str);
            String str2 = emgVar.c;
            List<clg> list4 = emgVar.h;
            ArrayList arrayList2 = new ArrayList(yw3.W0(list4, i));
            for (clg clgVar : list4) {
                long j2 = clgVar.a;
                emg emgVar2 = emgVar;
                long j3 = clgVar.k;
                Iterator it2 = it;
                String str3 = clgVar.h;
                if (ch3.r(str3)) {
                    str3 = clgVar.d;
                }
                arrayList2.add(new tlg(j2, j3, j3, str3, clgVar.l, clgVar.o, 0, 0, false, false, clgVar.a, 0, 12224));
                emgVar = emgVar2;
                it = it2;
            }
            Iterator it3 = it;
            arrayList.add(new omg(j, xnhVar, str2, null, arrayList2, 5, false, zContains, false, emgVar.g, emgVar.d == ((s7f) ((et3) this.j.getValue())).t(), 328));
            it = it3;
            i = 10;
        }
        return arrayList;
    }
}
