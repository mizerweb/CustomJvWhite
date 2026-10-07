package defpackage;

import one.me.android.notifications.NotificationsImagesProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class qnb extends nq4 {
    public gu4 d;
    public v71 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ NotificationsImagesProvider g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnb(NotificationsImagesProvider notificationsImagesProvider, nq4 nq4Var) {
        super(nq4Var);
        this.g = notificationsImagesProvider;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return NotificationsImagesProvider.a(this.g, null, null, this);
    }
}
