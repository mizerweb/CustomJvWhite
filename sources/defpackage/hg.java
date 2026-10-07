package defpackage;

import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.media.AudioProfile;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hg {
    public static /* synthetic */ ExtensionSessionConfiguration f(int i, ArrayList arrayList, ww0 ww0Var, CameraExtensionSession$StateCallback cameraExtensionSession$StateCallback) {
        return new ExtensionSessionConfiguration(i, arrayList, ww0Var, cameraExtensionSession$StateCallback);
    }

    public static /* synthetic */ InputConfiguration g(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo h(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* bridge */ /* synthetic */ AudioProfile j(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ void o() {
    }
}
