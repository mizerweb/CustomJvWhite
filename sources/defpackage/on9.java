package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;

/* JADX INFO: loaded from: classes2.dex */
public final class on9 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ MasterHostApi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on9(MasterHostApi masterHostApi, lq4 lq4Var) {
        super(lq4Var);
        this.e = masterHostApi;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objM23getAllExistingHostListIoAF18A = this.e.m23getAllExistingHostListIoAF18A(this);
        return objM23getAllExistingHostListIoAF18A == hu4.a ? objM23getAllExistingHostListIoAF18A : new roe(objM23getAllExistingHostListIoAF18A);
    }
}
