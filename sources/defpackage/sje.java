package defpackage;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sje implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uje b;

    public /* synthetic */ sje(uje ujeVar, int i) {
        this.a = i;
        this.b = ujeVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        uje ujeVar = this.b;
        switch (i) {
            case 0:
                break;
            default:
                ujeVar.a();
                return sbiVar;
        }
        while (ujeVar.f > 0) {
            hle hleVar = ujeVar.g;
            hleVar.getClass();
            try {
                SurfaceTexture surfaceTexture = (SurfaceTexture) hleVar.c;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (((SurfaceTexture) hleVar.c) != null) {
                    ujeVar.e = true;
                }
            } catch (RuntimeException unused) {
            }
            ujeVar.f--;
        }
        return sbiVar;
    }
}
