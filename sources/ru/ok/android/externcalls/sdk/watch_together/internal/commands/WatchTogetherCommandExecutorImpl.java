package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import defpackage.af7;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.ecj;
import defpackage.jc1;
import defpackage.kql;
import defpackage.n8b;
import defpackage.nx;
import defpackage.q4g;
import defpackage.u1b;
import defpackage.vj7;
import defpackage.y1b;
import defpackage.zq1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010!\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\"\u0010#J=\u0010$\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b$\u0010#J=\u0010%\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b%\u0010#JM\u0010)\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b'\u0010(JE\u0010*\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b*\u0010+JM\u00100\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103¨\u00064"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lzq1;", "mediaOptionsDelegate", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Laf7;)V", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lq4g;", "getSignalingOrPassExceptionToOnError", "(Lcf7;)Lq4g;", "", "method", "Lorg/json/JSONObject;", "errorResponse", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lcf7;)V", "Lu1b;", "movieId", "Lh2b;", "volume", "Ly1b;", "meta", "", "moveToAdminOnHangup", "onSuccess", "play-yj_a6ag", "(Lu1b;FLy1b;ZLaf7;Lcf7;)V", "play", "stop", "(Lu1b;Laf7;Lcf7;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lu1b;FZLaf7;Lcf7;)V", "setVolume", "setMuted", "(Lu1b;ZLaf7;Lcf7;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lu1b;JLjava/util/concurrent/TimeUnit;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WatchTogetherCommandExecutorImpl implements WatchTogetherCommandsExecutor {
    private final af7 mediaOptionsDelegate;
    private final SignalingProvider signalingProvider;

    public WatchTogetherCommandExecutorImpl(SignalingProvider signalingProvider, af7 af7Var) {
        this.signalingProvider = signalingProvider;
        this.mediaOptionsDelegate = af7Var;
    }

    private final q4g getSignalingOrPassExceptionToOnError(cf7 onError) {
        q4g signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (onError != null) {
            onError.invoke(new ConversationNotPreparedException());
        }
        return null;
    }

    public final void parseErrorResponse(String method, JSONObject errorResponse, cf7 onError) {
        String strOptString = errorResponse.optString("error");
        WatchTogetherError watchTogetherError = (cqk.d(strOptString, "movie-limit-exceeded") || cqk.d(strOptString, "movie-not-found")) ? WatchTogetherError.LIMIT_EXCEEDED : WatchTogetherError.UNKNOWN_ERROR;
        WatchTogetherError watchTogetherError2 = watchTogetherError;
        if (onError != null) {
            onError.invoke(new WatchTogetherException(watchTogetherError2, "Error response for " + method + " command " + errorResponse, null, 4, null));
        }
    }

    public static final void pause$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void play_yj_a6ag$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void resume$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void setMuted$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void setPosition$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void setVolume_F2PwOSs$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void stop$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(u1b movieId, af7 onSuccess, cf7 onError) {
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.d(kql.v(movieId.a, true), false, new nx(20, onSuccess), new ecj(this, onError, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* JADX INFO: renamed from: play-yj_a6ag */
    public void mo138playyj_a6ag(u1b movieId, float volume, y1b meta, boolean moveToAdminOnHangup, af7 onSuccess, cf7 onError) throws JSONException {
        zq1 zq1Var = (zq1) this.mediaOptionsDelegate.invoke();
        if (zq1Var == null || !zq1.d(new jc1(0, 22, n8b.class, zq1Var.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
            if (onError != null) {
                onError.invoke(new WatchTogetherException(WatchTogetherError.PLAY_NOT_ALLOWED, "Play not allowed due to media option", null, 4, null));
                return;
            }
            return;
        }
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "add-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("gain", volume);
        jSONObject.put("moveToAdminOnHangup", moveToAdminOnHangup);
        signalingOrPassExceptionToOnError.d(new vj7(jSONObject, 0), false, new nx(22, onSuccess), new ecj(this, onError, 4));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(u1b movieId, af7 onSuccess, cf7 onError) {
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.d(kql.v(movieId.a, false), false, new nx(18, onSuccess), new ecj(this, onError, 2));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(u1b movieId, boolean isMuted, af7 onSuccess, cf7 onError) throws JSONException {
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("mute", isMuted);
        signalingOrPassExceptionToOnError.d(new vj7(jSONObject, 0), false, new nx(23, onSuccess), new ecj(this, onError, 5));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(u1b movieId, long position, TimeUnit unit, af7 onSuccess, cf7 onError) throws JSONException {
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("offset", unit.toSeconds(position));
        signalingOrPassExceptionToOnError.d(new vj7(jSONObject, 0), false, new nx(21, onSuccess), new ecj(this, onError, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* JADX INFO: renamed from: setVolume-F2PwOSs */
    public void mo139setVolumeF2PwOSs(u1b movieId, float volume, boolean isMuted, af7 onSuccess, cf7 onError) throws JSONException {
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("gain", volume);
        jSONObject.put("mute", isMuted);
        signalingOrPassExceptionToOnError.d(new vj7(jSONObject, 0), false, new nx(19, onSuccess), new ecj(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(u1b movieId, af7 onSuccess, cf7 onError) throws JSONException {
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "remove-movie");
        jSONObject.put("movieId", j);
        signalingOrPassExceptionToOnError.d(new vj7(jSONObject, 0), false, new nx(24, onSuccess), new ecj(this, onError, 6));
    }
}
