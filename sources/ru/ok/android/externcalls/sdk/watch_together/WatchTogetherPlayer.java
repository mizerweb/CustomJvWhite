package ru.ok.android.externcalls.sdk.watch_together;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import defpackage.h2b;
import defpackage.u1b;
import defpackage.y1b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Ja\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0015\u0010\u0014JA\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0016\u0010\u0014JQ\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&J\u000f\u0010)\u001a\u00020(H'¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "", "Lu1b;", "movieId", "Lh2b;", "volume", "Ly1b;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Lu1b;FLy1b;ZLaf7;Lcf7;)V", "play", "stop", "(Lu1b;Laf7;Lcf7;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lu1b;FZLaf7;Lcf7;)V", "setVolume", "setMuted", "(Lu1b;ZLaf7;Lcf7;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lu1b;JLjava/util/concurrent/TimeUnit;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface WatchTogetherPlayer {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void pause$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: pause");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        watchTogetherPlayer.pause(u1bVar, af7Var, cf7Var);
    }

    /* JADX INFO: renamed from: play-yj_a6ag$default, reason: not valid java name */
    static void m136playyj_a6ag$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, float f, y1b y1bVar, boolean z, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: play-yj_a6ag");
            return;
        }
        if ((i & 2) != 0) {
            float f2 = h2b.a;
            f = h2b.a;
        }
        float f3 = f;
        y1b y1bVar2 = (i & 4) != 0 ? null : y1bVar;
        if ((i & 8) != 0) {
            z = false;
        }
        watchTogetherPlayer.mo138playyj_a6ag(u1bVar, f3, y1bVar2, z, (i & 16) != 0 ? null : af7Var, (i & 32) != 0 ? null : cf7Var);
    }

    static /* synthetic */ void resume$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: resume");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        watchTogetherPlayer.resume(u1bVar, af7Var, cf7Var);
    }

    static /* synthetic */ void setMuted$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, boolean z, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: setMuted");
            return;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        watchTogetherPlayer.setMuted(u1bVar, z, af7Var, cf7Var);
    }

    static /* synthetic */ void setPosition$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, long j, TimeUnit timeUnit, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: setPosition");
            return;
        }
        if ((i & 8) != 0) {
            af7Var = null;
        }
        if ((i & 16) != 0) {
            cf7Var = null;
        }
        watchTogetherPlayer.setPosition(u1bVar, j, timeUnit, af7Var, cf7Var);
    }

    /* JADX INFO: renamed from: setVolume-F2PwOSs$default, reason: not valid java name */
    static /* synthetic */ void m137setVolumeF2PwOSs$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, float f, boolean z, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: setVolume-F2PwOSs");
            return;
        }
        if ((i & 8) != 0) {
            af7Var = null;
        }
        if ((i & 16) != 0) {
            cf7Var = null;
        }
        watchTogetherPlayer.mo139setVolumeF2PwOSs(u1bVar, f, z, af7Var, cf7Var);
    }

    static /* synthetic */ void stop$default(WatchTogetherPlayer watchTogetherPlayer, u1b u1bVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: stop");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        watchTogetherPlayer.stop(u1bVar, af7Var, cf7Var);
    }

    void addListener(WatchTogetherListener listener);

    MovieStates getMovieStates();

    void pause(u1b movieId, af7 onSuccess, cf7 onError);

    /* JADX INFO: renamed from: play-yj_a6ag, reason: not valid java name */
    void mo138playyj_a6ag(u1b movieId, float volume, y1b meta, boolean moveToAdminOnHangup, af7 onSuccess, cf7 onError);

    void removeListener(WatchTogetherListener listener);

    void resume(u1b movieId, af7 onSuccess, cf7 onError);

    void setMuted(u1b movieId, boolean isMuted, af7 onSuccess, cf7 onError);

    void setPosition(u1b movieId, long position, TimeUnit unit, af7 onSuccess, cf7 onError);

    /* JADX INFO: renamed from: setVolume-F2PwOSs, reason: not valid java name */
    void mo139setVolumeF2PwOSs(u1b movieId, float volume, boolean isMuted, af7 onSuccess, cf7 onError);

    void stop(u1b movieId, af7 onSuccess, cf7 onError);
}
