package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class bc2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ dc2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc2(String str, dc2 dc2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = str;
        this.g = dc2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        dc2 dc2Var = this.g;
        String str = this.f;
        switch (i) {
            case 0:
                return new bc2(str, dc2Var, lq4Var, 0);
            default:
                return new bc2(str, dc2Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((bc2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Exception {
        int i;
        Boolean boolValueOf;
        int i2;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i3;
        int i4 = this.e;
        dc2 dc2Var = this.g;
        String str = this.f;
        switch (i4) {
            case 0:
                ch3.d0(obj);
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) ef2.b(str)));
                ic2 ic2Var = dc2Var.c;
                try {
                    ke2 ke2Var = (ke2) dc2Var.l.getValue();
                    ke2Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    lb2 lb2Var = ke2Var.a;
                    if (lb2Var != null) {
                        arrayList.add(new ue(lb2Var.a, str));
                    }
                    lb2 lb2Var2 = ke2Var.b;
                    if (lb2Var2 != null) {
                        try {
                            arrayList.add(new ue(lb2Var2.a, str));
                            break;
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new ue(arrayList);
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i = 3;
                        } else if (reason == 2) {
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
                    return null;
                }
            default:
                ch3.d0(obj);
                Provider provider = dc2Var.a;
                ic2 ic2Var2 = dc2Var.c;
                try {
                    boolValueOf = Boolean.valueOf(((CameraManager) provider.get()).isCameraDeviceSetupSupported(str));
                    break;
                } catch (Exception e2) {
                    if (e2 instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                        CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                        int reason2 = cameraAccessException2.getReason();
                        if (reason2 == 1) {
                            i2 = 3;
                        } else if (reason2 == 2) {
                            i2 = 6;
                        } else if (reason2 == 3) {
                            i2 = 0;
                        } else if (reason2 == 4) {
                            i2 = 1;
                        } else if (reason2 != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                        ic2Var2.a(str, i2, true);
                    } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                        ic2Var2.a(str, 9, false);
                    } else {
                        if (!(e2 instanceof IllegalStateException)) {
                            throw e2;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    boolValueOf = null;
                }
                if (cqk.d(boolValueOf, Boolean.TRUE)) {
                    Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) ef2.b(str)));
                    try {
                        cameraDeviceSetup = ((CameraManager) provider.get()).getCameraDeviceSetup(str);
                    } catch (Exception e3) {
                        if (e3 instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e3.getMessage());
                            CameraAccessException cameraAccessException3 = (CameraAccessException) e3;
                            int reason3 = cameraAccessException3.getReason();
                            if (reason3 == 1) {
                                i3 = 3;
                            } else if (reason3 == 2) {
                                i3 = 6;
                            } else if (reason3 == 3) {
                                i3 = 0;
                            } else if (reason3 == 4) {
                                i3 = 1;
                            } else if (reason3 != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException3);
                                i3 = 11;
                            } else {
                                i3 = 2;
                            }
                            ic2Var2.a(str, i3, true);
                        } else if ((e3 instanceof IllegalArgumentException) || (e3 instanceof SecurityException) || (e3 instanceof UnsupportedOperationException) || (e3 instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e3.getMessage());
                            ic2Var2.a(str, 9, false);
                        } else {
                            if (!(e3 instanceof IllegalStateException)) {
                                throw e3;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        cameraDeviceSetup = null;
                    }
                    if (cameraDeviceSetup != null) {
                        return new hc2(cameraDeviceSetup, str, ic2Var2);
                    }
                    break;
                }
                return null;
        }
    }
}
