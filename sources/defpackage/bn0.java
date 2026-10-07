package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import one.me.background.wake.BackgroundCheckReceiver;
import one.me.background.wake.BackgroundListenService;

/* JADX INFO: loaded from: classes2.dex */
public final class bn0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ in0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn0(in0 in0Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = in0Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        in0 in0Var = this.h;
        switch (i) {
            case 0:
                bn0 bn0Var = new bn0(in0Var, lq4Var, 0);
                bn0Var.g = obj;
                return bn0Var;
            default:
                bn0 bn0Var2 = new bn0(in0Var, lq4Var, 1);
                bn0Var2.g = obj;
                return bn0Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((bn0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        a4c a4cVar;
        boolean z = false;
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.g;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    gm0.n("KeepBackground", "start handleForeground");
                    mz7 mz7Var = (mz7) this.h.f.getValue();
                    this.g = gu4Var;
                    this.f = 1;
                    obj = mz7Var.b(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                this.h.i = ((jz7) obj).c();
                in0 in0Var = this.h;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, "KeepBackground", zo5.s("handleForeground: check done, shouldRunInBackground=", in0Var.i), null);
                    }
                }
                in0.c(this.h, gu4Var, "handleForeground");
                Application application = this.h.a;
                ((AlarmManager) application.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(application, 0, new Intent(application, (Class<?>) BackgroundCheckReceiver.class), 201326592));
                gm0.n("KeepBackground", "cancelAlarm: cancelled");
                return sbi.a;
            default:
                je9 je9Var2 = je9.d;
                gu4 gu4Var2 = (gu4) this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    mz7 mz7Var2 = (mz7) this.h.f.getValue();
                    this.g = gu4Var2;
                    this.f = 1;
                    obj = mz7Var2.b(this);
                    if (obj == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                jz7 jz7Var = (jz7) obj;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    boolean z2 = jz7Var.a;
                    boolean z3 = jz7Var.b;
                    boolean zC = jz7Var.c();
                    StringBuilder sbB = zo5.B("reachabilityCheck: push=", z2, ", oneMe=", z3, ", shouldRun=");
                    sbB.append(zC);
                    a4cVar3.c(je9Var2, "KeepBackground", sbB.toString(), null);
                }
                this.h.i = jz7Var.c();
                if (jz7Var.c() && !this.h.d().e()) {
                    z = true;
                }
                in0 in0Var2 = this.h;
                try {
                    if (z) {
                        gm0.n("KeepBackground", "reachabilityCheck: ENTERING foreground");
                        sgg sggVar = in0Var2.k;
                        if (sggVar != null) {
                            sggVar.b(null);
                        }
                        ae9.k(((kn0) in0Var2.h.getValue()).a(), "BACKGROUND_MODE", "carpet_mode_on", null, 12);
                        int i3 = BackgroundListenService.c;
                        mu8.a(in0Var2.a);
                    } else {
                        gm0.n("KeepBackground", "reachabilityCheck: EXITING foreground (if active)");
                        in0.c(in0Var2, gu4Var2, "reachabilityCheck");
                    }
                    poeVar = sbi.a;
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null && (a4cVar = gm0.f) != null && a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, "KeepBackground", "Failed to start?(" + z + ") service: " + gm0.N(thA), null);
                }
                return new roe(poeVar);
        }
    }
}
