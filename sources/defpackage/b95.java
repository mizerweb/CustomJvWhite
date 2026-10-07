package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class b95 {
    public final y82 a;
    public final j12 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final mjg f;
    public final f6h g;
    public final mjg h;
    public final r8e i;
    public final r8e j;
    public final t84 k;
    public final CopyOnWriteArraySet l;
    public final ConcurrentHashMap m;

    public b95(y82 y82Var, j12 j12Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = y82Var;
        this.b = j12Var;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        mjg mjgVarA = p90.a(dz4.r);
        this.f = mjgVarA;
        f6h f6hVar = new f6h(mjgVarA);
        this.g = f6hVar;
        mjg mjgVarA2 = p90.a(r66.a);
        this.h = mjgVarA2;
        ur2 ur2VarM0 = e9i.M0(mjgVarA2, new vm1((lq4) null, this, 3));
        a8g a8gVar = j0g.a;
        this.i = e9i.G0(ur2VarM0, y82Var, a8gVar, f6hVar);
        this.j = e9i.G0(e9i.M0(mjgVarA2, new l42(3, null, 4)), y82Var, a8gVar, null);
        t84 t84Var = new t84(y82Var, ny8Var, ny8Var3, ny8Var4, new oo3(1, this, b95.class, "provideCallDeps", "provideCallDeps(Lone/me/sdk/di/account/LocalAccountId;)Lone/me/calls/impl/di/CallSessionDeps;", 0, 2));
        this.k = t84Var;
        yab.i0(y82Var, null, 0, new ai8(mjgVarA2, t84Var, null, 14), 3);
        this.l = new CopyOnWriteArraySet();
        this.m = new ConcurrentHashMap();
    }

    public static final x02 a(b95 b95Var, y02 y02Var, String str) {
        Object value;
        b95Var.getClass();
        x02 x02VarA = y02Var.m().a(b95Var, str, y02Var.getScope());
        x02VarA.e().f(y02Var.e());
        mjg mjgVar = b95Var.h;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, ww3.H1(x02VarA, (List) value)));
        return x02VarA;
    }

    public static final x02 b(b95 b95Var) {
        Object next;
        Iterator it = ((Iterable) b95Var.h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Boolean) ((x02) next).isHeldByMe().getValue()).booleanValue());
        x02 x02Var = (x02) next;
        return x02Var == null ? b95Var.g : x02Var;
    }

    public final void c(f22 f22Var) {
        this.l.add(f22Var);
    }

    public final boolean d(ghg ghgVar) {
        return e(ghgVar) == null;
    }

    public final x02 e(ghg ghgVar) {
        Object next;
        boolean z;
        Iterator it = ((Iterable) this.h.getValue()).iterator();
        while (it.hasNext()) {
            next = it.next();
            dz4 dz4Var = (dz4) ((x02) next).z().getValue();
            phl phlVar = dz4Var.a;
            if (phlVar != null && (((ghgVar instanceof chg) && (phlVar instanceof k32) && ((chg) ghgVar).b().c() == ((k32) phlVar).c()) || (((ghgVar instanceof ehg) && (phlVar instanceof m32) && ((ehg) ghgVar).b().c() == ((m32) phlVar).c()) || ((((z = ghgVar instanceof dhg)) && (phlVar instanceof l32) && v3e.b(((dhg) ghgVar).b()).equals(v3e.b(((l32) phlVar).c()))) || (z && (phlVar instanceof k32) && v3e.b(((dhg) ghgVar).b()).equals(v3e.b(dz4Var.d))))))) {
                return (x02) next;
            }
        }
        next = null;
        return (x02) next;
    }

    public final x02 f() {
        Object next;
        mjg mjgVar = this.h;
        Iterator it = ((Iterable) mjgVar.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Boolean) ((x02) next).isHeldByMe().getValue()).booleanValue());
        x02 x02Var = (x02) next;
        return x02Var != null ? x02Var : (x02) ww3.t1((List) mjgVar.getValue());
    }

    public final boolean g() {
        Iterable iterable = (Iterable) this.h.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((x02) it.next()).C()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        int i;
        Iterable iterable = (Iterable) this.h.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            i = 0;
        } else {
            Iterator it = iterable.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((x02) it.next()).C() && (i = i + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        return i > 1;
    }

    public final x02 i(String str) {
        Object obj = null;
        if (r5h.X0(str)) {
            return null;
        }
        for (Object obj2 : (Iterable) this.h.getValue()) {
            if (cqk.d(((x02) obj2).s(), str)) {
                obj = obj2;
                break;
            }
        }
        return (x02) obj;
    }

    public final void j(String str) {
        Object next;
        je9 je9Var = je9.d;
        Iterator it = ((Iterable) this.h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((x02) next).s(), str));
        x02 x02Var = (x02) next;
        if (x02Var == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsManager", c0a.o("hangup(", str, "): session is no longer live, ignore"), null);
                return;
            }
            return;
        }
        if (x02Var.m() || x02Var.k()) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallsManager", c0a.o("hangup(", str, "): hanging up session"), null);
            }
            x02Var.o(false);
            return;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, "CallsManager", c0a.o("hangup(", str, "): no active/incoming call (already finishing), ignore"), null);
        }
    }

    public final void k(String str) {
        Object next;
        je9 je9Var = je9.d;
        Iterator it = ((Iterable) this.h.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            x02 x02Var = (x02) next;
            if (cqk.d(x02Var.s(), str) && !((Boolean) x02Var.isHeldByMe().getValue()).booleanValue()) {
                break;
            }
        }
        x02 x02Var2 = (x02) next;
        if (x02Var2 == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsManager", c0a.o("holdSession(", str, "): no active session to hold"), null);
                return;
            }
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallsManager", c0a.o("holdSession(", str, "): holding"), null);
        }
        l(x02Var2);
        s();
    }

    public final void l(x02 x02Var) {
        y02 y02VarO = o(x02Var.l());
        if (y02VarO.g().c()) {
            y02VarO.g().d(false);
        }
        if (y02VarO.l().c()) {
            y02VarO.l().b(false);
        }
        x02Var.i();
    }

    public final void m(String str) {
        Object next;
        boolean zC;
        mjg mjgVar = this.h;
        Iterator it = ((Iterable) mjgVar.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((x02) next).s(), str));
        x02 x02Var = (x02) next;
        if (x02Var != null) {
            boolean zH = h();
            y02 y02VarO = o(x02Var.l());
            Iterable iterable = (Iterable) mjgVar.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        zC = true;
                        break;
                    }
                    x02 x02Var2 = (x02) it2.next();
                    if (!cqk.d(x02Var2.s(), str) && !((Boolean) x02Var2.isHeldByMe().getValue()).booleanValue()) {
                        zC = ((ac1) y02VarO.b()).c();
                        break;
                    }
                }
            } else {
                zC = true;
                break;
            }
            Iterable iterable2 = (Iterable) mjgVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable2) {
                x02 x02Var3 = (x02) obj;
                if (!cqk.d(x02Var3.s(), str) && !((Boolean) x02Var3.isHeldByMe().getValue()).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                l((x02) it3.next());
            }
            y02VarO.a().b(x02Var.D());
            if (zH) {
                ((ac1) y02VarO.b()).d(zC);
                y02VarO.g().d(false);
            }
            y02VarO.c().a((Context) this.e.getValue(), y02VarO.d());
        }
        Iterator it4 = this.l.iterator();
        while (it4.hasNext()) {
            ((f22) it4.next()).e();
        }
    }

    public final void n(String str) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((f22) it.next()).i(str);
        }
    }

    public final y02 o(ha9 ha9Var) {
        return (y02) this.m.computeIfAbsent(ha9Var, new am(11, new nv4(2, ha9Var)));
    }

    public final y02 p(String str) {
        ha9 ha9VarL;
        x02 x02VarI = i(str);
        if (x02VarI == null || (ha9VarL = x02VarI.l()) == null || ha9VarL.equals(ha9.c)) {
            ha9VarL = null;
        }
        if (ha9VarL != null) {
            return o(ha9VarL);
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsManager", c0a.o("provideCallDepsForSession(", str, "): no live session"), null);
            }
        }
        return null;
    }

    public final void q(String str) {
        Object next;
        je9 je9Var = je9.d;
        Iterator it = ((Iterable) this.h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((x02) next).s(), str));
        x02 x02Var = (x02) next;
        if (x02Var == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsManager", c0a.o("returnToSession(", str, "): session is no longer live, ignore"), null);
                return;
            }
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallsManager", c0a.o("returnToSession(", str, "): swap — hold current active, unhold target"), null);
        }
        y02 y02VarO = o(x02Var.l());
        Iterable iterable = (Iterable) this.h.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            x02 x02Var2 = (x02) obj;
            if (!cqk.d(x02Var2.s(), str) && !((Boolean) x02Var2.isHeldByMe().getValue()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l((x02) it2.next());
        }
        x02Var.v();
        y02VarO.a().b(x02Var.D());
        ((ac1) y02VarO.b()).d(false);
        y02VarO.g().d(false);
        y02VarO.c().a((Context) this.e.getValue(), y02VarO.d());
    }

    public final void r(String str, boolean z) {
        Object value;
        Set set;
        mjg mjgVar = (mjg) this.k.i;
        do {
            value = mjgVar.getValue();
            set = (Set) value;
        } while (!mjgVar.h(value, z ? lof.a0(set, new z02(str)) : lof.X(set, new z02(str))));
    }

    public final void s() {
        Object next;
        Iterator it = ((Iterable) this.h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Boolean) ((x02) next).isHeldByMe().getValue()).booleanValue());
        x02 x02Var = (x02) next;
        if (x02Var != null) {
            o(x02Var.l()).a().b(x02Var.D());
            return;
        }
        Iterator it2 = this.m.values().iterator();
        while (it2.hasNext()) {
            ((y02) it2.next()).a().b(null);
        }
    }
}
