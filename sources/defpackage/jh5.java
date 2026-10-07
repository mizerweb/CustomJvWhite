package defpackage;

import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class jh5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DeletePushTokenIfNoHostsWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh5(DeletePushTokenIfNoHostsWorker deletePushTokenIfNoHostsWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = deletePushTokenIfNoHostsWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
