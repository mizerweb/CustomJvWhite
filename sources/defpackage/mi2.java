package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mi2 implements nc2 {
    public final ka a;
    public final ka b;
    public final fmi c;
    public final ff2 d;
    public final je2 g;
    public b9j h;
    public final pd2 l;
    public cli p;
    public q4h q;
    public final uvc r;
    public final uvc s;
    public final h6f u;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public List i = Collections.EMPTY_LIST;
    public int j = 0;
    public Range k = yi0.h;
    public final Object m = new Object();
    public boolean n = true;
    public t94 o = null;
    public final wze t = new wze();

    public mi2(pf2 pf2Var, pf2 pf2Var2, ja jaVar, ja jaVar2, uvc uvcVar, uvc uvcVar2, je2 je2Var, h6f h6fVar, fmi fmiVar) {
        pd2 pd2Var = jaVar.c;
        this.l = pd2Var;
        this.a = new ka(pf2Var, jaVar);
        if (pf2Var2 == null || jaVar2 == null) {
            this.b = null;
        } else {
            this.b = new ka(pf2Var2, jaVar2);
        }
        this.r = uvcVar;
        this.s = uvcVar2;
        this.g = je2Var;
        this.c = fmiVar;
        this.d = ejl.a(jaVar.a.g(), jaVar2 != null ? jaVar2.a.g() : null, ((sd2) pd2Var).a);
        this.u = h6fVar;
    }

    public static void B(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            cli cliVar = (cli) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                cliVar.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            cliVar.h = hashSet;
        }
    }

    public static ArrayList C(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            cliVar.getClass();
            cliVar.p = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                xxi xxiVar = (xxi) it2.next();
                if (cliVar.p(xxiVar.a)) {
                    qyj.l(cliVar + " already has effect" + cliVar.p, cliVar.p == null);
                    qyj.i(cliVar.p(xxiVar.a));
                    cliVar.p = xxiVar;
                    arrayList2.remove(xxiVar);
                }
            }
        }
        return arrayList2;
    }

    public static HashMap l(LinkedHashSet linkedHashSet, rj5 rj5Var) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            map.put(cliVar, cliVar.h);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = rj5Var != null ? (LinkedHashSet) rj5Var.b : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            cliVar.h = hashSet;
        }
        return map;
    }

    public static Matrix t(Rect rect, Size size) {
        qyj.h("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap w(ArrayList arrayList, fmi fmiVar, fmi fmiVar2, int i, Range range) {
        cmi cmiVarH;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            if (cliVar instanceof q4h) {
                q4h q4hVar = (q4h) cliVar;
                cmi cmiVarH2 = new r48(2).b().h(false, fmiVar);
                if (cmiVarH2 == null) {
                    cmiVarH = null;
                } else {
                    w8b w8bVarH = w8b.h(cmiVarH2);
                    w8bVarH.o(wih.T0);
                    cmiVarH = ((si2) q4hVar.n(w8bVarH)).q();
                }
            } else {
                cmiVarH = cliVar.h(false, fmiVar);
            }
            cmi cmiVarH3 = cliVar.h(true, fmiVar2);
            w8b w8bVarH2 = cmiVarH3 != null ? w8b.h(cmiVarH3) : w8b.e();
            w8bVarH2.m(cmi.a1, Integer.valueOf(i));
            if (!yi0.h.equals(range)) {
                w8bVarH2.l(cmi.b1, s94.b, range);
                w8bVarH2.m(cmi.c1, Boolean.TRUE);
            }
            cmi cmiVarQ = cliVar.n(w8bVarH2).q();
            ii2 ii2Var = new ii2();
            ii2Var.a = cmiVarH;
            ii2Var.b = cmiVarQ;
            map.put(cliVar, ii2Var);
        }
        return map;
    }

    public final void A(ArrayList arrayList) {
        synchronized (this.m) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cli) it.next()).h = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
            linkedHashSet.removeAll(arrayList);
            i(s(linkedHashSet, this.b != null));
        }
    }

    @Override // defpackage.nc2
    public final nf2 a() {
        return this.a.b;
    }

    public final void c(Collection collection, rj5 rj5Var) {
        tvj.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + rj5Var);
        synchronized (this.m) {
            try {
                ka kaVar = this.a;
                pd2 pd2Var = this.l;
                kaVar.f(pd2Var);
                ka kaVar2 = this.b;
                if (kaVar2 != null) {
                    kaVar2.f(pd2Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
                linkedHashSet.addAll(collection);
                HashMap mapL = l(linkedHashSet, rj5Var);
                try {
                    i(s(linkedHashSet, this.b != null));
                } catch (IllegalArgumentException e) {
                    B(mapL);
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(o81 o81Var) {
        Map map = o81Var.i.a;
        ArrayList<cli> arrayList = o81Var.b;
        synchronized (this.m) {
            try {
                if (this.h != null && !arrayList.isEmpty()) {
                    boolean z = this.a.b.a.j() == 0;
                    Rect rectH = this.a.b.a.h();
                    b9j b9jVar = this.h;
                    Rational rational = b9jVar.b;
                    int iD = this.a.b.a.D(b9jVar.c);
                    b9j b9jVar2 = this.h;
                    HashMap mapA = m4m.a(rectH, z, rational, iD, b9jVar2.a, b9jVar2.d, map);
                    for (cli cliVar : arrayList) {
                        Rect rect = (Rect) mapA.get(cliVar);
                        rect.getClass();
                        cliVar.F(rect);
                    }
                }
                for (cli cliVar2 : arrayList) {
                    Rect rectH2 = this.a.b.a.h();
                    yi0 yi0Var = (yi0) map.get(cliVar2);
                    yi0Var.getClass();
                    cliVar2.D(t(rectH2, yi0Var.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.i;
        ArrayList arrayList2 = o81Var.b;
        LinkedHashSet linkedHashSet = o81Var.a;
        ArrayList arrayListC = C(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListC2 = C(arrayList3, arrayListC);
        if (!arrayListC2.isEmpty()) {
            tvj.g("CameraUseCaseAdapter", "Unused effects: " + arrayListC2);
        }
        Iterator it = o81Var.e.iterator();
        while (it.hasNext()) {
            ((cli) it.next()).G(this.a);
        }
        this.a.n(o81Var.e);
        if (this.b != null) {
            for (cli cliVar3 : o81Var.e) {
                ka kaVar = this.b;
                Objects.requireNonNull(kaVar);
                cliVar3.G(kaVar);
            }
            ka kaVar2 = this.b;
            Objects.requireNonNull(kaVar2);
            kaVar2.n(o81Var.e);
        }
        if (o81Var.e.isEmpty()) {
            for (cli cliVar4 : o81Var.d) {
                Map map2 = o81Var.i.a;
                if (map2.containsKey(cliVar4)) {
                    yi0 yi0Var2 = (yi0) map2.get(cliVar4);
                    Objects.requireNonNull(yi0Var2);
                    t94 t94Var = yi0Var2.f;
                    if (t94Var != null) {
                        lmf lmfVar = cliVar4.s;
                        dhc dhcVar = lmfVar.g.b;
                        Objects.requireNonNull(t94Var);
                        if (t94Var.c().size() == lmfVar.g.b.c().size()) {
                            Iterator it2 = t94Var.c().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    bh0 bh0Var = (bh0) it2.next();
                                    if (!dhcVar.a.containsKey(bh0Var) || !Objects.equals(dhcVar.i(bh0Var), t94Var.i(bh0Var))) {
                                    }
                                }
                            }
                        }
                        cliVar4.j = cliVar4.A(t94Var);
                        if (this.n) {
                            this.a.l(cliVar4);
                            ka kaVar3 = this.b;
                            if (kaVar3 != null) {
                                kaVar3.l(cliVar4);
                            }
                        }
                    }
                }
            }
        }
        for (cli cliVar5 : o81Var.c) {
            ii2 ii2Var = (ii2) o81Var.h.get(cliVar5);
            Objects.requireNonNull(ii2Var);
            ka kaVar4 = this.b;
            ka kaVar5 = this.a;
            cmi cmiVar = ii2Var.a;
            if (kaVar4 != null) {
                cliVar5.b(kaVar5, kaVar4, cmiVar, ii2Var.b);
                yi0 yi0Var3 = (yi0) o81Var.i.a.get(cliVar5);
                yi0Var3.getClass();
                s4h s4hVar = o81Var.j;
                s4hVar.getClass();
                cliVar5.I(yi0Var3, (yi0) s4hVar.a.get(cliVar5));
            } else {
                cliVar5.b(kaVar5, null, cmiVar, ii2Var.b);
                yi0 yi0Var4 = (yi0) o81Var.i.a.get(cliVar5);
                yi0Var4.getClass();
                cliVar5.I(yi0Var4, null);
            }
        }
        if (this.n) {
            this.a.h(o81Var.c);
            ka kaVar6 = this.b;
            if (kaVar6 != null) {
                kaVar6.h(o81Var.c);
            }
        }
        Iterator it3 = o81Var.c.iterator();
        while (it3.hasNext()) {
            ((cli) it3.next()).t();
        }
        this.e.clear();
        this.e.addAll(o81Var.a);
        this.f.clear();
        this.f.addAll(o81Var.b);
        this.p = o81Var.g;
        this.q = o81Var.f;
    }

    public final void r() {
        synchronized (this.m) {
            try {
                if (!this.n) {
                    if (!this.f.isEmpty()) {
                        this.a.f(this.l);
                        ka kaVar = this.b;
                        if (kaVar != null) {
                            kaVar.f(this.l);
                        }
                    }
                    this.a.h(this.f);
                    ka kaVar2 = this.b;
                    if (kaVar2 != null) {
                        kaVar2.h(this.f);
                    }
                    synchronized (this.m) {
                        try {
                            t94 t94Var = this.o;
                            if (t94Var != null) {
                                this.a.c.e(t94Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((cli) it.next()).t();
                    }
                    this.n = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x02b8  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015a, code lost:
    
        if (r3 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        return s(r21, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.o81 s(java.util.LinkedHashSet r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi2.s(java.util.LinkedHashSet, boolean):o81");
    }

    public final void u() {
        synchronized (this.m) {
            try {
                if (this.n) {
                    this.a.n(new ArrayList(this.f));
                    ka kaVar = this.b;
                    if (kaVar != null) {
                        kaVar.n(new ArrayList(this.f));
                    }
                    synchronized (this.m) {
                        ia iaVar = this.a.c;
                        this.o = iaVar.b.k();
                        iaVar.n();
                    }
                    this.n = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int v() {
        int i;
        synchronized (this.m) {
            try {
                je2 je2Var = this.g;
                synchronized (je2Var.b) {
                    i = je2Var.e;
                }
                return i == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet x(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.m) {
            try {
                Iterator it = this.i.iterator();
                xxi xxiVar = null;
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    xxi xxiVar2 = (xxi) it.next();
                    int i2 = 0;
                    for (int i3 = xxiVar2.a; i3 != 0; i3 >>= 1) {
                        i2 += i3 & 1;
                    }
                    if (i2 > 1) {
                        qyj.l("Can only have one sharing effect.", xxiVar == null);
                        xxiVar = xxiVar2;
                    }
                }
                if (xxiVar != null) {
                    i = xxiVar.a;
                }
                if (z) {
                    i = 3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            cli cliVar = (cli) it2.next();
            qyj.h("Only support one level of sharing for now.", !(cliVar instanceof q4h));
            if (cliVar.p(i)) {
                hashSet.add(cliVar);
            }
        }
        return hashSet;
    }

    public final List y() {
        ArrayList arrayList;
        synchronized (this.m) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public final void z() {
        synchronized (this.m) {
            this.l.s();
        }
    }
}
