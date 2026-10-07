package kotlinx.coroutines.android;

import android.os.Looper;
import defpackage.lk9;
import defpackage.ore;
import defpackage.qk9;
import defpackage.rs7;
import defpackage.ss7;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lqk9;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidDispatcherFactory implements qk9 {
    @Override // defpackage.qk9
    public final lk9 a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new rs7(ss7.a(mainLooper), false);
        }
        ore.k("The main looper is not available");
        return null;
    }

    @Override // defpackage.qk9
    public final int b() {
        return 1073741823;
    }
}
