package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class pue extends ds0 {
    public l6g c;

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        if (this.c == null) {
            this.c = new l6g("RoundAsCirclePostprocessor#AntiAliased");
        }
        return this.c;
    }

    @Override // defpackage.ds0
    public final void c(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, true);
    }
}
