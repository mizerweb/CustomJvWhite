package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import android.util.Log;
import defpackage.ifh;
import defpackage.j95;
import defpackage.ny8;
import kotlin.Metadata;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "cause", "", "issueKey", "Lsbi;", "reportCrash", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lru/ok/tracer/lite/TracerLite;", "tracerLite$delegate", "Lny8;", "getTracerLite", "()Lru/ok/tracer/lite/TracerLite;", "tracerLite", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite;", "crashReport$delegate", "getCrashReport", "()Lru/ok/tracer/lite/crash/report/TracerCrashReportLite;", "crashReport", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TracerLiteFacade {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_AUDIOMANAGER_VERSION = "calls-audiomanager-version";

    /* JADX INFO: renamed from: crashReport$delegate, reason: from kotlin metadata */
    private final ny8 crashReport = new ifh(new TracerLiteFacade$crashReport$2(this));

    /* JADX INFO: renamed from: tracerLite$delegate, reason: from kotlin metadata */
    private final ny8 tracerLite;

    public TracerLiteFacade(Context context) {
        this.tracerLite = new ifh(new TracerLiteFacade$tracerLite$2(context));
    }

    private final TracerCrashReportLite getCrashReport() {
        return (TracerCrashReportLite) this.crashReport.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TracerLite getTracerLite() {
        return (TracerLite) this.tracerLite.getValue();
    }

    public static /* synthetic */ void reportCrash$default(TracerLiteFacade tracerLiteFacade, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerLiteFacade.reportCrash(th, str);
    }

    public final void reportCrash(Throwable cause, String issueKey) {
        try {
            getCrashReport().report(cause, issueKey);
        } catch (Throwable th) {
            Log.e("TracerLiteFacade", "Crash report failed", th);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade$Companion;", "", "()V", "KEY_AUDIOMANAGER_VERSION", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    public final void reportCrash(Throwable th) {
        reportCrash$default(this, th, null, 2, null);
    }
}
