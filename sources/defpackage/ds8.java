package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ds8 extends nq4 {
    public es8 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ es8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds8(es8 es8Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = es8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
