package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ofd extends nq4 {
    public wui d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pfd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofd(pfd pfdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = pfdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
