package defpackage;

import android.graphics.RectF;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o3m {
    public static final /* synthetic */ int a = 0;

    public static r60 a(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new r60(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    public static awi b(awi awiVar, Size size) {
        if (!(awiVar instanceof dwi)) {
            if (sk5.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                awiVar = new dwi(awiVar);
            } else if (size != null && !awiVar.f(size.getWidth(), size.getHeight())) {
                tvj.g("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + awiVar.j() + '/' + awiVar.k());
                awiVar = new dwi(awiVar);
            }
        }
        if (size != null && (awiVar instanceof dwi)) {
            ((dwi) awiVar).d.add(size);
        }
        return awiVar;
    }
}
