package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wof extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ny8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wof(int i, lq4 lq4Var, ny8 ny8Var) {
        super(2, lq4Var);
        this.e = i;
        this.h = ny8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                wof wofVar = new wof(0, lq4Var, this.h);
                wofVar.g = obj;
                return wofVar;
            default:
                wof wofVar2 = new wof(1, lq4Var, this.h);
                wofVar2.g = obj;
                return wofVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((wof) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((wof) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        ny8 ny8Var = this.h;
        switch (i) {
            case 0:
                yx6 yx6Var = (yx6) this.g;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                Long l = new Long(((zed) ny8Var.getValue()).a.t());
                this.g = null;
                this.f = 1;
                return yx6Var.emit(l, this) == hu4Var ? hu4Var : sbiVar;
            default:
                njd njdVar = (njd) this.g;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ifh ifhVar = new ifh(new j0i(ny8Var, 13, njdVar));
                njdVar.c(((wd4) ny8Var.getValue()).c() ? fbj.a : fbj.b);
                ((wd4) ny8Var.getValue()).f((vd4) ifhVar.getValue());
                j0i j0iVar = new j0i(ny8Var, 14, ifhVar);
                this.g = null;
                this.f = 1;
                return np4.b(njdVar, j0iVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
