package defpackage;

import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* JADX INFO: loaded from: classes3.dex */
public final class ugf extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMetricsEventJobService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ugf(SendMetricsEventJobService sendMetricsEventJobService, int i) {
        super(0);
        this.a = i;
        this.b = sendMetricsEventJobService;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        SendMetricsEventJobService sendMetricsEventJobService = this.b;
        switch (i) {
            case 0:
                return y0k.c.g(sendMetricsEventJobService);
            default:
                ((y0k) sendMetricsEventJobService.a.getValue()).a.b();
                return sbi.a;
        }
    }
}
