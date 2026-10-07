package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w49 extends nq4 {
    public njd d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ c59 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w49(c59 c59Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = c59Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(null, null, this);
    }
}
