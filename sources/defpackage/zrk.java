package defpackage;

import android.content.ComponentName;
import android.media.ImageWriter;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zrk {
    public static dh a(Surface surface, int i, d4h d4hVar, Handler handler) {
        ImageWriter imageWriterNewInstance;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = d4hVar.a;
        if (i2 >= 29) {
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1, i3);
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) d4h.b(i3)) + ") for " + ((Object) ("Input-" + i)) + ". Android " + i2 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1);
        }
        dh dhVar = new dh(imageWriterNewInstance, i);
        imageWriterNewInstance.setOnImageReleasedListener(dhVar, handler);
        return dhVar;
    }

    public static void b(v2a v2aVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((q2a) v2aVar.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            lvb.l0("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }
}
