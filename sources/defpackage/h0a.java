package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h0a implements plh {
    public boolean a;
    public boolean b;

    public h0a(s2e s2eVar) {
        boolean z;
        Iterator it = s2eVar.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).b()) {
                z = true;
                this.a = z;
                this.b = s2eVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
            }
        }
        z = false;
        this.a = z;
        this.b = s2eVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // defpackage.plh
    public Map b(pme pmeVar) {
        if (pmeVar != null && pmeVar.a == 3 && this.a) {
            return Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
        }
        return (pmeVar != null && pmeVar.a == 4 && this.b) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2) : s66.a;
    }
}
