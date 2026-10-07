package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nrc extends nq4 {
    public lrc d;
    public String e;
    public pxa f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qrc h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrc(qrc qrcVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = qrcVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.q(null, null, null, this);
    }
}
