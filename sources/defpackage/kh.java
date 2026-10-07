package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class kh implements ndi {
    public final OutputConfiguration a;
    public final Surface b;

    public kh(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
        this.b = outputConfiguration.getSurface();
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(OutputConfiguration.class))) {
            return this.a;
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
