package defpackage;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.media3.session.MediaSessionService;
import androidx.work.WorkRequest;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import one.me.devmenu.utils.JsonBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.messages.b;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class su6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ su6(d3a d3aVar, i2a i2aVar, Runnable runnable) {
        this.a = 19;
        this.b = d3aVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence charSequenceE;
        CharSequence charSequenceE2;
        boolean z;
        wmf wmfVar;
        switch (this.a) {
            case 0:
                uu6 uu6Var = (uu6) this.b;
                lag lagVar = (lag) this.c;
                uu6Var.j.h(lagVar.a, lagVar.b);
                return;
            case 1:
                wx6 wx6Var = (wx6) this.b;
                vx6 vx6Var = (vx6) this.c;
                k96 k96Var = wx6Var.i;
                if (k96Var != null) {
                    n1g.Q(k96Var, vx6Var.a, null, 5);
                    return;
                }
                return;
            case 2:
                oyj.d((Context) this.b).b((cdc) this.c);
                return;
            case 3:
                ((cb5) ((jx7) ((fy7) this.b).c.a).b.d.get(((ix7) this.c).m)).c(true);
                return;
            case 4:
                ls9 ls9Var = (ls9) this.b;
                ls9 ls9Var2 = (ls9) this.c;
                ls9Var.a();
                if (ls9Var2 != null) {
                    ls9Var2.a();
                    return;
                }
                return;
            case 5:
                g68 g68Var = (g68) this.b;
                qjh qjhVar = (qjh) this.c;
                try {
                    qjhVar.b(g68Var.l());
                    return;
                } catch (Exception e) {
                    qjhVar.a(e);
                    return;
                }
            case 6:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 7:
                JsonBottomSheet jsonBottomSheet = (JsonBottomSheet) this.b;
                xs8 xs8Var = (xs8) this.c;
                LinearLayout linearLayout = jsonBottomSheet.y;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                ViewParent parent = linearLayout.getParent();
                ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                }
                jac jacVar = xs8Var.a;
                (jacVar != null ? jacVar : null).requestFocus();
                return;
            case 8:
                ((InputMethodManager) ((View) this.b).getContext().getSystemService("input_method")).showSoftInput((View) this.c, 1);
                return;
            case 9:
                rj5 rj5Var = (rj5) this.b;
                ec1 ec1Var = (ec1) this.c;
                HashSet hashSet = new HashSet();
                if (rj5Var != null) {
                    hashSet.addAll((LinkedHashSet) rj5Var.b);
                }
                ((qk5) ec1Var.i).getClass();
                return;
            case 10:
                r6a r6aVar = (r6a) this.b;
                eqb eqbVar = (eqb) this.c;
                d99 d99Var = (d99) ((g8b) r6aVar.a).d();
                if (d99Var == null) {
                    return;
                }
                eqbVar.a(d99Var.a);
                return;
            case 11:
                r6a r6aVar2 = (r6a) this.b;
                r72 r72Var = (r72) this.c;
                d99 d99Var2 = (d99) ((g8b) r6aVar2.a).d();
                if (d99Var2 == null) {
                    r72Var.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    r72Var.b(d99Var2.a);
                    return;
                }
            case 12:
                Map.Entry entry = (Map.Entry) this.b;
                d99 d99Var3 = (d99) this.c;
                eqb eqbVar2 = (eqb) entry.getKey();
                d99Var3.getClass();
                eqbVar2.a(d99Var3.a);
                return;
            case 13:
                ec9 ec9Var = (ec9) this.b;
                Intent intent = (Intent) this.c;
                oc9.X();
                if (((Boolean) ((f5d) ((wo6) ec9Var.f.getValue())).a.R5.a(e5d.S6[357]).i()).booleanValue() && cqk.d(intent.getAction(), "action.LOCALE_CHANGED")) {
                    qw2 qw2Var = (qw2) ec9Var.e.getValue();
                    if (qw2Var.l) {
                        pw pwVar = new pw(0);
                        for (rt2 rt2Var : qw2Var.i.values()) {
                            if (rt2Var.o0()) {
                                z = false;
                            } else {
                                fda fdaVar = rt2Var.c;
                                if (fdaVar != null) {
                                    charSequenceE2 = fdaVar.e.e(rt2Var, true);
                                    c cVar = fdaVar.e;
                                    cVar.g = null;
                                    cVar.h = null;
                                    cVar.i = null;
                                    cVar.j = null;
                                    cVar.k = null;
                                    cVar.l = null;
                                    cVar.m = null;
                                    cVar.n = null;
                                    cVar.o = false;
                                    cVar.p = false;
                                    cVar.q = false;
                                    cVar.r = false;
                                    rt2 rt2Var2 = cVar.f;
                                    if (rt2Var2 != null) {
                                        cVar.l(rt2Var2);
                                    }
                                    charSequenceE = rt2Var.c.e.e(rt2Var, true);
                                } else {
                                    charSequenceE = null;
                                    charSequenceE2 = null;
                                }
                                if (rt2Var.j0()) {
                                    rt2Var.h = null;
                                }
                                rt2Var.V();
                                z = !TextUtils.equals(charSequenceE2, charSequenceE);
                            }
                            if (z) {
                                pwVar.add(Long.valueOf(rt2Var.a));
                            }
                        }
                        qw2Var.o.c(new wo3(pwVar, true));
                    }
                }
                ((b) ec9Var.d.getValue()).b();
                qw2 qw2Var2 = (qw2) ec9Var.e.getValue();
                if (qw2Var2.l) {
                    Iterator it = qw2Var2.i.values().iterator();
                    while (it.hasNext()) {
                        ((rt2) it.next()).o = null;
                    }
                    qw2Var2.o.c(new wo3(Collections.EMPTY_LIST, true));
                }
                gm0.n(ec9Var.a, "onReceive finished");
                return;
            case 14:
                Object obj = this.b;
                re9 re9Var = (re9) this.c;
                synchronized (obj) {
                    ((gsh) re9Var.a).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (re9Var.e + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS < jElapsedRealtime) {
                        long j = jElapsedRealtime - re9Var.d;
                        re9Var.d = jElapsedRealtime;
                        re9Var.b.invoke(new qe9(re9Var.f, j, re9Var.g, re9Var.h));
                        re9Var.f = 0;
                        re9Var.g = BuildConfig.MAX_TIME_TO_UPLOAD;
                        re9Var.h = Long.MIN_VALUE;
                    }
                    break;
                }
                return;
            case 15:
                pt9 pt9Var = (pt9) this.b;
                pt9Var.E.set(pt9Var.w((v2a) this.c, pt9Var.y, 0));
                return;
            case 16:
                pv9 pv9Var = (pv9) this.b;
                qg7 qg7Var = new qg7(pv9Var.a, (u2a) this.c);
                pv9Var.i = qg7Var;
                nv9 nv9Var = pv9Var.e;
                Handler handler = pv9Var.b.f;
                if (!((Set) qg7Var.c).add(nv9Var)) {
                    lvb.G0("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                nv9Var.d(handler);
                mu9 mu9Var = (mu9) qg7Var.b;
                MediaController mediaController = mu9Var.a;
                ku9 ku9Var = nv9Var.a;
                ku9Var.getClass();
                mediaController.registerCallback(ku9Var, handler);
                synchronized (mu9Var.b) {
                    d38 d38VarA = mu9Var.e.a();
                    if (d38VarA != null) {
                        ju9 ju9Var = new ju9(nv9Var);
                        mu9Var.d.put(nv9Var, ju9Var);
                        nv9Var.c = ju9Var;
                        try {
                            d38VarA.d0(ju9Var);
                            nv9Var.c(13, null);
                        } catch (RemoteException | SecurityException e2) {
                            lvb.l0("MediaControllerCompat", "Dead object in registerCallback.", e2);
                        }
                    } else {
                        nv9Var.c = null;
                        mu9Var.c.add(nv9Var);
                    }
                    break;
                }
                return;
            case 17:
                ((g0a) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 18:
                ((g0a) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 19:
                d3a d3aVar = (d3a) this.b;
                Runnable runnable = (Runnable) this.c;
                d3aVar.getClass();
                runnable.run();
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((mof) this.c).m(Boolean.valueOf(((d3a) this.b).p()));
                return;
            case 21:
                h88 h88Var = (h88) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    wmfVar = (wmf) h88Var.a;
                    lvb.W(wmfVar, "SessionResult must not be null");
                    break;
                } catch (InterruptedException e3) {
                    e = e3;
                    lvb.H0("MediaSessionLegacyStub", "Custom command failed", e);
                    wmfVar = new wmf(-1);
                } catch (CancellationException e4) {
                    lvb.H0("MediaSessionLegacyStub", "Custom command cancelled", e4);
                    wmfVar = new wmf(1);
                } catch (ExecutionException e5) {
                    e = e5;
                    lvb.H0("MediaSessionLegacyStub", "Custom command failed", e);
                    wmfVar = new wmf(-1);
                }
                resultReceiver.send(wmfVar.a, wmfVar.b);
                return;
            case 22:
                o3a o3aVar = (o3a) this.b;
                j4d j4dVar = (j4d) this.c;
                o3aVar.m.O(o3aVar.E(j4dVar));
                o3aVar.i.r(j4dVar.R().a(17) ? j4dVar.v() : ush.a);
                return;
            case 23:
                d3a d3aVar2 = (d3a) this.b;
                Intent intent2 = (Intent) this.c;
                int i2 = MediaSessionService.g;
                i2a i2aVarE = d3aVar2.e();
                if (i2aVarE == null) {
                    ComponentName component = intent2.getComponent();
                    i2aVarE = new i2a(new p3a(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1009003300, 8, false, null, Bundle.EMPTY);
                }
                if (d3aVar2.o(i2aVarE, intent2)) {
                    return;
                }
                lvb.g0("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case 24:
                MediaSessionService mediaSessionService = (MediaSessionService) this.b;
                k2a k2aVar = (k2a) this.c;
                int i3 = MediaSessionService.g;
                k0a k0aVar = (k0a) mediaSessionService.b().g.remove(k2aVar);
                if (k0aVar != null) {
                    qu9 qu9Var = k0aVar.a;
                    if (!qu9Var.cancel(false)) {
                        try {
                            ((iu9) rx8.F(qu9Var)).Q();
                        } catch (CancellationException | ExecutionException e6) {
                            lvb.H0("MediaController", "MediaController future failed (so we couldn't release it)", e6);
                        }
                    }
                }
                k2aVar.a.w = null;
                return;
            case 25:
                t4a t4aVar = (t4a) this.b;
                y28 y28Var = (y28) this.c;
                gvb gvbVar = t4aVar.d;
                i2a i2aVarZ = gvbVar.z(y28Var.asBinder());
                if (i2aVarZ != null) {
                    gvbVar.S(i2aVarZ);
                    return;
                }
                return;
            case 26:
                ((t4a) this.b).d.u((i2a) this.c);
                return;
            case 27:
                ((qg4) this.b).accept((c5a) this.c);
                return;
            case 28:
                ((n78) this.c).n((qwa) this.b);
                return;
            default:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
        }
    }

    public /* synthetic */ su6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
