package one.me.calls.impl.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.a4c;
import defpackage.cqk;
import defpackage.gm0;
import defpackage.j95;
import defpackage.je9;
import defpackage.jjf;
import defpackage.mpl;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class CallScreenShareService extends Service {
    public final String a = CallScreenShareService.class.getName();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        gm0.n(this.a, "CallScreenShareService onCreate");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "CallScreenShareService onDestroy()", null);
            }
        }
        stopForeground(2);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str = this.a;
        if (intent == null || cqk.d(intent.getAction(), "STOP")) {
            gm0.n(str, "CallScreenShareService stop.");
            stopSelfResult(i2);
            return 2;
        }
        int intExtra = intent.getIntExtra("NOTIFICATION_ID", -1);
        Notification notification = Build.VERSION.SDK_INT >= 33 ? (Notification) intent.getParcelableExtra("NOTIFICATION", Notification.class) : (Notification) intent.getParcelableExtra("NOTIFICATION");
        if (notification == null || intExtra == -1) {
            gm0.Y(str, "CallScreenShareService: no notification provided, stopping.");
            stopSelfResult(i2);
            return 2;
        }
        gm0.n(str, "CallScreenShareService start foreground with mediaProjection type.");
        try {
            mpl.c(this, intExtra, notification, jjf.c);
            return 2;
        } catch (Exception e) {
            gm0.V(str, "CallScreenShareService: failed to start foreground", new ScreenShareServiceException("failed to start foreground", e));
            stopSelfResult(i2);
            return 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/impl/service/CallScreenShareService$ScreenShareServiceException;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ScreenShareServiceException extends IssueKeyException {
        public /* synthetic */ ScreenShareServiceException(String str, Throwable th, int i, j95 j95Var) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public ScreenShareServiceException(String str, Throwable th) {
            super("49381", str, th);
        }
    }
}
