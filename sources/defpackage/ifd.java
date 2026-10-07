package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ifd extends nq4 {
    public au3 d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jfd h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifd(jfd jfdVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = jfdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, 0, 0, null, this);
    }
}
