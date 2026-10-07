package defpackage;

import com.vk.push.common.messaging.NotificationAnalyticsPayload;

/* JADX INFO: loaded from: classes3.dex */
public final class ygk extends nq4 {
    public qhk d;
    public String e;
    public NotificationAnalyticsPayload f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qhk h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygk(qhk qhkVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = qhkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return qhk.a(this.h, null, null, this);
    }
}
