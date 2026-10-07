package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sr6 extends nq4 {
    public List d;
    public dt9 e;
    public qs6 f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ tr6 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr6(tr6 tr6Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = tr6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return tr6.a(this.j, null, this);
    }
}
