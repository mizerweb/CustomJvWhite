package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class paa extends nq4 {
    public qaa d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qaa f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paa(qaa qaaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = qaaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.I(this);
    }
}
