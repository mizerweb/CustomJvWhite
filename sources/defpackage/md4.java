package defpackage;

import java.nio.channels.AsynchronousChannelGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class md4 extends nq4 {
    public AsynchronousChannelGroup d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nd4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md4(nd4 nd4Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = nd4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
