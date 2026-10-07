package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wfd implements qf7 {
    public final /* synthetic */ yfd a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ wfd(yfd yfdVar, boolean z) {
        this.a = yfdVar;
        this.b = z;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        yfd yfdVar = this.a;
        boolean z2 = this.b;
        Long l = (Long) obj;
        f9b f9bVar = (f9b) obj2;
        if (f9bVar == null || f9bVar.getValue() == null) {
            vfd vfdVarC = yfdVar.C();
            vfdVarC.t.incrementAndGet();
            vfdVarC.a();
            return null;
        }
        qfd qfdVar = (qfd) f9bVar.getValue();
        if (qfdVar != null) {
            if (z2 && qfdVar.b == agd.OFFLINE && ((ConcurrentHashMap.KeySetView) yfdVar.E.getValue()).contains(l)) {
                vfd vfdVarC2 = yfdVar.C();
                vfdVarC2.u.incrementAndGet();
                vfdVarC2.a();
                z = true;
            } else {
                z = false;
            }
            if (!yfdVar.I.get() && yfdVar.x(l.longValue(), qfdVar)) {
                String str = yfdVar.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "getContactPresence: moveToOffline #" + l + " stale=" + ((ConcurrentHashMap.KeySetView) yfdVar.E.getValue()).contains(l), null);
                    }
                }
                f9bVar.setValue(qfdVar.c());
                if (z2 && !z) {
                    vfd vfdVarC3 = yfdVar.C();
                    vfdVarC3.u.incrementAndGet();
                    vfdVarC3.a();
                    ((ConcurrentHashMap.KeySetView) yfdVar.E.getValue()).add(l);
                    return f9bVar;
                }
            } else if (z2 && !z) {
                vfd vfdVarC4 = yfdVar.C();
                vfdVarC4.v.incrementAndGet();
                vfdVarC4.a();
            }
        }
        return f9bVar;
    }
}
