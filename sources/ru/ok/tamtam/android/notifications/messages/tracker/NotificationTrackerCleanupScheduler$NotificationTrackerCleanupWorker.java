package ru.ok.tamtam.android.notifications.messages.tracker;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ch3;
import defpackage.es3;
import defpackage.et3;
import defpackage.hu4;
import defpackage.inb;
import defpackage.k89;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.s7f;
import defpackage.xt4;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ru/ok/tamtam/android/notifications/messages/tracker/NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "ioDispatcher", "Les3;", "trackerRegistry", "Let3;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lxt4;Les3;Let3;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker extends SdkCoroutineWorker {
    public final es3 g;
    public final et3 h;
    public final xt4 i;

    public NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, xt4 xt4Var2, es3 es3Var, et3 et3Var) {
        super(context, workerParameters, xt4Var);
        this.g = es3Var;
        this.h = et3Var;
        this.i = xt4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object d(lq4 lq4Var) {
        inb inbVar;
        if (lq4Var instanceof inb) {
            inbVar = (inb) lq4Var;
            int i = inbVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                inbVar.f = i - Integer.MIN_VALUE;
            } else {
                inbVar = new inb(this, (nq4) lq4Var);
            }
        } else {
            inbVar = new inb(this, (nq4) lq4Var);
        }
        Object obj = inbVar.d;
        int i2 = inbVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            long jF = ((s7f) this.h).f() - 604800000;
            inbVar.f = 1;
            Object objA = this.g.a(jF, inbVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return new k89();
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public final xt4 getI() {
        return this.i;
    }
}
