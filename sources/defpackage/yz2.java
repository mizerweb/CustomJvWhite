package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yz2 extends nq4 {
    public String d;
    public qw2 e;
    public List f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h03 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz2(h03 h03Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = h03Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, null, this);
    }
}
