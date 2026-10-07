package defpackage;

import android.content.Context;
import android.media.ImageReader;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d3m {
    public static ch a(int i, int i2, int i3, int i4) {
        return new ch(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static final int b(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "vibrate_when_ringing", 0) == 1 ? 1 : 2;
        } catch (Exception e) {
            gm0.V("VibrationUtils", "Failed to get info about call vibration state", e);
            return 3;
        }
    }
}
