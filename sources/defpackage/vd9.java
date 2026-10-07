package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vd9 extends nq4 {
    public List d;
    public Exception e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ae9 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd9(ae9 ae9Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = ae9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return ae9.c(this.g, null, null, null, this);
    }
}
