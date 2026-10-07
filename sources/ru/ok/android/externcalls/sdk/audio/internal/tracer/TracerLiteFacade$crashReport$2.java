package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import defpackage.af7;
import defpackage.ux8;
import kotlin.Metadata;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class TracerLiteFacade$crashReport$2 extends ux8 implements af7 {
    final /* synthetic */ TracerLiteFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$crashReport$2(TracerLiteFacade tracerLiteFacade) {
        super(0);
        this.this$0 = tracerLiteFacade;
    }

    @Override // defpackage.af7
    public final TracerCrashReportLite invoke() {
        return new TracerCrashReportLite(this.this$0.getTracerLite(), null, 2, null);
    }
}
