package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ndl {
    public static void a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, b(j2, j)));
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? BuildConfig.MAX_TIME_TO_UPLOAD : j3;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int d(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
