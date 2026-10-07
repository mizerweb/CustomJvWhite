package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wg implements pc7 {
    public final TotalCaptureResult a;
    public final xg b;

    public wg(TotalCaptureResult totalCaptureResult, String str) {
        this.a = totalCaptureResult;
        this.b = new xg(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            Map physicalCameraTotalResults = i >= 31 ? totalCaptureResult.getPhysicalCameraTotalResults() : i >= 28 ? totalCaptureResult.getPhysicalCameraResults() : s66.a;
            if (physicalCameraTotalResults != null && !physicalCameraTotalResults.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(physicalCameraTotalResults.size());
                for (Map.Entry entry : physicalCameraTotalResults.entrySet()) {
                    String str2 = (String) entry.getKey();
                    ef2.a(str2);
                    arrayMap.put(new ef2(str2), new xg((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(CaptureResult.class)) || sr3Var.equals(zfe.a(TotalCaptureResult.class))) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.pc7
    public final xg getMetadata() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
        xg xgVar = this.b;
        sb.append((Object) ef2.b(xgVar.b));
        sb.append(", frameNumber: ");
        sb.append(xgVar.a.getFrameNumber());
        sb.append(')');
        return sb.toString();
    }
}
