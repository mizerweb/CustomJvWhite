package com.my.tracker.core.o;

import android.app.Activity;
import android.os.Handler;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.TrackerConfig;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimePoint;
import com.my.tracker.core.utils.TimeUtils;
import defpackage.hed;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements MyTrackerActivityHandler {
    private final TrackerConfig c;
    private final b d;
    private final Map a = new WeakHashMap();
    private final a b = new a(0);
    private long e = -1;

    private a0(TrackerConfig trackerConfig, Handler handler) {
        this.c = trackerConfig;
        this.d = new b(handler, trackerConfig, new hed(11, this));
    }

    public /* synthetic */ void a() {
        Tracer.d("ActivityHandler: timer tick for buffering period");
        this.b.a();
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void handleOnActivityStarted(EngineCore engineCore, Activity activity, TimePoint timePoint) {
        long jConvertFromSec;
        int size = this.a.size();
        this.a.put(activity, Boolean.TRUE);
        if (size == 0) {
            this.b.b(timePoint.uptimeMillis);
            long jElapsedRealtime = TimeUtils.elapsedRealtime();
            long j = this.e;
            if (j == -1 || jElapsedRealtime - j >= TimeUtils.convertFromSec(this.c.getLaunchTimeout())) {
                this.b.b();
                if (this.c.isTrackingLaunchEnabled()) {
                    this.b.a(engineCore, timePoint.currentTimeSec);
                }
                jConvertFromSec = TimeUtils.convertFromSec(this.c.getBufferingPeriod());
            } else {
                jConvertFromSec = this.d.a(jElapsedRealtime);
                if (jConvertFromSec <= 0) {
                    Tracer.d("ActivityHandler: timer tick for buffering period");
                    this.b.a();
                    jConvertFromSec = TimeUtils.convertFromSec(this.c.getBufferingPeriod());
                }
            }
            this.d.b(jConvertFromSec);
        }
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void handleOnActivityStopped(EngineCore engineCore, Activity activity, TimePoint timePoint) {
        int size = this.a.size();
        this.a.remove(activity);
        if (size == 1 && this.a.isEmpty()) {
            this.b.a(timePoint.uptimeMillis);
            this.d.a();
            this.e = timePoint.elapsedRealtime;
            engineCore.getEnginePrefs().setLastStopTimestampSec(timePoint.currentTimeSec);
        }
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void manualOnActivityStarted(EngineCore engineCore, Activity activity, TimePoint timePoint) {
        handleOnActivityStarted(engineCore, activity, timePoint);
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void resetFlushTimer() {
        this.d.b(TimeUtils.convertFromSec(this.c.getBufferingPeriod()));
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void setActionEngineCoreFlush(Runnable runnable) {
        this.b.c = runnable;
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void setActionSensorHandlerStart(Runnable runnable) {
        this.b.b = runnable;
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void setActionTimespentSwitchToBackground(Consumer consumer) {
        this.b.e = consumer;
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void setActionTimespentSwitchToForeground(Consumer consumer) {
        this.b.d = consumer;
    }

    @Override // com.my.tracker.core.handlers.MyTrackerActivityHandler
    public void setActionTrackLaunch(BiConsumer biConsumer) {
        this.b.a = biConsumer;
    }

    public static final class a {
        public BiConsumer a;
        public Runnable b;
        public Runnable c;
        public Consumer d;
        public Consumer e;

        public /* synthetic */ a(int i) {
            this();
        }

        public void a(EngineCore engineCore, long j) {
            BiConsumer biConsumer = this.a;
            if (biConsumer != null) {
                try {
                    biConsumer.accept(engineCore, Long.valueOf(j));
                } catch (Throwable unused) {
                }
            }
        }

        public void b(long j) {
            Consumer consumer = this.d;
            if (consumer != null) {
                try {
                    consumer.accept(Long.valueOf(j));
                } catch (Throwable unused) {
                }
            }
        }

        private a() {
        }

        public void a() {
            Runnable runnable = this.c;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
        }

        public void b() {
            Runnable runnable = this.b;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
        }

        public void a(long j) {
            Consumer consumer = this.e;
            if (consumer != null) {
                try {
                    consumer.accept(Long.valueOf(j));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static a0 a(TrackerConfig trackerConfig, Handler handler) {
        return new a0(trackerConfig, handler);
    }

    public void a(EngineCore engineCore, com.my.tracker.core.o.a aVar) {
        aVar.a(engineCore, this);
    }

    public static final class b {
        private final Handler b;
        private final Runnable d;
        private final AtomicBoolean a = new AtomicBoolean();
        private long c = 0;
        private final Object e = new Object();

        public b(Handler handler, final TrackerConfig trackerConfig, final Runnable runnable) {
            this.b = handler;
            this.d = new Runnable() { // from class: com.my.tracker.core.o.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(runnable, trackerConfig);
                }
            };
        }

        public /* synthetic */ void a(Runnable runnable, TrackerConfig trackerConfig) {
            if (this.a.get()) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
                b(TimeUtils.convertFromSec(trackerConfig.getBufferingPeriod()));
            }
        }

        public void b(long j) {
            synchronized (this.e) {
                this.b.removeCallbacks(this.d);
                this.a.set(true);
                this.b.postDelayed(this.d, j);
                this.c = TimeUtils.elapsedRealtime() + j;
            }
        }

        public long a(long j) {
            return this.c - j;
        }

        public void a() {
            synchronized (this.e) {
                this.a.set(false);
                this.b.removeCallbacks(this.d);
            }
        }
    }
}
