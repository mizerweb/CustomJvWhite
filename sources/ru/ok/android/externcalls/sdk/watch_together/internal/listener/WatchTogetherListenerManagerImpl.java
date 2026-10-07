package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import android.os.Handler;
import android.os.Looper;
import defpackage.a2b;
import defpackage.b2b;
import defpackage.c2b;
import defpackage.d2b;
import defpackage.e2b;
import defpackage.ewg;
import defpackage.h2b;
import defpackage.r1b;
import defpackage.s66;
import defpackage.u1b;
import defpackage.v1b;
import defpackage.w1b;
import defpackage.x1b;
import defpackage.x52;
import defpackage.z1b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\nJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantsStorage", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "Lsbi;", "sendActualState", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "sendActualStateToAll", "()V", "Ld2b;", "updates", "updateState", "(Ld2b;)V", "", "position", "Lx1b;", "getPosition", "(Ljava/lang/Long;)Lx1b;", "Lb2b;", "startInfo", "onVideoStarted", "(Lb2b;)V", "onVideoStatesUpdatedChanged", "Le2b;", "stopInfo", "onVideoStopped", "(Le2b;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "movieStates", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WatchTogetherListenerManagerImpl implements WatchTogetherListenerManager {
    private final ParticipantStore participantsStorage;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile MovieStates movieStates = new MovieStates(s66.a);
    private final CopyOnWriteArraySet<WatchTogetherListener> listeners = new CopyOnWriteArraySet<>();

    public WatchTogetherListenerManagerImpl(ParticipantStore participantStore) {
        this.participantsStorage = participantStore;
    }

    private final x1b getPosition(Long position) {
        return (position == null || position.longValue() < 0) ? w1b.a : new v1b(position.longValue());
    }

    private final void sendActualState(WatchTogetherListener listener) {
        this.mainHandler.post(new ewg(this, 29, listener));
    }

    public static final void sendActualState$lambda$0(WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl, WatchTogetherListener watchTogetherListener) {
        if (watchTogetherListenerManagerImpl.listeners.contains(watchTogetherListener) && !watchTogetherListenerManagerImpl.movieStates.getStates().isEmpty()) {
            watchTogetherListener.onVideoStatesChanged(watchTogetherListenerManagerImpl.movieStates);
        }
    }

    private final void sendActualStateToAll() {
        Iterator<WatchTogetherListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatesChanged(this.movieStates);
        }
    }

    private final void updateState(d2b updates) {
        HashMap map = new HashMap();
        for (c2b c2bVar : updates.a) {
            ConversationParticipant byInternal = this.participantsStorage.getByInternal(c2bVar.a.b);
            if (byInternal != null) {
                ParticipantId externalId = byInternal.getExternalId();
                x52 x52Var = c2bVar.a;
                u1b u1bVar = x52Var.c;
                if (u1bVar != null) {
                    int i = a2b.$EnumSwitchMapping$1[x52Var.a.ordinal()];
                    Object obj = null;
                    z1b z1bVar = i != 1 ? i != 2 ? null : z1b.b : z1b.a;
                    if (z1bVar != null) {
                        for (Object obj2 : byInternal.getMovies()) {
                            r1b r1bVar = (r1b) obj2;
                            if (r1bVar.d == z1bVar && r1bVar.a.equals(u1bVar)) {
                                obj = obj2;
                                break;
                            }
                        }
                        r1b r1bVar2 = (r1b) obj;
                        x1b position = getPosition(c2bVar.d);
                        boolean z = true ^ c2bVar.c;
                        float f = c2bVar.b;
                        h2b.a(f);
                        map.put(u1bVar, new MovieState(externalId, position, z, f, c2bVar.e, r1bVar2, null));
                        if (!this.movieStates.getStates().containsKey(u1bVar) && r1bVar2 != null) {
                            MovieStartedData movieStartedData = new MovieStartedData(externalId, this.participantsStorage.getActiveRoomId(), r1bVar2);
                            Iterator<T> it = this.listeners.iterator();
                            while (it.hasNext()) {
                                ((WatchTogetherListener) it.next()).onVideoStarted(movieStartedData);
                            }
                        }
                    }
                }
            }
        }
        this.movieStates = this.movieStates.copy(map);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener listener) {
        this.listeners.add(listener);
        sendActualState(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.movieStates;
    }

    public final void onVideoStarted(b2b startInfo) {
        ConversationParticipant byInternal = this.participantsStorage.getByInternal(startInfo.a);
        if (byInternal != null) {
            r1b r1bVar = startInfo.c;
            ParticipantId externalId = byInternal.getExternalId();
            MovieStates movieStates = this.movieStates;
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
            u1b u1bVar = r1bVar.a;
            w1b w1bVar = w1b.a;
            float f = h2b.a;
            linkedHashMap.put(u1bVar, new MovieState(externalId, w1bVar, true, 0.0f, true, r1bVar, null));
            this.movieStates = movieStates.copy(linkedHashMap);
            MovieStartedData movieStartedData = new MovieStartedData(byInternal.getExternalId(), startInfo.b, r1bVar);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStarted(movieStartedData);
            }
        }
    }

    public final void onVideoStatesUpdatedChanged(d2b updates) {
        updateState(updates);
        sendActualStateToAll();
    }

    public final void onVideoStopped(e2b stopInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
        MovieState movieState = (MovieState) linkedHashMap.remove(stopInfo.c);
        this.movieStates = this.movieStates.copy(linkedHashMap);
        if (movieState != null) {
            MovieStoppedData movieStoppedData = new MovieStoppedData(movieState.getParticipantId(), stopInfo.b, stopInfo.c, stopInfo.d);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStopped(movieStoppedData);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener listener) {
        this.listeners.remove(listener);
    }
}
