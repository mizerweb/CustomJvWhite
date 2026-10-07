package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kaa extends nq4 {
    public rt2 d;
    public sfa e;
    public wfe f;
    public c79 g;
    public c79 h;
    public c79 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qaa l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaa(qaa qaaVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = qaaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.E(null, this, null);
    }
}
