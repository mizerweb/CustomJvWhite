package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mnb extends nq4 {
    public pnb d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pnb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnb(pnb pnbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = pnbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return pnb.a(this.g, null, null, this);
    }
}
