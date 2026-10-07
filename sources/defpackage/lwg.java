package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lwg extends nq4 {
    public qwg d;
    public List e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qwg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwg(qwg qwgVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = qwgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return qwg.f(this.h, 0L, this);
    }
}
