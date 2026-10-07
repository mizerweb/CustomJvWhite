package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wqf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xqf g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqf(xqf xqfVar, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xqfVar;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        boolean z = this.h;
        xqf xqfVar = this.g;
        switch (i) {
            case 0:
                return new wqf(xqfVar, z, lq4Var, 0);
            default:
                return new wqf(xqfVar, z, lq4Var, 1);
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
                break;
        }
        return ((wqf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        boolean z = this.h;
        hu4 hu4Var = hu4.a;
        xqf xqfVar = this.g;
        switch (i) {
            case 0:
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
                zv8[] zv8VarArr = xqf.o;
                jn jnVar = (jn) xqfVar.e.getValue();
                ((nni) jnVar.a.getValue()).c("app.media.animoji.enabled", z);
                jnVar.h.B(jnVar, jn.j[0], yab.h0(jnVar.g, new du4("invalidate chats and messages cache"), 2, new in(jnVar, z, null, 0)));
                this.f = 1;
                return xqf.B(xqfVar, this) == hu4Var ? hu4Var : sbiVar;
            default:
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
                zv8[] zv8VarArr2 = xqf.o;
                xqfVar.C().c("app.media.autoplay.gif", z);
                this.f = 1;
                return xqf.B(xqfVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
