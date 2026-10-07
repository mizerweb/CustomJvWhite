package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.nf2;
import defpackage.pi0;

/* JADX INFO: loaded from: classes2.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean c(nf2 nf2Var, pi0 pi0Var) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && nf2Var.j() == 0 && pi0Var == pi0.e;
    }
}
