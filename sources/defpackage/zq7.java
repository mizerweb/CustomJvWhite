package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zq7 extends nq4 {
    public mjg d;
    public String e;
    public pnh f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cr7 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq7(cr7 cr7Var, lq4 lq4Var) {
        super(lq4Var);
        this.h = cr7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return cr7.a(this.h, null, this);
    }
}
