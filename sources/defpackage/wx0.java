package defpackage;

import android.os.SystemClock;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class wx0 {
    private static final bo7 c = new bo7("StreamingFormatChecker", "");
    private final LinkedList a = new LinkedList();
    private long b = -1;

    public void a(vg8 vg8Var) {
        if (vg8Var.j() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a.add(Long.valueOf(jElapsedRealtime));
        if (this.a.size() > 5) {
            this.a.removeFirst();
        }
        if (this.a.size() == 5) {
            Long l = (Long) this.a.peekFirst();
            yab.s(l);
            if (jElapsedRealtime - l.longValue() < 5000) {
                long j = this.b;
                if (j == -1 || jElapsedRealtime - j >= 5000) {
                    this.b = jElapsedRealtime;
                    c.e("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
