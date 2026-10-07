package defpackage;

import android.app.Activity;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class hv7 implements sb5 {
    public static final /* synthetic */ zv8[] j;
    public final ny8 a;
    public final ny8 b;
    public final CallIncomingScreen c;
    public final b95 d;
    public final String e;
    public final k42 f;
    public final ny8 g;
    public final ny8 h;
    public final p3c i = qyj.S();

    static {
        z8b z8bVar = new z8b(hv7.class, "showNotificationJob", "getShowNotificationJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public hv7(ny8 ny8Var, ny8 ny8Var2, CallIncomingScreen callIncomingScreen, b95 b95Var, String str, k42 k42Var, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = callIncomingScreen;
        this.d = b95Var;
        this.e = str;
        this.f = k42Var;
        this.g = ny8Var3;
        this.h = ny8Var4;
    }

    @Override // defpackage.sb5
    public final void onDestroy(g19 g19Var) {
        this.i.B(this, j[0], null);
        g19Var.f().f(this);
    }

    @Override // defpackage.sb5
    public final void onPause(g19 g19Var) {
        this.d.r(this.e, false);
        if (!((wsc) this.a.getValue()).b.a()) {
            gm0.Y(hv7.class.getName(), "Early return in onPause cuz of !checkFullscreenIntentPermission()");
            return;
        }
        this.i.B(this, j[0], null);
        Activity activity = this.c.getActivity();
        if (activity != null) {
            ((m02) this.b.getValue()).a(activity, this.f);
        }
    }

    @Override // defpackage.sb5
    public final void onResume(g19 g19Var) {
        Object poeVar;
        boolean z = true;
        this.d.r(this.e, true);
        dz4 dz4Var = (dz4) ((x02) this.d.i.a.getValue()).z().getValue();
        Activity activity = this.c.getActivity();
        u92 u92Var = (u92) this.g.getValue();
        c95 c95Var = (c95) this.h.getValue();
        if (!((wsc) this.a.getValue()).b.a()) {
            gm0.Y(hv7.class.getName(), "Skip: fullscreen intent permission not granted");
            return;
        }
        if (!dz4Var.h || dz4Var.g) {
            gm0.n(hv7.class.getName(), "Skip: no active incoming call");
            return;
        }
        c95Var.getClass();
        try {
            StatusBarNotification[] activeNotifications = c95Var.f().b.getActiveNotifications();
            Iterable arrayList = activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
            if (!(arrayList instanceof Collection) || !((Collection) arrayList).isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                } while (((StatusBarNotification) it.next()).getId() != 240);
            } else {
                z = false;
                break;
            }
            poeVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallsNotificationRoot", zo5.r("Failed to get active notifs: ", thA), thA);
                }
            }
            poeVar = Boolean.FALSE;
        }
        if (!((Boolean) poeVar).booleanValue()) {
            gm0.n(hv7.class.getName(), "Skip: incoming notification is not visible");
        } else if (activity != null) {
            this.i.B(this, j[0], yab.i0(tre.d0(g19Var), null, 0, new gv7(u92Var, activity, this, dz4Var, c95Var, null, 0), 3));
        }
    }
}
