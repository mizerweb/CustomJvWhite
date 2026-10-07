package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes2.dex */
public final class lb2 {
    public final CameraManager a;

    public lb2(Context context) {
        this.a = (CameraManager) context.getSystemService(CameraManager.class);
    }
}
