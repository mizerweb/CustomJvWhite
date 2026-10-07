package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.impl.service.d;
import org.json.JSONException;
import org.webrtc.IceCandidate;
import org.webrtc.RTCErrorType;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sc2(m0a m0aVar, k2a k2aVar, String str, Bundle bundle, iu9 iu9Var) {
        this.a = 4;
        this.b = m0aVar;
        this.c = str;
        this.d = bundle;
        this.e = iu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        switch (this.a) {
            case 0:
                ((hi2) this.b).a.onCaptureCompleted((CameraCaptureSession) this.c, (CaptureRequest) this.d, (TotalCaptureResult) this.e);
                return;
            case 1:
                ((hi2) this.b).a.onCaptureFailed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureFailure) this.e);
                return;
            case 2:
                gvb gvbVar = (gvb) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                ad4 ad4Var = (ad4) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
                synchronized (gvbVar.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            gvbVar.t(ad4Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 3:
                View view = (View) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                View view2 = (View) this.d;
                er4 er4Var = (er4) this.e;
                int i = og5.g;
                if (view != null) {
                    viewGroup.removeView(view);
                }
                if (view2 != null && view2.getParent() == null) {
                    viewGroup.addView(view2);
                }
                if (viewGroup.getWindowToken() != null) {
                    er4Var.a();
                    return;
                }
                return;
            case 4:
                m0a m0aVar = (m0a) this.b;
                m0aVar.e.execute(new d86(m0aVar, (iu9) this.e, (String) this.c, (Bundle) this.d));
                return;
            case 5:
                y3a y3aVar = (y3a) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                i2a i2aVar = (i2a) this.d;
                r94 r94Var = (r94) this.e;
                atomicReference.set(y3aVar.j.m(i2aVar));
                r94Var.f();
                return;
            case 6:
                d3a d3aVar = (d3a) this.b;
                mof mofVar = (mof) this.c;
                qg4 qg4Var = (qg4) this.d;
                e89 e89Var = (e89) this.e;
                if (d3aVar.j()) {
                    mofVar.m(null);
                    return;
                }
                try {
                    qg4Var.accept(e89Var);
                    mofVar.m(null);
                    return;
                } catch (Throwable th2) {
                    mofVar.n(th2);
                    return;
                }
            case 7:
                d3a d3aVar2 = (d3a) this.b;
                q4a q4aVar = (q4a) this.c;
                i2a i2aVar2 = (i2a) this.d;
                List list = (List) this.e;
                if (d3aVar2.j()) {
                    return;
                }
                q4aVar.b(d3aVar2.t, i2aVar2, list);
                return;
            case 8:
                qfa qfaVar = (qfa) this.b;
                sfa sfaVar = (sfa) this.c;
                String str = (String) this.d;
                try {
                    qfaVar.n(sfaVar.a, str, (pfa) this.e);
                    qfaVar.c.c(new kfi(sfaVar.h, sfaVar.a, false));
                    return;
                } catch (Exception unused) {
                    gm0.W("qfa", qv1.k("Can't update attach async localId = ", str), new Object[0]);
                    return;
                }
            case 9:
                i0b i0bVar = (i0b) this.b;
                HashMap map = (HashMap) this.c;
                nof nofVar = (nof) this.d;
                HashMap map2 = (HashMap) this.e;
                ro7 ro7Var = i0bVar.c;
                nofVar.e.getTimestamp();
                ro7Var.accept(new h0b(map, map2));
                return;
            case 10:
                OneLogDirect.send_B_83SRM$lambda$1((String) this.b, (OneLogItem) this.c, (no) this.d, (qf7) this.e);
                return;
            case 11:
                uvc uvcVar = (uvc) this.b;
                String str2 = (String) this.c;
                RTCErrorType rTCErrorType = (RTCErrorType) this.d;
                IceCandidate iceCandidate = (IceCandidate) this.e;
                qpc qpcVar = (qpc) uvcVar.c;
                n91 n91VarB = qpcVar.B();
                if (n91VarB != null) {
                    qpcVar.p.getClass();
                    str2.getClass();
                    rTCErrorType.getClass();
                    iceCandidate.getClass();
                    String string = iceCandidate.toString();
                    string.getClass();
                    n91VarB.onIceCandidateAddFailed(new n38(string, rTCErrorType.getNative(), str2));
                    return;
                }
                return;
            case 12:
                euc eucVar = (euc) this.b;
                uy8 uy8Var = (uy8) this.c;
                Collection collection = (Collection) this.d;
                ConditionVariable conditionVariable = (ConditionVariable) this.e;
                try {
                    try {
                        swh swhVar = swh.a;
                        a28 a28VarB = ((l28) swh.h.getValue()).b(eucVar);
                        try {
                            int i2 = a28VarB.b;
                            String strF0 = z5h.F0((byte[]) ((pr6) a28VarB.d).c);
                            so2.Q(strF0, "CRASH_FREE");
                            if (i2 != 200) {
                                Log.e("Tracer", "HTTP " + i2 + ", " + strF0);
                            } else {
                                ((snf) uy8Var.a).a();
                            }
                            return;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                rx8.n(a28VarB, th3);
                                throw th4;
                            }
                        }
                    } catch (Exception unused2) {
                        swh swhVar2 = swh.a;
                        swh.b().b(collection);
                        break;
                    }
                } finally {
                    conditionVariable.open();
                }
                break;
            case 13:
                StereoRoomManagerImpl.resolveIdsAndThen$lambda$2((StereoRoomManagerImpl) this.b, (ArrayList) this.c, (List) this.d, (af7) this.e);
                return;
            case 14:
                bph bphVar = (bph) this.b;
                Surface surface = (Surface) this.c;
                u72 u72Var = (u72) this.d;
                ich ichVar = (ich) this.e;
                tvj.a("TextureViewImpl", "Safe to release surface.");
                oo ooVar = bphVar.l;
                if (ooVar != null) {
                    ooVar.g();
                    bphVar.l = null;
                }
                surface.release();
                if (bphVar.g == u72Var) {
                    bphVar.g = null;
                }
                if (bphVar.h == ichVar) {
                    bphVar.h = null;
                    return;
                }
                return;
            case 15:
                TracerCrashReportLite.reportException$lambda$2((TracerCrashReportLite) this.b, (String) this.c, (Throwable) this.d, (String) this.e);
                return;
            default:
                d.g((d) this.b, (Context) this.c, (Intent) this.d, (k42) this.e);
                return;
        }
    }

    public /* synthetic */ sc2(View view, boolean z, og5 og5Var, ViewGroup viewGroup, View view2, er4 er4Var) {
        this.a = 3;
        this.b = view;
        this.c = viewGroup;
        this.d = view2;
        this.e = er4Var;
    }

    public /* synthetic */ sc2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
