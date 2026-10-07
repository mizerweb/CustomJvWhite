package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class eg implements jd2 {
    public final le2 a;
    public final CameraCaptureSession b;
    public final ic2 c;
    public final Handler d;

    public eg(le2 le2Var, CameraCaptureSession cameraCaptureSession, ic2 ic2Var, Handler handler) {
        this.a = le2Var;
        this.b = cameraCaptureSession;
        this.c = ic2Var;
        this.d = handler;
        g40 g40Var = tf2.a;
        g40Var.getClass();
        g40.b.incrementAndGet(g40Var);
    }

    @Override // defpackage.jd2
    public final boolean F0() throws Throwable {
        double d;
        sbi sbiVar;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strY = le2Var.Y();
            ic2 ic2Var = this.c;
            try {
                this.b.stopRepeating();
                sbiVar = sbi.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
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
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            return sbiVar != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.jd2
    public final boolean J() throws Throwable {
        double d;
        sbi sbiVar;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strY = le2Var.Y();
            ic2 ic2Var = this.c;
            try {
                this.b.abortCaptures();
                sbiVar = sbi.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
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
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            return sbiVar != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.jd2
    public final Integer L0(CaptureRequest captureRequest, vb2 vb2Var) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                String strY = le2Var.Y();
                ic2 ic2Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.capture(captureRequest, vb2Var, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.jd2
    public final Integer O(ArrayList arrayList, vb2 vb2Var) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                String strY = le2Var.Y();
                ic2 ic2Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.captureBurst(arrayList, vb2Var, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.jd2
    public final boolean Q(List list) throws Throwable {
        double d;
        sbi sbiVar;
        StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strY = le2Var.Y();
            ic2 ic2Var = this.c;
            try {
                try {
                    CameraCaptureSession cameraCaptureSession = this.b;
                    List list2 = list;
                    d = 1000000.0d;
                    try {
                        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((OutputConfiguration) ((kh) it.next()).W(zfe.a(OutputConfiguration.class)));
                        }
                        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                        sbiVar = sbi.a;
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof CameraAccessException) {
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
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                return sbiVar != null;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ndi
    public Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(CameraCaptureSession.class))) {
            return this.b;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.jd2
    public final Integer f(CaptureRequest captureRequest, vb2 vb2Var) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                String strY = le2Var.Y();
                ic2 ic2Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.setRepeatingRequest(captureRequest, vb2Var, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.jd2
    public final Surface getInputSurface() {
        return this.b.getInputSurface();
    }

    @Override // defpackage.jd2
    public final Integer m0(ArrayList arrayList, vb2 vb2Var) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        le2 le2Var = this.a;
        sb.append(le2Var.Y());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                String strY = le2Var.Y();
                ic2 ic2Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.setRepeatingBurst(arrayList, vb2Var, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
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
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.jd2
    public final le2 n() {
        return this.a;
    }
}
