package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zuf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ gvf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuf(Object obj, lq4 lq4Var, gvf gvfVar) {
        super(2, lq4Var);
        this.e = 1;
        this.g = obj;
        this.h = gvfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gvf gvfVar = this.h;
        switch (i) {
            case 0:
                zuf zufVar = new zuf(gvfVar, lq4Var, 0);
                zufVar.g = obj;
                return zufVar;
            case 1:
                return new zuf(this.g, lq4Var, gvfVar);
            default:
                zuf zufVar2 = new zuf(gvfVar, lq4Var, 2);
                zufVar2.g = obj;
                return zufVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((zuf) create((ba4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((zuf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((zuf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        gvf gvfVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                ba4 ba4Var = (ba4) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    if (cqk.d(ba4Var, z94.a)) {
                        this.g = null;
                        this.f = 1;
                        if (gvf.D(gvfVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else if (cqk.d(ba4Var, x94.a)) {
                        this.g = null;
                        this.f = 2;
                        if (gvf.D(gvfVar, this) == hu4Var) {
                            return hu4Var;
                        }
                        gvfVar.I(tpf.l);
                    } else {
                        if (!cqk.d(ba4Var, y94.a)) {
                            ore.o();
                            return null;
                        }
                        this.g = null;
                        this.f = 3;
                        if (gvf.D(gvfVar, this) == hu4Var) {
                            return hu4Var;
                        }
                        gvfVar.I(tpf.k);
                    }
                } else if (i2 == 1) {
                    ch3.d0(obj);
                } else if (i2 == 2) {
                    ch3.d0(obj);
                    gvfVar.I(tpf.l);
                } else {
                    if (i2 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    gvfVar.I(tpf.k);
                }
                return sbi.a;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                pvb pvbVar = (pvb) gvfVar.e.getValue();
                h3b h3bVar = new h3b();
                this.f = 1;
                Object objD = pvbVar.D(h3bVar, this);
                return objD == hu4Var ? hu4Var : objD;
            default:
                gu4 gu4Var = (gu4) this.g;
                int i4 = this.f;
                try {
                    if (i4 == 0) {
                        ch3.d0(obj);
                        zuf zufVar = new zuf(gu4Var, (lq4) null, gvfVar);
                        this.g = null;
                        this.f = 1;
                        obj = lvb.J0(500L, zufVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i4 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    break;
                } catch (Throwable th) {
                    obj = new poe(th);
                }
                return new roe(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zuf(gvf gvfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = gvfVar;
    }
}
