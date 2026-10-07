package defpackage;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Process;
import android.util.Rational;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ym1 implements g32 {
    public sgg A;
    public wu7 B;
    public Integer C;
    public final mjg D;
    public final ua7 E;
    public final ny8 F;
    public final ny8 G;
    public final vq4 H;
    public final yf2 I;
    public final tm1 J;
    public final k42 a;
    public final hk6 b;
    public final zb1 c;
    public final l92 d;
    public final ny8 e;
    public final ha9 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public MainActivity n;
    public final ny8 o;
    public boolean q;
    public final ny8 s;
    public Drawable t;
    public boolean u;
    public final dq4 v;
    public sgg w;
    public sgg x;
    public pm1 y;
    public sgg z;
    public final y0d p = new y0d();
    public final AtomicBoolean r = new AtomicBoolean(false);

    public ym1(k42 k42Var, hk6 hk6Var, zb1 zb1Var, l92 l92Var, rd1 rd1Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ha9 ha9Var) {
        this.a = k42Var;
        this.b = hk6Var;
        this.c = zb1Var;
        this.d = l92Var;
        this.e = ny8Var5;
        this.f = ha9Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        this.l = ny8Var9;
        final int i = 2;
        this.m = rx8.P(3, new af7(this) { // from class: mm1
            public final /* synthetic */ ym1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ym1 ym1Var = this.b;
                switch (i2) {
                    case 0:
                        return new rm1(ym1Var);
                    case 1:
                        return new sm1(ym1Var);
                    default:
                        return new sy1(ym1Var, ym1Var.a);
                }
            }
        });
        this.o = ny8Var;
        final int i2 = 0;
        ny8 ny8VarP = rx8.P(3, new b6(19));
        this.s = ny8VarP;
        this.t = (ColorDrawable) ny8VarP.getValue();
        this.v = cqk.a(((n0c) ((xhh) ny8Var4.getValue())).c());
        this.D = p90.a(Boolean.FALSE);
        this.E = new ua7(2, this);
        this.F = rx8.P(3, new af7(this) { // from class: mm1
            public final /* synthetic */ ym1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ym1 ym1Var = this.b;
                switch (i3) {
                    case 0:
                        return new rm1(ym1Var);
                    case 1:
                        return new sm1(ym1Var);
                    default:
                        return new sy1(ym1Var, ym1Var.a);
                }
            }
        });
        final int i3 = 1;
        this.G = rx8.P(3, new af7(this) { // from class: mm1
            public final /* synthetic */ ym1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ym1 ym1Var = this.b;
                switch (i4) {
                    case 0:
                        return new rm1(ym1Var);
                    case 1:
                        return new sm1(ym1Var);
                    default:
                        return new sy1(ym1Var, ym1Var.a);
                }
            }
        });
        this.H = new vq4(i3, this);
        this.I = new yf2(rd1Var, new p3c(5, this));
        this.J = new tm1(this);
    }

    public static void m(ym1 ym1Var) {
        ym1Var.u = false;
        ym1Var.b.d();
        ym1Var.H.f(false);
    }

    public final void A(boolean z) {
        MainActivity mainActivity = this.n;
        if (mainActivity == null) {
            gm0.Y(ym1.class.getName(), "Early return in updateActivityViewCorners cuz of activity is null");
        } else if (!z) {
            mainActivity.getWindow().setBackgroundDrawable(this.t);
        } else {
            this.t = mainActivity.getWindow().getDecorView().getBackground();
            mainActivity.getWindow().setBackgroundDrawable((ColorDrawable) this.s.getValue());
        }
    }

    public final void a() {
        lve lveVar;
        br4 br4Var;
        br4 parentController;
        MainActivity mainActivity = this.n;
        if (mainActivity == null || this.r.getAndSet(true)) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "PipAppController", zo5.s("applyPipEnteredSideEffects: currentPipScreenTag=", h().g(":call-pip") != null), null);
            }
        }
        mjg mjgVar = this.D;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        w();
        A(true);
        lve lveVar2 = (lve) ww3.D1(h().e());
        hve router = (lveVar2 == null || (br4Var = lveVar2.a) == null || (parentController = br4Var.getParentController()) == null) ? null : parentController.getRouter();
        br4 br4Var2 = (router == null || (lveVar = (lve) ww3.D1(router.e())) == null) ? null : lveVar.a;
        BottomSheetWidget bottomSheetWidget = br4Var2 instanceof BottomSheetWidget ? (BottomSheetWidget) br4Var2 : null;
        if (bottomSheetWidget != null) {
            gm0.n("PipAppController", "hide last bottom sheet dialog before pip mode");
            bottomSheetWidget.v1(true);
        }
        if (h().g(":call-pip") == null) {
            o65.c(kk9.b.b(), ":call-pip", null, null, 6);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action-microphone-state");
        if (!this.q) {
            np4.z(mainActivity.getApplicationContext(), this.p, intentFilter, null, null, 4);
            this.q = true;
        }
        this.I.b();
    }

    public final sy1 e() {
        return (sy1) this.m.getValue();
    }

    public final boolean f() {
        return ((n42) this.a).c().C();
    }

    public final boolean g() {
        return ((f62) ((n42) this.a).f.a.getValue()).b;
    }

    public final hve h() {
        return ((c1c) this.e.getValue()).c().w1();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005d A[PHI: r6
  0x005d: PHI (r6v3 android.app.RemoteAction) = (r6v1 android.app.RemoteAction), (r6v4 android.app.RemoteAction) binds: [B:18:0x009f, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    public final PictureInPictureParams i(boolean z) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        c79 c79VarW = yab.w();
        zb1 zb1Var = this.c;
        boolean zC = ((ac1) zb1Var).c();
        MainActivity mainActivity = this.n;
        ny8 ny8Var = this.i;
        RemoteAction remoteAction = null;
        k42 k42Var = this.a;
        if (zC) {
            if (mainActivity != null) {
                Icon iconCreateWithResource = Icon.createWithResource(mainActivity, R.drawable.ic_pip_mic_none_24);
                String string = mainActivity.getString(R.string.call_microphone_enabled_accessibility);
                String string2 = mainActivity.getString(R.string.call_microphone_enabled_accessibility);
                so1 so1Var = (so1) ny8Var.getValue();
                ((ac1) zb1Var).c();
                PendingIntent pendingIntentD = so1Var.d(((f62) ((n42) k42Var).f.a.getValue()).h);
                if (pendingIntentD == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                remoteAction = new RemoteAction(iconCreateWithResource, string, string2, pendingIntentD);
            }
            if (remoteAction != null) {
                c79VarW.add(remoteAction);
            }
        } else {
            if (mainActivity != null) {
                Icon iconCreateWithResource2 = Icon.createWithResource(mainActivity, R.drawable.ic_pip_mic_off_24);
                String string3 = mainActivity.getString(R.string.call_microphone_disabled_accessibility);
                String string4 = mainActivity.getString(R.string.call_microphone_disabled_accessibility);
                so1 so1Var2 = (so1) ny8Var.getValue();
                ((ac1) zb1Var).c();
                PendingIntent pendingIntentD2 = so1Var2.d(((f62) ((n42) k42Var).f.a.getValue()).h);
                if (pendingIntentD2 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                remoteAction = new RemoteAction(iconCreateWithResource2, string3, string4, pendingIntentD2);
            }
            if (remoteAction != null) {
                c79VarW.add(remoteAction);
            }
        }
        PictureInPictureParams.Builder aspectRatio = builder.setActions(yab.j(c79VarW)).setAspectRatio(Rational.parseRational("2:3"));
        if (Build.VERSION.SDK_INT >= 31) {
            aspectRatio.setAutoEnterEnabled(z);
        }
        return aspectRatio.build();
    }

    public final RootController k() {
        return ((c1c) this.e.getValue()).c();
    }

    public final boolean l() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        MainActivity mainActivity = this.n;
        if (mainActivity != null) {
            try {
                if (((AppOpsManager) mainActivity.getSystemService(AppOpsManager.class)).unsafeCheckOp("android:picture_in_picture", Process.myUid(), mainActivity.getPackageName()) == 0) {
                    return true;
                }
            } catch (SecurityException unused) {
                gm0.n("PipAppController", "Can't check pip permission state in settings.");
                return false;
            }
        }
        return false;
    }

    public final void o(boolean z) {
        RootController rootControllerK = k();
        if (rootControllerK.getActivity() != null) {
            if (lvb.w0(rootControllerK.getContext()).a()) {
                z = true;
            }
            if (!rootControllerK.y1().o()) {
                gm0.n("RootController", "hideTopController call indicator wasn't init");
            } else if (RootController.o1(rootControllerK, rootControllerK.z1())) {
                gm0.n("RootController", "hideTopController hide call indicator force=" + z);
                rootControllerK.r1(false, z, null);
            } else {
                RootController.p1(rootControllerK, false);
                gm0.n("RootController", "hideTopController call indicator already hidden force=" + z);
            }
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "PipAppController", zo5.s("try to hide call indicator hasCall=", f()), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) throws Throwable {
        super.onDestroyed(conversationDestroyedInfo);
        this.H.f(false);
        this.I.b();
        ConversationEndReason reason = conversationDestroyedInfo.getReason();
        if ((reason instanceof ConversationEndReason.Hangup) || (reason instanceof ConversationEndReason.EndedForAll)) {
            yab.A0(k66.a, new sfd(this, (lq4) null, 29));
        }
    }

    public final void p() {
        Boolean bool = Boolean.FALSE;
        mjg mjgVar = this.D;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        MainActivity mainActivity = this.n;
        if (mainActivity == null) {
            return;
        }
        gm0.n("PipAppController", "hide global pip");
        this.r.set(false);
        if (this.q) {
            mainActivity.getApplicationContext().unregisterReceiver(this.p);
            this.q = false;
        }
        A(false);
        hve hveVarH = h();
        lve lveVar = (lve) ww3.D1(hveVarH.e());
        if (!cqk.d(lveVar != null ? lveVar.b : null, ":call-pip")) {
            gm0.n("PipAppController", "last screen wasn't pip, skip navigation to call.");
        } else if (g() && !m92.a(hveVarH)) {
            gm0.n("PipAppController", "open active call after pip mode.");
            kk9.m(kk9.b, null, false, null, ((f62) ((n42) this.a).f.a.getValue()).h, 7);
        }
        br4 br4VarG = hveVarH.g(":call-pip");
        if (br4VarG != null) {
            hveVarH.C(br4VarG);
            if (hveVarH.o()) {
                return;
            }
            mainActivity.finish();
        }
    }

    public final boolean q() {
        return ((Boolean) ((e5d) this.l.getValue()).E6.a(e5d.S6[397]).i()).booleanValue();
    }

    public final void t() {
        MainActivity mainActivity = this.n;
        if (mainActivity == null) {
            gm0.Y(ym1.class.getName(), "Early return in preparePip cuz of activity is null");
        } else if (!g()) {
            gm0.n("PipAppController", "Early return in preparePip cuz call is not active yet");
        } else {
            this.b.e(mainActivity, h());
        }
    }

    public final void v() {
        WindowManager windowManager;
        wu7 wu7Var = this.B;
        if (wu7Var != null) {
            Object poeVar = null;
            this.B = null;
            try {
                MainActivity mainActivity = this.n;
                if (mainActivity != null && (windowManager = mainActivity.getWindowManager()) != null) {
                    windowManager.removeView(wu7Var);
                    poeVar = sbi.a;
                }
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V("PipAppController", "can't remove held call banner", thA);
            }
        }
    }

    public final void w() {
        wu7 wu7Var = this.B;
        if (wu7Var == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = wu7Var.getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            this.C = Integer.valueOf(layoutParams2.y);
        }
        v();
    }

    public final void x() {
        MainActivity mainActivity = this.n;
        if (mainActivity == null) {
            gm0.Y(ym1.class.getName(), "Early return in showFakePip cuz of activity is null");
            return;
        }
        if (this.u) {
            hve hveVarH = h();
            hk6 hk6Var = this.b;
            hk6Var.getClass();
            gm0.n("FakePipController", "try to show local pip");
            ev1 ev1Var = hk6Var.i;
            if (cqk.c(ev1Var != null ? Float.valueOf(ev1Var.getAlpha()) : null, 1.0f) && isk.g(ev1Var)) {
                gm0.n("FakePipController", "local pip already in show progress");
            } else {
                hk6Var.e(mainActivity, hveVarH);
                if (ev1Var != null) {
                    ev1Var.setVisibility(8);
                }
                okg okgVar = (okg) hk6Var.b.getValue();
                String strA = ns4.a(((f62) ((n42) ((k42) hk6Var.f.getValue())).f.a.getValue()).i);
                mjg mjgVar = okgVar.a;
                Object value = mjgVar.getValue();
                nkg nkgVar = nkg.b;
                if (value != nkgVar) {
                    okgVar.a(strA, true);
                }
                mjgVar.j(null, nkgVar);
                if (ev1Var != null) {
                    isk.d(ev1Var, true, 0L, null, 4);
                }
            }
            this.H.f(h().a.a.size() < 2);
        }
    }

    public final void y(boolean z) {
        boolean zF = f();
        lve lveVar = (lve) ww3.D1(h().e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        boolean z2 = (br4Var instanceof chb) || br4Var == null;
        boolean z3 = !z2;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "PipAppController", qt4.o("try to show call indicator hasCall=", zF, " canShow=", z3, "."), null);
            }
        }
        if (!z2 && zF) {
            sgg sggVar = this.w;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.w = null;
            RootController rootControllerK = k();
            CallIndicatorWidget callIndicatorWidget = new CallIndicatorWidget(this.f);
            if (lvb.w0(rootControllerK.getContext()).a()) {
                z = true;
            }
            if (rootControllerK.y1().o() && RootController.o1(rootControllerK, rootControllerK.z1())) {
                RootController.p1(rootControllerK, true);
                gm0.n("RootController", "showTopController call indicator already shown.");
            } else {
                gm0.n("RootController", "showTopController show call indicator force=" + z + ".");
                rootControllerK.r1(true, z, callIndicatorWidget);
            }
        }
        if (zF) {
            return;
        }
        sgg sggVar2 = this.w;
        if (sggVar2 == null || !sggVar2.isActive()) {
            gm0.n("PipAppController", "can't show indicator due to call is absent, try to force close indicator.");
            o(true);
        }
    }

    public final void z(boolean z) {
        Integer numValueOf;
        ActivityManager.RecentTaskInfo taskInfo;
        MainActivity mainActivity = this.n;
        if (mainActivity == null) {
            return;
        }
        if (((KeyguardManager) mainActivity.getSystemService("keyguard")).isDeviceLocked()) {
            gm0.n("PipAppController", "can't show global pip due to device is locked");
            return;
        }
        MainActivity mainActivity2 = this.n;
        boolean z2 = false;
        if (!(mainActivity2 == null ? false : mainActivity2.getPackageManager().hasSystemFeature("android.software.picture_in_picture"))) {
            gm0.n("PipAppController", "pip mode doesn't supported on current device");
            return;
        }
        if (!l()) {
            gm0.n("PipAppController", "doesn't have PIP permission.");
            return;
        }
        ActivityManager activityManager = (ActivityManager) mainActivity.getSystemService("activity");
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : appTasks) {
            if (((ActivityManager.AppTask) obj).getTaskInfo().numActivities > 0) {
                arrayList.add(obj);
            }
        }
        boolean z3 = arrayList.size() == 1 && ((ActivityManager.AppTask) ww3.r1(arrayList)).getTaskInfo().numActivities == 1;
        lve lveVar = (lve) ww3.D1(h().e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        if ((br4Var instanceof chb) || br4Var == null) {
            if (e().a() && g()) {
                z2 = true;
            }
            this.u = z2;
        }
        if (z3 && this.u) {
            gm0.n("PipAppController", "start show global pip");
            if (q() && z && Build.VERSION.SDK_INT >= 31) {
                return;
            }
            a();
            try {
                mainActivity.enterPictureInPictureMode(i(q()));
                return;
            } catch (IllegalStateException e) {
                gm0.V(ym1.class.getName(), "Failed to enter picture-in-picture mode", e);
                p();
                return;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) ww3.u1(1, activityManager.getAppTasks());
            numValueOf = (appTask == null || (taskInfo = appTask.getTaskInfo()) == null) ? null : Integer.valueOf(taskInfo.taskId);
        } else {
            numValueOf = -1;
        }
        if (i >= 29) {
            String strZ1 = ww3.z1(activityManager.getAppTasks(), null, null, null, new xk1(2), 31);
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                boolean z4 = this.u;
                boolean zG = g();
                StringBuilder sb = new StringBuilder("can't show global pip isMainTask=");
                sb.append(z3);
                sb.append(", secondTaskId=");
                sb.append(numValueOf);
                sb.append(" isPipAvailable=");
                qt4.B(" isCallAvailable=", " allTasks=", sb, z4, zG);
                sb.append(strZ1);
                a4cVar.c(je9Var, "PipAppController", sb.toString(), null);
            }
        }
    }
}
