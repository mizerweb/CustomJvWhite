package defpackage;

import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.facebook.fresco.ui.common.OnFadeListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class erk implements OnFadeListener {
    public static int a(boolean z) {
        List supportedPerformancePoints;
        try {
            a87 a87Var = new a87();
            a87Var.m = uya.n("video/avc");
            b87 b87Var = new b87(a87Var);
            String str = b87Var.n;
            if (str != null) {
                List listE = ut9.e(str, z, false);
                String strC = ut9.c(b87Var);
                Iterable iterableE = strC == null ? ghe.e : ut9.e(strC, z, false);
                z88 z88VarL = c98.l();
                z88VarL.f(listE);
                z88VarL.f(iterableE);
                ghe gheVarH = z88VarL.h();
                for (int i = 0; i < gheVarH.d; i++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((nt9) gheVarH.get(i)).d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        ht6.m();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointG = ht6.g();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (ht6.i(supportedPerformancePoints.get(i2)).covers(performancePointG)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }
}
