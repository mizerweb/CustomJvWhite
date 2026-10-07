package ru.rustore.sdk.metrics.internal.presentation;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.c8g;
import defpackage.d8g;
import defpackage.g8g;
import defpackage.ifh;
import defpackage.kr0;
import defpackage.so2;
import defpackage.ugf;
import defpackage.vgf;
import defpackage.vn5;
import defpackage.zn5;

/* JADX INFO: loaded from: classes3.dex */
public final class SendMetricsEventJobService extends JobService {
    public final ifh a = new ifh(new ugf(this, 0));
    public c8g b;
    public volatile boolean c;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int i = 1;
        int i2 = 0;
        g8g g8gVar = new g8g(0, new ugf(this, 1));
        ifh ifhVar = zn5.a;
        synchronized (so2.h) {
        }
        d8g d8gVar = new d8g(new d8g(g8gVar, (vn5) zn5.b.getValue(), i), new kr0(this, 4, jobParameters), i2);
        c8g c8gVar = new c8g(new vgf(this, jobParameters, 0), new vgf(this, jobParameters, 1));
        d8gVar.a(c8gVar);
        this.b = c8gVar;
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.c = true;
        c8g c8gVar = this.b;
        if (c8gVar != null) {
            c8gVar.dispose();
        }
        return true;
    }
}
