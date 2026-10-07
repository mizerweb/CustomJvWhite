package androidx.work;

import android.content.Context;
import defpackage.f55;
import defpackage.l89;
import defpackage.m89;
import defpackage.o0j;
import defpackage.t41;
import defpackage.u72;
import defpackage.xlf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lm89;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends m89 {
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // defpackage.m89
    public final u72 a() {
        return f55.m(new t41(this.b.d, new o0j(this)));
    }

    @Override // defpackage.m89
    public final u72 c() {
        return f55.m(new t41(this.b.d, new xlf(10, this)));
    }

    public abstract l89 d();
}
