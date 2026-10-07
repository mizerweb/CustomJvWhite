package defpackage;

import android.content.ClipData;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraExtensionSession;
import android.media.MediaDrm;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f82 {
    public static /* bridge */ /* synthetic */ ContentInfo C(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return CameraExtensionSession.class;
    }

    public static /* bridge */ /* synthetic */ CameraExtensionCharacteristics d(Object obj) {
        return (CameraExtensionCharacteristics) obj;
    }

    public static /* bridge */ /* synthetic */ CameraExtensionSession e(Object obj) {
        return (CameraExtensionSession) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent g(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver j(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* synthetic */ ContentInfo.Builder k(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder l(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo n(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return CameraExtensionCharacteristics.class;
    }

    public static /* synthetic */ void r() {
    }
}
