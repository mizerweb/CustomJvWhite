package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zqg extends nq4 {
    public azg d;
    public swg e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ erg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqg(erg ergVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = ergVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, 0L, this);
    }
}
