package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wwi implements DisplayManager.DisplayListener {
    public final Choreographer a;
    public final DisplayManager b;
    public volatile long c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public wwi(Choreographer choreographer, DisplayManager displayManager) {
        this.a = choreographer;
        this.b = displayManager;
    }

    public static wwi a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        try {
            Choreographer choreographer = Choreographer.getInstance();
            return Build.VERSION.SDK_INT >= 33 ? new zwi(choreographer, displayManager) : new xwi(choreographer, displayManager);
        } catch (RuntimeException e) {
            lvb.H0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            return null;
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
