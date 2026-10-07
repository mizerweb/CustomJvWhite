package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gah extends nq4 {
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jah g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gah(jah jahVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = jahVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(0, this, null);
    }
}
