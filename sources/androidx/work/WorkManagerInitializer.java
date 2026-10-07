package androidx.work;

import android.content.Context;
import defpackage.ga4;
import defpackage.gg8;
import defpackage.ja4;
import defpackage.n1g;
import defpackage.oyj;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkManagerInitializer implements gg8 {
    public static final String a = n1g.Z("WrkMgrInitializer");

    @Override // defpackage.gg8
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.gg8
    public final Object b(Context context) {
        n1g.x().p(a, "Initializing WorkManager with default configuration.");
        oyj.e(context, new ja4(new ga4()));
        return oyj.d(context);
    }
}
