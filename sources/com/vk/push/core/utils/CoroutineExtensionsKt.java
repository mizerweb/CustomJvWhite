package com.vk.push.core.utils;

import defpackage.ao5;
import defpackage.ck2;
import defpackage.poe;
import defpackage.qd6;
import defpackage.xt4;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"T", "Lck2;", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "safeResume", "(Lck2;Ljava/lang/Object;)V", "", "throwable", "safeResumeWithException", "(Lck2;Ljava/lang/Throwable;)V", "Lao5;", "Lxt4;", "getSingleThread", "(Lao5;)Lxt4;", "SingleThread", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CoroutineExtensionsKt {
    public static final xt4 getSingleThread(ao5 ao5Var) {
        return new qd6(Executors.newSingleThreadExecutor());
    }

    public static final synchronized <T> void safeResume(ck2 ck2Var, T t) {
        if (ck2Var.isActive()) {
            ck2Var.resumeWith(t);
        }
    }

    public static final synchronized <T> void safeResumeWithException(ck2 ck2Var, Throwable th) {
        if (ck2Var.isActive()) {
            ck2Var.resumeWith(new poe(th));
        }
    }
}
