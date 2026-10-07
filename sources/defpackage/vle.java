package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vle extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ dme f;
    public final /* synthetic */ aq g;
    public final /* synthetic */ yhh h;
    public final /* synthetic */ qih i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vle(dme dmeVar, aq aqVar, yhh yhhVar, qih qihVar, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = dmeVar;
        this.g = aqVar;
        this.h = yhhVar;
        this.i = qihVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new vle(this.f, this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((vle) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            if (!this.f.o) {
                aq aqVar = this.g;
                this.e = 1;
                obj = aqVar.u(this);
                if (obj != hu4Var) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        hih hihVar = (hih) obj;
        if (hihVar != null) {
            dme dmeVar = this.f;
            yhh yhhVar = this.h;
            je9 je9Var = je9.f;
            if (iih.Q0.contains(yhhVar.b)) {
                ole oleVar = (ole) dmeVar.q.compute(Short.valueOf(hihVar.k()), new he7(new z00(6, dmeVar), 5));
                String str = dmeVar.s;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    lhb lhbVar = kfc.c;
                    short sK = hihVar.k();
                    lhbVar.getClass();
                    a4cVar.c(je9Var, str, "saveTaskFail: " + lhb.p(sK) + lhb.c(hihVar.k()) + "protocol.error=" + yhhVar + "|error.info=" + oleVar, null);
                }
            } else {
                String str2 = dmeVar.s;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "saveTaskFail: unknown error! request=" + hihVar + ", error=" + yhhVar, null);
                }
            }
        }
        this.i.f(this.h);
        dme dmeVar2 = this.f;
        aq aqVar2 = this.g;
        yhh yhhVar2 = this.h;
        this.e = 2;
        return dme.d(dmeVar2, aqVar2, yhhVar2, this) == hu4Var ? hu4Var : sbiVar;
    }
}
