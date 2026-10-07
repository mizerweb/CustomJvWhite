package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jb2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ kb2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb2(kb2 kb2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = kb2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
