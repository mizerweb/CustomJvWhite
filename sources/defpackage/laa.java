package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class laa extends nq4 {
    public sfa d;
    public c79 e;
    public c79 f;
    public c79 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ qaa i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laa(qaa qaaVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = qaaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.F(null, this, null);
    }
}
