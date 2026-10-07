package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f6i extends nq4 {
    public String d;
    public String e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ j6i i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6i(j6i j6iVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = j6iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.E(null, null, this);
    }
}
