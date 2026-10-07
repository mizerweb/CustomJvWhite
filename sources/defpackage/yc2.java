package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class yc2 implements cle {
    public final LinkedHashMap a = new LinkedHashMap();
    public final ifh b = new ifh(new k82(4));
    public volatile Map c = s66.a;

    public static int d(jme jmeVar) {
        ghh ghhVar = (ghh) jmeVar.a(ihh.a);
        Object obj = ghhVar != null ? ghhVar.a.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.cle
    public final void A(jme jmeVar, long j, xg xgVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) jmeVar.W(zfe.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) xgVar.W(zfe.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new tc2((hi2) zc2Var, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    @Override // defpackage.cle
    public final void I(jme jmeVar, long j) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSessionC = c(jmeVar);
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                if (cameraCaptureSessionC != null && captureRequest != null) {
                    executor.execute(new xc2((hi2) zc2Var, cameraCaptureSessionC, j, 0));
                }
            }
        }
    }

    @Override // defpackage.cle
    public final void K(jme jmeVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) jmeVar.W(zfe.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new f92((hi2) zc2Var, 3, cameraCaptureSession));
                }
            } else {
                executor.execute(new rc2(zc2Var, this, jmeVar, 1));
            }
        }
    }

    @Override // defpackage.cle
    public final void P(jme jmeVar, long j, long j2) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSessionC = c(jmeVar);
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                if (cameraCaptureSessionC != null && captureRequest != null) {
                    executor.execute(new vc2((hi2) zc2Var, cameraCaptureSessionC, captureRequest, j2, j, 1));
                }
            } else {
                executor.execute(new rc2(zc2Var, this, jmeVar, 0));
            }
        }
    }

    @Override // defpackage.cle
    public final void Y(jme jmeVar, long j, eme emeVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSessionC = c(jmeVar);
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) emeVar.W(zfe.a(CaptureFailure.class));
                if (cameraCaptureSessionC != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new sc2((hi2) zc2Var, cameraCaptureSessionC, captureRequest, captureFailure, 1));
                }
            } else {
                executor.execute(new i0(zc2Var, this, jmeVar, new zpe(20), 12));
            }
        }
    }

    public final void a(zc2 zc2Var, Executor executor) {
        if (this.c.containsKey(zc2Var)) {
            throw new IllegalStateException((zc2Var + " was already registered!").toString());
        }
        synchronized (this.a) {
            this.a.put(zc2Var, executor);
            this.c = wm9.X0(this.a);
        }
    }

    @Override // defpackage.cle
    public final void b(jme jmeVar, final long j, int i, int i2) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) jmeVar.W(zfe.a(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                final Surface surface = (Surface) jmeVar.t0().get(new j4h(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final hi2 hi2Var = (hi2) zc2Var;
                    executor.execute(new Runnable() { // from class: wc2
                        @Override // java.lang.Runnable
                        public final void run() {
                            hi2Var.a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    public final CameraCaptureSession c(jme jmeVar) {
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) jmeVar.W(zfe.a(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || f82.e(jmeVar.W(zfe.a(f82.D()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.b.getValue();
    }

    @Override // defpackage.cle
    public final void g(jme jmeVar, long j, long j2) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) jmeVar.W(zfe.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new vc2((hi2) zc2Var, cameraCaptureSession, captureRequest, j2, j, 0));
                }
            }
        }
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSessionC = c(jmeVar);
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) wgVar.W(zfe.a(TotalCaptureResult.class));
                if (cameraCaptureSessionC != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new sc2((hi2) zc2Var, cameraCaptureSessionC, captureRequest, totalCaptureResult, 0));
                }
            } else {
                executor.execute(new i0(zc2Var, this, jmeVar, new sm2(jmeVar, wgVar), 11));
            }
        }
    }

    @Override // defpackage.cle
    public final void l(jme jmeVar, int i) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (zc2Var instanceof hi2) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) jmeVar.W(zfe.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) jmeVar.W(zfe.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) jmeVar.W(zfe.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new tc2((hi2) zc2Var, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new uc2(zc2Var, this, jmeVar, i));
            }
        }
    }

    @Override // defpackage.cle
    public final void o0(fle fleVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            zc2 zc2Var = (zc2) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = fleVar.c.get(ihh.a);
            ghh ghhVar = obj instanceof ghh ? (ghh) obj : null;
            Object obj2 = ghhVar != null ? ghhVar.a.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new ai(zc2Var, num != null ? num.intValue() : -1, 5));
        }
    }
}
