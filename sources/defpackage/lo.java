package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class lo {
    public static /* synthetic */ OutputConfiguration e(int i, Size size) {
        return new OutputConfiguration(i, size);
    }

    public static /* synthetic */ SessionConfiguration f(int i, List list) {
        return new SessionConfiguration(i, list);
    }
}
