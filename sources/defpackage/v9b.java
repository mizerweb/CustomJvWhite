package defpackage;

import android.app.Application;
import com.my.tracker.MyTracker;
import com.my.tracker.core.TrackerConfig;
import com.my.tracker.core.a;
import com.my.tracker.core.o.a0;
import com.my.tracker.core.o.h;
import com.my.tracker.core.o.q;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9b implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ Application b;
    public final /* synthetic */ TrackerConfig c;
    public final /* synthetic */ a d;
    public final /* synthetic */ h e;
    public final /* synthetic */ a0 f;
    public final /* synthetic */ q g;
    public final /* synthetic */ com.my.tracker.core.o.a h;

    public /* synthetic */ v9b(Semaphore semaphore, Application application, TrackerConfig trackerConfig, a aVar, h hVar, a0 a0Var, q qVar, com.my.tracker.core.o.a aVar2) {
        this.a = semaphore;
        this.b = application;
        this.c = trackerConfig;
        this.d = aVar;
        this.e = hVar;
        this.f = a0Var;
        this.g = qVar;
        this.h = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MyTracker.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
