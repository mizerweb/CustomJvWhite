package defpackage;

import java.util.Iterator;
import org.webrtc.EglBase;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ j91(o91 o91Var, boolean z) {
        this.a = 0;
        this.b = o91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o91 o91Var = this.b;
        switch (i) {
            case 0:
                if (o91Var.u) {
                    return;
                }
                Iterator it = o91Var.k0.iterator();
                if (it.hasNext()) {
                    throw qt4.h(it);
                }
                return;
            case 1:
                CidLogger cidLogger = o91Var.N;
                EglBase eglBase = o91Var.r;
                try {
                    cidLogger.log("OKRTCCall", "Releasing ".concat(uza.b(eglBase)));
                    eglBase.release();
                    cidLogger.log("OKRTCCall", uza.b(eglBase).concat(" was released"));
                    return;
                } catch (Exception e) {
                    cidLogger.reportException("OKRTCCall", "release.egl", e);
                    return;
                }
            case 2:
                p8b p8bVar = o91Var.t0;
                if (o91Var.u) {
                    return;
                }
                int iC = o91Var.f0.c();
                boolean z = iC == 2 || iC == 1;
                if (z == p8bVar.f) {
                    return;
                }
                o91Var.N.log("OKRTCCall", bc1.m(") != camera video enabled state (", "). Let us update media settings", new StringBuilder("onLocalMediaStreamChanged, media settings video enabled state ("), p8bVar.f, z));
                if (o91Var.q()) {
                    o91Var.p(z);
                    o91Var.I();
                    return;
                }
                return;
            case 3:
                o91Var.l.post(new j91(o91Var, 1));
                return;
            default:
                o91Var.f(zvh.b, false);
                o91Var.d(o91Var.n0, 1);
                o91Var.n0.s(true);
                return;
        }
    }

    public /* synthetic */ j91(o91 o91Var, int i) {
        this.a = i;
        this.b = o91Var;
    }
}
