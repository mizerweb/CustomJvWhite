package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class yt6 extends nq4 {
    public fd4 d;
    public wfi e;
    public j9b f;
    public ByteBuffer g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ zt6 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt6(zt6 zt6Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = zt6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, null, this);
    }
}
