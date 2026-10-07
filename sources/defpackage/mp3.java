package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mp3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ np3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp3(np3 np3Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = np3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
