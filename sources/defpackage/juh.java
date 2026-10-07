package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class juh extends nq4 {
    public String d;
    public vo5 e;
    public Serializable f;
    public Serializable g;
    public Serializable h;
    public Serializable i;
    public wfe j;
    public Serializable k;
    public Serializable l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nuh q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juh(nuh nuhVar, nq4 nq4Var) {
        super(nq4Var);
        this.q = nuhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, 0, this);
    }
}
