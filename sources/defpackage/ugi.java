package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ugi extends mdh implements vf7 {
    public int e;
    public /* synthetic */ Throwable f;
    public /* synthetic */ long g;
    public final /* synthetic */ zgi h;
    public final /* synthetic */ wfe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugi(zgi zgiVar, wfe wfeVar, lq4 lq4Var) {
        super(4, lq4Var);
        this.h = zgiVar;
        this.i = wfeVar;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        ugi ugiVar = new ugi(this.h, this.i, (lq4) obj4);
        ugiVar.f = (Throwable) obj2;
        ugiVar.g = jLongValue;
        return ugiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.f;
        long j = this.g;
        int i = this.e;
        zgi zgiVar = this.h;
        wfe wfeVar = this.i;
        if (i == 0) {
            ch3.d0(obj);
            vfi vfiVar = (vfi) wfeVar.a;
            this.f = null;
            this.g = j;
            this.e = 1;
            obj = zgi.d(zgiVar, vfiVar, th, j, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            mii miiVarH = zgiVar.h();
            String str = ((vfi) wfeVar.a).a.d;
            miiVarH.getClass();
            miiVarH.f.a(new lqc(str, p90.O(1, "upload_retried"), miiVarH.a.a()));
        }
        return obj;
    }
}
