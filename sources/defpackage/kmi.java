package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class kmi {
    public final lg2 a;
    public final je2 b;
    public final fik c;
    public final a2k d;
    public final kj9 e;
    public final lh2 f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final ui2 j;
    public final we2 k;
    public boolean o;
    public final mxa s;
    public final pbh t;
    public final ch u;
    public final ptf v;
    public volatile v05 w;
    public final ArrayList x;
    public final Set y;
    public final Object l = new Object();
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public boolean p = true;
    public boolean q = true;
    public final LinkedHashSet r = new LinkedHashSet();

    public kmi(lg2 lg2Var, je2 je2Var, fik fikVar, a2k a2kVar, kj9 kj9Var, Set set, eb2 eb2Var, lh2 lh2Var, rg5 rg5Var, Provider provider, Provider provider2, p86 p86Var, kg2 kg2Var, ui2 ui2Var, we2 we2Var, Context context, fo5 fo5Var) {
        this.a = lg2Var;
        this.b = je2Var;
        this.c = fikVar;
        this.d = a2kVar;
        this.e = kj9Var;
        this.f = lh2Var;
        this.g = rg5Var;
        this.h = provider;
        this.i = provider2;
        this.j = ui2Var;
        this.k = we2Var;
        this.s = new mxa(kg2Var, new lxa(), fo5Var);
        bg2 bg2Var = kg2Var.b;
        this.t = new pbh(context, bg2Var, p86Var, io6.p0);
        this.u = new ch(bg2Var);
        this.v = new ptf(29, this);
        this.x = new ArrayList();
        Set setW1 = ww3.W1(set);
        setW1.add(eb2Var);
        this.y = setW1;
    }

    public final void a(cli cliVar) {
        synchronized (this.l) {
            if (this.n.add(cliVar)) {
                l();
            }
        }
    }

    public final boolean b(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.j.a.b(ui2.l, Boolean.TRUE)).booleanValue() && !this.m.contains(this.s) && j(linkedHashSet)) {
            c();
            return true;
        }
        if (!linkedHashSet.contains(this.s) || j(linkedHashSet)) {
            return false;
        }
        mxa mxaVar = this.s;
        synchronized (this.l) {
            if (this.n.remove(mxaVar)) {
                l();
            }
        }
        g(Collections.singletonList(mxaVar));
        mxaVar.G((pf2) this.g.get());
        return true;
    }

    public final void c() {
        pf2 pf2Var = (pf2) this.g.get();
        mxa mxaVar = this.s;
        mxaVar.b(pf2Var, null, null, null);
        mxaVar.I(yi0.a(nxa.a).j(), null);
        d(Collections.singletonList(mxaVar));
        a(mxaVar);
    }

    public final void d(List list) {
        synchronized (this.l) {
            if (list.isEmpty()) {
                if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.m.contains((cli) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cli) it.next()).y();
            }
            if (this.m.addAll(list) && !b(ww3.w1(this.m, this.n))) {
                n();
                this.e.a(ww3.T1(this.m));
                k(this.m);
            }
            if (this.p) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((cli) it2.next()).v();
                }
            } else {
                this.r.addAll(arrayList);
            }
        }
    }

    public final Object e(mdh mdhVar) {
        List listT1;
        synchronized (this.l) {
            f();
            this.s.C();
            listT1 = ww3.T1(this.x);
        }
        Object objU = ch3.u(listT1, mdhVar);
        return objU == hu4.a ? objU : sbi.a;
    }

    public final void f() {
        vo8 vo8VarA;
        hli hliVarH = h();
        this.w = null;
        je2 je2Var = this.b;
        nf2 nf2Var = (nf2) this.i.get();
        synchronized (je2Var.b) {
            try {
                if (je2Var.f) {
                    ArrayList arrayList = je2Var.d;
                    bg2 bg2Var = (bg2) hjl.b(nf2Var, zfe.a(bg2.class));
                    String str = bg2Var != null ? ((qb2) bg2Var).a : null;
                    ef2 ef2Var = str != null ? new ef2(str) : null;
                    if (ef2Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(ef2Var.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hliVarH != null) {
            if (hliVarH.h.a()) {
                hliVarH.c.close();
                vo8VarA = yab.i0(hliVarH.b.f, null, 0, new fpf(null, hliVarH), 3);
            } else {
                vo8VarA = qyj.a(sbi.a);
            }
            this.x.add(vo8VarA);
            vo8VarA.Y(new bad(this, 26, vo8VarA));
        }
        synchronized (this.l) {
        }
    }

    public final void g(List list) {
        synchronized (this.l) {
            if (list.isEmpty()) {
                if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.n.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cli cliVar = (cli) it.next();
                if (this.m.contains(cliVar)) {
                    cliVar.z();
                }
            }
            if (this.m.removeAll(list)) {
                if (b(ww3.w1(this.m, this.n))) {
                    return;
                }
                if (this.m.isEmpty()) {
                    this.d.e(false);
                    this.e.a(r66.a);
                } else {
                    n();
                    this.e.a(ww3.T1(this.m));
                }
                k(this.m);
            }
            this.r.removeAll(list);
        }
    }

    public final hli h() {
        v05 v05Var = this.w;
        if (v05Var != null) {
            return (hli) ((vwd) v05Var.m).get();
        }
        return null;
    }

    public final int i() {
        int i;
        synchronized (this.l) {
            je2 je2Var = this.b;
            synchronized (je2Var.b) {
                i = je2Var.e;
            }
            return i == 2 ? 1 : 0;
        }
    }

    public final boolean j(LinkedHashSet linkedHashSet) {
        boolean z;
        pbh pbhVar;
        int i;
        boolean z2;
        boolean zA;
        cmi cmiVar;
        if (((Boolean) this.j.a.b(ui2.l, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                cli cliVar = (cli) it.next();
                mxa mxaVar = this.s;
                if (!cqk.d(cliVar, mxaVar) && !cliVar.s.b().isEmpty()) {
                    ArrayList<cli> arrayList = new ArrayList();
                    for (Object obj : this.m) {
                        if (!cqk.d((cli) obj, mxaVar)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                        kmf kmfVar = new kmf();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            kmfVar.a(((cli) it2.next()).s);
                        }
                        lmf lmfVarB = kmfVar.b();
                        List listUnmodifiableList = Collections.unmodifiableList(lmfVarB.g.a);
                        List listB = lmfVarB.b();
                        if (listB.isEmpty()) {
                            break;
                        }
                        List list = listB;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z = true;
                                    break;
                                }
                                if (!cqk.d(((wf5) it3.next()).j, MediaCodec.class)) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            z = true;
                            break;
                        }
                        boolean zIsEmpty = listUnmodifiableList.isEmpty();
                        if (!z && !zIsEmpty) {
                            break;
                        }
                        if (mxaVar.d() == null) {
                            mxaVar.I(yi0.a(nxa.a).j(), null);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            pbhVar = this.t;
                            if (!zHasNext) {
                                break;
                            }
                            cli cliVar2 = (cli) it4.next();
                            Size sizeD = cliVar2.d();
                            yi0 yi0Var = cliVar2.j;
                            if (sizeD == null || yi0Var == null) {
                                if (tvj.f(5, "CXCP")) {
                                    Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
                                }
                                arrayList2.clear();
                                break;
                            }
                            int i2 = i();
                            int inputFormat = cliVar2.i.getInputFormat();
                            t4h t4hVarK = cliVar2.i.K();
                            pbhVar.getClass();
                            t4h t4hVar = tbh.e;
                            tbh tbhVarQ = yr8.q(inputFormat, sizeD, pbhVar.l(inputFormat), i2, 2, t4hVarK);
                            int inputFormat2 = cliVar2.i.getInputFormat();
                            fx5 fx5Var = yi0Var.c;
                            List listSingletonList = cliVar2 instanceof q4h ? (List) ((r4h) ((q4h) cliVar2).i).i(r4h.b) : Collections.singletonList(cliVar2.i.L());
                            t94 t94VarE = yi0Var.f;
                            if (t94VarE == null) {
                                t94VarE = w8b.e();
                            }
                            t94 t94Var = t94VarE;
                            int i3 = yi0Var.d;
                            Range range = yi0Var.e;
                            Boolean bool = (Boolean) cliVar2.i.b(cmi.c1, Boolean.FALSE);
                            Objects.requireNonNull(bool);
                            arrayList2.add(new pg0(tbhVarQ, inputFormat2, sizeD, fx5Var, listSingletonList, t94Var, i3, range, bool.booleanValue(), cliVar2.i.N(sizeD)));
                        }
                        if (arrayList2.isEmpty()) {
                            zA = false;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (cli cliVar3 : arrayList) {
                                for (wf5 wf5Var : cliVar3.s.b()) {
                                    int i4 = i();
                                    int inputFormat3 = cliVar3.i.getInputFormat();
                                    Size size = wf5Var.h;
                                    t4h t4hVarK2 = cliVar3.i.K();
                                    pbhVar.getClass();
                                    t4h t4hVar2 = tbh.e;
                                    arrayList3.add(yr8.q(inputFormat3, size, pbhVar.l(inputFormat3), i4, 2, t4hVarK2));
                                }
                            }
                            int i5 = i();
                            Iterator it5 = this.u.m(arrayList2, Collections.singletonList(mxaVar.i), Collections.singletonList(0)).entrySet().iterator();
                            do {
                                if (!it5.hasNext()) {
                                    i = 8;
                                    break;
                                }
                                i = 10;
                            } while (((fx5) ((Map.Entry) it5.next()).getValue()).b != 10);
                            int i6 = i;
                            Iterator it6 = arrayList.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                cli cliVar4 = (cli) it6.next();
                                if (cliVar4 != null && c2m.c(cliVar4)) {
                                    z2 = true;
                                    break;
                                }
                            }
                            int iB = c2m.b(arrayList, new u8h(21));
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof z58) {
                                    arrayList4.add(obj2);
                                }
                            }
                            z58 z58Var = (z58) ww3.t1(arrayList4);
                            obh obhVar = new obh(i5, i6, z2, iB, (z58Var == null || (cmiVar = z58Var.i) == null || cmiVar.getInputFormat() != 4101) ? false : true, false, false, false, yi0.h, false);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList3);
                            int i7 = i();
                            int inputFormat4 = mxaVar.i.getInputFormat();
                            Size sizeD2 = mxaVar.d();
                            t4h t4hVarK3 = mxaVar.i.K();
                            pbhVar.getClass();
                            t4h t4hVar3 = tbh.e;
                            arrayList5.add(yr8.q(inputFormat4, sizeD2, pbhVar.l(inputFormat4), i7, 2, t4hVarK3));
                            r66 r66Var = r66.a;
                            zA = pbhVar.a(obhVar, arrayList5, s66.a, r66Var, r66Var);
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "Combination of " + arrayList3 + " + " + mxaVar + " is supported: " + zA);
                            }
                        }
                        if (zA) {
                            return true;
                        }
                    } else {
                        break;
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final void k(LinkedHashSet linkedHashSet) {
        f();
        List listT1 = ww3.T1(linkedHashSet);
        if (listT1.isEmpty()) {
            for (fli fliVar : this.y) {
                fliVar.b(null);
                fliVar.reset();
            }
            return;
        }
        if (!this.p) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                ((fli) it.next()).b(null);
            }
        }
        iq7 iq7Var = new iq7(this.f);
        synchronized (this.l) {
        }
        nmf nmfVar = new nmf(listT1, this.q);
        we2 we2Var = this.k;
        ptf ptfVar = this.v;
        synchronized (this.l) {
        }
        eli eliVar = new eli(ptfVar, iq7Var, nmfVar, new ifh(new i8f(nmfVar, we2Var, iq7Var, 10)));
        if (!this.p) {
            je2 je2Var = this.b;
            nf2 nf2Var = (nf2) this.i.get();
            synchronized (je2Var.b) {
                try {
                    if (je2Var.f) {
                        ArrayList arrayList = je2Var.d;
                        bg2 bg2Var = (bg2) hjl.b(nf2Var, zfe.a(bg2.class));
                        String str = bg2Var != null ? ((qb2) bg2Var).a : null;
                        ef2 ef2Var = str != null ? new ef2(str) : null;
                        if (ef2Var == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(ef2Var.a);
                        synchronized (je2Var.b) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        fik fikVar = this.c;
        this.w = new v05((r05) fikVar.b, (t05) fikVar.c, eliVar);
        hli hliVarH = h();
        if (hliVarH == null) {
            ore.k("Required value was null.");
            return;
        }
        yab.i0(hliVarH.b.f, null, 0, new hpf(null, hliVarH), 3);
        Iterator it2 = this.y.iterator();
        while (it2.hasNext()) {
            ((fli) it2.next()).b(hliVarH.c);
        }
        yab.i0(hliVarH.b.f, null, 0, new in((lq4) null, hliVarH, this.o), 3);
        m(ww3.w1(this.m, this.n));
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Notifying " + this.r + " camera control ready");
        }
        Iterator it3 = this.r.iterator();
        while (it3.hasNext()) {
            ((cli) it3.next()).v();
        }
        this.r.clear();
    }

    public final void l() {
        if (this.m.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetW1 = ww3.w1(this.m, this.n);
        if (((Boolean) this.j.a.b(ui2.l, Boolean.TRUE)).booleanValue() && !this.m.contains(this.s) && j(linkedHashSetW1)) {
            c();
            return;
        }
        if (!linkedHashSetW1.contains(this.s) || j(linkedHashSetW1)) {
            m(linkedHashSetW1);
            return;
        }
        mxa mxaVar = this.s;
        synchronized (this.l) {
            if (this.n.remove(mxaVar)) {
                l();
            }
        }
        g(Collections.singletonList(mxaVar));
        mxaVar.G((pf2) this.g.get());
    }

    public final void m(LinkedHashSet linkedHashSet) {
        hli hliVarH = h();
        if (hliVarH != null) {
            hliVarH.c.d(linkedHashSet, this.q);
            for (fli fliVar : this.y) {
                if (fliVar instanceof jmi) {
                    ((jmi) fliVar).a(linkedHashSet);
                }
            }
        }
    }

    public final void n() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.m;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((cli) it.next()).i.b(cmi.e1, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.e(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.k + '>';
    }
}
