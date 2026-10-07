package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bvf extends nq4 {
    public List d;
    public vjd e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gvf g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvf(gvf gvfVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = gvfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return gvf.B(this.g, null, this);
    }
}
