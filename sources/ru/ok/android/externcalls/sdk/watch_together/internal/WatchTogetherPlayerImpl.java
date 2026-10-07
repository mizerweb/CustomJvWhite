package ru.ok.android.externcalls.sdk.watch_together.internal;

import defpackage.af7;
import defpackage.cf7;
import defpackage.u1b;
import defpackage.y1b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007JX\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ>\u0010\u001c\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001aJN\u0010 \u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010!\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b!\u0010\"JN\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b-\u0010,J\u0010\u0010/\u001a\u00020.H\u0097\u0001¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102¨\u00063"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/WatchTogetherPlayerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;)V", "Lu1b;", "movieId", "Lh2b;", "volume", "Ly1b;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Lu1b;FLy1b;ZLaf7;Lcf7;)V", "play", "stop", "(Lu1b;Laf7;Lcf7;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lu1b;FZLaf7;Lcf7;)V", "setVolume", "setMuted", "(Lu1b;ZLaf7;Lcf7;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lu1b;JLjava/util/concurrent/TimeUnit;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WatchTogetherPlayerImpl implements WatchTogetherPlayer, WatchTogetherCommandsExecutor, WatchTogetherListenerManager {
    private final WatchTogetherCommandsExecutor commandExecutor;
    private final WatchTogetherListenerManager listenerManager;

    public WatchTogetherPlayerImpl(WatchTogetherCommandsExecutor watchTogetherCommandsExecutor, WatchTogetherListenerManager watchTogetherListenerManager) {
        this.commandExecutor = watchTogetherCommandsExecutor;
        this.listenerManager = watchTogetherListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.listenerManager.getMovieStates();
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(u1b movieId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.pause(movieId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* JADX INFO: renamed from: play-yj_a6ag */
    public void mo138playyj_a6ag(u1b movieId, float volume, y1b meta, boolean moveToAdminOnHangup, af7 onSuccess, cf7 onError) {
        this.commandExecutor.mo138playyj_a6ag(movieId, volume, meta, moveToAdminOnHangup, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(u1b movieId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.resume(movieId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(u1b movieId, boolean isMuted, af7 onSuccess, cf7 onError) {
        this.commandExecutor.setMuted(movieId, isMuted, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(u1b movieId, long position, TimeUnit unit, af7 onSuccess, cf7 onError) {
        this.commandExecutor.setPosition(movieId, position, unit, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* JADX INFO: renamed from: setVolume-F2PwOSs */
    public void mo139setVolumeF2PwOSs(u1b movieId, float volume, boolean isMuted, af7 onSuccess, cf7 onError) {
        this.commandExecutor.mo139setVolumeF2PwOSs(movieId, volume, isMuted, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(u1b movieId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.stop(movieId, onSuccess, onError);
    }
}
