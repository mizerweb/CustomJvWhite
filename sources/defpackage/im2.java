package defpackage;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes2.dex */
public final class im2 implements cle {
    public final /* synthetic */ i64 a;

    public im2(i64 i64Var) {
        this.a = i64Var;
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) {
        this.a.Q(null);
    }

    @Override // defpackage.cle
    public final void Y(jme jmeVar, long j, eme emeVar) {
        this.a.j0(new ImageCaptureException(2, "Capture request failed with reason " + emeVar.r0(), null));
    }

    @Override // defpackage.cle
    public final void o0(fle fleVar) {
        this.a.j0(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
    }
}
