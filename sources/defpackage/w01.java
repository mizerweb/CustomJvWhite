package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w01 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ vg4 c;

    public /* synthetic */ w01(yx6 yx6Var, vg4 vg4Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = vg4Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        v01 v01Var;
        rl4 rl4Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        vg4 vg4Var = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof v01) {
                    v01Var = (v01) lq4Var;
                    int i2 = v01Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        v01Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        v01Var = new v01(this, lq4Var);
                    }
                } else {
                    v01Var = new v01(this, lq4Var);
                }
                Object obj2 = v01Var.d;
                int i3 = v01Var.e;
                if (i3 == 0) {
                    ch3.d0(obj2);
                    ylc ylcVar = new ylc(vg4Var, (yhc) obj);
                    v01Var.e = 1;
                    return yx6Var.emit(ylcVar, v01Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj2);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lq4Var instanceof rl4) {
                    rl4Var = (rl4) lq4Var;
                    int i4 = rl4Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        rl4Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        rl4Var = new rl4(this, lq4Var);
                    }
                } else {
                    rl4Var = new rl4(this, lq4Var);
                }
                Object obj3 = rl4Var.d;
                int i5 = rl4Var.e;
                if (i5 == 0) {
                    ch3.d0(obj3);
                    ylc ylcVar2 = new ylc(vg4Var, (yhc) obj);
                    rl4Var.e = 1;
                    return yx6Var.emit(ylcVar2, rl4Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
