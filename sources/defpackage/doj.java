package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class doj extends nq4 {
    public es8 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ioj f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doj(ioj iojVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = iojVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.O(null, this);
    }
}
