package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y3b extends aq implements qih {
    public final long f;
    public final long g;
    public final List h;

    public y3b(long j, long j2, long j3, List list) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = list;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        z3b z3bVar = (z3b) kihVar;
        qfa qfaVarR = r();
        Map map = z3bVar.c;
        ose oseVar = (ose) qfaVarR.b.c();
        oseVar.e().a(new xre(map, 0, oseVar));
        Iterator it = z3bVar.c.keySet().iterator();
        while (it.hasNext()) {
            sfa sfaVarF = r().f(this.f, ((Long) it.next()).longValue());
            if (sfaVarF != null) {
                o().c(new kfi(this.f, sfaVarF.a, false));
            }
        }
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        return new h3b(this.g, this.h);
    }
}
