package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.gg8;
import defpackage.lhb;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements gg8 {
    @Override // defpackage.gg8
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.gg8
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: mpd
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new jn5(applicationContext, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new lhb(22);
    }
}
