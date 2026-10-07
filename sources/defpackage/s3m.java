package defpackage;

import android.content.Context;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s3m {
    public static void a(fx5 fx5Var) {
        if (fx5Var.equals(fx5.f)) {
            throw new VideoMessageProcessorException("The specified dynamic range=" + fx5Var + " is not supported yet", null);
        }
    }

    public static final long b(Context context) {
        return context.getSharedPreferences("app_crash_prefs", 0).getLong("pref_last_crash_time", 0L);
    }
}
