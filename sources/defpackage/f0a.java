package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.os.VibratorManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f0a {
    public static /* bridge */ /* synthetic */ VibratorManager h(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
