package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nb0(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        this.a = 3;
        this.b = z;
        this.c = callsAudioManagerV3Impl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        byte b = 0;
        switch (this.a) {
            case 0:
                v2a v2aVar = (v2a) this.c;
                boolean z2 = this.b;
                ob0 ob0Var = (ob0) v2aVar.c;
                String str = vqi.a;
                ob0Var.h(z2);
                return;
            case 1:
                kzi kziVar = (kzi) this.c;
                boolean z3 = this.b;
                dee deeVar = (dee) kziVar.b;
                if (deeVar.a0 == z3) {
                    tvj.g("Recorder", "Audio source silenced transitions to the same state " + z3);
                    return;
                } else {
                    deeVar.a0 = z3;
                    deeVar.O(true);
                    return;
                }
            case 2:
                rj5 rj5Var = (rj5) this.c;
                boolean z4 = this.b;
                wb0 wb0Var = (wb0) rj5Var.b;
                wb0Var.q = z4;
                if (wb0Var.g == 2) {
                    wb0Var.a();
                    return;
                }
                return;
            case 3:
                CallsAudioManagerV3Impl.updateProximityTrackingState$lambda$10(this.b, (CallsAudioManagerV3Impl) this.c);
                return;
            case 4:
                i92 i92Var = (i92) this.c;
                boolean z5 = this.b;
                i92Var.e();
                if (i92Var.h != 0) {
                    return;
                }
                long j = i92Var.c.a.a;
                Iterator it = i92Var.d.iterator();
                long j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                while (it.hasNext()) {
                    long j3 = ((fda) it.next()).a.c;
                    if (j3 < j2) {
                        j2 = j3;
                    }
                }
                long j4 = j2 - 1;
                gm0.n("i92", "loadNext: from db from: " + vd7.K(Long.valueOf(j)) + " to: " + vd7.K(Long.valueOf(j4)));
                ArrayList arrayListH = i92Var.m.h(j, j4);
                i92Var.a(i92Var.d.size(), arrayListH);
                gm0.n("i92", "loadNext: loaded from db: " + arrayListH.size() + " messages");
                i92Var.b = arrayListH.isEmpty();
                i92Var.f();
                if (z5 && arrayListH.size() < 100 && i92Var.c.d) {
                    i92Var.d();
                    return;
                }
                return;
            case 5:
                gs5 gs5Var = (gs5) this.c;
                boolean z6 = this.b;
                g85 g85Var = gs5Var.j;
                g85Var.getClass();
                g85Var.L(gs5Var, z6);
                return;
            case 6:
                tda tdaVar = (tda) this.c;
                boolean z7 = this.b;
                pda pdaVar = tdaVar.h;
                if (z7 && pdaVar != null && pdaVar.getVisibility() == 0) {
                    pdaVar.measure(View.MeasureSpec.makeMeasureSpec(tdaVar.b().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tdaVar.k, Integer.MIN_VALUE));
                    ViewParent parent = tdaVar.b().getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        gp2 gp2Var = new gp2();
                        gp2Var.c = 150L;
                        gp2Var.d = new DecelerateInterpolator(1.2f);
                        gp2Var.b(tdaVar.b());
                        x2i.a(gp2Var, viewGroup);
                    }
                    ViewGroup.LayoutParams layoutParams = pdaVar.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        layoutParams.height = pdaVar.getMeasuredHeight();
                        pdaVar.setLayoutParams(layoutParams);
                        return;
                    }
                }
                return;
            case 7:
                h7c h7cVar = (h7c) this.c;
                boolean z8 = this.b;
                f7c f7cVar = f7c.f;
                f7c f7cVar2 = f7c.c;
                h7cVar.j = Thread.currentThread();
                try {
                    if (h7cVar.d.get() != f7cVar) {
                        if (z8) {
                            do {
                                h7cVar.a.call();
                                if (h7cVar.d.get() == f7cVar) {
                                }
                            } while (h7cVar.i.getAndSet(false));
                            AtomicReference atomicReference = h7cVar.d;
                            f7c f7cVar3 = f7c.b;
                            while (!atomicReference.compareAndSet(f7cVar2, f7cVar3)) {
                                if (atomicReference.get() != f7cVar2) {
                                }
                            }
                        } else {
                            h7cVar.f = h7cVar.a.call();
                            AtomicReference atomicReference2 = h7cVar.d;
                            f7c f7cVar4 = f7c.d;
                            while (!atomicReference2.compareAndSet(f7cVar2, f7cVar4)) {
                                if (atomicReference2.get() != f7cVar2) {
                                }
                            }
                            h7cVar.e.countDown();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        h7cVar.g.set(th);
                        AtomicReference atomicReference3 = h7cVar.d;
                        f7c f7cVar5 = f7c.e;
                        while (!atomicReference3.compareAndSet(f7cVar2, f7cVar5)) {
                            if (atomicReference3.get() != f7cVar2) {
                            }
                        }
                        h7cVar.e.countDown();
                    } finally {
                        h7cVar.j = null;
                    }
                    break;
                }
                return;
            case 8:
                ((a0d) this.c).w.setVisibility(this.b ? 0 : 8);
                return;
            case 9:
                q4g q4gVar = (q4g) this.c;
                boolean z9 = this.b;
                Iterator it2 = q4gVar.m.iterator();
                while (it2.hasNext()) {
                    cf4 cf4Var = ((f91) it2.next()).a.j;
                    if (cf4Var.i != z9) {
                        cf4Var.i = z9;
                        if (cf4Var.c.a) {
                            cf4Var.a();
                        }
                    }
                }
                return;
            default:
                ufk ufkVar = (ufk) this.c;
                boolean z10 = this.b;
                o91 o91Var = ufkVar.a;
                try {
                    if (o91Var.q()) {
                        o91Var.F0.getClass();
                        p8b p8bVar = o91Var.t0;
                        if (p8bVar.b) {
                            p8bVar.b = false;
                            p8bVar.c = false;
                            p8bVar.a();
                        } else {
                            z = false;
                        }
                        if (z) {
                            o91Var.I();
                            o91Var.n(oh1.e, null);
                        }
                        o91Var.A();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    o91Var.N.logException("OKRTCCall", qv1.m("Error apply screen capture stopped state (fast=", ")", z10), th2);
                    return;
                }
        }
    }

    public /* synthetic */ nb0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
