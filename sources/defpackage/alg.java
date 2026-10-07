package defpackage;

import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.util.Size;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class alg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ alg(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditingSession editingSession;
        switch (this.a) {
            case 0:
                ((StereoRoomManagerImpl) this.b).idNotResolved((ParticipantId) this.c, (cf7) this.d);
                break;
            case 1:
                ((xde) this.b).o((zbh) this.c, (Map.Entry) this.d);
                break;
            case 2:
                och ochVar = (och) this.b;
                ich ichVar = (ich) this.c;
                oo ooVar = (oo) this.d;
                nch nchVar = ochVar.f;
                nchVar.a();
                if (nchVar.g) {
                    nchVar.g = false;
                    ichVar.d();
                    ichVar.k.b(null);
                } else {
                    nchVar.b = ichVar;
                    nchVar.d = ooVar;
                    Size size = ichVar.b;
                    nchVar.a = size;
                    nchVar.f = false;
                    if (!nchVar.b()) {
                        tvj.a("SurfaceViewImpl", "Wait for new Surface creation.");
                        nchVar.h.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    }
                }
                break;
            case 3:
                k2i k2iVar = (k2i) this.b;
                z88 z88Var = (z88) this.c;
                ExportException exportException = (ExportException) this.d;
                vog vogVar = k2iVar.e;
                ghe gheVarH = z88Var.h();
                dc9 dc9Var = k2iVar.d;
                String str = (String) dc9Var.b;
                String str2 = (String) dc9Var.c;
                g2i g2iVar = (g2i) vogVar.a;
                wv5 wv5Var = g2iVar.q;
                int i = exportException.a;
                if (i == 7003) {
                    int i2 = g2iVar.x;
                    if ((i2 == 5 || i2 == 6) || g2iVar.f()) {
                        g2iVar.t = null;
                        g2iVar.s = null;
                        wv5Var.c();
                        wv5Var.m = 6;
                        g2iVar.x = 0;
                        k84 k84Var = g2iVar.u;
                        k84Var.getClass();
                        String str3 = g2iVar.w;
                        str3.getClass();
                        g2iVar.i(k84Var, new t9b(str3, g2iVar.k, g2iVar.p, 0, null), g2iVar.p, 0L);
                    }
                }
                ((z88) wv5Var.n).f(gheVarH);
                if (str != null) {
                    wv5Var.f = str;
                }
                if (str2 != null) {
                    wv5Var.l = str2;
                }
                wv5Var.q = exportException;
                g2iVar.g();
                nh6 nh6VarA = wv5Var.a();
                g2iVar.g.f(-1, new oo(g2iVar, nh6VarA, exportException, 29));
                if (g2iVar.b()) {
                    ww6 ww6Var = new ww6(15);
                    int i3 = g2iVar.e(ww6Var) == 2 ? ww6Var.b : -1;
                    w26 w26Var = g2iVar.y;
                    w26Var.getClass();
                    boolean zF = g2iVar.f();
                    v26 v26Var = w26Var.e;
                    EditingEndedEvent.Builder errorCode = w26Var.a(3).setErrorCode(w26.f.get(i, 1));
                    if (i3 != -1) {
                        errorCode.setFinalProgressPercent(i3);
                    }
                    w26Var.f(errorCode, nh6VarA, zF);
                    ArrayList arrayListC = w26.c(nh6VarA.s);
                    for (int i4 = 0; i4 < arrayListC.size(); i4++) {
                        errorCode.addInputMediaItemInfo(u26.i(arrayListC.get(i4)));
                    }
                    errorCode.setOutputMediaItemInfo(w26.d(nh6VarA));
                    EditingEndedEvent editingEndedEventBuild = errorCode.build();
                    if (!v26Var.b && (editingSession = v26Var.a) != null) {
                        editingSession.reportEditingEndedEvent(editingEndedEventBuild);
                        v26Var.b = true;
                    }
                    try {
                        x05.l(v26Var);
                    } catch (Exception e) {
                        lvb.l0("EditingMetricsCollector", "error while closing the metrics reporter", e);
                    }
                }
                g2iVar.x = 0;
                g2iVar.s = null;
                break;
            case 4:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$0((UrlSharingListenerManagerImpl) this.b, (c6g) this.c, (dnf) this.d);
                break;
            case 5:
                e89 e89Var = (e89) this.b;
                mof mofVar = (mof) this.c;
                try {
                    try {
                        mofVar.o(((t00) this.d).apply(rx8.F(e89Var)));
                    } catch (Throwable th) {
                        mofVar.n(th);
                        return;
                    }
                } catch (Error e2) {
                    e = e2;
                    mofVar.n(e);
                    return;
                } catch (CancellationException unused) {
                    mofVar.cancel(false);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    mofVar.n(e);
                    return;
                } catch (ExecutionException e4) {
                    Throwable th2 = e4;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    mofVar.n(th2);
                    return;
                }
                break;
            case 6:
                mof mofVar2 = (mof) this.b;
                su6 su6Var = (su6) this.c;
                wmf wmfVar = (wmf) this.d;
                try {
                    if (!(mofVar2.a instanceof a1)) {
                        su6Var.run();
                        mofVar2.m(wmfVar);
                    }
                } catch (Throwable th3) {
                    mofVar2.n(th3);
                    return;
                }
                break;
            case 7:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                hmf hmfVar = (hmf) this.c;
                xti xtiVar = (xti) this.d;
                qyj.l("Surface update cancellation should only occur on main thread.", wxl.c());
                atomicBoolean.set(true);
                ((ArrayList) hmfVar.b.e).remove(xtiVar);
                hmfVar.e.remove(xtiVar);
                break;
            case 8:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                break;
            case 9:
                fbc fbcVar = (fbc) this.b;
                b87 b87Var = (b87) this.c;
                w55 w55Var = (w55) this.d;
                y3j y3jVar = (y3j) fbcVar.c;
                String str4 = vqi.a;
                y3jVar.C(b87Var, w55Var);
                break;
            case 10:
                ((eck) this.b).f.e((List) this.c, (w4k) this.d);
                break;
            case 11:
                dc9 dc9Var2 = (dc9) this.b;
                pve pveVar = (pve) this.c;
                Throwable th4 = (Throwable) this.d;
                for (sve sveVar : (CopyOnWriteArrayList) dc9Var2.c) {
                    try {
                        Long l = (Long) sveVar.d.get(pveVar);
                        if (l != null) {
                            sveVar.b.log(sveVar.a, "<- [" + l + "]: " + th4);
                        }
                    } catch (Throwable th5) {
                        ((y3e) dc9Var2.b).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                break;
            default:
                dc9 dc9Var3 = (dc9) this.b;
                pve pveVar2 = (pve) this.c;
                yve yveVar = (yve) this.d;
                for (sve sveVar2 : (CopyOnWriteArrayList) dc9Var3.c) {
                    try {
                        Long l2 = (Long) sveVar2.d.get(pveVar2);
                        if (l2 != null) {
                            sveVar2.b.log(sveVar2.a, "<- [" + l2 + "]: " + yveVar);
                        }
                    } catch (Throwable th6) {
                        ((y3e) dc9Var3.b).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsuccess", th6);
                    }
                }
                break;
        }
    }
}
