package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oaa extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ qaa e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaa(qaa qaaVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = qaaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return qaa.C(this.e, null, this);
    }
}
