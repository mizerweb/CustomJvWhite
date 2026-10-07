package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zgg extends nq4 {
    public g4b d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ahg g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgg(ahg ahgVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ahgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, null, null, this);
    }
}
