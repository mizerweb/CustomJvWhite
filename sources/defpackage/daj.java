package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class daj implements le2 {
    public final gg a;
    public final Object b = new Object();
    public boolean c;

    public daj(gg ggVar) {
        this.a = ggVar;
    }

    @Override // defpackage.le2
    public final CaptureRequest.Builder A(int i) {
        CaptureRequest.Builder builderA;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    builderA = null;
                } else {
                    builderA = this.a.A(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderA;
    }

    @Override // defpackage.le2
    public final boolean D0(ArrayList arrayList, id2 id2Var) {
        boolean zD0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((zm2) id2Var).b();
                    zD0 = false;
                } else {
                    zD0 = this.a.D0(arrayList, id2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zD0;
    }

    @Override // defpackage.le2
    public final boolean I(rg8 rg8Var, ArrayList arrayList, id2 id2Var) {
        boolean zI;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((zm2) id2Var).b();
                    zI = false;
                } else {
                    zI = this.a.I(rg8Var, arrayList, id2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zI;
    }

    @Override // defpackage.le2
    public final void I0() {
        this.a.I0();
    }

    @Override // defpackage.le2
    public final boolean P(bi6 bi6Var) {
        boolean zP;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    bi6Var.g.b();
                    zP = false;
                } else {
                    zP = this.a.P(bi6Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zP;
    }

    @Override // defpackage.le2
    public final boolean P0(InputConfiguration inputConfiguration, ArrayList arrayList, id2 id2Var) {
        boolean zP0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((zm2) id2Var).b();
                    zP0 = false;
                } else {
                    zP0 = this.a.P0(inputConfiguration, arrayList, id2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zP0;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        return this.a.W(sr3Var);
    }

    @Override // defpackage.le2
    public final String Y() {
        return this.a.c;
    }

    @Override // defpackage.le2
    public final CaptureRequest.Builder k0(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderK0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    builderK0 = null;
                } else {
                    builderK0 = this.a.k0(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderK0;
    }

    @Override // defpackage.le2
    public final void o0(int i) {
        this.a.o0(i);
    }

    @Override // defpackage.le2
    public final boolean u0(omf omfVar) {
        boolean zU0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    omfVar.e.b();
                    zU0 = false;
                } else {
                    zU0 = this.a.u0(omfVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zU0;
    }

    @Override // defpackage.le2
    public final boolean v0(ArrayList arrayList, id2 id2Var) {
        boolean zV0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((zm2) id2Var).b();
                    zV0 = false;
                } else {
                    zV0 = this.a.v0(arrayList, id2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zV0;
    }

    @Override // defpackage.le2
    public final void y() {
        this.a.y();
    }

    @Override // defpackage.le2
    public final boolean z0(List list, id2 id2Var) {
        boolean zZ0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    id2Var.b();
                    zZ0 = false;
                } else {
                    zZ0 = this.a.z0(list, id2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zZ0;
    }
}
