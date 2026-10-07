package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ynl {
    public static q54 a(Byte b) {
        Object obj = null;
        if (b == null) {
            return null;
        }
        y1 y1Var = new y1(0, q54.l);
        while (y1Var.hasNext()) {
            Object next = y1Var.next();
            if (((q54) next).a == b.byteValue()) {
                obj = next;
                break;
            }
        }
        return (q54) obj;
    }

    public static final void b(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    public static final void c(CaptureRequest.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b(builder, entry.getKey(), entry.getValue());
        }
    }
}
