package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ru1 {
    public final du1 a;
    public final xq1 b;
    public final fik c;
    public final CidLogger d;
    public final rj5 e;
    public final HashMap f;
    public final HashMap g;
    public final LongSparseArray h;
    public yt1 i;
    public dnf j;
    public dnf k;

    public ru1(du1 du1Var, xq1 xq1Var, fik fikVar, CidLogger cidLogger) {
        this.a = du1Var;
        this.b = xq1Var;
        this.c = fikVar;
        this.d = cidLogger;
        rj5 rj5Var = new rj5(27, false);
        rj5Var.b = c76.a;
        this.e = rj5Var;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new LongSparseArray();
        bnf bnfVar = bnf.a;
        this.j = bnfVar;
        this.k = bnfVar;
    }

    public final ch a(smc smcVar, dnf dnfVar) {
        dnf dnfVar2;
        boolean z;
        yt1 yt1Var = smcVar.a;
        imc imcVar = smcVar.i;
        imc imcVar2 = smcVar.h;
        imc imcVar3 = smcVar.g;
        imc imcVar4 = smcVar.f;
        imc imcVar5 = smcVar.e;
        imc imcVar6 = smcVar.d;
        imc imcVar7 = smcVar.c;
        imc imcVar8 = smcVar.b;
        du1 du1VarL = l(yt1Var);
        if (du1VarL == null) {
            du1VarL = new du1(yt1Var, (bpc) imcVar8.s(), (n8b) imcVar7.s(), (p8b) imcVar6.s());
            e(du1VarL, dnfVar);
            dnfVar2 = null;
            z = true;
        } else {
            n8b n8bVar = du1VarL.b;
            if (imcVar8.q()) {
                du1VarL.f((bpc) imcVar8.c());
            }
            if (imcVar7.q()) {
                n8b n8bVar2 = (n8b) imcVar7.c();
                o0a o0aVar = n8bVar2.a;
                n8bVar.getClass();
                o0aVar.getClass();
                n8bVar.a = o0aVar;
                o0a o0aVar2 = n8bVar2.b;
                o0aVar2.getClass();
                n8bVar.b = o0aVar2;
                o0a o0aVar3 = n8bVar2.c;
                o0aVar3.getClass();
                n8bVar.c = o0aVar3;
                o0a o0aVar4 = n8bVar2.d;
                o0aVar4.getClass();
                n8bVar.d = o0aVar4;
            }
            if (imcVar6.q()) {
                p8b p8bVar = (p8b) imcVar6.c();
                p8b p8bVar2 = du1VarL.c;
                boolean z2 = p8bVar2.e;
                boolean z3 = p8bVar.e;
                if (z2 != z3 || p8bVar2.f != p8bVar.f || p8bVar2.b != p8bVar.b || p8bVar2.g != p8bVar.g || p8bVar2.c != p8bVar.c || p8bVar2.d != p8bVar.d) {
                    p8bVar2.e = z3;
                    p8bVar2.f = p8bVar.f;
                    p8bVar2.b = p8bVar.b;
                    p8bVar2.g = p8bVar.g;
                    p8bVar2.c = p8bVar.c;
                    p8bVar2.d = p8bVar.d;
                    p8bVar2.a();
                }
            }
            dnfVar2 = (dnf) this.g.get(yt1Var);
            if (dnfVar2 == null) {
                dnfVar2 = this.k;
            }
            z = !cqk.d(dnfVar2, dnfVar);
            if (!cqk.d(dnfVar2, dnfVar)) {
                b(yt1Var, dnfVar2);
                e(du1VarL, dnfVar);
            }
        }
        if (yt1Var == this.i) {
            du1VarL.p = true;
        }
        if (imcVar5.q()) {
            List list = (List) imcVar5.c();
            ArrayList arrayList = du1VarL.d;
            arrayList.clear();
            arrayList.addAll(list);
        }
        if (imcVar4.q()) {
            du1VarL.q = (hi1) imcVar4.c();
        }
        if (imcVar3.q()) {
            du1VarL.r = (List) imcVar3.c();
        }
        if (imcVar2.q()) {
            du1VarL.s = ((Number) imcVar2.c()).intValue();
        }
        if (imcVar.q()) {
            du1VarL.g = (cu1) imcVar.c();
        }
        return new ch(du1VarL, z, dnfVar2, 12);
    }

    public final du1 b(yt1 yt1Var, dnf dnfVar) {
        HashMap map = this.g;
        dnf dnfVar2 = (dnf) map.get(yt1Var);
        if (dnfVar2 == null) {
            return null;
        }
        if (!dnfVar2.equals(dnfVar)) {
            this.d.log("CallParticipants", "Tried to remove " + yt1Var + " from " + dnfVar + " but participant is in " + dnfVar2);
            return null;
        }
        long j = yt1Var.a;
        LongSparseArray longSparseArray = this.h;
        Set set = (Set) longSparseArray.get(j);
        if (set != null) {
            set.remove(yt1Var);
            if (set.isEmpty()) {
                longSparseArray.remove(j);
            }
        }
        map.remove(yt1Var);
        HashMap map2 = this.f;
        Object linkedHashMap = map2.get(dnfVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map2.put(dnfVar, linkedHashMap);
        }
        return (du1) ((Map) linkedHashMap).remove(yt1Var);
    }

    public final dnf c(yt1 yt1Var) {
        dnf dnfVar = (dnf) this.g.get(yt1Var);
        if (dnfVar == null) {
            return cqk.d(yt1Var, this.a.a) ? this.k : bnf.a;
        }
        return dnfVar;
    }

    public final Map d(dnf dnfVar) {
        HashMap map = this.f;
        Object linkedHashMap = map.get(dnfVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(dnfVar, linkedHashMap);
        }
        return (Map) linkedHashMap;
    }

    public final void e(du1 du1Var, dnf dnfVar) {
        yt1 yt1Var = du1Var.a;
        if (yt1Var == null) {
            return;
        }
        HashMap map = this.f;
        Object linkedHashMap = map.get(dnfVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(dnfVar, linkedHashMap);
        }
        ((Map) linkedHashMap).put(yt1Var, du1Var);
        this.g.put(yt1Var, dnfVar);
        this.d.log("CallParticipants", "Participant added { participantId=\"" + yt1Var + "\", roomId=\"" + dnfVar + "\" }");
        long j = yt1Var.a;
        LongSparseArray longSparseArray = this.h;
        Set linkedHashSet = (Set) longSparseArray.get(j);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            longSparseArray.put(j, linkedHashSet);
        }
        linkedHashSet.add(yt1Var);
    }

    public final void f(dnf dnfVar, List list) {
        boolean zD = cqk.d(dnfVar, this.k);
        xq1 xq1Var = this.b;
        if (zD) {
            List list2 = list;
            xq1Var.a.onActiveParticipantsChanged(new u91(list2, d(this.k).values(), this.a));
        }
        xq1Var.c.onCallParticipantsChanged(new tu1(dnfVar, list));
    }

    public final du1 g(smc smcVar, bnf bnfVar) {
        return (du1) ww3.r1(h(bnfVar, Collections.singletonList(smcVar)));
    }

    public final ArrayList h(dnf dnfVar, List list) {
        du1 du1Var;
        List list2;
        xq1 xq1Var = this.b;
        bnc bncVar = xq1Var.c;
        k9 k9Var = xq1Var.a;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            smc smcVar = (smc) it.next();
            dnf dnfVarC = dnfVar == null ? c(smcVar.a) : dnfVar;
            ch chVarA = a(smcVar, dnfVarC);
            dnf dnfVar2 = (dnf) chVarA.d;
            du1 du1Var2 = (du1) chVarA.c;
            arrayList.add(du1Var2);
            if (chVarA.b) {
                Object arrayList2 = linkedHashMap.get(dnfVarC);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(dnfVarC, arrayList2);
                }
                ((List) arrayList2).add(du1Var2);
            } else {
                Object arrayList3 = linkedHashMap2.get(dnfVarC);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap2.put(dnfVarC, arrayList3);
                }
                ((List) arrayList3).add(du1Var2);
            }
            if (dnfVar2 != null && !dnfVar2.equals(dnfVarC)) {
                Object arrayList4 = linkedHashMap3.get(dnfVar2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap3.put(dnfVar2, arrayList4);
                }
                ((List) arrayList4).add(du1Var2);
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            du1Var = this.a;
            list2 = r66.a;
            if (!zHasNext) {
                break;
            }
            dnf dnfVar3 = (dnf) it2.next();
            List list3 = (List) linkedHashMap3.get(dnfVar3);
            if (list3 != null) {
                list2 = list3;
            }
            if (cqk.d(dnfVar3, this.k)) {
                k9Var.onActiveParticipantsRemoved(new w91(list2, d(this.k).values(), du1Var));
            }
            bncVar.onCallParticipantsRemoved(new vu1(dnfVar3, list2));
        }
        for (dnf dnfVar4 : linkedHashMap.keySet()) {
            List list4 = (List) linkedHashMap.get(dnfVar4);
            if (list4 == null) {
                list4 = list2;
            }
            if (cqk.d(dnfVar4, this.k)) {
                k9Var.onActiveParticipantsAdded(new t91(list4, d(this.k).values(), du1Var));
            }
            bncVar.onCallParticipantsAdded(new su1(dnfVar4, list4));
        }
        for (dnf dnfVar5 : linkedHashMap2.keySet()) {
            List list5 = (List) linkedHashMap2.get(dnfVar5);
            if (list5 == null) {
                list5 = list2;
            }
            f(dnfVar5, list5);
        }
        return arrayList;
    }

    public final void i() {
        ArrayList arrayList = new ArrayList(d(this.k).values());
        this.e.b = c76.a;
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.a.onActiveParticipantsRemoved(new w91(arrayList, r66.a, this.a));
        this.c.f();
    }

    public final Collection j() {
        return d(this.k).values();
    }

    public final du1 k() {
        return this.a;
    }

    public final du1 l(yt1 yt1Var) {
        yt1Var.getClass();
        du1 du1Var = this.a;
        yt1 yt1Var2 = du1Var.a;
        if (yt1Var2 != null && yt1Var2.equals(yt1Var)) {
            return du1Var;
        }
        dnf dnfVar = (dnf) this.g.get(yt1Var);
        if (dnfVar != null) {
            return (du1) d(dnfVar).get(yt1Var);
        }
        return null;
    }

    public final boolean m(du1 du1Var) {
        if (du1Var == null) {
            return false;
        }
        yt1 yt1Var = du1Var.a;
        return (yt1Var != null ? l(yt1Var) : null) != null;
    }

    public final void n(yt1 yt1Var, bpc bpcVar, String str, String str2) {
        du1 du1VarL = l(yt1Var);
        if (du1VarL != null) {
            HashMap map = du1VarL.f;
            if (bpcVar != null) {
                boolean zIsEmpty = map.isEmpty();
                map.put(bpcVar, new ylc(str, str2));
                if (Objects.equals(du1VarL.k, bpcVar)) {
                    du1VarL.m = str;
                    du1VarL.l = str2;
                }
                if (zIsEmpty && du1VarL.k == null) {
                    dnf dnfVar = (dnf) this.g.get(yt1Var);
                    if (dnfVar == null) {
                        dnfVar = this.k;
                    }
                    f(dnfVar, Collections.singletonList(du1VarL));
                }
            }
        }
    }

    public final ArrayList o(dnf dnfVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yt1 yt1Var = (yt1) it.next();
            dnf dnfVarC = dnfVar == null ? c(yt1Var) : dnfVar;
            du1 du1VarB = b(yt1Var, dnfVarC);
            if (du1VarB != null) {
                Object arrayList = linkedHashMap.get(dnfVarC);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(dnfVarC, arrayList);
                }
                ((List) arrayList).add(du1VarB);
            }
        }
        for (dnf dnfVar2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(dnfVar2);
            if (list2 == null) {
                list2 = r66.a;
            }
            boolean zD = cqk.d(dnfVar2, this.k);
            xq1 xq1Var = this.b;
            if (zD) {
                xq1Var.a.onActiveParticipantsRemoved(new w91(list2, d(this.k).values(), this.a));
            }
            xq1Var.c.onCallParticipantsRemoved(new vu1(dnfVar2, list2));
        }
        return yw3.X0(linkedHashMap.values());
    }

    public final void p(dnf dnfVar) {
        dnf dnfVar2 = this.k;
        this.k = dnfVar;
        if (cqk.d(dnfVar2, dnfVar)) {
            return;
        }
        this.b.a.onActiveParticipantUpdated(new x91(d(dnfVar2).values(), dnfVar2, d(dnfVar).values(), dnfVar, dnfVar instanceof cnf ? this.c.r((cnf) dnfVar) : null, this.a));
    }

    public final void q(HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (du1 du1Var : map.keySet()) {
            Object obj = map.get(du1Var);
            obj.getClass();
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (m(du1Var) && du1Var.h != zBooleanValue) {
                du1Var.h = zBooleanValue;
                arrayList.add(du1Var);
            }
        }
        f(this.k, arrayList);
    }

    public final void r(yt1 yt1Var) {
        if (yt1Var == this.i) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        yt1 yt1Var2 = this.i;
        du1 du1VarL = yt1Var2 != null ? l(yt1Var2) : null;
        if (du1VarL != null) {
            boolean zD = du1VarL.d();
            du1VarL.p = false;
            if (zD != du1VarL.d()) {
                arrayList.add(du1VarL);
            }
        }
        du1 du1VarL2 = yt1Var != null ? l(yt1Var) : null;
        if (du1VarL2 != null) {
            boolean zD2 = du1VarL2.d();
            du1VarL2.p = true;
            if (zD2 != du1VarL2.d()) {
                arrayList.add(du1VarL2);
            }
        }
        f(this.k, arrayList);
        this.i = yt1Var;
    }

    public final void s(dnf dnfVar) {
        dnfVar.getClass();
        dnf dnfVar2 = this.j;
        this.j = dnfVar;
        if (cqk.d(dnfVar2, dnfVar)) {
            return;
        }
        this.b.f.onCurrentParticipantInvitedToRoom(new e12(this.a, dnfVar, dnfVar instanceof cnf ? this.c.r((cnf) dnfVar) : null));
    }

    public final void t(List list) {
        list.getClass();
        Map mapD = d(this.k);
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            du1 du1Var = (du1) mapD.get((yt1) it.next());
            if (du1Var != null) {
                boolean zE = du1Var.e();
                du1Var.o = true;
                if (zE != du1Var.e()) {
                    arrayList.add(du1Var);
                }
            }
        }
        rj5 rj5Var = this.e;
        for (Object obj : (Set) rj5Var.b) {
            du1 du1Var2 = (du1) mapD.get(obj);
            if (du1Var2 != null && !hashSet.contains(obj)) {
                boolean zE2 = du1Var2.e();
                du1Var2.o = false;
                if (zE2 != du1Var2.e()) {
                    arrayList.add(du1Var2);
                }
            }
        }
        rj5Var.b = hashSet;
        f(this.k, arrayList);
    }

    public final int u() {
        dnf dnfVar = this.k;
        dnfVar.getClass();
        Map map = (Map) this.f.get(dnfVar);
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}
