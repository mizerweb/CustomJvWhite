package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class s0j implements ug4 {
    public final ich a;
    public final SurfaceTexture b;
    public final Surface c;
    public final /* synthetic */ t0j d;

    public s0j(t0j t0jVar, ich ichVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.d = t0jVar;
        this.a = ichVar;
        this.b = surfaceTexture;
        this.c = surface;
    }

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        String strH;
        t0j t0jVar = this.d;
        String str = t0jVar.a;
        int i = ((cj0) obj).a;
        if (i == 0) {
            strH = "SURFACE_USED_SUCCESSFULLY";
        } else if (i == 1) {
            strH = "REQUEST_CANCELLED";
        } else if (i == 2) {
            strH = "INVALID_SURFACE";
        } else if (i != 3) {
            strH = i != 4 ? zo5.h(i, "SerufaceRequest.Result_UNKNOWN_code_") : "WILL_NOT_PROVIDE_SURFACE";
        } else {
            strH = "SURFACE_ALREADY_PROVIDED";
        }
        gm0.n(str, "onSurfaceRequestResult event=".concat(strH));
        t0jVar.b();
        this.a.a();
        SurfaceTexture surfaceTexture = this.b;
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        this.c.release();
        t0jVar.l--;
        t0jVar.f();
    }
}
