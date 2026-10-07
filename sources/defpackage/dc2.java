package defpackage;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Provider;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class dc2 {
    public final Provider a;
    public final zqh b;
    public final ic2 c;
    public final Provider d;
    public final dq4 e;
    public final Object f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final int j;
    public final q8e k;
    public final ifh l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public dc2(Provider provider, zqh zqhVar, PackageManager packageManager, ic2 ic2Var, Provider provider2, qg2 qg2Var, vo8 vo8Var) {
        this.a = provider;
        this.b = zqhVar;
        this.c = ic2Var;
        this.d = provider2;
        dq4 dq4VarA = cqk.a(lvb.x0(new nah(vo8Var), zqhVar.h).u0(new du4("Camera2DeviceCache")));
        this.e = dq4VarA;
        this.f = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        this.j = i;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i);
        qg2Var.a(new c3(26, this), 2);
        this.k = e9i.E0(e9i.I(e9i.o(new qt1(this, null, 17))), dq4VarA, new nig(BuildConfig.MAX_TIME_TO_UPLOAD), 1);
        this.l = new ifh(new yk1(15, this));
    }

    public static final void a(dc2 dc2Var, njd njdVar, String str, boolean z) {
        ArrayList arrayList;
        synchronized (dc2Var.f) {
            arrayList = dc2Var.g;
        }
        ArrayList arrayListD = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        Log.i("CXCP", "New camera " + str + " detected");
                        arrayListD = dc2Var.d();
                        break;
                    }
                } while (!cqk.d(((ef2) it.next()).a, str));
            } else {
                Log.i("CXCP", "New camera " + str + " detected");
                arrayListD = dc2Var.d();
                break;
            }
        } else {
            if (z) {
                ore.o();
                return;
            }
            if (arrayList == null) {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayListD = dc2Var.d();
                break;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (cqk.d(((ef2) it2.next()).a, str)) {
                        Log.i("CXCP", "Unavailable camera " + str + " detected");
                        arrayListD = dc2Var.d();
                        break;
                    }
                }
            }
        }
        if (arrayListD != null && (arrayListD.size() >= dc2Var.j || arrayList == null)) {
            arrayList = arrayListD;
        }
        if (arrayList != null) {
            e(njdVar, arrayList);
        }
    }

    public static void e(njd njdVar, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (all.b(njdVar, arrayList) instanceof cs2) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, nq4 nq4Var) {
        ac2 ac2Var;
        xf5 xf5Var;
        if (nq4Var instanceof ac2) {
            ac2Var = (ac2) nq4Var;
            int i = ac2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac2Var.h = i - Integer.MIN_VALUE;
            } else {
                ac2Var = new ac2(this, nq4Var);
            }
        } else {
            ac2Var = new ac2(this, nq4Var);
        }
        Object objZ0 = ac2Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = ac2Var.h;
        if (i2 == 0) {
            ch3.d0(objZ0);
            if (Build.VERSION.SDK_INT < 35) {
                return null;
            }
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.h;
                    ef2 ef2Var = new ef2(str);
                    Object objH = linkedHashMap.get(ef2Var);
                    if (objH == null) {
                        objH = yab.h(this.e, this.b.f, 0, new bc2(str, this, null, 0), 2);
                        linkedHashMap.put(ef2Var, objH);
                    }
                    xf5Var = (xf5) objH;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ac2Var.d = str;
            ac2Var.e = xf5Var;
            ac2Var.h = 1;
            objZ0 = xf5Var.z0(ac2Var);
            if (objZ0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xf5 xf5Var2 = ac2Var.e;
            String str2 = ac2Var.d;
            ch3.d0(objZ0);
            xf5Var = xf5Var2;
            str = str2;
        }
        ue ueVar = (ue) objZ0;
        if (ueVar != null) {
            return ueVar;
        }
        Log.d("CXCP", "Removing null CameraDeviceSetupCompat from cache for " + ((Object) ef2.b(str)));
        synchronized (this.f) {
            this.h.remove(new ef2(str), xf5Var);
        }
        return ueVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, nq4 nq4Var) {
        cc2 cc2Var;
        xf5 xf5Var;
        if (nq4Var instanceof cc2) {
            cc2Var = (cc2) nq4Var;
            int i = cc2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc2Var.h = i - Integer.MIN_VALUE;
            } else {
                cc2Var = new cc2(this, nq4Var);
            }
        } else {
            cc2Var = new cc2(this, nq4Var);
        }
        Object objZ0 = cc2Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = cc2Var.h;
        if (i2 == 0) {
            ch3.d0(objZ0);
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.i;
                    ef2 ef2Var = new ef2(str);
                    Object objH = linkedHashMap.get(ef2Var);
                    if (objH == null) {
                        objH = yab.h(this.e, this.b.f, 0, new bc2(str, this, null, 1), 2);
                        linkedHashMap.put(ef2Var, objH);
                    }
                    xf5Var = (xf5) objH;
                } catch (Throwable th) {
                    throw th;
                }
            }
            cc2Var.d = str;
            cc2Var.e = xf5Var;
            cc2Var.h = 1;
            objZ0 = xf5Var.z0(cc2Var);
            if (objZ0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xf5 xf5Var2 = cc2Var.e;
            String str2 = cc2Var.d;
            ch3.d0(objZ0);
            xf5Var = xf5Var2;
            str = str2;
        }
        hc2 hc2Var = (hc2) objZ0;
        if (hc2Var != null) {
            return hc2Var;
        }
        Log.d("CXCP", "Removing null camera2DeviceSetupWrapper from cache for " + ((Object) ef2.b(str)));
        synchronized (this.f) {
            this.i.remove(new ef2(str), xf5Var);
        }
        return hc2Var;
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.a.get()).getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                ef2.a(str);
                arrayList.add(new ef2(str));
            }
            if (arrayList.size() < this.j) {
                Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.f) {
                this.g = arrayList;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }
}
