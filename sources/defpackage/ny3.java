package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ny3 extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ oy3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny3(oy3 oy3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = oy3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
