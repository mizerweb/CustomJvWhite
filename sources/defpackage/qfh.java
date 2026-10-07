package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qfh implements qtb, md6 {
    public static final String j = n1g.Z("SystemFgDispatcher");
    public final oyj a;
    public final azj b;
    public final Object c = new Object();
    public iyj d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final jw8 h;
    public SystemForegroundService i;

    public qfh(Context context) {
        oyj oyjVarD = oyj.d(context);
        this.a = oyjVarD;
        this.b = oyjVarD.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new jw8(oyjVarD.j);
        oyjVarD.f.a(this);
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, iyj iyjVar, q77 q77Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", iyjVar.a);
        intent.putExtra("KEY_GENERATION", iyjVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", q77Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q77Var.b);
        intent.putExtra("KEY_NOTIFICATION", q77Var.c);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.md6
    public final void a(iyj iyjVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                vo8 vo8Var = ((mzj) this.f.remove(iyjVar)) != null ? (vo8) this.g.remove(iyjVar) : null;
                if (vo8Var != null) {
                    vo8Var.b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q77 q77Var = (q77) this.e.remove(iyjVar);
        if (iyjVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (iyj) entry.getKey();
                if (this.i != null) {
                    q77 q77Var2 = (q77) entry.getValue();
                    SystemForegroundService systemForegroundService = this.i;
                    int i = q77Var2.a;
                    int i2 = q77Var2.b;
                    Notification notification = q77Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        io.m(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        io.k(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.i.d.cancel(q77Var2.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.i;
        if (q77Var == null || systemForegroundService2 == null) {
            return;
        }
        n1g.x().p(j, "Removing Notification (id: " + q77Var.a + ", workSpecId: " + iyjVar + ", notificationType: " + q77Var.b);
        systemForegroundService2.d.cancel(q77Var.a);
    }

    @Override // defpackage.qtb
    public final void d(mzj mzjVar, og4 og4Var) {
        if (og4Var instanceof ng4) {
            String str = mzjVar.a;
            n1g.x().p(j, "Constraints unmet for WorkSpec " + str);
            iyj iyjVarN = wk8.n(mzjVar);
            int i = ((ng4) og4Var).a;
            oyj oyjVar = this.a;
            oyjVar.d.a(new eqg(oyjVar.f, new kig(iyjVarN), true, i));
        }
    }

    public final void f(Intent intent) {
        if (this.i == null) {
            ore.k("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        iyj iyjVar = new iyj(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n1g n1gVarX = n1g.x();
        StringBuilder sbA = nbh.A(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        sbA.append(intExtra2);
        sbA.append(")");
        n1gVarX.p(j, sbA.toString());
        if (notification == null) {
            ore.p("Notification passed in the intent was null.");
            return;
        }
        q77 q77Var = new q77(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(iyjVar, q77Var);
        q77 q77Var2 = (q77) linkedHashMap.get(this.d);
        if (q77Var2 == null) {
            this.d = iyjVar;
        } else {
            this.i.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((q77) ((Map.Entry) it.next()).getValue()).b;
                }
                q77Var = new q77(q77Var2.a, q77Var2.c, i);
            } else {
                q77Var = q77Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        int i2 = q77Var.a;
        int i3 = q77Var.b;
        Notification notification2 = q77Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            io.m(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            io.k(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void g() {
        this.i = null;
        synchronized (this.c) {
            try {
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((vo8) it.next()).b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ijd ijdVar = this.a.f;
        synchronized (ijdVar.k) {
            ijdVar.j.remove(this);
        }
    }

    public final void h(int i, int i2) {
        n1g.x().J(j, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.e.entrySet()) {
            if (((q77) entry.getValue()).b == i2) {
                iyj iyjVar = (iyj) entry.getKey();
                oyj oyjVar = this.a;
                oyjVar.d.a(new eqg(oyjVar.f, new kig(iyjVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            n1g.x().p(SystemForegroundService.e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
