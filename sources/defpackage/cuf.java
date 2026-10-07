package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cuf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ euf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cuf(euf eufVar, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = eufVar;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        euf eufVar = this.g;
        switch (i) {
            case 0:
                return new cuf(eufVar, lq4Var, 0);
            case 1:
                return new cuf(eufVar, lq4Var, 1);
            case 2:
                return new cuf(eufVar, this.f, lq4Var, 2);
            case 3:
                return new cuf(eufVar, this.f, lq4Var, 3);
            case 4:
                return new cuf(eufVar, this.f, lq4Var, 4);
            case 5:
                return new cuf(eufVar, this.f, lq4Var, 5);
            default:
                return new cuf(eufVar, this.f, lq4Var, 6);
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
                return ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 1:
                return ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 2:
                ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((cuf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        euf eufVar = this.g;
        switch (i) {
            case 0:
                ny8 ny8Var = eufVar.d;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i2 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                euf.B(eufVar);
                this.f = 1;
                Object objK0 = yab.K0(((n0c) ((xhh) ny8Var.getValue())).b(), new duf(eufVar, null, 0), this);
                if (objK0 != hu4Var) {
                    objK0 = sbiVar;
                }
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
                this.f = 2;
                Object objK1 = yab.K0(((n0c) ((xhh) ny8Var.getValue())).b(), new duf(eufVar, null, 1), this);
                if (objK1 != hu4Var) {
                    objK1 = sbiVar;
                }
                if (objK1 == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            case 1:
                ny8 ny8Var2 = eufVar.d;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    eufVar.n.setValue(eufVar.E());
                    eufVar.o.setValue(eufVar.D());
                    return sbiVar;
                }
                ch3.d0(obj);
                this.f = 1;
                Object objK2 = yab.K0(((n0c) ((xhh) ny8Var2.getValue())).b(), new duf(eufVar, null, 0), this);
                if (objK2 != hu4Var) {
                    objK2 = sbiVar;
                }
                if (objK2 == hu4Var) {
                    return hu4Var;
                }
                this.f = 2;
                Object objK3 = yab.K0(((n0c) ((xhh) ny8Var2.getValue())).b(), new duf(eufVar, null, 1), this);
                if (objK3 != hu4Var) {
                    objK3 = sbiVar;
                }
                if (objK3 == hu4Var) {
                    return hu4Var;
                }
                eufVar.n.setValue(eufVar.E());
                eufVar.o.setValue(eufVar.D());
                return sbiVar;
            case 2:
                ch3.d0(obj);
                zv8[] zv8VarArr = euf.z;
                eufVar.F().d(this.f, "app.media.load.audio_messages");
                eufVar.n.setValue(eufVar.E());
                return sbiVar;
            case 3:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = euf.z;
                eufVar.F().d(this.f, "app.media.load.gif");
                eufVar.n.setValue(eufVar.E());
                return sbiVar;
            case 4:
                ch3.d0(obj);
                zv8[] zv8VarArr3 = euf.z;
                eufVar.F().d(this.f, "app.media.load.photo");
                eufVar.n.setValue(eufVar.E());
                return sbiVar;
            case 5:
                ch3.d0(obj);
                zv8[] zv8VarArr4 = euf.z;
                eufVar.F().d(this.f, "app.media.load.video_messages");
                eufVar.n.setValue(eufVar.E());
                return sbiVar;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr5 = euf.z;
                ((nni) eufVar.e.getValue()).d(this.f, "app.media.caching.time");
                euf.B(eufVar);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cuf(euf eufVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = eufVar;
    }
}
