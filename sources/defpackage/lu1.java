package defpackage;

import android.os.SystemClock;
import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lu1 implements LongSupplier {
    public final /* synthetic */ int a;

    @Override // java.util.function.LongSupplier
    public final long getAsLong() {
        switch (this.a) {
            case 0:
                return System.currentTimeMillis();
            case 1:
                return System.currentTimeMillis();
            default:
                return SystemClock.uptimeMillis();
        }
    }
}
