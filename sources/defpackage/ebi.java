package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ebi extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fbi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebi(fbi fbiVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = fbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, false, this);
    }
}
