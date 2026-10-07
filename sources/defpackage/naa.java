package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class naa extends nq4 {
    public rt2 d;
    public sfa e;
    public mjg f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ qaa i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naa(qaa qaaVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = qaaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return qaa.B(this.i, null, this);
    }
}
