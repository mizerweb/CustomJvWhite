package defpackage;

import android.content.res.Resources;
import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v25 implements pah {
    public final /* synthetic */ int a;

    @Override // defpackage.pah
    public final Object get() {
        int dimensionPixelSize;
        switch (this.a) {
            case 0:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof h1b) {
                    return (h1b) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new k1b((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new h1b(executorServiceNewSingleThreadExecutor);
            case 1:
                Resources system = Resources.getSystem();
                try {
                    dimensionPixelSize = system.getDimensionPixelSize(system.getIdentifier("notification_right_icon_size", "dimen", "android"));
                    break;
                } catch (Resources.NotFoundException unused) {
                    dimensionPixelSize = (int) (system.getDisplayMetrics().density * 48.0f);
                }
                return Integer.valueOf(dimensionPixelSize);
            case 2:
                byte[] bArr = new byte[12];
                xc5.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new yb5(new y65(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, lhe.g);
            case 4:
                Resources system2 = Resources.getSystem();
                int dimensionPixelSize2 = system2.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize2 = system2.getDimensionPixelSize(system2.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                    break;
                } catch (Resources.NotFoundException unused2) {
                }
                return Integer.valueOf(dimensionPixelSize2);
            default:
                throw new IllegalStateException();
        }
    }
}
