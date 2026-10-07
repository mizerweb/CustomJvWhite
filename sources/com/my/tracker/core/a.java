package com.my.tracker.core;

import android.app.Application;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.UserInfoState;
import com.my.tracker.core.a;
import com.my.tracker.core.proto.ExternalProtoWritersSetter;
import com.my.tracker.core.utils.ArrayUtils;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimeUtils;
import com.my.tracker.core.utils.TriConsumer;
import defpackage.l2k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public class a implements EngineMiniCore {
    private final Application a;
    private final TrackerConfig b;
    private final AsyncCore c;
    private final TimeCore d;
    private final ExternalProtoWritersSetter e;
    private final ConcurrentLinkedDeque f = new ConcurrentLinkedDeque();
    EngineInfoState g = new EngineInfoState(false, UserInfoState.EMPTY, "");

    public a(Application application, TrackerConfig trackerConfig, AsyncCore asyncCore, TimeCore timeCore, ExternalProtoWritersSetter externalProtoWritersSetter) {
        this.a = application;
        this.b = trackerConfig;
        this.c = asyncCore;
        this.d = timeCore;
        this.e = externalProtoWritersSetter;
    }

    public void a(EngineCore engineCore, long j, long j2, EngineInfoState engineInfoState) {
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    ((TriConsumer) it.next()).accept(Long.valueOf(j), Long.valueOf(j2), engineInfoState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (engineCore instanceof b) {
            ((b) engineCore).a(engineInfoState);
        } else {
            Tracer.e("MyTracker: unexpected engineCore - ".concat(engineCore.getClass().getName()));
        }
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public void addEngineInfoBeforeChangeListener(TriConsumer triConsumer) {
        synchronized (this.f) {
            this.f.add(triConsumer);
        }
    }

    public void b(Boolean bool) {
        onEngineWorkerWithEngineCore(new l2k(this, bool, TimeUtils.uptimeMillis(), TimeUtils.currentTimeMillis(), 0));
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public Application getApplication() {
        return this.a;
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public EngineInfoState getCurrentEngineInfoState() {
        return this.g;
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public ExternalProtoWritersSetter getExternalProtoWritersSetter() {
        return this.e;
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public TimeCore getTimeCore() {
        return this.d;
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public TrackerConfig getTrackerConfig() {
        return this.b;
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public void insertEventWithEngineCore(final long j, final int i, final boolean z, final boolean z2, final long j2, final EngineCore.EventPacker eventPacker) {
        onEngineWorkerWithEngineCore(new Consumer() { // from class: k2k
            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                ((EngineCore) obj).insertEventSync(j, i, z, z2, j2, eventPacker);
            }
        });
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public void onEngineWorkerWithEngineCore(Consumer consumer) {
        this.c.onEngineWorkerWithEngineCore(consumer);
    }

    @Override // com.my.tracker.core.EngineMiniCore
    public void setRemoteConfig(String str) {
        onEngineWorkerWithEngineCore(new l2k(this, str, TimeUtils.uptimeMillis(), TimeUtils.currentTimeMillis(), 1));
    }

    public void b(final UserInfoState userInfoState) {
        final long jUptimeMillis = TimeUtils.uptimeMillis();
        final long jCurrentTimeMillis = TimeUtils.currentTimeMillis();
        onEngineWorkerWithEngineCore(new Consumer() { // from class: m2k
            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                this.a.a(userInfoState, jUptimeMillis, jCurrentTimeMillis, (EngineCore) obj);
            }
        });
    }

    public void a() {
        final int i = 0;
        final int i2 = 1;
        this.b.getMyTrackerParams().a(new Consumer(this) { // from class: f2k
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                int i3 = i;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        aVar.a((UserInfoState) obj);
                        break;
                    case 1:
                        aVar.b((UserInfoState) obj);
                        break;
                    case 2:
                        aVar.a((Boolean) obj);
                        break;
                    default:
                        aVar.b((Boolean) obj);
                        break;
                }
            }
        }, new Consumer(this) { // from class: f2k
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                int i3 = i2;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        aVar.a((UserInfoState) obj);
                        break;
                    case 1:
                        aVar.b((UserInfoState) obj);
                        break;
                    case 2:
                        aVar.a((Boolean) obj);
                        break;
                    default:
                        aVar.b((Boolean) obj);
                        break;
                }
            }
        });
        final int i3 = 2;
        final int i4 = 3;
        this.b.addKidModeChangeListener(new Consumer(this) { // from class: f2k
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                int i5 = i3;
                a aVar = this.b;
                switch (i5) {
                    case 0:
                        aVar.a((UserInfoState) obj);
                        break;
                    case 1:
                        aVar.b((UserInfoState) obj);
                        break;
                    case 2:
                        aVar.a((Boolean) obj);
                        break;
                    default:
                        aVar.b((Boolean) obj);
                        break;
                }
            }
        }, new Consumer(this) { // from class: f2k
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                int i5 = i4;
                a aVar = this.b;
                switch (i5) {
                    case 0:
                        aVar.a((UserInfoState) obj);
                        break;
                    case 1:
                        aVar.b((UserInfoState) obj);
                        break;
                    case 2:
                        aVar.a((Boolean) obj);
                        break;
                    default:
                        aVar.b((Boolean) obj);
                        break;
                }
            }
        });
    }

    public /* synthetic */ void a(UserInfoState userInfoState) {
        this.g = this.g.copyWithUserInfoState(userInfoState);
    }

    public /* synthetic */ void a(Boolean bool) {
        this.g = this.g.copyWithKidMode(bool.booleanValue());
    }

    public /* synthetic */ void a(String str, long j, long j2, EngineCore engineCore) {
        a aVar;
        Tracer.d("setRemoteConfig: remoteConfig=" + str);
        if (this.g.remoteConfig.equals(str)) {
            aVar = this;
        } else {
            aVar = this;
            aVar.a(engineCore, j, j2, this.g);
        }
        aVar.g = aVar.g.copyWithRemoteConfig(str);
    }

    public /* synthetic */ void a(UserInfoState userInfoState, long j, long j2, EngineCore engineCore) {
        a aVar;
        Tracer.d("onUserInfoStateChanged: customUserIds=" + Arrays.toString(userInfoState.customUserIds));
        if (ArrayUtils.compareArrays(this.g.userInfoState.customUserIds, userInfoState.customUserIds) != 0) {
            aVar = this;
            aVar.a(engineCore, j, j2, this.g);
        } else {
            aVar = this;
        }
        aVar.g = aVar.g.copyWithUserInfoState(userInfoState);
    }

    public /* synthetic */ void a(Boolean bool, long j, long j2, EngineCore engineCore) {
        Tracer.d("updateKidMode: newKidMode=" + bool);
        boolean zBooleanValue = bool.booleanValue();
        EngineInfoState engineInfoState = this.g;
        if (zBooleanValue == engineInfoState.kidMode) {
            return;
        }
        a(engineCore, j, j2, engineInfoState);
        this.g = this.g.copyWithKidMode(bool.booleanValue());
    }

    public static a a(Application application, TrackerConfig trackerConfig, AsyncCore asyncCore, TimeCore timeCore, ExternalProtoWritersSetter externalProtoWritersSetter) {
        return new a(application, trackerConfig, asyncCore, timeCore, externalProtoWritersSetter);
    }
}
