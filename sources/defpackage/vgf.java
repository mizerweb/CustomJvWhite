package defpackage;

import android.app.job.JobParameters;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* JADX INFO: loaded from: classes3.dex */
public final class vgf extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMetricsEventJobService b;
    public final /* synthetic */ JobParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgf(SendMetricsEventJobService sendMetricsEventJobService, JobParameters jobParameters, int i) {
        super(1);
        this.a = i;
        this.b = sendMetricsEventJobService;
        this.c = jobParameters;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                SendMetricsEventJobService sendMetricsEventJobService = this.b;
                JobParameters jobParameters = this.c;
                if (!sendMetricsEventJobService.c) {
                    sendMetricsEventJobService.jobFinished(jobParameters, false);
                }
                break;
            default:
                SendMetricsEventJobService sendMetricsEventJobService2 = this.b;
                JobParameters jobParameters2 = this.c;
                if (!sendMetricsEventJobService2.c) {
                    sendMetricsEventJobService2.jobFinished(jobParameters2, false);
                }
                break;
        }
        return sbi.a;
    }
}
