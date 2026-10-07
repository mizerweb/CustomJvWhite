package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import defpackage.af7;
import defpackage.cf7;
import defpackage.u1b;
import defpackage.y1b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JW\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0015\u0010\u0014J=\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0016\u0010\u0014JM\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "", "Lu1b;", "movieId", "Lh2b;", "volume", "Ly1b;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Lu1b;FLy1b;ZLaf7;Lcf7;)V", "play", "stop", "(Lu1b;Laf7;Lcf7;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lu1b;FZLaf7;Lcf7;)V", "setVolume", "setMuted", "(Lu1b;ZLaf7;Lcf7;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lu1b;JLjava/util/concurrent/TimeUnit;Laf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface WatchTogetherCommandsExecutor {
    void pause(u1b movieId, af7 onSuccess, cf7 onError);

    /* JADX INFO: renamed from: play-yj_a6ag */
    void mo138playyj_a6ag(u1b movieId, float volume, y1b meta, boolean moveToAdminOnHangup, af7 onSuccess, cf7 onError);

    void resume(u1b movieId, af7 onSuccess, cf7 onError);

    void setMuted(u1b movieId, boolean isMuted, af7 onSuccess, cf7 onError);

    void setPosition(u1b movieId, long position, TimeUnit unit, af7 onSuccess, cf7 onError);

    /* JADX INFO: renamed from: setVolume-F2PwOSs */
    void mo139setVolumeF2PwOSs(u1b movieId, float volume, boolean isMuted, af7 onSuccess, cf7 onError);

    void stop(u1b movieId, af7 onSuccess, cf7 onError);
}
