package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xnc extends nq4 {
    public String d;
    public cf7 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ znc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnc(znc zncVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = zncVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, this);
    }
}
