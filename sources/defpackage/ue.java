package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ue {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ue(CameraManager cameraManager, String str) {
        this.b = cameraManager.getCameraDeviceSetup(str);
    }

    public final ww6 a(SessionConfiguration sessionConfiguration) {
        int i = this.a;
        int i2 = 6;
        Object obj = this.b;
        byte b = 0;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ww6 ww6VarA = ((ue) it.next()).a(sessionConfiguration);
                    if (ww6VarA.b != 0) {
                        return ww6VarA;
                    }
                }
                return new ww6(b, i2, b);
            default:
                int i3 = ((CameraDevice.CameraDeviceSetup) obj).isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                return new ww6(i3, i2, b);
        }
    }

    public ue(ArrayList arrayList) {
        this.b = arrayList;
    }
}
