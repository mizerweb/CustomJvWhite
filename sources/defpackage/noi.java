package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class noi extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;
    public final /* synthetic */ gpi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noi(gpi gpiVar, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = gpiVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gpi gpiVar = this.g;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                noi noiVar = new noi(gpiVar, lq4Var, 0);
                noiVar.f = th;
                noiVar.invokeSuspend(sbiVar);
                break;
            default:
                noi noiVar2 = new noi(gpiVar, lq4Var, 1);
                noiVar2.f = th;
                noiVar2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.e) {
            case 0:
                Throwable th = this.f;
                ch3.d0(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                gm0.V(this.g.p, "fail", th);
                return sbi.a;
            default:
                Throwable th2 = this.f;
                ch3.d0(obj);
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                String str = this.g.p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.k("saveCurrentStoryToGallery observe failed: ", th2.getMessage()), null);
                    }
                }
                a8j.x(this.g.r1, new mqi(false));
                return sbi.a;
        }
    }
}
