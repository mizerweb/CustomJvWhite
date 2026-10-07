package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a41 extends nq4 {
    public long d;
    public long e;
    public long f;
    public ByteBuffer g;
    public /* synthetic */ Object h;
    public final /* synthetic */ b41 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(b41 b41Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = b41Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return b41.b(this.i, 0L, 0L, this);
    }
}
