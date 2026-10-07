package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o6b extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y6b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6b(y6b y6bVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = y6bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        y6b y6bVar = this.g;
        switch (i) {
            case 0:
                o6b o6bVar = new o6b(y6bVar, lq4Var, 0);
                o6bVar.f = obj;
                return o6bVar;
            default:
                o6b o6bVar2 = new o6b(y6bVar, lq4Var, 1);
                o6bVar2.f = obj;
                return o6bVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Map map = (Map) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((o6b) create(map, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((o6b) create(map, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                Map map = (Map) this.f;
                ch3.d0(obj);
                String str = this.g.e;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.h(map.size(), "activeAccountComponents count="), null);
                    }
                }
                break;
            default:
                Map map2 = (Map) this.f;
                ch3.d0(obj);
                String str2 = this.g.e;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, zo5.h(map2.size(), "loggedInAccountComponents count="), null);
                    }
                }
                break;
        }
        return sbi.a;
    }
}
