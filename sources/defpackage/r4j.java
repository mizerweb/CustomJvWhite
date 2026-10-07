package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r4j extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ s4j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4j(s4j s4jVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = s4jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
