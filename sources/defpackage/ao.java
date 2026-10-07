package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vbf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao(vbf vbfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = vbfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        vbf vbfVar = this.h;
        switch (i) {
            case 0:
                ao aoVar = new ao(vbfVar, lq4Var, 0);
                aoVar.g = obj;
                return aoVar;
            default:
                ao aoVar2 = new ao(vbfVar, lq4Var, 1);
                aoVar2.g = obj;
                return aoVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ao) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((ao) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x002f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:13:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        wn wnVar;
        int i = this.e;
        int i2 = 0;
        hu4 hu4Var = hu4.a;
        vbf vbfVar = this.h;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                gu4 gu4Var = (gu4) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.g = gu4Var;
                    this.f = 1;
                    ek2 ek2Var = new ek2(1, p90.B(this));
                    ek2Var.u();
                    ((lk9) vbfVar.b).D0(gu4Var.k(), new zn(i2, ek2Var));
                    if (ek2Var.s() == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            default:
                vn vnVar = (vn) vbfVar.a;
                yx6 yx6Var = (yx6) this.g;
                int i4 = this.f;
                if (i4 == 0 || i4 == 1) {
                    ch3.d0(obj);
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                } else {
                    ch3.d0(obj);
                    if (obj == null) {
                        wnVar = new wn("Application Not Responding for at least ".concat(ew5.t(vnVar.a)));
                        this.g = yx6Var;
                        this.f = 3;
                        if (yx6Var.emit(wnVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                }
                while (true) {
                    ((a6) vbfVar.c).invoke();
                    if (Boolean.FALSE.booleanValue()) {
                        ghb ghbVar = ew5.b;
                        long jO = qe7.O(10, lw5.SECONDS);
                        this.g = yx6Var;
                        this.f = 1;
                        if (rx8.u(jO, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        long j = vnVar.a;
                        ao aoVar = new ao(vbfVar, lq4Var, i2);
                        this.g = yx6Var;
                        this.f = 2;
                        Object objM0 = lvb.M0(j, aoVar, this);
                        if (objM0 == hu4Var) {
                            return hu4Var;
                        }
                        if (objM0 == null) {
                            wnVar = new wn("Application Not Responding for at least ".concat(ew5.t(vnVar.a)));
                            this.g = yx6Var;
                            this.f = 3;
                            if (yx6Var.emit(wnVar, this) == hu4Var) {
                                return hu4Var;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                break;
        }
    }
}
