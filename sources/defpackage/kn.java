package defpackage;

import android.graphics.Picture;
import android.os.SystemClock;
import java.util.function.Supplier;
import one.video.calls.sdk_private.m;
import one.video.calls.sdk_private.n;
import one.video.calls.sdk_private.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kn implements Supplier {
    public final /* synthetic */ int a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Picture();
            case 1:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 2:
                return new n("");
            case 3:
                return new m("failed to negotiate signature scheme");
            case 4:
                return new p();
            case 5:
                return new dea();
            default:
                return new IllegalStateException("Can't find connection id that is not retired");
        }
    }
}
