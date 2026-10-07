package defpackage;

import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class my2 implements LongFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ my2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        qfd qfdVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((bi4) ((ny2) obj).b.getValue()).f(j, true);
            default:
                yfd yfdVar = (yfd) obj;
                je9 je9Var = je9.e;
                f9b f9bVar = (f9b) yfdVar.F.get(Long.valueOf(j));
                agd agdVar = (f9bVar == null || (qfdVar = (qfd) f9bVar.getValue()) == null) ? null : qfdVar.b;
                if (agdVar == null) {
                    String str = yfdVar.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar == null || !a4cVar.b(je9Var)) {
                        return null;
                    }
                    a4cVar.c(je9Var, str, zo5.j(j, "handleNotifMessage: no presence for #"), null);
                    return null;
                }
                if (!yfdVar.b.contains(Long.valueOf(j))) {
                    return agdVar;
                }
                String str2 = yfdVar.g;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null || !a4cVar2.b(je9Var)) {
                    return null;
                }
                a4cVar2.c(je9Var, str2, nbh.s(j, "handleNotifMessage: status cannot be returned because #", " is processing now"), null);
                return null;
        }
    }
}
