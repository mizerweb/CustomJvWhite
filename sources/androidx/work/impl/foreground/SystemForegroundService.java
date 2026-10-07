package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.g19;
import defpackage.i19;
import defpackage.kr6;
import defpackage.lvb;
import defpackage.m09;
import defpackage.n1g;
import defpackage.ng7;
import defpackage.np0;
import defpackage.oyj;
import defpackage.qfh;
import defpackage.za2;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends Service implements g19 {
    public static final String e = n1g.Z("SystemFgService");
    public final kr6 a;
    public boolean b;
    public qfh c;
    public NotificationManager d;

    public SystemForegroundService() {
        kr6 kr6Var = new kr6();
        kr6Var.a = new i19(this);
        kr6Var.b = new Handler();
        this.a = kr6Var;
    }

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        qfh qfhVar = new qfh(getApplicationContext());
        this.c = qfhVar;
        if (qfhVar.i != null) {
            n1g.x().s(qfh.j, "A callback already exists.");
        } else {
            qfhVar.i = this;
        }
    }

    public final void b() {
        this.a.J(m09.ON_CREATE);
        super.onCreate();
    }

    public final void e() {
        m09 m09Var = m09.ON_STOP;
        kr6 kr6Var = this.a;
        kr6Var.J(m09Var);
        kr6Var.J(m09.ON_DESTROY);
        super.onDestroy();
    }

    @Override // defpackage.g19
    public final i19 f() {
        return (i19) this.a.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.a.J(m09.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        b();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        e();
        this.c.g();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.J(m09.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        String str = e;
        if (z) {
            n1g.x().J(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.g();
            a();
            this.b = false;
        }
        if (intent != null) {
            qfh qfhVar = this.c;
            qfhVar.getClass();
            String str2 = qfh.j;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                n1g.x().J(str2, "Started foreground service " + intent);
                qfhVar.b.a(new ng7((Object) qfhVar, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), false, 27));
                qfhVar.f(intent);
            } else if ("ACTION_NOTIFY".equals(action)) {
                qfhVar.f(intent);
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                n1g.x().J(str2, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    oyj oyjVar = qfhVar.a;
                    lvb.v0(oyjVar.b.m, "CancelWorkById", oyjVar.d.a, new za2(oyjVar, 3, UUID.fromString(stringExtra)));
                }
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                n1g.x().J(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = qfhVar.i;
                if (systemForegroundService != null) {
                    systemForegroundService.b = true;
                    n1g.x().p(str, "Shutting down.");
                    systemForegroundService.stopForeground(true);
                    systemForegroundService.stopSelf(i2);
                }
            }
        }
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.h(i, np0.q);
    }

    public final void onTimeout(int i, int i2) {
        this.c.h(i, i2);
    }
}
