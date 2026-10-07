package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j8d extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ k8d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8d(k8d k8dVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = k8dVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        k8d k8dVar = this.g;
        switch (i) {
            case 0:
                return new j8d(k8dVar, lq4Var, 0);
            default:
                return new j8d(k8dVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((j8d) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        a4c a4cVar;
        k8d k8dVar;
        String str;
        switch (this.e) {
            case 0:
                k8d k8dVar2 = this.g;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(500, lw5.MILLISECONDS);
                    this.f = 1;
                    if (rx8.u(jO, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                sgg sggVar = k8dVar2.i;
                if (sggVar != null && sggVar.isActive()) {
                    mjg mjgVar = k8dVar2.j;
                    Boolean bool = Boolean.TRUE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                }
                return sbi.a;
            default:
                je9 je9Var = je9.d;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        k8d k8dVar3 = this.g;
                        String str2 = k8dVar3.h;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "finish poll for chat(" + k8dVar3.c + ") and message(" + k8dVar3.d + ") started", null);
                        }
                        jv6 jv6Var = (jv6) this.g.g.getValue();
                        k8d k8dVar4 = this.g;
                        long j = k8dVar4.c;
                        long j2 = k8dVar4.d;
                        this.f = 1;
                        if (jv6Var.a(j, j2, this) == hu4Var2) {
                            return hu4Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    a8j.x(this.g.e.c, f8d.a);
                    k8dVar = this.g;
                    str = k8dVar.h;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str, c0a.m(k8dVar.d, ") finished", qt4.s(k8dVar.c, "finish poll for chat(", ") and message(")), null);
                    }
                } catch (Throwable th) {
                    try {
                        k8d.B(this.g, th);
                        k8dVar = this.g;
                        str = k8dVar.h;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                        }
                    } finally {
                        k8d k8dVar5 = this.g;
                        String str3 = k8dVar5.h;
                        a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str3, c0a.m(k8dVar5.d, ") finished", qt4.s(k8dVar5.c, "finish poll for chat(", ") and message(")), null);
                        }
                        mjg mjgVar2 = this.g.j;
                        Boolean bool2 = Boolean.FALSE;
                        mjgVar2.getClass();
                        mjgVar2.j(null, bool2);
                        a8j.x(this.g.l, rt3.b);
                    }
                }
                return sbi.a;
        }
    }
}
