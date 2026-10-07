package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.gg8;
import defpackage.m09;
import defpackage.ore;
import defpackage.pid;
import defpackage.qid;
import defpackage.r66;
import defpackage.u50;
import defpackage.x09;
import defpackage.y09;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lgg8;", "Lg19;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements gg8 {
    @Override // defpackage.gg8
    public final List a() {
        return r66.a;
    }

    @Override // defpackage.gg8
    public final Object b(Context context) {
        if (!((HashSet) u50.g(context).b).contains(ProcessLifecycleInitializer.class)) {
            ore.k("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!y09.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new x09());
        }
        qid qidVar = qid.i;
        qidVar.getClass();
        qidVar.e = new Handler();
        qidVar.f.d(m09.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new pid(qidVar));
        return qidVar;
    }
}
