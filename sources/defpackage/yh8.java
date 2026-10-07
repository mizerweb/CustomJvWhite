package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yh8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh8(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                yh8 yh8Var = new yh8(2, lq4Var, 0);
                yh8Var.f = obj;
                return yh8Var;
            case 1:
                yh8 yh8Var2 = new yh8(2, lq4Var, 1);
                yh8Var2.f = obj;
                return yh8Var2;
            default:
                yh8 yh8Var3 = new yh8(2, lq4Var, 2);
                yh8Var3.f = obj;
                return yh8Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((yh8) create((x0c) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                ((yh8) create((we4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((yh8) create((h0g) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                x0c x0cVar = (x0c) this.f;
                ch3.d0(obj);
                return Boolean.valueOf("".equals(x0cVar.a));
            case 1:
                we4 we4Var = (we4) this.f;
                ch3.d0(obj);
                rg9 rg9Var = rg9.i;
                String str = rg9Var.g;
                owh owhVar = str != null ? new owh(str) : null;
                String str2 = owhVar != null ? owhVar.a : null;
                if (str2 == null) {
                    String str3 = rg9Var.b;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str3, "Invoked 'listenToFirstConnectionState', but traceId is null or empty!", null);
                        }
                    }
                } else {
                    b9b b9bVar = new b9b();
                    b9bVar.k("init_connection_type", new Integer(we4Var.a));
                    rg9Var.h(b9bVar, str2);
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                return Boolean.valueOf(((h0g) this.f) != h0g.a);
        }
    }
}
