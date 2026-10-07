package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ygj extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zgj h;
    public final /* synthetic */ vgj i;
    public final /* synthetic */ wlj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygj(zgj zgjVar, vgj vgjVar, wlj wljVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = zgjVar;
        this.i = vgjVar;
        this.j = wljVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        wlj wljVar = this.j;
        vgj vgjVar = this.i;
        zgj zgjVar = this.h;
        switch (i) {
            case 0:
                ygj ygjVar = new ygj(zgjVar, wljVar, vgjVar, lq4Var);
                ygjVar.g = obj;
                return ygjVar;
            default:
                ygj ygjVar2 = new ygj(zgjVar, vgjVar, wljVar, lq4Var);
                ygjVar2.g = obj;
                return ygjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ygj) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((ygj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        wlj wljVar = this.j;
        hu4 hu4Var = hu4.a;
        zgj zgjVar = this.h;
        switch (i) {
            case 0:
                String str = (String) this.g;
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
                qs8 qs8Var = zgjVar.a;
                zlj zljVar = new zlj(wljVar.a, str);
                qs8Var.getClass();
                String strB = qs8Var.b(zlj.Companion.serializer(), zljVar);
                p41 p41Var = zgjVar.d;
                this.i.getClass();
                fs8 fs8Var = new fs8("WebAppOpenCodeReader", strB, false);
                this.g = null;
                this.f = 1;
                return p41Var.a(this, fs8Var) == hu4Var ? hu4Var : sbiVar;
            default:
                Throwable th = (Throwable) this.g;
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
                ugj ugjVar = th instanceof ugj ? (ugj) th : null;
                ms8 ks8Var = ugjVar == null ? ls8.d : new ks8(new ns8(ugjVar.a, ugjVar.b));
                l44 l44Var = (l44) zgjVar.b.getValue();
                p41 p41Var2 = zgjVar.d;
                String str2 = wljVar.a;
                this.g = null;
                this.f = 1;
                return l44Var.a(p41Var2, ks8Var, this.i, str2, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygj(zgj zgjVar, wlj wljVar, vgj vgjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = zgjVar;
        this.j = wljVar;
        this.i = vgjVar;
    }
}
