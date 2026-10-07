package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oej extends nq4 {
    public jx0 d;
    public String e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rej h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oej(rej rejVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = rejVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.l(null, this);
    }
}
