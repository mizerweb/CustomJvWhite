package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yxe extends nq4 implements yx6 {
    public final yx6 d;
    public final vt4 e;
    public final int f;
    public vt4 g;
    public lq4 h;

    public yxe(yx6 yx6Var, vt4 vt4Var) {
        super(r64.c, k66.a);
        this.d = yx6Var;
        this.e = vt4Var;
        this.f = ((Number) vt4Var.E(0, new dz(11))).intValue();
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        try {
            Object objL = l(lq4Var, obj);
            return objL == hu4.a ? objL : sbi.a;
        } catch (Throwable th) {
            this.g = new bt5(lq4Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.mq0, defpackage.iu4
    public final iu4 getCallerFrame() {
        lq4 lq4Var = this.h;
        if (lq4Var instanceof iu4) {
            return (iu4) lq4Var;
        }
        return null;
    }

    @Override // defpackage.nq4, defpackage.lq4
    public final vt4 getContext() {
        vt4 vt4Var = this.g;
        return vt4Var == null ? k66.a : vt4Var;
    }

    @Override // defpackage.mq0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable thA = roe.a(obj);
        if (thA != null) {
            this.g = new bt5(getContext(), thA);
        }
        lq4 lq4Var = this.h;
        if (lq4Var != null) {
            lq4Var.resumeWith(obj);
        }
        return hu4.a;
    }

    public final Object l(lq4 lq4Var, Object obj) {
        vt4 context = lq4Var.getContext();
        vd7.q(context);
        vt4 vt4Var = this.g;
        if (vt4Var != context) {
            if (vt4Var instanceof bt5) {
                throw new IllegalStateException(s5h.x0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((bt5) vt4Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.E(0, new z00(7, this))).intValue() != this.f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.g = context;
        }
        this.h = lq4Var;
        Object objI = aye.a.i(this.d, obj, this);
        if (!cqk.d(objI, hu4.a)) {
            this.h = null;
        }
        return objI;
    }
}
