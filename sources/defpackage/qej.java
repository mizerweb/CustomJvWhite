package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class qej extends nq4 {
    public mx0 d;
    public Serializable e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rej g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qej(rej rejVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = rejVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return rej.c(this.g, null, null, this);
    }
}
