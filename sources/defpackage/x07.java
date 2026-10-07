package defpackage;

import com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class x07 extends nq4 {
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ FlowableFileDataStoreImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x07(FlowableFileDataStoreImpl flowableFileDataStoreImpl, lq4 lq4Var) {
        super(lq4Var);
        this.f = flowableFileDataStoreImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.clear(this);
    }
}
