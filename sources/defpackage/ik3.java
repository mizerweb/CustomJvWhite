package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ik3 extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jk3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik3(jk3 jk3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = jk3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.u(null, null, this);
    }
}
