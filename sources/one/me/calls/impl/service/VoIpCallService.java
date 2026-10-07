package one.me.calls.impl.service;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import defpackage.a4c;
import defpackage.af7;
import defpackage.ai;
import defpackage.b2f;
import defpackage.b95;
import defpackage.be1;
import defpackage.c0a;
import defpackage.c95;
import defpackage.dz4;
import defpackage.g5c;
import defpackage.gm0;
import defpackage.gue;
import defpackage.ha9;
import defpackage.hi6;
import defpackage.ifh;
import defpackage.ii6;
import defpackage.j95;
import defpackage.je9;
import defpackage.jjf;
import defpackage.ki6;
import defpackage.mpl;
import defpackage.n02;
import defpackage.n0c;
import defpackage.ny8;
import defpackage.o02;
import defpackage.o0j;
import defpackage.ore;
import defpackage.pi6;
import defpackage.poe;
import defpackage.qv1;
import defpackage.roe;
import defpackage.rx8;
import defpackage.sbi;
import defpackage.taj;
import defpackage.u92;
import defpackage.wgl;
import defpackage.wmi;
import defpackage.wsc;
import defpackage.x02;
import defpackage.xhh;
import defpackage.y02;
import defpackage.yab;
import defpackage.zo5;
import kotlin.Metadata;
import one.me.calls.impl.service.VoIpCallService;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class VoIpCallService extends Service {
    public static final /* synthetic */ int g = 0;
    public final String a = VoIpCallService.class.getName();
    public final ny8 b = rx8.P(3, new o0j(6));
    public final ifh c;
    public final ifh d;
    public final o02 e;
    public int f;

    public VoIpCallService() {
        final int i = 0;
        this.c = new ifh(new af7(this) { // from class: saj
            public final /* synthetic */ VoIpCallService b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                VoIpCallService voIpCallService = this.b;
                switch (i2) {
                    case 0:
                        int i3 = VoIpCallService.g;
                        return ((ga2) voIpCallService.b.getValue()).b();
                    default:
                        int i4 = VoIpCallService.g;
                        return (c95) ((ga2) voIpCallService.b.getValue()).getAccessor().c(734);
                }
            }
        });
        final int i2 = 1;
        ifh ifhVar = new ifh(new af7(this) { // from class: saj
            public final /* synthetic */ VoIpCallService b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                VoIpCallService voIpCallService = this.b;
                switch (i3) {
                    case 0:
                        int i4 = VoIpCallService.g;
                        return ((ga2) voIpCallService.b.getValue()).b();
                    default:
                        int i5 = VoIpCallService.g;
                        return (c95) ((ga2) voIpCallService.b.getValue()).getAccessor().c(734);
                }
            }
        });
        this.d = ifhVar;
        this.e = new o02(this, ifhVar);
        this.f = -1;
    }

    public static final void a(VoIpCallService voIpCallService, int i, Notification notification, boolean z, boolean z2, boolean z3) {
        je9 je9Var = je9.d;
        try {
            int iD = voIpCallService.d(z3, z);
            String str = voIpCallService.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                Handler handler = b.b;
                a4cVar.c(je9Var, str, "start foreground with types: ".concat(a.d(iD)), null);
            }
            mpl.c(voIpCallService, i, notification, iD);
            if (Build.VERSION.SDK_INT >= 29) {
                String str2 = voIpCallService.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    Handler handler2 = b.b;
                    a4cVar2.c(je9Var, str2, "crosscheck types: ".concat(a.d(voIpCallService.getForegroundServiceType())), null);
                }
            }
            voIpCallService.b(i, notification, z2);
        } catch (Throwable th) {
            String str3 = voIpCallService.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str3, c0a.o("can't start foreground service due to ", th.getMessage(), ". Try with simple permissions."), th);
                }
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                mpl.c(voIpCallService, i, notification, i2 < 34 ? jjf.f : jjf.b);
                if (i2 >= 29) {
                    String str4 = voIpCallService.a;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                        Handler handler3 = b.b;
                        a4cVar4.c(je9Var, str4, "started with types: ".concat(a.d(voIpCallService.getForegroundServiceType())), null);
                    }
                }
                voIpCallService.b(i, notification, z2);
            } catch (Exception e) {
                VoIpCallServiceException voIpCallServiceException = new VoIpCallServiceException(qv1.m("can't start foreground service. isIncoming=", ".", z2), e);
                gm0.V(voIpCallService.a, voIpCallServiceException.getMessage(), voIpCallServiceException);
                voIpCallService.b(i, notification, z2);
            }
        }
    }

    public final void b(int i, Notification notification, boolean z) {
        boolean zH = e().h();
        ifh ifhVar = this.d;
        if (!zH) {
            ((c95) ifhVar.getValue()).c(i);
        }
        if (Build.VERSION.SDK_INT < 29 || !z) {
            return;
        }
        int foregroundServiceType = getForegroundServiceType();
        int i2 = jjf.a;
        if (foregroundServiceType == 0) {
            gm0.n(this.a, "start with none flag, show push around service.");
            ((c95) ifhVar.getValue()).g(i, notification);
        }
    }

    public final void c(int i) {
        if (d.d == null) {
            d.d = new Handler(Looper.getMainLooper());
        }
        Handler handler = d.d;
        if (handler != null) {
            handler.postDelayed(new ai(this, i, 23), 500L);
        } else {
            ore.p("Required value was null.");
        }
    }

    public final int d(boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT < 34) {
            return jjf.f;
        }
        x02 x02VarF = e().f();
        if (x02VarF == null) {
            x02VarF = (x02) e().i.a.getValue();
        }
        y02 y02VarP = e().p(x02VarF.s());
        int i = jjf.b;
        if (y02VarP == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallServiceTag", c0a.o("VoIpCallService getAvailableForegroundServiceType: no live session (id=", x02VarF.s(), "). Stop service."), null);
                    return i;
                }
            }
        } else if (z2 || ((gue) y02VarP.getAccessor().c(69)).e()) {
            if (((wsc) y02VarP.getAccessor().c(34)).c(wsc.i)) {
                i |= jjf.e;
            }
            if (((wsc) y02VarP.getAccessor().c(34)).c(wsc.n)) {
                i |= jjf.d;
            }
            return (y02VarP.l().c() || z) ? jjf.c | i : i;
        }
        return i;
    }

    public final b95 e() {
        return (b95) this.c.getValue();
    }

    public final void f(be1 be1Var, dz4 dz4Var, boolean z, boolean z2) {
        x02 x02VarF = e().f();
        if (x02VarF == null) {
            x02VarF = (x02) e().i.a.getValue();
        }
        x02 x02Var = x02VarF;
        y02 y02VarP = e().p(x02Var.s());
        if (y02VarP != null) {
            yab.i0((wmi) y02VarP.getAccessor().c(139), ((n0c) ((xhh) y02VarP.getAccessor().c(23))).c().S0(), 0, new taj(this, y02VarP, x02Var, dz4Var, be1Var, z2, z, null), 2);
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallServiceTag", c0a.o("VoIpCallService updateNotificationWithActiveState: no live session (id=", x02Var.s(), "). Stop service."), null);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        gm0.n(this.a, "VoIpCallService onCreate");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.i("VoIpCallService onDestroy(), localAccountId=", (ha9) this.e.f), null);
            }
        }
        this.e.j();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Object poeVar;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallServiceTag", zo5.h(i2, "onStartCommand, service startId="), null);
        }
        this.f = i2;
        x02 x02VarF = e().f();
        if (x02VarF == null) {
            x02VarF = (x02) e().i.a.getValue();
        }
        y02 y02VarP = e().p(x02VarF.s());
        if (y02VarP == null) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallServiceTag", c0a.o("VoIpCallService onStartCommand: no live session (id=", x02VarF.s(), "). Stop service."), null);
            }
            o02 o02Var = this.e;
            if (o02Var.b) {
                c(this.f);
                return 2;
            }
            try {
                mpl.c(this, 239, ((c95) this.d.getValue()).e(), Build.VERSION.SDK_INT < 34 ? jjf.f : jjf.b);
                o02Var.b = true;
                poeVar = sbi.a;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V("CallServiceTag", "stopWithForegroundGuarantee: startForeground failed", thA);
            }
            c(this.f);
            return 2;
        }
        this.e.f = new ha9(intent != null ? intent.getIntExtra("LOCAL_ACCOUNT_ID", 0) : 0);
        String str = this.a;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str, qv1.i("VoIpCallService onStartCommand, localAccountId=", (ha9) this.e.f), null);
        }
        o02 o02Var2 = this.e;
        u92 u92VarJ = y02VarP.j();
        if (!o02Var2.a) {
            o02Var2.a = true;
            ny8 ny8Var = u92VarJ.d;
            ((g5c) ny8Var.getValue()).p();
            ((g5c) ny8Var.getValue()).o();
        }
        this.e.i();
        dz4 dz4Var = (dz4) x02VarF.z().getValue();
        be1 be1Var = (be1) x02VarF.b().getValue();
        f(be1Var, dz4Var, false, false);
        if (!x02VarF.C()) {
            gm0.n(this.a, "VoIpCallService don't have active call. Stop service.");
            c(i2);
            return 2;
        }
        if (intent == null || wgl.b(intent) == n02.STOP) {
            gm0.n(this.a, "VoIpCallService finished.");
            c(i2);
            return 2;
        }
        if (wgl.b(intent) == n02.CALL) {
            gm0.n(this.a, "VoIpCallService start.");
            x02 x02VarF2 = e().f();
            if (x02VarF2 == null) {
                x02VarF2 = (x02) e().i.a.getValue();
            }
            y02 y02VarP2 = e().p(x02VarF2.s());
            if (y02VarP2 != null) {
                yab.i0((wmi) y02VarP2.getAccessor().c(139), ((n0c) ((xhh) y02VarP2.getAccessor().c(23))).c().S0(), 0, new b2f(this, y02VarP2, be1Var, dz4Var, x02VarF2, null, 10), 2);
                return 2;
            }
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "CallServiceTag", c0a.o("VoIpCallService showHiddenIncomingNotificationForeground: no live session (id=", x02VarF2.s(), "). Stop service."), null);
            }
            return 2;
        }
        pi6 pi6Var = dz4Var.q;
        if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) {
            gm0.n(this.a, "VoIpCallService finished due to call is failed or finished.");
            c(i2);
            return 2;
        }
        if (wgl.b(intent) == n02.RESTART_FOREGROUND) {
            gm0.n(this.a, "VoIpCallService restart.");
            f(be1Var, dz4Var, false, ((dz4) x02VarF.z().getValue()).g);
            return 2;
        }
        n02 n02VarB = wgl.b(intent);
        n02 n02Var = n02.RESTART_FOREGROUND_SCREENSHARING;
        String str2 = this.a;
        if (n02VarB != n02Var) {
            gm0.n(str2, "VoIpCallService simple start, no action.");
            return 2;
        }
        gm0.n(str2, "VoIpCallService restart for screen sharing.");
        f(be1Var, dz4Var, true, true);
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        boolean zIsEmpty = ((ActivityManager) getSystemService("activity")).getAppTasks().isEmpty();
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("onTaskRemoved: isLastTask=", zIsEmpty), null);
            }
        }
        x02 x02VarF = e().f();
        if (x02VarF == null) {
            x02VarF = (x02) e().i.a.getValue();
        }
        if (!zIsEmpty || x02VarF.C()) {
            return;
        }
        gm0.n(this.a, "VoIpCallService don't have active call. Stop service.");
        this.e.j();
        stopSelf();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/impl/service/VoIpCallService$VoIpCallServiceException;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VoIpCallServiceException extends IssueKeyException {
        public /* synthetic */ VoIpCallServiceException(String str, Throwable th, int i, j95 j95Var) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public VoIpCallServiceException(String str, Throwable th) {
            super("48866", str, th);
        }
    }
}
