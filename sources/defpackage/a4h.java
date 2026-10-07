package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class a4h {
    public final sjc a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final c4h c;

    public a4h(StreamConfigurationMap streamConfigurationMap, sjc sjcVar) {
        this.a = sjcVar;
        new LinkedHashMap();
        new LinkedHashMap();
        this.c = Build.VERSION.SDK_INT >= 34 ? new b4h(0, streamConfigurationMap) : new c4h(0, streamConfigurationMap);
    }

    public final Size[] a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Size[] sizeArrC = null;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            sizeArrC = this.c.c(i);
        } catch (Throwable th) {
            tvj.i("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArrC == null || sizeArrC.length == 0) {
            tvj.g("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return sizeArrC;
        }
        sjc sjcVar = this.a;
        sjcVar.getClass();
        ArrayList arrayList = new ArrayList(new wv(sizeArrC, false));
        if (sjcVar.c != null) {
            Size[] sizeArr2 = (i == 34 && (Build.MANUFACTURER.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length != 0) {
                cx3.a1(arrayList, sizeArr2);
            }
        }
        bg2 bg2Var = sjcVar.a;
        if (bg2Var != null && sjcVar.b != null) {
            String str = ((qb2) bg2Var).a;
            boolean zC = uwl.c();
            Collection<?> collectionP0 = r66.a;
            if (zC) {
                if (str.equals("0") && i == 256) {
                    collectionP0 = xw3.P0(new Size(4160, 3120), new Size(y5g.CLOSE_SOCKET_CODE_TIMEOUT, 3000));
                }
            } else if (uwl.d()) {
                if (str.equals("0") && i == 256) {
                    collectionP0 = xw3.P0(new Size(4160, 3120), new Size(y5g.CLOSE_SOCKET_CODE_TIMEOUT, 3000));
                }
            } else if (uwl.a()) {
                if (str.equals("0") && (i == 34 || i == 35)) {
                    collectionP0 = xw3.P0(new Size(720, 720), new Size(HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST));
                }
            } else if (uwl.h()) {
                if (str.equals("0")) {
                    if (i == 34) {
                        collectionP0 = xw3.P0(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(np0.q, 1536), new Size(np0.q, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionP0 = xw3.P0(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(np0.q, 1536), new Size(np0.q, 1152), new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    collectionP0 = xw3.P0(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(np0.q, 1536), new Size(np0.q, 1152), new Size(1920, 1080));
                }
            } else if (uwl.g()) {
                if (str.equals("0")) {
                    if (i == 34) {
                        collectionP0 = xw3.P0(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(np0.q, 1536), new Size(np0.q, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionP0 = xw3.P0(new Size(np0.q, 1536), new Size(np0.q, 1152), new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    collectionP0 = xw3.P0(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(np0.q, 1536), new Size(np0.q, 1152), new Size(1920, 1080));
                }
            } else if (uwl.e()) {
                if (str.equals("0") && i == 256) {
                    collectionP0 = Collections.singletonList(new Size(9280, 6944));
                }
            } else if (uwl.f()) {
                if (i == 35) {
                    collectionP0 = xw3.P0(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                }
            } else if (uwl.b()) {
                if (i == 35) {
                    collectionP0 = xw3.P0(new Size(4032, 3024), new Size(y5g.CLOSE_SOCKET_CODE_TIMEOUT, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                }
            } else if (!uwl.i()) {
                tvj.g("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
            } else if (str.equals("1") && i == 35) {
                collectionP0 = xw3.P0(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
            }
            Collection<?> collection = collectionP0;
            if (!collection.isEmpty()) {
                arrayList.removeAll(collection);
            }
        }
        if (arrayList.isEmpty()) {
            tvj.g("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr3 = (Size[]) arrayList.toArray(new Size[0]);
        linkedHashMap.put(Integer.valueOf(i), sizeArr3);
        return (Size[]) sizeArr3.clone();
    }
}
