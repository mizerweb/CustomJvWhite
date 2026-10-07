package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gg implements le2 {
    public final bg2 a;
    public final CameraDevice b;
    public final String c;
    public final ic2 d;
    public final xp9 e;
    public final zqh f;
    public final b40 g = gvk.a(false);
    public final i40 h = gvk.c(null);

    public gg(bg2 bg2Var, CameraDevice cameraDevice, String str, ic2 ic2Var, xp9 xp9Var, zqh zqhVar) {
        this.a = bg2Var;
        this.b = cameraDevice;
        this.c = str;
        this.d = ic2Var;
        this.e = xp9Var;
        this.f = zqhVar;
    }

    @Override // defpackage.le2
    public final CaptureRequest.Builder A(int i) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            ic2 ic2Var = this.d;
            try {
                builderCreateCaptureRequest = this.b.createCaptureRequest(i);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i2 = 0;
                try {
                    if (e instanceof CameraAccessException) {
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
                        ic2Var.a(str, i2, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ic2Var.a(str, 9, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateCaptureRequest = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            return builderCreateCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[Catch: all -> 0x006c, TryCatch #4 {all -> 0x006c, blocks: (B:8:0x0039, B:9:0x003e, B:10:0x004f, B:12:0x0055, B:18:0x0074, B:20:0x0079, B:22:0x0080, B:24:0x0086, B:32:0x009d, B:34:0x00a1, B:43:0x00ce, B:50:0x00f5, B:52:0x00fa, B:54:0x0100, B:56:0x0104, B:58:0x0108, B:61:0x010d, B:63:0x0111, B:64:0x0117, B:65:0x0118), top: B:86:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[Catch: all -> 0x006c, TryCatch #4 {all -> 0x006c, blocks: (B:8:0x0039, B:9:0x003e, B:10:0x004f, B:12:0x0055, B:18:0x0074, B:20:0x0079, B:22:0x0080, B:24:0x0086, B:32:0x009d, B:34:0x00a1, B:43:0x00ce, B:50:0x00f5, B:52:0x00fa, B:54:0x0100, B:56:0x0104, B:58:0x0108, B:61:0x010d, B:63:0x0111, B:64:0x0117, B:65:0x0118), top: B:86:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[Catch: all -> 0x006c, TryCatch #4 {all -> 0x006c, blocks: (B:8:0x0039, B:9:0x003e, B:10:0x004f, B:12:0x0055, B:18:0x0074, B:20:0x0079, B:22:0x0080, B:24:0x0086, B:32:0x009d, B:34:0x00a1, B:43:0x00ce, B:50:0x00f5, B:52:0x00fa, B:54:0x0100, B:56:0x0104, B:58:0x0108, B:61:0x010d, B:63:0x0111, B:64:0x0117, B:65:0x0118), top: B:86:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0155, please report this as an issue */
    @Override // defpackage.le2
    public final boolean D0(ArrayList arrayList, id2 id2Var) {
        mnf mnfVar;
        ic2 ic2Var;
        boolean z;
        sbi sbiVar;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        zqh zqhVar = this.f;
        CameraDevice cameraDevice = this.b;
        ylc ylcVarA = a(id2Var);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar2 = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar2 != null) {
            b(mnfVar2);
        }
        String str = this.c;
        String strK = qv1.k("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            ic2 ic2Var2 = this.d;
            try {
                ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((OutputConfiguration) ((kh) it.next()).W(zfe.a(OutputConfiguration.class)));
                }
                mnfVar = mnfVar2;
                try {
                    try {
                        ic2Var = ic2Var2;
                        try {
                            cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new ng(this, id2Var, mnfVar, this.d, this.e, zqhVar.a()), zqhVar.a());
                            sbiVar = sbi.a;
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CameraAccessException) {
                                ic2 ic2Var3 = ic2Var;
                                if (e instanceof IllegalArgumentException) {
                                }
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                ic2Var3.a(str, 9, false);
                                sbiVar = null;
                                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
                                if (sbiVar == null) {
                                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (mnfVar != null) {
                                        c(mnfVar);
                                    }
                                }
                                if (sbiVar != null) {
                                    return true;
                                }
                                return z;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z2 = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z2 = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z2 = true;
                            }
                            ic2Var.a(str, i, z2);
                            sbiVar = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ic2Var = ic2Var2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    ic2Var = ic2Var2;
                    if (e instanceof CameraAccessException) {
                        ic2 ic2Var4 = ic2Var;
                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z = false;
                            ic2Var4.a(str, 9, false);
                            sbiVar = null;
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
                        if (sbiVar == null) {
                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                            if (mnfVar != null) {
                                c(mnfVar);
                            }
                        }
                        if (sbiVar != null) {
                            return true;
                        }
                        return z;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z2 = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z2 = true;
                            i = 0;
                        } else if (reason != 4) {
                            z2 = true;
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z2 = true;
                    }
                    ic2Var.a(str, i, z2);
                    sbiVar = null;
                    z = false;
                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
                    if (sbiVar == null) {
                        Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                        if (mnfVar != null) {
                            c(mnfVar);
                        }
                    }
                    if (sbiVar != null) {
                        return true;
                    }
                    return z;
                }
            } catch (Exception e4) {
                e = e4;
                mnfVar = mnfVar2;
            }
            z = false;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
            if (sbiVar == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (mnfVar != null) {
                    c(mnfVar);
                }
            }
            if (sbiVar != null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0161, please report this as an issue */
    @Override // defpackage.le2
    public final boolean I(rg8 rg8Var, ArrayList arrayList, id2 id2Var) {
        ic2 ic2Var;
        boolean z;
        sbi sbiVar;
        zqh zqhVar = this.f;
        CameraDevice cameraDevice = this.b;
        ylc ylcVarA = a(id2Var);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar != null) {
            b(mnfVar);
        }
        String str = this.c;
        String strK = qv1.k("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            ic2 ic2Var2 = this.d;
            try {
                InputConfiguration inputConfiguration = new InputConfiguration(rg8Var.a, rg8Var.b, rg8Var.c);
                ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((OutputConfiguration) ((kh) it.next()).W(zfe.a(OutputConfiguration.class)));
                }
                try {
                    ic2Var = ic2Var2;
                    try {
                        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new ng(this, id2Var, mnfVar, this.d, this.e, zqhVar.a()), zqhVar.a());
                        sbiVar = sbi.a;
                    } catch (Exception e) {
                        e = e;
                        if (!(e instanceof CameraAccessException)) {
                            ic2 ic2Var3 = ic2Var;
                            if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                ic2Var3.a(str, 9, false);
                                sbiVar = null;
                            } else {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
                            if (sbiVar == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (mnfVar != null) {
                                    c(mnfVar);
                                }
                            }
                            if (sbiVar != null) {
                                return true;
                            }
                            return z;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        boolean z2 = true;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                z2 = true;
                                i = 0;
                            } else if (reason == 4) {
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        }
                        ic2Var.a(str, i, z2);
                        sbiVar = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    ic2Var = ic2Var2;
                }
            } catch (Exception e3) {
                e = e3;
                ic2Var = ic2Var2;
            }
            z = false;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
            if (sbiVar == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (mnfVar != null) {
                    c(mnfVar);
                }
            }
            if (sbiVar != null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(strK, " - ")));
            throw th;
        }
    }

    @Override // defpackage.le2
    public final void I0() {
        if (!this.g.b()) {
            ore.k("Check failed.");
            return;
        }
        i40 i40Var = this.h;
        i40Var.getClass();
        mnf mnfVar = (mnf) i40.b.getAndSet(i40Var, null);
        if (mnfVar != null) {
            c(mnfVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:25:0x008d, B:27:0x0098, B:29:0x009e, B:31:0x00aa, B:36:0x00b4, B:37:0x00bb, B:38:0x00bc, B:46:0x00d0, B:48:0x00d4, B:57:0x0101, B:63:0x0120, B:66:0x0126, B:68:0x012a, B:70:0x012e, B:72:0x0132, B:75:0x0137, B:77:0x013b, B:78:0x0141, B:79:0x0142), top: B:94:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:25:0x008d, B:27:0x0098, B:29:0x009e, B:31:0x00aa, B:36:0x00b4, B:37:0x00bb, B:38:0x00bc, B:46:0x00d0, B:48:0x00d4, B:57:0x0101, B:63:0x0120, B:66:0x0126, B:68:0x012a, B:70:0x012e, B:72:0x0132, B:75:0x0137, B:77:0x013b, B:78:0x0141, B:79:0x0142), top: B:94:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:25:0x008d, B:27:0x0098, B:29:0x009e, B:31:0x00aa, B:36:0x00b4, B:37:0x00bb, B:38:0x00bc, B:46:0x00d0, B:48:0x00d4, B:57:0x0101, B:63:0x0120, B:66:0x0126, B:68:0x012a, B:70:0x012e, B:72:0x0132, B:75:0x0137, B:77:0x013b, B:78:0x0141, B:79:0x0142), top: B:94:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00d4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0101, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0181, please report this as an issue */
    @Override // defpackage.le2
    public final boolean P(bi6 bi6Var) throws Throwable {
        String str;
        long j;
        String str2;
        boolean z;
        sbi sbiVar;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        ww0 ww0Var = bi6Var.b;
        CameraDevice cameraDevice = this.b;
        Integer num = bi6Var.f;
        ci6 ci6Var = bi6Var.g;
        ylc ylcVarA = a(ci6Var);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar != null) {
            b(mnfVar);
        }
        String str3 = this.c;
        String strK = qv1.k("CXCP#createExtensionSession-", str3);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                ic2 ic2Var = this.d;
                try {
                    int iIntValue = num.intValue();
                    ArrayList arrayList = bi6Var.a;
                    j = jElapsedRealtimeNanos;
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    int i2 = iIntValue;
                                    arrayList2.add((OutputConfiguration) ((kh) it.next()).W(zfe.a(OutputConfiguration.class)));
                                    iIntValue = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    str = "%.3f ms";
                                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(j) / 1000000.0d)}, 1, null, str, zo5.z(strK, " - ")));
                                    throw th;
                                }
                            }
                            str2 = "%.3f ms";
                            try {
                                ExtensionSessionConfiguration extensionSessionConfigurationF = hg.f(iIntValue, arrayList2, ww0Var, new ug(this, ci6Var, mnfVar, this.d, this.e, ww0Var));
                                kh khVar = bi6Var.h;
                                if (khVar != null && Build.VERSION.SDK_INT >= 34) {
                                    OutputConfiguration outputConfiguration = (OutputConfiguration) khVar.W(zfe.a(OutputConfiguration.class));
                                    if (outputConfiguration == null) {
                                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                                    }
                                    extensionSessionConfigurationF.setPostviewOutputConfiguration(outputConfiguration);
                                }
                                cameraDevice.createExtensionSession(extensionSessionConfigurationF);
                                sbiVar = sbi.a;
                                z = false;
                            } catch (Exception e) {
                                e = e;
                                if (!(e instanceof CameraAccessException)) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    ic2Var.a(str3, i, z2);
                                } else {
                                    if (e instanceof IllegalArgumentException) {
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    ic2Var.a(str3, 9, false);
                                    sbiVar = null;
                                }
                                z = false;
                                sbiVar = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = "%.3f ms";
                            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(j) / 1000000.0d)}, 1, null, str, zo5.z(strK, " - ")));
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "%.3f ms";
                        if (!(e instanceof CameraAccessException)) {
                            if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                ic2Var.a(str3, 9, false);
                            } else {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            sbiVar = null;
                            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(j) / 1000000.0d)}, 1, null, str2, zo5.z(strK, " - ")));
                            if (sbiVar == null) {
                                Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                if (mnfVar != null) {
                                    c(mnfVar);
                                }
                            }
                            if (sbiVar != null) {
                                return true;
                            }
                            return z;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z2 = true;
                        if (reason != 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z2 = true;
                                i = 0;
                            } else if (reason != 4) {
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        }
                        ic2Var.a(str3, i, z2);
                        z = false;
                        sbiVar = null;
                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(j) / 1000000.0d)}, 1, null, str2, zo5.z(strK, " - ")));
                        if (sbiVar == null) {
                            Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                            if (mnfVar != null) {
                                c(mnfVar);
                            }
                        }
                        if (sbiVar != null) {
                            return true;
                        }
                        return z;
                    }
                } catch (Exception e3) {
                    e = e3;
                    j = jElapsedRealtimeNanos;
                } catch (Throwable th3) {
                    th = th3;
                    j = jElapsedRealtimeNanos;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(j) / 1000000.0d)}, 1, null, str2, zo5.z(strK, " - ")));
                if (sbiVar == null) {
                    Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                    if (mnfVar != null) {
                        c(mnfVar);
                    }
                }
                if (sbiVar != null) {
                    return true;
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = "%.3f ms";
            j = jElapsedRealtimeNanos;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.le2
    public final boolean P0(InputConfiguration inputConfiguration, ArrayList arrayList, id2 id2Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        boolean z;
        mnf mnfVar;
        boolean z2;
        sbi sbiVar;
        ?? r10;
        zqh zqhVar = this.f;
        CameraDevice cameraDevice = this.b;
        ylc ylcVarA = a(id2Var);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar2 = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar2 != null) {
            b(mnfVar2);
        }
        String str3 = this.c;
        String strK = qv1.k("CXCP#createReprocessableCaptureSession-", str3);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            ic2 ic2Var = this.d;
            try {
                mnfVar = mnfVar2;
                try {
                    ic2 ic2Var2 = this.d;
                    xp9 xp9Var = this.e;
                    try {
                        Handler handlerA = zqhVar.a();
                        str2 = strK;
                        z = true;
                        try {
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new ng(this, id2Var, mnfVar, ic2Var2, xp9Var, handlerA), zqhVar.a());
                                sbiVar = sbi.a;
                                z2 = false;
                                r10 = z;
                            } catch (Throwable th) {
                                th = th;
                                str = str2;
                                r9 = z;
                                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", zo5.z(str, " - ")));
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CameraAccessException) {
                                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                CameraAccessException cameraAccessException = (CameraAccessException) e;
                                int reason = cameraAccessException.getReason();
                                int i = 3;
                                if (reason != z) {
                                    if (reason == 2) {
                                        i = 6;
                                    } else if (reason == 3) {
                                        i = 0;
                                    } else if (reason == 4) {
                                        i = z ? 1 : 0;
                                    } else if (reason != 5) {
                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i = 11;
                                    } else {
                                        i = 2;
                                    }
                                }
                                ic2Var.a(str3, i, z);
                            } else {
                                if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z2 = false;
                                    ic2Var.a(str3, 9, false);
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                sbiVar = null;
                                r10 = z;
                            }
                            z2 = false;
                            sbiVar = null;
                            r10 = z;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = strK;
                        z = true;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = strK;
                        z = true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                    str2 = strK;
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    str2 = strK;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = strK;
                mnfVar = mnfVar2;
                z = true;
            } catch (Throwable th4) {
                th = th4;
                str2 = strK;
                z = true;
            }
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", zo5.z(str2, " - ")));
            if (sbiVar == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (mnfVar != null) {
                    c(mnfVar);
                }
            }
            return sbiVar != null ? r10 : z2;
        } catch (Throwable th5) {
            th = th5;
            str = strK;
            r9 = 1;
        }
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(CameraDevice.class))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.le2
    public final String Y() {
        return this.c;
    }

    public final ylc a(mnf mnfVar) {
        if (this.g.b()) {
            c(mnfVar);
            return new ylc(Boolean.FALSE, null);
        }
        Boolean bool = Boolean.TRUE;
        i40 i40Var = this.h;
        i40Var.getClass();
        return new ylc(bool, i40.b.getAndSet(i40Var, mnfVar));
    }

    public final void b(mnf mnfVar) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            mnfVar.d();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(mnf mnfVar) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            mnfVar.b();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.le2
    public final CaptureRequest.Builder k0(TotalCaptureResult totalCaptureResult) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            ic2 ic2Var = this.d;
            try {
                builderCreateReprocessCaptureRequest = this.b.createReprocessCaptureRequest(totalCaptureResult);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i = 0;
                try {
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
                        ic2Var.a(str, i, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ic2Var.a(str, 9, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateReprocessCaptureRequest = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", zo5.z(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.le2
    public final void o0(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.c;
            ic2 ic2Var = this.d;
            try {
                this.b.setCameraAudioRestriction(i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
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
                    ic2Var.a(str, i2, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    ic2Var.a(str, 9, false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) ef2.b(this.c)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0240  */
    /* JADX WARN: Code duplicated, block: B:107:0x0258  */
    /* JADX WARN: Code duplicated, block: B:109:0x025d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x025f  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a A[Catch: all -> 0x00b5, TryCatch #5 {all -> 0x00b5, blocks: (B:25:0x009e, B:27:0x00a7, B:29:0x00ad, B:34:0x00bf, B:37:0x00ea, B:38:0x0108, B:40:0x010e, B:41:0x011c, B:42:0x0126, B:44:0x012c, B:46:0x013e, B:48:0x014b, B:49:0x014f, B:51:0x015e, B:54:0x0167, B:55:0x016a, B:57:0x016c, B:58:0x016f, B:67:0x0186, B:69:0x018a, B:78:0x01b7, B:86:0x01dc, B:88:0x01e1, B:90:0x01e7, B:92:0x01eb, B:94:0x01ef, B:97:0x01f4, B:99:0x01f8, B:100:0x01fe, B:101:0x01ff), top: B:120:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7 A[Catch: all -> 0x00b5, TryCatch #5 {all -> 0x00b5, blocks: (B:25:0x009e, B:27:0x00a7, B:29:0x00ad, B:34:0x00bf, B:37:0x00ea, B:38:0x0108, B:40:0x010e, B:41:0x011c, B:42:0x0126, B:44:0x012c, B:46:0x013e, B:48:0x014b, B:49:0x014f, B:51:0x015e, B:54:0x0167, B:55:0x016a, B:57:0x016c, B:58:0x016f, B:67:0x0186, B:69:0x018a, B:78:0x01b7, B:86:0x01dc, B:88:0x01e1, B:90:0x01e7, B:92:0x01eb, B:94:0x01ef, B:97:0x01f4, B:99:0x01f8, B:100:0x01fe, B:101:0x01ff), top: B:120:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1 A[Catch: all -> 0x00b5, TryCatch #5 {all -> 0x00b5, blocks: (B:25:0x009e, B:27:0x00a7, B:29:0x00ad, B:34:0x00bf, B:37:0x00ea, B:38:0x0108, B:40:0x010e, B:41:0x011c, B:42:0x0126, B:44:0x012c, B:46:0x013e, B:48:0x014b, B:49:0x014f, B:51:0x015e, B:54:0x0167, B:55:0x016a, B:57:0x016c, B:58:0x016f, B:67:0x0186, B:69:0x018a, B:78:0x01b7, B:86:0x01dc, B:88:0x01e1, B:90:0x01e7, B:92:0x01eb, B:94:0x01ef, B:97:0x01f4, B:99:0x01f8, B:100:0x01fe, B:101:0x01ff), top: B:120:0x003b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0240, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x018a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01b7, please report this as an issue */
    @Override // defpackage.le2
    public final boolean u0(omf omfVar) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        sbi sbiVar;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        CameraDevice cameraDevice = this.b;
        List list = omfVar.b;
        ylc ylcVarA = a(omfVar.e);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar != null) {
            b(mnfVar);
        }
        String str5 = this.c;
        String strK = qv1.k("CXCP#createCaptureSession-", str5);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                ic2 ic2Var = this.d;
                try {
                    int i2 = omfVar.a;
                    ArrayList arrayList = omfVar.c;
                    str3 = "%.3f ms";
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList2.add((OutputConfiguration) ((kh) it.next()).W(zfe.a(OutputConfiguration.class)));
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = " - ";
                                    str = str3;
                                    Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, zo5.z(strK, str2)));
                                    throw th;
                                }
                            }
                            try {
                                str4 = " - ";
                                ic2Var = ic2Var;
                                try {
                                    SessionConfiguration sessionConfigurationJ = n4.j(i2, arrayList2, omfVar.d, new ng(this, omfVar.e, mnfVar, this.d, this.e, this.f.a()));
                                    if (list != null) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            sessionConfigurationJ.setInputConfiguration(ysk.a(str5, list));
                                        } else {
                                            sessionConfigurationJ.setInputConfiguration(new InputConfiguration(((rg8) ww3.K1(list)).a, ((rg8) ww3.K1(list)).b, ((rg8) ww3.K1(list)).c));
                                        }
                                    }
                                    try {
                                        Trace.beginSection("createCaptureRequest");
                                        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(omfVar.f);
                                        Trace.endSection();
                                        Set set = (Set) ((qb2) this.a).h.getValue();
                                        ArrayList arrayList3 = new ArrayList(yw3.W0(set, 10));
                                        Iterator it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(((CaptureRequest.Key) it2.next()).getName());
                                        }
                                        for (Map.Entry entry : omfVar.g.entrySet()) {
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if ((key instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key).getName())) {
                                                ynl.b(builderCreateCaptureRequest, key, value);
                                            }
                                        }
                                        sessionConfigurationJ.setSessionParameters(builderCreateCaptureRequest.build());
                                        try {
                                            Trace.beginSection("Api28Compat.createCaptureSession");
                                            cameraDevice.createCaptureSession(sessionConfigurationJ);
                                            Trace.endSection();
                                            sbiVar = sbi.a;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof CameraAccessException) {
                                        ic2 ic2Var2 = ic2Var;
                                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            z = false;
                                            ic2Var2.a(str5, 9, false);
                                            sbiVar = null;
                                        } else {
                                            if (!(e instanceof IllegalStateException)) {
                                                throw e;
                                            }
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        }
                                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, zo5.z(strK, str4)));
                                        if (sbiVar == null) {
                                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                            if (mnfVar != null) {
                                                c(mnfVar);
                                            }
                                        }
                                        if (sbiVar != null) {
                                            return true;
                                        }
                                        return z;
                                    }
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                i = 0;
                                            } else if (reason != 4) {
                                                i = 1;
                                            } else if (reason != 5) {
                                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                i = 11;
                                            } else {
                                                i = 2;
                                            }
                                            z2 = true;
                                        } else {
                                            i = 6;
                                        }
                                        z2 = true;
                                    } else {
                                        ic2Var = ic2Var;
                                    }
                                    ic2Var.a(str5, i, z2);
                                    sbiVar = null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str4 = " - ";
                                ic2Var = ic2Var;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str4 = " - ";
                            if (e instanceof CameraAccessException) {
                                ic2 ic2Var3 = ic2Var;
                                if (e instanceof IllegalArgumentException) {
                                }
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                ic2Var3.a(str5, 9, false);
                                sbiVar = null;
                                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, zo5.z(strK, str4)));
                                if (sbiVar == null) {
                                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (mnfVar != null) {
                                        c(mnfVar);
                                    }
                                }
                                if (sbiVar != null) {
                                    return true;
                                }
                                return z;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason != 1) {
                                if (reason != 2) {
                                    if (reason != 3) {
                                        i = 0;
                                    } else if (reason != 4) {
                                        i = 1;
                                    } else if (reason != 5) {
                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i = 11;
                                    } else {
                                        i = 2;
                                    }
                                    z2 = true;
                                } else {
                                    i = 6;
                                }
                                z2 = true;
                            } else {
                                ic2Var = ic2Var;
                            }
                            ic2Var.a(str5, i, z2);
                            sbiVar = null;
                            z = false;
                            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, zo5.z(strK, str4)));
                            if (sbiVar == null) {
                                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                if (mnfVar != null) {
                                    c(mnfVar);
                                }
                            }
                            if (sbiVar != null) {
                                return true;
                            }
                            return z;
                        }
                        z = false;
                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, zo5.z(strK, str4)));
                        if (sbiVar == null) {
                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                            if (mnfVar != null) {
                                c(mnfVar);
                            }
                        }
                        if (sbiVar != null) {
                            return true;
                        }
                        return z;
                    } catch (Throwable th4) {
                        th = th4;
                        str = str3;
                        str2 = " - ";
                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, zo5.z(strK, str2)));
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = "%.3f ms";
                } catch (Throwable th5) {
                    th = th5;
                    str3 = "%.3f ms";
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            str = "%.3f ms";
            str2 = " - ";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zqh] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.le2
    public final boolean v0(ArrayList arrayList, id2 id2Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        mnf mnfVar;
        boolean z;
        boolean z2;
        sbi sbiVar;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        ylc ylcVarA = a(id2Var);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar2 = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar2 != null) {
            b(mnfVar2);
        }
        String str4 = this.c;
        String strK = qv1.k("CXCP#createConstrainedHighSpeedCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                ic2 ic2Var = this.d;
                try {
                    mnfVar = mnfVar2;
                    try {
                        ic2 ic2Var2 = this.d;
                        xp9 xp9Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strK;
                            z = true;
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new ng(this, id2Var, mnfVar, ic2Var2, xp9Var, handlerA), r11.a());
                                sbiVar = sbi.a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    ic2Var.a(str4, i, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        ic2Var.a(str4, 9, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    sbiVar = null;
                                    r10 = z;
                                }
                                z2 = false;
                                sbiVar = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strK;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strK;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", zo5.z(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strK;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strK;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strK;
                    mnfVar = mnfVar2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strK;
                    r11 = 1;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", zo5.z(str3, " - ")));
                if (sbiVar == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (mnfVar != null) {
                        c(mnfVar);
                    }
                }
                return sbiVar != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = strK;
            r9 = 1;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", zo5.z(str, " - ")));
            throw th;
        }
    }

    @Override // defpackage.le2
    public final void y() {
        mnf mnfVar;
        if (!this.g.a() || (mnfVar = (mnf) this.h.a) == null) {
            return;
        }
        b(mnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zqh] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.le2
    public final boolean z0(List list, id2 id2Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        mnf mnfVar;
        boolean z;
        boolean z2;
        sbi sbiVar;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        ylc ylcVarA = a(id2Var);
        boolean zBooleanValue = ((Boolean) ylcVarA.a).booleanValue();
        mnf mnfVar2 = (mnf) ylcVarA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (mnfVar2 != null) {
            b(mnfVar2);
        }
        String str4 = this.c;
        String strK = qv1.k("CXCP#createCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                ic2 ic2Var = this.d;
                try {
                    mnfVar = mnfVar2;
                    try {
                        ic2 ic2Var2 = this.d;
                        xp9 xp9Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strK;
                            z = true;
                            try {
                                cameraDevice.createCaptureSession(list, new ng(this, id2Var, mnfVar, ic2Var2, xp9Var, handlerA), r11.a());
                                sbiVar = sbi.a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    ic2Var.a(str4, i, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        ic2Var.a(str4, 9, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    sbiVar = null;
                                    r10 = z;
                                }
                                z2 = false;
                                sbiVar = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strK;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strK;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", zo5.z(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strK;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strK;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strK;
                    mnfVar = mnfVar2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strK;
                    r11 = 1;
                }
                Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", zo5.z(str3, " - ")));
                if (sbiVar == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (mnfVar != null) {
                        c(mnfVar);
                    }
                }
                return sbiVar != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = strK;
            r9 = 1;
            Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", zo5.z(str, " - ")));
            throw th;
        }
    }
}
