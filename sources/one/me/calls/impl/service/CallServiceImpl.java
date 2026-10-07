package one.me.calls.impl.service;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import defpackage.a4c;
import defpackage.ai;
import defpackage.b95;
import defpackage.bc1;
import defpackage.be1;
import defpackage.br1;
import defpackage.c0a;
import defpackage.c95;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.dz4;
import defpackage.e5d;
import defpackage.g5c;
import defpackage.gm0;
import defpackage.gu4;
import defpackage.gue;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.j95;
import defpackage.je9;
import defpackage.jjf;
import defpackage.llh;
import defpackage.mpl;
import defpackage.n0c;
import defpackage.nbh;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.ore;
import defpackage.p02;
import defpackage.phl;
import defpackage.poe;
import defpackage.q02;
import defpackage.qt1;
import defpackage.qv1;
import defpackage.r02;
import defpackage.re1;
import defpackage.roe;
import defpackage.s02;
import defpackage.sbi;
import defpackage.sgg;
import defpackage.u92;
import defpackage.ue1;
import defpackage.vd7;
import defpackage.wsc;
import defpackage.x02;
import defpackage.xhh;
import defpackage.y02;
import defpackage.yab;
import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class CallServiceImpl extends ConnectionService {
    public static final /* synthetic */ int i = 0;
    public PowerManager.WakeLock a;
    public boolean d;
    public long e;
    public sgg h;
    public final ifh b = new ifh(new br1(22));
    public final ifh c = new ifh(new br1(23));
    public int f = -1;
    public final ifh g = new ifh(new br1(24));

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(CallServiceImpl callServiceImpl, y02 y02Var, String str, dz4 dz4Var, be1 be1Var, nq4 nq4Var) {
        s02 s02Var;
        CallServiceImpl callServiceImpl2;
        if (nq4Var instanceof s02) {
            s02Var = (s02) nq4Var;
            int i2 = s02Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s02Var.g = i2 - Integer.MIN_VALUE;
            } else {
                s02Var = new s02(callServiceImpl, nq4Var);
            }
        } else {
            s02Var = new s02(callServiceImpl, nq4Var);
        }
        s02 s02Var2 = s02Var;
        Object objJ = s02Var2.e;
        hu4 hu4Var = hu4.a;
        int i3 = s02Var2.g;
        if (i3 == 0) {
            ch3.d0(objJ);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallServiceTag", qv1.i("CallService show hidden incoming notification, localAccountId=", y02Var.i()), null);
                }
            }
            u92 u92VarJ = y02Var.j();
            phl phlVar = dz4Var.a;
            boolean zB = phlVar != null ? phlVar.b() : false;
            s02Var2.d = y02Var;
            s02Var2.g = 1;
            objJ = u92VarJ.j(callServiceImpl, be1Var, zB, str, s02Var2);
            callServiceImpl2 = callServiceImpl;
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02Var = s02Var2.d;
            ch3.d0(objJ);
            callServiceImpl2 = callServiceImpl;
        }
        callServiceImpl2.m(y02Var, 240, (Notification) objJ, true, false, false);
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        if (r2 == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        if (r0 == r9) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(one.me.calls.impl.service.CallServiceImpl r18, defpackage.y02 r19, java.lang.String r20, defpackage.dz4 r21, defpackage.be1 r22, boolean r23, boolean r24, boolean r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.impl.service.CallServiceImpl.b(one.me.calls.impl.service.CallServiceImpl, y02, java.lang.String, dz4, be1, boolean, boolean, boolean, nq4):java.lang.Object");
    }

    public static int h(y02 y02Var, boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT < 34) {
            gm0.n("CallServiceTag", "Low API version, start with simple flag.");
            return jjf.f;
        }
        int i2 = jjf.b;
        if (!z2 && !((gue) y02Var.getAccessor().c(69)).e()) {
            gm0.n("CallServiceTag", "App in background, start with simple flag.");
            return i2;
        }
        if (((wsc) y02Var.getAccessor().c(34)).c(wsc.i)) {
            i2 |= jjf.e;
        }
        if (((wsc) y02Var.getAccessor().c(34)).c(wsc.n)) {
            i2 |= jjf.d;
        }
        return (y02Var.l().c() || z) ? jjf.c | i2 : i2;
    }

    public final void c() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", zo5.s("cleanup(), channelsPrepared = ", this.d), null);
            }
        }
        if (this.d) {
            ((c95) this.c.getValue()).b();
            this.d = false;
        }
        this.e = 0L;
        n();
    }

    public final void d(y02 y02Var) {
        if (this.d) {
            return;
        }
        this.d = true;
        ny8 ny8Var = y02Var.j().d;
        ((g5c) ny8Var.getValue()).p();
        ((g5c) ny8Var.getValue()).o();
    }

    public final void e(int i2, Notification notification, boolean z) {
        boolean zH = i().h();
        ifh ifhVar = this.c;
        if (!zH) {
            ((c95) ifhVar.getValue()).c(i2);
        }
        if (Build.VERSION.SDK_INT < 29 || !z) {
            return;
        }
        int foregroundServiceType = getForegroundServiceType();
        int i3 = jjf.a;
        if (foregroundServiceType == 0) {
            gm0.n("CallServiceTag", "CallService start with none flag, show push around service.");
            ((c95) ifhVar.getValue()).g(i2, notification);
        }
    }

    public final void f(int i2, long j) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", nbh.s(j, "finishService, delay=", "ms"), null);
            }
        }
        Handler handler = b.b;
        a.e().postDelayed(new ai(i2, this, 4), j);
    }

    public final void g(y02 y02Var, dz4 dz4Var, be1 be1Var) {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallServiceTag", zo5.j(this.e, "finishServiceWithForegroundGuarantee. "), null);
        }
        if (!j()) {
            gm0.n("CallServiceTag", "CallService promote to foreground with temp notification before finish.");
            l(y02Var, dz4Var, be1Var, false, false);
            this.e = SystemClock.elapsedRealtime();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallServiceTag", zo5.j(this.e, "Set promoted time from finishServiceWithForegroundGuarantee "), null);
            }
            f(this.f, 500L);
            return;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, "CallServiceTag", zo5.j(this.e, "simple stop. "), null);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        int i2 = this.f;
        long j = 500 - jElapsedRealtime;
        if (j < 0) {
            j = 0;
        }
        f(i2, j);
    }

    public final b95 i() {
        return (b95) this.b.getValue();
    }

    public final boolean j() {
        if (Build.VERSION.SDK_INT < 29) {
            return this.e != 0;
        }
        int foregroundServiceType = getForegroundServiceType();
        int i2 = jjf.a;
        return foregroundServiceType != 0;
    }

    public final void k(y02 y02Var, cf7 cf7Var) {
        this.h = yab.i0((gu4) this.g.getValue(), ((n0c) ((xhh) y02Var.getAccessor().c(23))).c().S0(), 0, new qt1(this.h, cf7Var, null, 5), 2);
    }

    public final void l(y02 y02Var, dz4 dz4Var, be1 be1Var, boolean z, boolean z2) {
        u92 u92VarJ = y02Var.j();
        phl phlVar = dz4Var.a;
        m(y02Var, 239, u92VarJ.d(this, be1Var, phlVar != null ? phlVar.b() : false, dz4Var.h), true, z, z2);
    }

    public final void m(y02 y02Var, int i2, Notification notification, boolean z, boolean z2, boolean z3) {
        a4c a4cVar;
        a4c a4cVar2;
        je9 je9Var = je9.d;
        try {
            int iH = h(y02Var, z2, z3);
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                Handler handler = b.b;
                a4cVar3.c(je9Var, "CallServiceTag", "CallService start foreground with particular types: ".concat(a.d(iH)), null);
            }
            mpl.c(this, i2, notification, iH);
            if (Build.VERSION.SDK_INT >= 29 && (a4cVar2 = gm0.f) != null && a4cVar2.b(je9Var)) {
                Handler handler2 = b.b;
                a4cVar2.c(je9Var, "CallServiceTag", "CallService crosscheck types: ".concat(a.d(getForegroundServiceType())), null);
            }
            e(i2, notification, z);
        } catch (Throwable th) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, "CallServiceTag", c0a.o("CallService can't start foreground service due to ", th.getMessage(), ". Try to start with simple permissions."), th);
                }
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                mpl.c(this, i2, notification, i3 < 34 ? jjf.f : jjf.b);
                if (i3 >= 29 && (a4cVar = gm0.f) != null && a4cVar.b(je9Var)) {
                    Handler handler3 = b.b;
                    a4cVar.c(je9Var, "CallServiceTag", "CallService started with types: ".concat(a.d(getForegroundServiceType())), null);
                }
                e(i2, notification, z);
            } catch (Exception e) {
                CallServiceException callServiceException = new CallServiceException(qv1.m("CallService can't start foreground service. Try show usual notification isIncoming=", ".", z), e);
                gm0.V("CallServiceTag", callServiceException.getMessage(), callServiceException);
                e(i2, notification, z);
            }
        }
    }

    public final void n() {
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock != null && wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.a;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            gm0.n("CallServiceTag", "cpu wake lock stop");
        }
        this.a = null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        gm0.n("CallServiceTag", "CallService onCreate");
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        je9 je9Var = je9.d;
        gm0.n("CallServiceTag", "onCreateIncomingConnection");
        Bundle extras = connectionRequest != null ? connectionRequest.getExtras() : null;
        String string2 = extras != null ? extras.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string2 == null) {
            string2 = "";
        }
        String str = string2;
        y02 y02VarP = i().p(str);
        if (y02VarP == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, "CallServiceTag", c0a.o("onCreateIncomingConnection: no live session (id=", str, ")"), null);
                }
            }
            return null;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallServiceTag", qv1.i("onCreateIncomingConnection(), localAccountId=", y02VarP.i()), null);
        }
        llh llhVar = (llh) ((e5d) ((ifh) y02VarP.k()).getValue()).s().i();
        boolean z = llhVar.a;
        re1 re1Var = new re1(y02VarP.h(), str, z);
        if (!y02VarP.h().j(re1Var)) {
            gm0.n("CallServiceTag", "connection destroyed before fully initialized");
            return null;
        }
        if (z) {
            re1Var.setInitialized();
            re1Var.setAddress(connectionRequest != null ? connectionRequest.getAddress() : null, 1);
            if (llhVar.g && extras != null && (string = extras.getString("extra.DISPLAY_NAME")) != null) {
                re1Var.setCallerDisplayName(string, 1);
            }
            re1Var.setRinging();
            if (llhVar.g) {
                y02VarP.h().l();
            }
        }
        if (!cqk.d(((x02) i().i.a.getValue()).s(), str)) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallServiceTag", c0a.o("onCreateIncomingConnection: parallel session=", str, ", manager shows notification"), null);
            }
            return re1Var;
        }
        x02 x02VarI = i().i(str);
        if (x02VarI == null) {
            x02VarI = (x02) i().i.a.getValue();
        }
        try {
            k(y02VarP, new q02(this, y02VarP, str, (dz4) x02VarI.z().getValue(), (be1) x02VarI.b().getValue(), null, 0));
            return re1Var;
        } catch (Exception e) {
            gm0.V("CallServiceTag", "onCreateIncomingConnection: startForeground failed", e);
            return re1Var;
        }
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        ue1 ue1VarH;
        CallServiceException callServiceException = new CallServiceException("onCreateIncomingConnectionFailed: Cannon create incoming telecom connection", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        gm0.V("CallServiceTag", callServiceException.getMessage(), callServiceException);
        Bundle extras = connectionRequest != null ? connectionRequest.getExtras() : null;
        String string = extras != null ? extras.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string == null) {
            string = "";
        }
        y02 y02VarP = i().p(string);
        if (y02VarP != null && (ue1VarH = y02VarP.h()) != null) {
            ue1VarH.k(string);
        }
        c();
        stopSelf(this.f);
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        Bundle bundle;
        gm0.n("CallServiceTag", "onCreateOutgoingConnection");
        Bundle extras = connectionRequest != null ? connectionRequest.getExtras() : null;
        if (extras != null && (bundle = extras.getBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS")) != null) {
            if (!bundle.containsKey("one.me.calls.telecom.EXTRA_SESSION_ID")) {
                bundle = null;
            }
            if (bundle != null) {
                extras = bundle;
            }
        }
        String string2 = extras != null ? extras.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string2 == null) {
            string2 = "";
        }
        String str = string2;
        y02 y02VarP = i().p(str);
        if (y02VarP == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallServiceTag", c0a.o("onCreateOutgoingConnection: no live session (id=", str, ")"), null);
                }
            }
            return null;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, "CallServiceTag", qv1.i("onCreateOutgoingConnection(), localAccountId=", y02VarP.i()), null);
            }
        }
        llh llhVar = (llh) ((e5d) ((ifh) y02VarP.k()).getValue()).s().i();
        boolean z = llhVar.a;
        re1 re1Var = new re1(y02VarP.h(), str, z);
        if (!y02VarP.h().j(re1Var)) {
            gm0.n("CallServiceTag", "connection destroyed before fully initialized");
            return null;
        }
        if (z) {
            re1Var.setInitialized();
            re1Var.setAddress(connectionRequest != null ? connectionRequest.getAddress() : null, 1);
            if (llhVar.g && extras != null && (string = extras.getString("extra.DISPLAY_NAME")) != null) {
                re1Var.setCallerDisplayName(string, 1);
            }
            re1Var.setDialing();
            if (llhVar.g) {
                y02VarP.h().l();
            }
        }
        x02 x02VarI = i().i(str);
        if (x02VarI == null) {
            x02VarI = (x02) i().i.a.getValue();
        }
        try {
            k(y02VarP, new q02(this, y02VarP, str, (dz4) x02VarI.z().getValue(), (be1) x02VarI.b().getValue(), null, 1));
            return re1Var;
        } catch (Exception e) {
            gm0.V("CallServiceTag", "onCreateOutgoingConnection: startForeground failed", e);
            return re1Var;
        }
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        ue1 ue1VarH;
        Bundle bundle;
        Bundle extras = connectionRequest != null ? connectionRequest.getExtras() : null;
        if (extras != null && (bundle = extras.getBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS")) != null) {
            if (!bundle.containsKey("one.me.calls.telecom.EXTRA_SESSION_ID")) {
                bundle = null;
            }
            if (bundle != null) {
                extras = bundle;
            }
        }
        String string = extras != null ? extras.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string == null) {
            string = "";
        }
        y02 y02VarP = i().p(string);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", qv1.i("onCreateOutgoingConnectionFailed(), localAccountId=", y02VarP != null ? y02VarP.i() : null), null);
            }
        }
        if (y02VarP != null && (ue1VarH = y02VarP.h()) != null) {
            ue1VarH.k(string);
        }
        c();
        stopSelf(this.f);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        gm0.n("CallServiceTag", "service call onDestroy()");
        c();
        vd7.f(((gu4) this.g.getValue()).k(), null);
        this.h = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        Object poeVar;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallServiceTag", zo5.h(i3, "onStartCommand, service startId="), null);
        }
        this.f = i3;
        x02 x02VarF = i().f();
        if (x02VarF == null) {
            x02VarF = (x02) i().i.a.getValue();
        }
        y02 y02VarP = i().p(x02VarF.s());
        if (y02VarP == null) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallServiceTag", c0a.o("CallService onStartCommand: no live session (id=", x02VarF.s(), "). Stop service."), null);
            }
            boolean zJ = j();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallServiceTag", bc1.l(this.e, "stopWithForegroundGuarantee with time = ", ", isForeground = ", zJ), null);
            }
            if (zJ) {
                f(this.f, 500L);
                return 2;
            }
            try {
                mpl.c(this, 239, ((c95) this.c.getValue()).e(), Build.VERSION.SDK_INT < 34 ? jjf.f : jjf.b);
                this.e = SystemClock.elapsedRealtime();
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, "CallServiceTag", "Set promoted time from stopWithForegroundGuarantee " + this.e, null);
                }
                poeVar = sbi.a;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V("CallServiceTag", "stopWithForegroundGuarantee: startForeground failed", thA);
            }
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, "CallServiceTag", "stop with stub foreground", null);
            }
            f(this.f, 500L);
            return 2;
        }
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            a4cVar6.c(je9Var, "CallServiceTag", qv1.i("CallService onStartCommand, localAccountId=", y02VarP.i()), null);
        }
        n();
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "max:calls_prx");
        wakeLockNewWakeLock.acquire();
        this.a = wakeLockNewWakeLock;
        dz4 dz4Var = (dz4) x02VarF.z().getValue();
        be1 be1Var = (be1) x02VarF.b().getValue();
        boolean z = x02VarF.C() && dz4Var.g;
        if (!x02VarF.C()) {
            gm0.n("CallServiceTag", "CallService don't have active call. Stop service.");
            d(y02VarP);
            if (((Boolean) ((e5d) ((ifh) y02VarP.k()).getValue()).H6.a(e5d.S6[400]).i()).booleanValue()) {
                g(y02VarP, dz4Var, be1Var);
                return 2;
            }
            l(y02VarP, dz4Var, be1Var, false, false);
            f(this.f, 500L);
            return 2;
        }
        if ((intent == null || p02.f.get(intent.getIntExtra("ACTION", 0)) == p02.b) && ((Boolean) ((e5d) ((ifh) y02VarP.k()).getValue()).H6.a(e5d.S6[400]).i()).booleanValue()) {
            gm0.n("CallServiceTag", "CallService stop requested. Stop service.");
            d(y02VarP);
            g(y02VarP, dz4Var, be1Var);
            return 2;
        }
        String strS = x02VarF.s();
        if (!j() && ((Boolean) ((e5d) ((ifh) y02VarP.k()).getValue()).H6.a(e5d.S6[400]).i()).booleanValue()) {
            gm0.n("CallServiceTag", "CallService promote to foreground with temp notification.");
            d(y02VarP);
            l(y02VarP, dz4Var, be1Var, false, z);
            this.e = SystemClock.elapsedRealtime();
            a4c a4cVar7 = gm0.f;
            if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                a4cVar7.c(je9Var, "CallServiceTag", zo5.j(this.e, "Set promoted time from promoteToForegroundIfNeeded "), null);
            }
            y02VarP.h().m(strS);
        }
        k(y02VarP, new r02(this, y02VarP, x02VarF, dz4Var, be1Var, z, intent, i3, null));
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        boolean zIsEmpty = ((ActivityManager) getSystemService("activity")).getAppTasks().isEmpty();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", zo5.s("onTaskRemoved: isLastTask=", zIsEmpty), null);
            }
        }
        if (zIsEmpty) {
            x02 x02VarF = i().f();
            if (x02VarF == null || !x02VarF.C()) {
                gm0.n("CallServiceTag", "CallService don't have active call. Stop service.");
                c();
                stopSelf(this.f);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/impl/service/CallServiceImpl$CallServiceException;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CallServiceException extends IssueKeyException {
        public /* synthetic */ CallServiceException(String str, Throwable th, int i, j95 j95Var) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public CallServiceException(String str, Throwable th) {
            super("44746", str, th);
        }
    }
}
