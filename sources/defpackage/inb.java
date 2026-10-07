package defpackage;

import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class inb extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inb(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
