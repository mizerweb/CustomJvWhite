package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d6i extends nq4 {
    public String d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j6i g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6i(j6i j6iVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = j6iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return j6i.B(this.g, null, null, this);
    }
}
