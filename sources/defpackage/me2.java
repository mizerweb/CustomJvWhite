package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class me2 {
    public final qc2 a;

    public me2(qc2 qc2Var) {
        this.a = qc2Var;
    }

    public static ArrayList a(me2 me2Var) {
        ArrayList arrayListD;
        dc2 dc2Var = me2Var.c().b;
        synchronized (dc2Var.f) {
            arrayListD = dc2Var.g;
        }
        if (arrayListD == null) {
            arrayListD = dc2Var.d();
        }
        if (arrayListD == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) pc2.a("CXCP-Camera2")));
        }
        return arrayListD;
    }

    public static Set b(me2 me2Var) {
        dc2 dc2Var = me2Var.c().b;
        if (Build.VERSION.SDK_INT < 30) {
            dc2Var.getClass();
            return c76.a;
        }
        synchronized (dc2Var.f) {
        }
        try {
            Set<Set> concurrentCameraIds = ((CameraManager) dc2Var.a.get()).getConcurrentCameraIds();
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds);
            ArrayList arrayList = new ArrayList(yw3.W0(concurrentCameraIds, 10));
            for (Set<String> set : concurrentCameraIds) {
                ArrayList arrayList2 = new ArrayList(yw3.W0(set, 10));
                for (String str : set) {
                    ef2.a(str);
                    arrayList2.add(new ef2(str));
                }
                arrayList.add(ww3.X1(arrayList2));
            }
            return ww3.X1(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public final ya2 c() {
        qc2 qc2Var = this.a;
        try {
            Trace.beginSection("getCameraBackend");
            qc2Var.d.getClass();
            ya2 ya2VarA = qc2Var.a("CXCP-Camera2");
            if (ya2VarA != null) {
                Trace.endSection();
                return ya2VarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) pc2.a("CXCP-Camera2"))).toString());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
