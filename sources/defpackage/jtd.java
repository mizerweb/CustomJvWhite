package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jtd extends a8j {
    public final long c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public la3 k;
    public final ic6 l = new ic6(null);
    public final r8e m;
    public final mjg n;
    public final r8e o;
    public final r8e p;

    public jtd(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.c = j;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = ny8Var7;
        this.j = ny8Var8;
        r8e r8eVarK = ((xn3) ny8Var3.getValue()).k(j);
        this.m = r8eVarK;
        mjg mjgVarA = p90.a(null);
        this.n = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.o = r8eVar;
        bye byeVar = new bye(new voc(new bye(new voc(new jz(r8eVarK, 13), (lq4) null, this, 15)), (lq4) null, this, 16));
        ghb ghbVar = ew5.b;
        e9i.j0(e9i.T(new fz6(tre.G0(byeVar, qe7.O(5, lw5.SECONDS)), new dtd(this, (lq4) null, 0), 3), ((n0c) ((xhh) ny8Var7.getValue())).a()), this.b);
        this.p = e9i.G0(e9i.T(new q0d(new hz1(r8eVar, 11), this, 8), ((n0c) ((xhh) ny8Var7.getValue())).a()), this.b, j0g.a, null);
    }

    public static final void B(jtd jtdVar, ax2 ax2Var) {
        boolean z;
        mjg mjgVar = jtdVar.n;
        List listK = ((xm) jtdVar.f.getValue()).k();
        if (listK.isEmpty()) {
            a8j.t(jtdVar, ((n0c) ((xhh) jtdVar.i.getValue())).b(), new l0d(jtdVar, ax2Var, null, 21), 2);
            boolean z2 = ax2Var.b;
            int i = ax2Var.c;
            r66 r66Var = r66.a;
            la3 la3Var = new la3(z2, i, r66Var, r66Var, false, false, true, true);
            mjgVar.getClass();
            mjgVar.j(null, la3Var);
            return;
        }
        List list = ax2Var.f;
        boolean z3 = ax2Var.e;
        ArrayList<jl> arrayList = new ArrayList();
        for (Object obj : listK) {
            jl jlVar = (jl) obj;
            if (z3) {
                if (list != null && list.contains(jlVar.b)) {
                    arrayList.add(obj);
                }
            } else if (list != null && !list.contains(jlVar.b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        for (jl jlVar2 : arrayList) {
            arrayList2.add(((b56) jtdVar.g.getValue()).b(jlVar2.a, jlVar2.c, jlVar2.e, jlVar2.b, gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        }
        if (ax2Var.c == jtdVar.C().b && z3 == jtdVar.C().c) {
            if (list != null) {
                if (list.size() == jtdVar.C().d.size()) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String str = (String) it.next();
                                List list3 = jtdVar.C().d;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it2 = list3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((String) it2.next()).contentEquals(str)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        la3 la3Var2 = new la3(ax2Var.b, ax2Var.c, arrayList2, listK, z, false, false, true);
        jtdVar.k = la3Var2;
        mjgVar.getClass();
        mjgVar.j(null, la3Var2);
    }

    public final ad5 C() {
        return (ad5) ((f5d) ((wo6) this.h.getValue())).a.Y2.a(e5d.S6[208]).i();
    }

    public final boolean D(la3 la3Var) {
        CharSequence charSequence;
        Object next;
        la3 la3Var2 = this.k;
        if (la3Var2 == null) {
            return false;
        }
        List list = la3Var2.c;
        boolean z = la3Var.a;
        List list2 = la3Var.c;
        if (z != la3Var2.a || la3Var.b != la3Var2.b) {
            return true;
        }
        Object obj = null;
        if (!cqk.d(list2 != null ? Integer.valueOf(list2.size()) : null, list != null ? Integer.valueOf(list.size()) : null)) {
            return true;
        }
        if (list2 != null) {
            for (Object obj2 : list2) {
                CharSequence charSequence2 = (CharSequence) obj2;
                if (list != null) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!z5h.E0((CharSequence) next, charSequence2));
                    charSequence = (CharSequence) next;
                } else {
                    charSequence = null;
                }
                if (charSequence == null) {
                    obj = obj2;
                    break;
                }
            }
            obj = (CharSequence) obj;
        }
        return obj != null;
    }

    public final void E() {
        rt2 rt2Var = (rt2) this.m.a.getValue();
        if (rt2Var == null) {
            gm0.Y(jtd.class.getName(), "Early return in reloadSettings cuz of chatFlow.value?.serverId is null");
        } else {
            a8j.t(this, ((n0c) ((xhh) this.i.getValue())).b(), new etd(this, rt2Var.A(), null), 2);
        }
    }

    public final void F() {
        Object value = this.n.getValue();
        la3 la3Var = value instanceof la3 ? (la3) value : null;
        if (la3Var == null) {
            gm0.Y(jtd.class.getName(), "Early return in save cuz of _state.value as? ChatReactionsSettingsState.Content is null");
        } else {
            a8j.t(this, ((n0c) ((xhh) this.i.getValue())).b(), new voc(la3Var, this, (lq4) null, 14), 2);
        }
    }
}
