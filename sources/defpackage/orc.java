package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class orc extends nq4 {
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qrc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orc(qrc qrcVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = qrcVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return qrc.e(this.g, this);
    }
}
