package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jk3 extends wed {
    public final wqg j;
    public final i5d k;
    public final ny8 l;
    public final ny8 m;
    public final ConcurrentHashMap n;
    public final ConcurrentHashMap o;
    public final int p;
    public final r8e q;

    public jk3(wmi wmiVar, ny8 ny8Var, ny8 ny8Var2, wqg wqgVar, i5d i5dVar) {
        super(wmiVar, null, 14);
        this.j = wqgVar;
        this.k = i5dVar;
        this.l = ny8Var;
        this.m = ny8Var2;
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.p = 30;
        this.q = ((asg) ny8Var2.getValue()).h;
    }

    @Override // defpackage.wed
    public final void f(LinkedHashSet linkedHashSet) {
        linkedHashSet.removeIf(new hk3(0, new w03(rx8.j0(yw3.X0(this.n.values())), this, System.currentTimeMillis(), 1)));
    }

    @Override // defpackage.wed
    public final int j() {
        return this.p;
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return u(list, (u8b) obj2, qedVar);
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(list.size(), "makeRequest: size="), null);
            }
        }
        u8b u8bVar = new u8b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u8bVar.b(new zyg(((Number) it.next()).longValue()));
        }
        return ((aj5) this.l.getValue()).m(u8bVar, gzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(List list, u8b u8bVar, nq4 nq4Var) {
        ik3 ik3Var;
        long jO;
        if (nq4Var instanceof ik3) {
            ik3Var = (ik3) nq4Var;
            int i = ik3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik3Var.g = i - Integer.MIN_VALUE;
            } else {
                ik3Var = new ik3(this, nq4Var);
            }
        } else {
            ik3Var = new ik3(this, nq4Var);
        }
        Object obj = ik3Var.e;
        int i2 = ik3Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            asg asgVar = (asg) this.m.getValue();
            ik3Var.d = list;
            ik3Var.g = 1;
            Object objU = asgVar.u(list, u8bVar, ik3Var);
            hu4 hu4Var = hu4.a;
            if (objU == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ik3Var.d;
            ch3.d0(obj);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer num = ((vqg) this.k.i()).e;
        lw5 lw5Var = lw5.SECONDS;
        if (num != null) {
            ghb ghbVar = ew5.b;
            jO = qe7.O(num.intValue(), lw5Var);
        } else {
            ghb ghbVar2 = ew5.b;
            jO = qe7.O(60, lw5Var);
        }
        long jG = ew5.g(jO) + jCurrentTimeMillis;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.o.put(new Long(((Number) it.next()).longValue()), new Long(jG));
        }
        return sbi.a;
    }

    public final Object v(String str, Set set, gz gzVar) {
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (!((Boolean) this.j.invoke()).booleanValue()) {
            String str2 = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "the stories feature is disabled", null);
                return sbiVar;
            }
        } else if (set.isEmpty()) {
            String str3 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "We cannot prefetch empty data", null);
                return sbiVar;
            }
        } else {
            this.n.put(str, set);
            Object objR = r(str, set, gzVar);
            if (objR == hu4.a) {
                return objR;
            }
        }
        return sbiVar;
    }
}
