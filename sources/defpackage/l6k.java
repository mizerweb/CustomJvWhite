package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l6k extends nq4 {
    public ewe d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ewe g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6k(ewe eweVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = eweVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(false, this);
    }
}
