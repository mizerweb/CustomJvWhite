package com.my.tracker.applifecycle;

import android.app.Activity;
import com.my.tracker.applifecycle.MyTrackerAppLifecycle;
import com.my.tracker.applifecycle.o.a;
import com.my.tracker.applifecycle.o.b;
import com.my.tracker.applifecycle.o.c;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.MyTrackerInternal;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimePoint;
import defpackage.y9b;
import defpackage.z9b;

/* JADX INFO: loaded from: classes.dex */
public final class MyTrackerAppLifecycle {
    private static EngineMiniCore a;
    private static d b;

    static {
        MyTrackerInternal.registerInit("applifecycle", new y9b(0), new z9b());
    }

    public static void a(EngineCore engineCore, MyTrackerActivityHandler myTrackerActivityHandler) {
        d dVarA = d.a(myTrackerActivityHandler);
        b = dVarA;
        dVarA.a();
        c.a(engineCore, b);
        a.a(engineCore, b);
        b.a(engineCore, b);
    }

    public static void trackLaunchManually(final Activity activity) {
        EngineMiniCore engineMiniCore = a;
        if (engineMiniCore == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            final TimePoint timePointNow = TimePoint.now();
            engineMiniCore.onEngineWorkerWithEngineCore(new Consumer() { // from class: x9b
                @Override // com.my.tracker.core.utils.Consumer
                public final void accept(Object obj) {
                    MyTrackerAppLifecycle.a(activity, timePointNow, (EngineCore) obj);
                }
            });
        }
    }

    public static void a(EngineMiniCore engineMiniCore) {
        a = engineMiniCore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Activity activity, TimePoint timePoint, EngineCore engineCore) {
        d dVar = b;
        if (dVar == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            dVar.a(engineCore, activity, timePoint);
        }
    }
}
