package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ok7 extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qk7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok7(qk7 qk7Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = qk7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
