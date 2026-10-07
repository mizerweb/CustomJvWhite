package defpackage;

import one.me.sdk.vendor.rustore.push.RustoreMessagingService;

/* JADX INFO: loaded from: classes3.dex */
public final class lwe extends nq4 {
    public RustoreMessagingService d;
    public hhk e;
    public /* synthetic */ Object f;
    public final /* synthetic */ RustoreMessagingService g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwe(RustoreMessagingService rustoreMessagingService, nq4 nq4Var) {
        super(nq4Var);
        this.g = rustoreMessagingService;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
