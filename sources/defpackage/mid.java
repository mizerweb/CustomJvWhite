package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mid extends nq4 {
    public q24 d;
    public List e;
    public s04 f;
    public Long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ nid i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mid(nid nidVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = nidVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, null, this);
    }
}
