package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fa3 implements yx6 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yx6 c;
    public final /* synthetic */ ny8 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fa3(yx6 yx6Var, Object obj, ny8 ny8Var, int i) {
        this.a = i;
        this.e = obj;
        this.d = ny8Var;
        this.c = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        ea3 ea3Var;
        si4 si4Var;
        Object value;
        Object value2;
        int i = this.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.c;
        ny8 ny8Var = this.d;
        hu4 hu4Var = hu4.a;
        Object obj2 = this.e;
        lq4 lq4Var2 = null;
        switch (i) {
            case 0:
                ga3 ga3Var = (ga3) obj2;
                gu4 gu4Var = ga3Var.i;
                if (lq4Var instanceof ea3) {
                    ea3Var = (ea3) lq4Var;
                    int i2 = ea3Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ea3Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        ea3Var = new ea3(this, lq4Var);
                    }
                } else {
                    ea3Var = new ea3(this, lq4Var);
                }
                Object obj3 = ea3Var.d;
                int i3 = ea3Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                int i4 = this.b;
                this.b = i4 + 1;
                if (i4 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                if (i4 == 0) {
                    rt2 rt2Var = (rt2) obj;
                    yab.i0(gu4Var, null, 0, new k23(ny8Var, rt2Var, lq4Var2, 8), 3);
                    yab.i0(gu4Var, null, 0, new in1(ga3Var, rt2Var, lq4Var2, 26), 3);
                }
                ea3Var.e = 1;
                return yx6Var.emit(obj, ea3Var) == hu4Var ? hu4Var : sbiVar;
            default:
                vi4 vi4Var = (vi4) obj2;
                if (lq4Var instanceof si4) {
                    si4Var = (si4) lq4Var;
                    int i5 = si4Var.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        si4Var.e = i5 - Integer.MIN_VALUE;
                    } else {
                        si4Var = new si4(this, lq4Var);
                    }
                } else {
                    si4Var = new si4(this, lq4Var);
                }
                Object obj4 = si4Var.d;
                int i6 = si4Var.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                int i7 = this.b;
                this.b = i7 + 1;
                if (i7 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                if (i7 == 0) {
                    vg4 vg4Var = (vg4) obj;
                    vi4Var.E.set(vg4Var.v() == ((s7f) ((et3) ny8Var.getValue())).t());
                    pz5 pz5VarP = vi4.p(vi4Var, vg4Var);
                    mjg mjgVar = vi4Var.k;
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, pz5VarP));
                    mjg mjgVar2 = vi4Var.l;
                    do {
                        value2 = mjgVar2.getValue();
                    } while (!mjgVar2.h(value2, pz5VarP));
                    yab.i0(vi4Var.a, ((n0c) vi4Var.r()).b(), 0, new jd3(vi4Var, lq4Var2, 16), 2);
                }
                si4Var.e = 1;
                return yx6Var.emit(obj, si4Var) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
