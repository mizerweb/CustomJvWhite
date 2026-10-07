package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hrj extends nq4 {
    public frj d;
    public brj e;
    public hqg f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ krj i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrj(krj krjVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = krjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.j(null, false, this);
    }
}
