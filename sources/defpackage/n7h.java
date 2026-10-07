package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n7h implements yx6 {
    public final yx6 a;
    public final qf7 b;

    public n7h(yx6 yx6Var, qf7 qf7Var) {
        this.a = yx6Var;
        this.b = qf7Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) throws Throwable {
        m7h m7hVar;
        Throwable th;
        yxe yxeVar;
        n7h n7hVar;
        yx6 yx6Var;
        if (nq4Var instanceof m7h) {
            m7hVar = (m7h) nq4Var;
            int i = m7hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7hVar.h = i - Integer.MIN_VALUE;
            } else {
                m7hVar = new m7h(this, nq4Var);
            }
        } else {
            m7hVar = new m7h(this, nq4Var);
        }
        Object obj = m7hVar.f;
        int i2 = m7hVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yxeVar = m7hVar.e;
            n7hVar = m7hVar.d;
            try {
                ch3.d0(obj);
                yxeVar.releaseIntercepted();
                yx6Var = n7hVar.a;
                if (yx6Var instanceof n7h) {
                    m7hVar.d = null;
                    m7hVar.e = null;
                    m7hVar.h = 2;
                    if (((n7h) yx6Var).b(m7hVar) == hu4Var) {
                    }
                }
                return sbiVar;
            } catch (Throwable th2) {
                th = th2;
                yxeVar.releaseIntercepted();
                throw th;
            }
        }
        ch3.d0(obj);
        yxe yxeVar2 = new yxe(this.a, m7hVar.getContext());
        try {
            qf7 qf7Var = this.b;
            m7hVar.d = this;
            m7hVar.e = yxeVar2;
            m7hVar.h = 1;
            if (qf7Var.invoke(yxeVar2, m7hVar) != hu4Var) {
                n7hVar = this;
                yxeVar = yxeVar2;
                yxeVar.releaseIntercepted();
                yx6Var = n7hVar.a;
                if (yx6Var instanceof n7h) {
                    m7hVar.d = null;
                    m7hVar.e = null;
                    m7hVar.h = 2;
                    if (((n7h) yx6Var).b(m7hVar) == hu4Var) {
                    }
                }
                return sbiVar;
            }
        } catch (Throwable th3) {
            th = th3;
            yxeVar = yxeVar2;
            yxeVar.releaseIntercepted();
            throw th;
        }
        return hu4Var;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        return this.a.emit(obj, lq4Var);
    }
}
