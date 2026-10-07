package com.my.tracker.core.o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimePoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private final EngineMiniCore a;
    private final Object b = new Object();
    private List c = new ArrayList();
    private MyTrackerActivityHandler d = null;

    private a(EngineMiniCore engineMiniCore) {
        this.a = engineMiniCore;
    }

    public void a(EngineCore engineCore, MyTrackerActivityHandler myTrackerActivityHandler) {
        List list;
        while (true) {
            synchronized (this.b) {
                try {
                    List list2 = this.c;
                    if (list2 == null) {
                        Tracer.e("ActivityLifecycleListener: unexpected branch 1");
                        return;
                    } else if (list2.isEmpty()) {
                        this.c = null;
                        this.d = myTrackerActivityHandler;
                        return;
                    } else {
                        list = this.c;
                        this.c = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((BiConsumer) it.next()).accept(engineCore, myTrackerActivityHandler);
                } catch (Throwable th2) {
                    Tracer.d("ActivityLifecycleListener: unexpected error 2: " + th2, th2);
                }
            }
        }
    }

    public void b() {
        this.a.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        final TimePoint timePointNow = TimePoint.now();
        a(new BiConsumer() { // from class: i2k
            @Override // com.my.tracker.core.utils.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MyTrackerActivityHandler) obj2).handleOnActivityStarted((EngineCore) obj, activity, timePointNow);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        final TimePoint timePointNow = TimePoint.now();
        a(new BiConsumer() { // from class: h2k
            @Override // com.my.tracker.core.utils.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MyTrackerActivityHandler) obj2).handleOnActivityStopped((EngineCore) obj, activity, timePointNow);
            }
        });
    }

    public void a() {
        synchronized (this.b) {
            this.a.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.c = new ArrayList();
            this.d = null;
        }
    }

    private void a(final BiConsumer biConsumer) {
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    List list = this.c;
                    if (list != null) {
                        list.add(biConsumer);
                    }
                } else {
                    this.a.onEngineWorkerWithEngineCore(new Consumer() { // from class: g2k
                        @Override // com.my.tracker.core.utils.Consumer
                        public final void accept(Object obj) {
                            this.a.a(biConsumer, (EngineCore) obj);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BiConsumer biConsumer, EngineCore engineCore) {
        biConsumer.accept(engineCore, this.d);
    }

    public static a a(EngineMiniCore engineMiniCore) {
        return new a(engineMiniCore);
    }
}
