package one.me.background.wake;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.a4c;
import defpackage.ae9;
import defpackage.g5c;
import defpackage.gm0;
import defpackage.ifh;
import defpackage.je9;
import defpackage.jjf;
import defpackage.kn0;
import defpackage.mpl;
import defpackage.p90;
import defpackage.qlb;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.rm0;
import defpackage.u7f;
import defpackage.va;
import defpackage.zid;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundListenService extends Service {
    public static final /* synthetic */ int c = 0;
    public final ifh a = new ifh(new va(13));
    public boolean b;

    public static final Integer a(BackgroundListenService backgroundListenService) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Integer.valueOf(backgroundListenService.getForegroundServiceType());
        }
        return null;
    }

    public final Notification b() {
        u7f u7fVar = (u7f) c().getAccessor().c(343);
        u7fVar.b.getClass();
        g5c g5cVar = (g5c) u7fVar.d.getValue();
        PendingIntent pendingIntentP = p90.p(this, 9001, g5cVar.h(false));
        qlb qlbVarJ = g5cVar.j("ru.oneme.app.misc", true);
        qlbVarJ.e = qlb.c(getString(R.string.oneme_background_wake_notification_title));
        qlbVarJ.f = qlb.c(getString(R.string.oneme_background_wake_notification_subtitle));
        qlbVarJ.f(2, true);
        qlbVarJ.k = -1;
        qlbVarJ.H = true;
        qlbVarJ.g = pendingIntentP;
        return qlbVarJ.a();
    }

    public final rm0 c() {
        return (rm0) this.a.getValue();
    }

    public final void d(boolean z) {
        try {
            mpl.c(this, -9001, b(), jjf.f);
            this.b = true;
        } catch (Exception e) {
            this.b = false;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "KeepBackground", "Failed to startForeground", e);
                }
            }
            if (z) {
                stopSelf();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        gm0.n("KeepBackground", "onCreate");
        d(true);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", qv1.j("startForeground called, notificationId=-9001, foregroundType:", a(this)), null);
            }
        }
        ((zid) c().getAccessor().c(36)).d(64L);
        ae9.k(((kn0) c().getAccessor().c(337)).a(), "BACKGROUND_MODE", "system_curtain_shown", null, 12);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "KeepBackground", "onDestroy, isStartForegroundCalled:" + this.b + ", foregroundType:" + a(this), null);
        }
        ae9.k(((kn0) c().getAccessor().c(337)).a(), "BACKGROUND_MODE", "system_curtain_hidden", null, 12);
        ((zid) c().getAccessor().c(36)).a(64L);
        stopForeground(1);
        this.b = false;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "KeepBackground", qv1.j("onDestroy, stopForeground called, foregroundType:", a(this)), null);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "KeepBackground", qt4.l("onStartCommand: flags=", i, i2, ", startId="), null);
        }
        d(false);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null || !a4cVar2.b(je9Var)) {
            return 1;
        }
        a4cVar2.c(je9Var, "KeepBackground", qv1.j("startForeground called, notificationId=-9001, foregroundType:", a(this)), null);
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", "onTaskRemoved, isStartForegroundCalled:" + this.b + ", foregroundType:" + a(this), null);
            }
        }
        super.onTaskRemoved(intent);
    }

    public final void onTimeout(int i, int i2) {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            boolean z = this.b;
            StringBuilder sbP = qv1.p("onTimeout: startId=", i, ", fgsType=", i2, ", stopping service, isStartForegroundCalled:");
            sbP.append(z);
            a4cVar.c(je9Var, "KeepBackground", sbP.toString(), null);
        }
        ((zid) c().getAccessor().c(36)).a(64L);
        stopForeground(1);
        this.b = false;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "KeepBackground", qv1.j("onTimeout, stopForeground called, foregroundType:", a(this)), null);
        }
    }
}
