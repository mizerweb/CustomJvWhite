package defpackage;

import android.os.Environment;
import android.os.StatFs;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class lp3 {
    public final i5d a;

    public lp3(i5d i5dVar) {
        this.a = i5dVar;
    }

    public final int a() {
        Object poeVar;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            poeVar = Long.valueOf(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object objValueOf = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
        if (poeVar instanceof poe) {
            poeVar = objValueOf;
        }
        long jLongValue = ((Number) poeVar).longValue();
        i5d i5dVar = this.a;
        if (jLongValue < ((rd7) i5dVar.i()).a) {
            return 3;
        }
        return jLongValue < ((rd7) i5dVar.i()).b ? 2 : 1;
    }
}
