package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ya2 {
    public final zqh a;
    public final dc2 b;
    public final kc2 c;
    public final txd d;
    public final i1m e;
    public final Object f = new Object();
    public final LinkedHashSet g = new LinkedHashSet();

    public ya2(zqh zqhVar, dc2 dc2Var, kc2 kc2Var, txd txdVar, i1m i1mVar) {
        this.a = zqhVar;
        this.b = dc2Var;
        this.c = kc2Var;
        this.d = txdVar;
        this.e = i1mVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x020c  */
    /* JADX WARN: Code duplicated, block: B:109:0x020f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0219  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01db  */
    public final Object a(se2 se2Var, nq4 nq4Var) throws Exception {
        xa2 xa2Var;
        SessionConfiguration sessionConfigurationF;
        se2 se2Var2;
        ue ueVar;
        OutputConfiguration outputConfiguration;
        hc2 hc2Var;
        CaptureRequest.Builder builderCreateCaptureRequest;
        Integer num;
        Object key;
        Object value;
        CaptureRequest.Key key2;
        int i;
        se2 se2Var3 = se2Var;
        if (nq4Var instanceof xa2) {
            xa2Var = (xa2) nq4Var;
            int i2 = xa2Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xa2Var.i = i2 - Integer.MIN_VALUE;
            } else {
                xa2Var = new xa2(this, nq4Var);
            }
        } else {
            xa2Var = new xa2(this, nq4Var);
        }
        Object objB = xa2Var.g;
        int i3 = xa2Var.i;
        dc2 dc2Var = this.b;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objB);
            if (Build.VERSION.SDK_INT < 35) {
                return new fa4(0);
            }
            String str = se2Var3.a;
            xa2Var.d = se2Var3;
            xa2Var.i = 1;
            objB = dc2Var.b(str, xa2Var);
            if (objB != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 == 1) {
            se2Var3 = xa2Var.d;
            ch3.d0(objB);
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SessionConfiguration sessionConfigurationK = n4.k(xa2Var.f);
            ueVar = xa2Var.e;
            se2Var2 = xa2Var.d;
            ch3.d0(objB);
            sessionConfigurationF = sessionConfigurationK;
        }
        hc2Var = (hc2) objB;
        if (hc2Var != null) {
            int i4 = se2Var2.f;
            String str2 = hc2Var.b;
            ic2 ic2Var = hc2Var.c;
            try {
                builderCreateCaptureRequest = hc2Var.a.createCaptureRequest(i4);
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    boolean z = true;
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
                        z = true;
                    } else {
                        i = 3;
                    }
                    ic2Var.a(str2, i, z);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    ic2Var.a(str2, 9, false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
                builderCreateCaptureRequest = null;
            }
        } else {
            builderCreateCaptureRequest = null;
        }
        if (builderCreateCaptureRequest != null) {
            for (Map.Entry entry : se2Var2.g.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (key instanceof CaptureRequest.Key) {
                    key2 = (CaptureRequest.Key) key;
                } else {
                    key2 = null;
                }
                if (key2 != null) {
                    builderCreateCaptureRequest.set(key2, value);
                }
            }
            sessionConfigurationF.setSessionParameters(builderCreateCaptureRequest.build());
        }
        if (ueVar != null) {
            num = new Integer(ueVar.a(sessionConfigurationF).b);
        } else {
            num = null;
        }
        return num != null ? new fa4(num.intValue()) : new fa4(0);
        ue ueVar2 = (ue) objB;
        int i5 = se2Var3.h;
        String str3 = se2Var3.a;
        if (i5 == 0) {
            i5 = 0;
        } else if (i5 == 1) {
            i5 = 1;
        } else if (i5 == 2) {
            Log.i("CXCP", "Unsupported session mode: " + ((Object) bjl.b(se2Var3.h)));
            return new fa4(0);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = se2Var3.b.iterator();
        while (it.hasNext()) {
            for (xjc xjcVar : ((ai2) it.next()).a) {
                int i6 = xjcVar.b;
                String str4 = xjcVar.c;
                kh khVarA = er3.A(null, Integer.valueOf(i6), l6m.n, xjcVar.d, xjcVar.e, xjcVar.f, xjcVar.h, xjcVar.a, false, 0, !(str4 == null ? false : str4.equals(str3)) ? str4 : null, 1536);
                if (khVarA != null && (outputConfiguration = (OutputConfiguration) khVarA.W(zfe.a(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        sessionConfigurationF = lo.f(i5, ww3.T1(linkedHashSet));
        xa2Var.d = se2Var3;
        xa2Var.e = ueVar2;
        xa2Var.f = sessionConfigurationF;
        xa2Var.i = 2;
        Object objC = dc2Var.c(str3, xa2Var);
        if (objC != hu4Var) {
            se2Var2 = se2Var3;
            ueVar = ueVar2;
            objB = objC;
            hc2Var = (hc2) objB;
            if (hc2Var != null) {
                int i7 = se2Var2.f;
                String str5 = hc2Var.b;
                ic2 ic2Var2 = hc2Var.c;
                builderCreateCaptureRequest = hc2Var.a.createCaptureRequest(i7);
            } else {
                builderCreateCaptureRequest = null;
            }
            if (builderCreateCaptureRequest != null) {
                while (r2.hasNext()) {
                    key = entry.getKey();
                    value = entry.getValue();
                    if (key instanceof CaptureRequest.Key) {
                        key2 = (CaptureRequest.Key) key;
                    } else {
                        key2 = null;
                    }
                    if (key2 != null) {
                        builderCreateCaptureRequest.set(key2, value);
                    }
                }
                sessionConfigurationF.setSessionParameters(builderCreateCaptureRequest.build());
            }
            if (ueVar != null) {
                num = new Integer(ueVar.a(sessionConfigurationF).b);
            } else {
                num = null;
            }
            if (num != null) {
            }
        }
        return hu4Var;
    }
}
