package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class pid extends i66 {
    final /* synthetic */ qid this$0;

    public static final class a extends i66 {
        final /* synthetic */ qid this$0;

        public a(qid qidVar) {
            this.this$0 = qidVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            qid qidVar = this.this$0;
            int i = qidVar.a + 1;
            qidVar.a = i;
            if (i == 1 && qidVar.d) {
                qidVar.f.d(m09.ON_START);
                qidVar.d = false;
            }
        }
    }

    public pid(qid qidVar) {
        this.this$0 = qidVar;
    }

    @Override // defpackage.i66, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = tke.b;
            ((tke) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.this$0.h;
        }
    }

    @Override // defpackage.i66, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        qid qidVar = this.this$0;
        int i = qidVar.b - 1;
        qidVar.b = i;
        if (i == 0) {
            qidVar.e.postDelayed(qidVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        oid.a(activity, new a(this.this$0));
    }

    @Override // defpackage.i66, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        qid qidVar = this.this$0;
        int i = qidVar.a - 1;
        qidVar.a = i;
        if (i == 0 && qidVar.c) {
            qidVar.f.d(m09.ON_STOP);
            qidVar.d = true;
        }
    }
}
