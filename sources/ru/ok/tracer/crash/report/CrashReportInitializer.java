package ru.ok.tracer.crash.report;

import android.content.Context;
import defpackage.fg8;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/crash/report/CrashReportInitializer;", "Lfg8;", "Lxwh;", "<init>", "()V", "tracer-crash-report_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CrashReportInitializer implements fg8 {
    @Override // defpackage.fg8
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.fg8
    public final Object b(Context context) {
        return null;
    }
}
