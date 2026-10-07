package defpackage;

import android.media.session.MediaSessionManager;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.NetworkViolation;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b88 {
    public static /* bridge */ /* synthetic */ Class C() {
        return CustomViolation.class;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder j(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return NetworkViolation.class;
    }

    public static /* synthetic */ void o(int i, int i2, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DiskReadViolation.class;
    }
}
