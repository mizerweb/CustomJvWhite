package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import one.me.transparent.AppInitProvider;

/* JADX INFO: loaded from: classes.dex */
public final class qt extends h66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object poeVar;
        switch (this.a) {
            case 0:
                AppInitProvider appInitProvider = (AppInitProvider) this.b;
                String str = appInitProvider.a;
                try {
                    r7 r7Var = r7.a;
                    wtc wtcVar = new wtc(0, r7.d(ha9.b));
                    wtcVar.f();
                    gm0.n(str, "routerWrapper exists; run events observing");
                    Context context = appInitProvider.getContext();
                    if (context == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
                    wtcVar.h().i();
                    poeVar = sbi.a;
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        gm0.V(str, "fail", thA);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                break;
            default:
                boolean z = ((gue) this.b).f;
                if (!((gue) this.b).f) {
                    gm0.Y("gue", "set visible=true on onActivityResumed");
                    ((gue) this.b).f = true;
                }
                boolean z2 = ((gue) this.b).g;
                if (!((gue) this.b).g) {
                    gm0.Y("gue", "set screenOn=true on onActivityResumed");
                    ((gue) this.b).g = true;
                }
                if (z && z2) {
                    return;
                }
                gm0.Y("gue", "crutch! call onAppGoesForeground");
                ((gue) this.b).b();
                return;
        }
    }

    @Override // defpackage.h66, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                gue gueVar = (gue) this.b;
                gueVar.c++;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "gue", zo5.h(gueVar.c, "onActivityStarted, visibleActivitiesCount: "), null);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h66, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                gue gueVar = (gue) this.b;
                gueVar.c--;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "gue", "onActivityStopped, visibleActivitiesCount: " + gueVar.c + ", visible=" + gueVar.f + ", isScreenOn=" + gueVar.g, null);
                    }
                }
                if (((gue) this.b).f) {
                    gue gueVar2 = (gue) this.b;
                    if (gueVar2.c == 0) {
                        gueVar2.f = false;
                        if (((gue) this.b).g) {
                            ((gue) this.b).a();
                        }
                    }
                }
                break;
        }
    }
}
