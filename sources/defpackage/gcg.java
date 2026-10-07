package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gcg extends nq4 {
    public icg d;
    public jcg e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ icg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcg(icg icgVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = icgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return icg.b(this.h, null, this);
    }
}
