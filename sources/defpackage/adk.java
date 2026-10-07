package defpackage;

import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.messaging.NotificationPayload;

/* JADX INFO: loaded from: classes3.dex */
public final class adk extends nq4 {
    public js8 d;
    public NotificationPayload e;
    public ylc f;
    public NotificationAnalyticsPayload g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ js8 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adk(js8 js8Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = js8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, 0, null, null, this);
    }
}
