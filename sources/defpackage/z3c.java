package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z3c extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ a4c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3c(int i, a4c a4cVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = i;
        this.g = a4cVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new z3c(this.f, this.g, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((z3c) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        a4c a4cVar = this.g;
        final x3c x3cVar = a4cVar.i;
        final m2c m2cVar = a4cVar.h;
        int i = this.e;
        lq4 lq4Var = null;
        int i2 = 1;
        if (i == 0) {
            ch3.d0(obj);
            int iD = qt4.D(this.f);
            if (iD == 0) {
                m2cVar.getClass();
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: b2c
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
                        yab.A0(k66.a, new xra(6, (lq4) null, th, m2cVar, defaultUncaughtExceptionHandler, thread));
                    }
                });
                yab.i0(m2cVar.b, null, 0, new k2c(m2cVar, lq4Var, i2), 3);
            } else {
                if (iD != 1) {
                    ore.o();
                    return null;
                }
                this.e = 1;
                Object objD = m2cVar.d(this);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        x3cVar.getClass();
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: q3c
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
                yab.A0(k66.a, new tt6(th, x3cVar, defaultUncaughtExceptionHandler2, thread, (lq4) null));
            }
        });
        yab.i0(x3cVar.a, null, 0, new w3c(x3cVar, lq4Var, i2), 3);
        return sbi.a;
    }
}
