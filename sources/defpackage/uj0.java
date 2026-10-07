package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* JADX INFO: loaded from: classes.dex */
public final class uj0 extends cne {
    @Override // defpackage.cne, defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return new l6g(qt4.l("circle|resize:", this.c, this.d, ","));
    }

    @Override // defpackage.ds0
    public final void c(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, true);
    }

    @Override // defpackage.cne, defpackage.ds0, defpackage.qcd
    public final String getName() {
        return nbh.u("AvatarAsCirclePostProcessor(", this.c, ",", this.d, ")");
    }
}
