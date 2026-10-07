package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j5j extends nq4 {
    public long d;
    public rt2 e;
    public List f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ k5j j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5j(k5j k5jVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = k5jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.v(0L, null, this);
    }
}
