package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl5 implements oub {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;

    public tl5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        mjg mjgVarA = p90.a(pub.a);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        ((kub) ny8Var4.getValue()).b.put(cvb.DIGITAL_ID, this);
    }

    @Override // defpackage.oub
    public final Long a() {
        xb9 xb9Var = (xb9) ((et3) this.b.getValue());
        return (Long) xb9Var.b1.m(xb9Var, xb9.g1[46]);
    }

    @Override // defpackage.oub
    public final boolean b() {
        if (!((f5d) ((wo6) this.a.getValue())).t()) {
            return false;
        }
        s7f s7fVar = (s7f) ((et3) this.b.getValue());
        if (((Boolean) s7fVar.d0.m(s7fVar, s7f.j0[52])).booleanValue()) {
            return false;
        }
        return !e();
    }

    @Override // defpackage.oub
    public final long c() {
        return ((s7f) ((et3) this.b.getValue())).f();
    }

    @Override // defpackage.oub
    public final void d() {
        if (a() != null) {
            return;
        }
        et3 et3Var = (et3) this.b.getValue();
        xb9 xb9Var = (xb9) et3Var;
        xb9Var.b1.B(xb9Var, xb9.g1[46], Long.valueOf(c()));
    }

    @Override // defpackage.oub
    public final void dismiss() {
        ((kub) this.d.getValue()).a.h(cvb.DIGITAL_ID, null);
        mjg mjgVar = this.e;
        mjgVar.getClass();
        mjgVar.j(null, pub.a);
    }

    @Override // defpackage.oub
    public final void f() {
        xb9 xb9Var = (xb9) ((et3) this.b.getValue());
        xb9Var.b1.B(xb9Var, xb9.g1[46], Long.MIN_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(af7 af7Var, lq4 lq4Var) {
        sl5 sl5Var;
        boolean z;
        Object obj;
        if (lq4Var instanceof sl5) {
            sl5Var = (sl5) lq4Var;
            int i = sl5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sl5Var.f = i - Integer.MIN_VALUE;
            } else {
                sl5Var = new sl5(this, (nq4) lq4Var);
            }
        } else {
            sl5Var = new sl5(this, (nq4) lq4Var);
        }
        Object objA = sl5Var.d;
        int i2 = sl5Var.f;
        if (i2 == 0) {
            ch3.d0(objA);
            if (((Boolean) af7Var.invoke()).booleanValue() && b()) {
                kub kubVar = (kub) this.d.getValue();
                sl5Var.f = 1;
                objA = kubVar.a(cvb.DIGITAL_ID, sl5Var);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            }
            if (z) {
                obj = qub.a;
            } else {
                obj = pub.a;
            }
            mjg mjgVar = this.e;
            mjgVar.getClass();
            mjgVar.j(null, obj);
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objA);
        z = ((Boolean) objA).booleanValue();
        if (z) {
            obj = qub.a;
        } else {
            obj = pub.a;
        }
        mjg mjgVar2 = this.e;
        mjgVar2.getClass();
        mjgVar2.j(null, obj);
        return sbi.a;
    }

    @Override // defpackage.oub
    public final r8e getState() {
        return this.f;
    }
}
