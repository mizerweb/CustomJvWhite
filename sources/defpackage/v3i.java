package defpackage;

import one.me.transparent.TransparentWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class v3i extends nq4 {
    public TransparentWidget d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x3i f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3i(x3i x3iVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = x3iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}
