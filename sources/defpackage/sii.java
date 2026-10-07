package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class sii extends nq4 {
    public fd4 d;
    public j28 e;
    public String f;
    public ByteBuffer g;
    public /* synthetic */ Object h;
    public final /* synthetic */ uii i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sii(uii uiiVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = uiiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.k(null, null, null, this);
    }
}
