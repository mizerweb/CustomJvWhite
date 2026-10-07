package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dn6 extends nq4 {
    public gn6 d;
    public ilb e;
    public List f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ gn6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn6(gn6 gn6Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = gn6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return gn6.b(this.i, null, 0L, this);
    }
}
