package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.ScrollView;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.initialization.BootCompletedReceiver;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3(kzi kziVar, boolean z) {
        this.a = 12;
        this.b = kziVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj;
        ?? r5;
        int i = this.a;
        Application application = null;
        boolean z = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ScrollView) obj2).fullScroll(130);
                return;
            case 1:
                ((AtomicBoolean) obj2).set(true);
                return;
            case 2:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = r9.g;
                Method method = r9.f;
                q9 q9Var = Build.VERSION.SDK_INT;
                if (q9Var >= 28) {
                    activity.recreate();
                    return;
                }
                if (((q9Var != 26 && q9Var != 27) || method != null) && (r9.e != null || r9.d != null)) {
                    try {
                        Object obj3 = r9.c.get(activity);
                        if (obj3 != null && (obj = r9.b.get(activity)) != null) {
                            application = activity.getApplication();
                            q9Var = new q9(activity);
                            application.registerActivityLifecycleCallbacks(q9Var);
                            handler.post(new og7(q9Var, 1, obj3));
                            if (q9Var != 26 && q9Var != 27) {
                                z = false;
                            }
                            try {
                                if (z) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application = application;
                                        r5 = q9Var;
                                        handler.post(new ng7(application, 2, r5));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new ng7(application, 2, q9Var));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = q9Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 3:
                jac jacVar = (jac) obj2;
                zv8[] zv8VarArr = AddLinkBottomSheet.s;
                jacVar.setSelection(jacVar.getText().length());
                return;
            case 4:
                km kmVar = (km) obj2;
                kmVar.l.clear();
                HashMap map = kmVar.i;
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    ((lm) ((Map.Entry) it.next()).getValue()).getClass();
                    throw null;
                }
                map.clear();
                kmVar.j.clear();
                return;
            case 5:
                qu quVar = (qu) obj2;
                ((naj) ((ny8) quVar.a).getValue()).a();
                whh whhVar = (whh) ((ny8) quVar.b).getValue();
                whhVar.getClass();
                gm0.n("whh", "syncAll");
                whhVar.e.execute(new jm((Object) whhVar, (Object) Collections.EMPTY_LIST, true, 5));
                return;
            case 6:
                ((wx) obj2).b();
                return;
            case 7:
                y30 y30Var = (y30) obj2;
                synchronized (y30Var.a) {
                    try {
                        if (y30Var.m) {
                            return;
                        }
                        long j = y30Var.l - 1;
                        y30Var.l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            y30Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (y30Var.a) {
                            y30Var.n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 8:
                super/*android.graphics.drawable.Drawable*/.invalidateSelf();
                return;
            case 9:
                q70 q70Var = (q70) obj2;
                if (q70Var.c.a) {
                    q70Var.a.a.F0(3, false);
                    return;
                }
                return;
            case 10:
                cqk.g(((pb0) obj2).a);
                return;
            case 11:
                wb0 wb0Var = (wb0) obj2;
                int iD = qt4.D(wb0Var.g);
                if (iD == 1) {
                    wb0Var.d(1);
                    wb0Var.f();
                    return;
                } else {
                    if (iD != 2) {
                        return;
                    }
                    tvj.g("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    return;
                }
            case 12:
                ((kzi) obj2).getClass();
                return;
            case 13:
                ((u89) obj2).f(-1, new p51(10));
                return;
            case 14:
                ((y8j) ((mp0) obj2).a).f();
                return;
            case 15:
                ((pti) obj2).e();
                return;
            case 16:
                dw0 dw0Var = (dw0) obj2;
                af7 onSingleClick = dw0Var.getOnSingleClick();
                if (onSingleClick != null) {
                    onSingleClick.invoke();
                    return;
                } else {
                    ((View) dw0Var.getParent()).performClick();
                    return;
                }
            case 17:
                BootCompletedReceiver bootCompletedReceiver = (BootCompletedReceiver) obj2;
                int i2 = BootCompletedReceiver.b;
                try {
                    r7 r7Var = r7.a;
                    qzb qzbVar = new qzb(r7.d(ha9.b));
                    dme dmeVar = (dme) qzbVar.getAccessor().c(324);
                    gm0.x(dmeVar.s, "onBootCompleted", null);
                    ((s7f) dmeVar.i()).D(true);
                    dmeVar.j().e(false);
                    ((dkh) dmeVar.h.getValue()).a();
                    ((h5c) qzbVar.getAccessor().c(662)).e();
                    return;
                } catch (Exception e) {
                    gm0.V(bootCompletedReceiver.a, "fail", e);
                    return;
                }
            case 18:
                ((o61) obj2).invalidate();
                return;
            case 19:
                br4 br4Var = (CallIncomingScreen) obj2;
                ou7 ou7Var = CallIncomingScreen.m;
                gm0.n(CallIncomingScreen.class.getName(), "closing not measured screen with post");
                br4Var.getRouter().C(br4Var);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ym1 ym1Var = (ym1) obj2;
                if (ym1Var.u && ym1Var.e().a()) {
                    gm0.n("PipAppController", "restore fake pip after activity recreation");
                    ym1Var.t();
                    ym1Var.x();
                    return;
                }
                return;
            case 21:
                br4 br4Var2 = (CallScreen) obj2;
                l6m l6mVar = CallScreen.D1;
                br4Var2.getRouter().C(br4Var2);
                return;
            case 22:
                w22.y((w22) obj2);
                return;
            case 23:
                c62.b((c62) obj2);
                return;
            case 24:
                ObjectAnimator objectAnimator = ((CallWaitingRoomEventsWidget) obj2).d;
                if (objectAnimator != null) {
                    objectAnimator.start();
                    return;
                }
                return;
            case 25:
                w82 w82Var = (w82) obj2;
                if (((ac1) w82Var.b).c()) {
                    ((d9b) w82Var.x.getValue()).a(Boolean.FALSE);
                    return;
                }
                sgg sggVar = w82Var.z;
                if (sggVar == null || !sggVar.isActive()) {
                    w82Var.z = yab.i0(w82Var.g, null, 0, new m5(w82Var, null, 16), 3);
                    return;
                }
                return;
            case 26:
                cqk.g(((dc2) obj2).e);
                return;
            case 27:
                yab.A0(k66.a, new m5((qc2) obj2, null, 18));
                return;
            case 28:
                ch chVar = (ch) obj2;
                synchronized (chVar.d) {
                    try {
                        if (chVar.b) {
                            return;
                        }
                        tvj.a("CameraController", "Tap-to-focus reset.");
                        ((g8b) chVar.c).i(new vih(0));
                        chVar.b = true;
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            default:
                fe2 fe2Var = (fe2) obj2;
                he2 he2Var = fe2Var.c;
                fee feeVar = (fee) he2Var.l.remove(fe2Var);
                if (feeVar == null || he2Var.k != feeVar) {
                    return;
                }
                he2Var.k = null;
                return;
        }
    }

    public /* synthetic */ c3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
