package defpackage;

import android.media.metrics.EditingEndedEvent;
import android.media.metrics.MediaItemInfo;
import javax.crypto.spec.ChaCha20ParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u26 {
    public static /* synthetic */ EditingEndedEvent.Builder d(int i) {
        return new EditingEndedEvent.Builder(i);
    }

    public static /* synthetic */ MediaItemInfo.Builder h() {
        return new MediaItemInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ MediaItemInfo i(Object obj) {
        return (MediaItemInfo) obj;
    }

    public static /* synthetic */ ChaCha20ParameterSpec j(int i, byte[] bArr) {
        return new ChaCha20ParameterSpec(bArr, i);
    }

    public static /* synthetic */ void k() {
    }
}
