package defpackage;

import com.vk.push.core.ipc.BaseIPCClient;

/* JADX INFO: loaded from: classes2.dex */
public final class mr0 extends nq4 {
    public BaseIPCClient d;
    public cf7 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BaseIPCClient g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(BaseIPCClient baseIPCClient, lq4 lq4Var) {
        super(lq4Var);
        this.g = baseIPCClient;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.makeSimpleRequest(null, null, null, null, this);
    }
}
