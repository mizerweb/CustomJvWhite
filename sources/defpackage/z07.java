package defpackage;

import com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class z07 extends nq4 {
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ FlowableFileDataStoreImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z07(FlowableFileDataStoreImpl flowableFileDataStoreImpl, lq4 lq4Var) {
        super(lq4Var);
        this.g = flowableFileDataStoreImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.write(null, this);
    }
}
