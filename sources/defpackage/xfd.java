package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xfd implements f22 {
    public final /* synthetic */ yfd a;
    public final /* synthetic */ ConcurrentHashMap.KeySetView b;

    public xfd(yfd yfdVar, ConcurrentHashMap.KeySetView keySetView) {
        this.a = yfdVar;
        this.b = keySetView;
    }

    @Override // defpackage.f22
    public final void l() {
        dz4 dz4Var = (dz4) ((x02) this.a.w.i.a.getValue()).z().getValue();
        if (dz4Var.h) {
            phl phlVar = dz4Var.a;
            m32 m32Var = phlVar instanceof m32 ? (m32) phlVar : null;
            Long lValueOf = m32Var != null ? Long.valueOf(m32Var.c()) : null;
            if (lValueOf == null) {
                return;
            }
            yfd yfdVar = this.a;
            a2f a2fVarH = yfdVar.H(lValueOf.longValue(), "call-" + yfdVar.o.a() + "-" + lValueOf);
            if (a2fVarH != null) {
                this.b.add(a2fVarH);
            }
            String str = this.a.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "applyCallsFix: onCallInit", null);
                }
            }
            yfd yfdVar2 = this.a;
            yfdVar2.F.compute(lValueOf, new mw1(9, new s81(14, yfdVar2)));
            if (this.a.K.add(lValueOf)) {
                return;
            }
            String str2 = this.a.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, iic.m(lValueOf, "applyCallFix: callerId #", " already in callerIds"), null);
            }
        }
    }

    @Override // defpackage.f22
    public final void m(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a2f) it.next()).a();
        }
        this.b.clear();
        if (this.a.K.isEmpty()) {
            return;
        }
        pw pwVar = new pw(this.a.K);
        this.a.K.clear();
        yfd yfdVar = this.a;
        yab.i0(yfdVar.n, null, 0, new l0d(yfdVar, pwVar, null, 4), 3);
        String str2 = this.a.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, "applyCallsFix: onCallDestroyed", null);
        }
    }
}
