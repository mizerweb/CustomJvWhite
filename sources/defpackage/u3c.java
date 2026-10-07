package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u3c extends nq4 {
    public cf7 d;
    public j9b e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ x3c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3c(x3c x3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = x3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
