package defpackage;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class faj implements bli {
    public final HashSet a;
    public final fmi e;
    public final pf2 f;
    public final pf2 g;
    public final HashSet i;
    public final HashMap j;
    public final fne k;
    public final fne l;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final ad2 h = new ad2(this);

    public faj(pf2 pf2Var, pf2 pf2Var2, HashSet hashSet, fmi fmiVar, vuf vufVar) {
        this.f = pf2Var;
        this.g = pf2Var2;
        this.e = fmiVar;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            map.put(cliVar, cliVar.r(pf2Var.j(), null, cliVar.h(true, fmiVar)));
        }
        this.j = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.i = hashSet2;
        this.k = new fne(pf2Var, hashSet2);
        if (this.g != null) {
            this.l = new fne(this.g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            cli cliVar2 = (cli) it2.next();
            this.d.put(cliVar2, Boolean.FALSE);
            this.c.put(cliVar2, new eaj(pf2Var, this, vufVar));
        }
    }

    public static void t(zbh zbhVar, wf5 wf5Var, lmf lmfVar) {
        zbhVar.e();
        try {
            wxl.a();
            zbhVar.b();
            ybh ybhVar = zbhVar.l;
            Objects.requireNonNull(ybhVar);
            ybhVar.g(wf5Var, new vbh(ybhVar, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            jmf jmfVar = lmfVar.f;
            if (jmfVar != null) {
                jmfVar.a(lmfVar);
            }
        }
    }

    public static wf5 u(cli cliVar) {
        List listB = cliVar instanceof z58 ? cliVar.s.b() : Collections.unmodifiableList(cliVar.s.g.a);
        qyj.l(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (wf5) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.bli
    public final void c(cli cliVar) {
        wf5 wf5VarU;
        wxl.a();
        zbh zbhVarW = w(cliVar);
        if (x(cliVar) && (wf5VarU = u(cliVar)) != null) {
            t(zbhVarW, wf5VarU, cliVar.s);
        }
    }

    @Override // defpackage.bli
    public final void i(cli cliVar) {
        wxl.a();
        if (x(cliVar)) {
            return;
        }
        this.d.put(cliVar, Boolean.TRUE);
        wf5 wf5VarU = u(cliVar);
        if (wf5VarU != null) {
            t(w(cliVar), wf5VarU, cliVar.s);
        }
    }

    @Override // defpackage.bli
    public final void l(cli cliVar) {
        wxl.a();
        if (x(cliVar)) {
            zbh zbhVarW = w(cliVar);
            wf5 wf5VarU = u(cliVar);
            if (wf5VarU != null) {
                t(zbhVarW, wf5VarU, cliVar.s);
                return;
            }
            wxl.a();
            zbhVarW.b();
            zbhVarW.l.a();
        }
    }

    @Override // defpackage.bli
    public final void r(cli cliVar) {
        wxl.a();
        if (x(cliVar)) {
            this.d.put(cliVar, Boolean.FALSE);
            zbh zbhVarW = w(cliVar);
            wxl.a();
            zbhVarW.b();
            zbhVarW.l.a();
        }
    }

    public final ei0 s(cli cliVar, fne fneVar, pf2 pf2Var, zbh zbhVar, int i, boolean z, boolean z2) {
        int i2;
        int iD = pf2Var.a().D(i);
        boolean zE = y1i.e(zbhVar.b);
        cmi cmiVar = (cmi) this.j.get(cliVar);
        Objects.requireNonNull(cmiVar);
        ged gedVarB = fneVar.b(cmiVar, zbhVar.d, y1i.b(zbhVar.b), z);
        Rect rect = gedVarB.a;
        Size size = gedVarB.b;
        int iK = y1i.k((zbhVar.i + pf2Var.a().D(((v68) cliVar.i).y(0))) - iD);
        boolean zQ = z2 ? false : cliVar.q(pf2Var) ^ zE;
        if (cliVar instanceof igd) {
            i2 = 1;
        } else {
            i2 = cliVar instanceof z58 ? 4 : 2;
        }
        return new ei0(UUID.randomUUID(), i2, cliVar instanceof z58 ? np0.n : 34, rect, y1i.h(iK, size), iK, zQ, false);
    }

    public final HashMap v(zbh zbhVar, boolean z) {
        HashMap map = new HashMap();
        for (cli cliVar : this.a) {
            cmi cmiVar = (cmi) this.j.get(cliVar);
            Objects.requireNonNull(cmiVar);
            Size size = this.k.b(cmiVar, zbhVar.d, y1i.b(zbhVar.b), z).c;
            map.put(cliVar, size);
            tvj.a("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + cliVar);
        }
        return map;
    }

    public final zbh w(cli cliVar) {
        zbh zbhVar = (zbh) this.b.get(cliVar);
        Objects.requireNonNull(zbhVar);
        return zbhVar;
    }

    public final boolean x(cli cliVar) {
        Boolean bool = (Boolean) this.d.get(cliVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap map, HashMap map2) {
        HashMap map3 = this.b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            cli cliVar = (cli) entry.getKey();
            zbh zbhVar = (zbh) entry.getValue();
            cliVar.F(zbhVar.d);
            cliVar.D(zbhVar.b);
            tw5 tw5VarB = zbhVar.g.b();
            Size size = (Size) map2.get(cliVar);
            if (size != null) {
                tw5VarB.b = size;
            }
            cliVar.I(tw5VarB.j(), null);
            cliVar.t();
        }
    }
}
