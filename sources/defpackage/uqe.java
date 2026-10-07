package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uqe extends nq4 {
    public bre d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bre g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqe(bre breVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = breVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return bre.d(this.g, null, this);
    }
}
