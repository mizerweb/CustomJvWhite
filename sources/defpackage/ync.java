package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ync extends mdh implements cf7 {
    public final /* synthetic */ znc e;
    public final /* synthetic */ String f;
    public final /* synthetic */ cf7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ync(znc zncVar, String str, cf7 cf7Var, lq4 lq4Var) {
        super(1, lq4Var);
        this.e = zncVar;
        this.f = str;
        this.g = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new ync(this.e, this.f, this.g, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((ync) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        vxe vxeVarO0 = this.e.b.O0(this.f);
        try {
            Object objInvoke = this.g.invoke(vxeVarO0);
            p90.f(vxeVarO0, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }
}
