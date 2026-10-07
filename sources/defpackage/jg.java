package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jg implements jd2, ndi, AutoCloseable {
    public final le2 a;
    public final CameraExtensionSession b;
    public final ic2 c;
    public final Executor d;
    public final int e;
    public final h40 f;
    public final HashMap g;

    public jg(gg ggVar, CameraExtensionSession cameraExtensionSession, ic2 ic2Var, ww0 ww0Var) {
        this.a = ggVar;
        this.b = cameraExtensionSession;
        this.c = ic2Var;
        this.d = ww0Var;
        g40 g40Var = tf2.a;
        g40Var.getClass();
        this.e = g40.b.incrementAndGet(g40Var);
        h40 h40Var = new h40();
        h40Var.a = 0L;
        this.f = h40Var;
        this.g = new HashMap();
    }

    @Override // defpackage.jd2
    public final boolean F0() throws Exception {
        sbi sbiVar;
        String strY = this.a.Y();
        try {
            this.b.stopRepeating();
            sbiVar = sbi.a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            ic2 ic2Var = this.c;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i = 11;
                    } else {
                        i = 2;
                    }
                }
                ic2Var.a(strY, i, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                ic2Var.a(strY, 9, false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            sbiVar = null;
        }
        return sbiVar != null;
    }

    @Override // defpackage.jd2
    public final boolean J() {
        return false;
    }

    @Override // defpackage.jd2
    public final Integer L0(CaptureRequest captureRequest, vb2 vb2Var) throws Exception {
        String strY = this.a.Y();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            Executor executor = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, executor, new ig(this, vb2Var)) : cameraExtensionSession.capture(captureRequest, executor, new ig(this, vb2Var, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            ic2 ic2Var = this.c;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                ic2Var.a(strY, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            ic2Var.a(strY, i2, true);
            return null;
        }
    }

    @Override // defpackage.jd2
    public final Integer O(ArrayList arrayList, vb2 vb2Var) throws Exception {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            L0((CaptureRequest) it.next(), vb2Var);
        }
        return null;
    }

    @Override // defpackage.jd2
    public final boolean Q(List list) {
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(f82.D()))) {
            return this.b;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.b.close();
    }

    @Override // defpackage.jd2
    public final Integer f(CaptureRequest captureRequest, vb2 vb2Var) throws Exception {
        String strY = this.a.Y();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            Executor executor = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new ig(this, vb2Var)) : cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new ig(this, vb2Var, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            ic2 ic2Var = this.c;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                ic2Var.a(strY, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            ic2Var.a(strY, i2, true);
            return null;
        }
    }

    @Override // defpackage.jd2
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.jd2
    public final Integer m0(ArrayList arrayList, vb2 vb2Var) {
        if (arrayList.size() == 1) {
            return f((CaptureRequest) ww3.K1(arrayList), vb2Var);
        }
        ore.k("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // defpackage.jd2
    public final le2 n() {
        return this.a;
    }
}
