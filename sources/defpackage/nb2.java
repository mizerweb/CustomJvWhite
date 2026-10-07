package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nb2 implements mwa, ndi {
    public final String a;
    public final int b;
    public final CameraExtensionCharacteristics c;
    public final ny8 d;

    public nb2(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        this.a = str;
        this.b = i;
        this.c = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        rx8.P(2, new mb2(this, 0));
        rx8.P(2, new mb2(this, 1));
        this.d = rx8.P(2, new mb2(this, 2));
        rx8.P(2, new mb2(this, 3));
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(f82.o()))) {
            return this.c;
        }
        return null;
    }
}
