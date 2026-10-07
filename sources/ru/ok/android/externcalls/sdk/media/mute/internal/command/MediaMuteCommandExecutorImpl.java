package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import defpackage.af7;
import defpackage.cf7;
import defpackage.dnf;
import defpackage.n0a;
import defpackage.n8b;
import defpackage.nx;
import defpackage.o0a;
import defpackage.o91;
import defpackage.ox;
import defpackage.p0a;
import defpackage.q4g;
import defpackage.r0a;
import defpackage.wzf;
import defpackage.yt1;
import defpackage.zzf;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010Jc\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001f\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J_\u0010!\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\u001cJS\u0010\"\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#JY\u0010$\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010 JM\u0010%\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020'2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R0\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lo91;", "getCall", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "Ldnf;", "getActiveRoomId", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Laf7;Lcf7;Laf7;)V", "", "Ln0a;", "Lo0a;", "statesToUpdate", "participantId", "roomId", "Lsbi;", "onSuccess", "", "onError", "updateMediaOptions", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "", "mediaOptions", "requestToEnableMedia", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "updateMediaOptionsForParticipant", "updateMediaOptionsForAll", "(Ljava/util/Map;Ldnf;Laf7;Lcf7;)V", "requestToEnableMediaForParticipant", "requestToEnableMediaForAll", "(Ljava/util/Set;Ldnf;Laf7;Lcf7;)V", "Lp0a;", "getMediaOptionsForCall", "(Ldnf;)Lp0a;", "getMediaOptionsForCurrentUser", "()Lp0a;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Laf7;", "Lcf7;", "Lr0a;", "paramsCreator", "Lr0a;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaMuteCommandExecutorImpl implements MediaMuteCommandExecutor {
    private final af7 getActiveRoomId;
    private final af7 getCall;
    private final cf7 getInternalId;
    private final r0a paramsCreator = new r0a();
    private final SignalingProvider signalingProvider;

    public MediaMuteCommandExecutorImpl(SignalingProvider signalingProvider, af7 af7Var, cf7 cf7Var, af7 af7Var2) {
        this.signalingProvider = signalingProvider;
        this.getCall = af7Var;
        this.getInternalId = cf7Var;
        this.getActiveRoomId = af7Var2;
    }

    private final void requestToEnableMedia(Set<? extends n0a> mediaOptions, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError) {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        yt1 yt1Var = (yt1) this.getInternalId.invoke(participantId);
        if (participantId != null && yt1Var == null) {
            if (onError != null) {
                onError.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            r0a r0aVar = this.paramsCreator;
            if (roomId == null) {
                roomId = (dnf) this.getActiveRoomId.invoke();
            }
            r0aVar.getClass();
            q4gVar.l(r0a.a(mediaOptions, yt1Var, roomId), new nx(5, onSuccess), new ox(5, onError));
        } catch (JSONException e) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    public static final void requestToEnableMedia$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void requestToEnableMedia$lambda$1(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    private final void updateMediaOptions(Map<n0a, ? extends o0a> statesToUpdate, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError) {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        yt1 yt1Var = (yt1) this.getInternalId.invoke(participantId);
        if (participantId != null && yt1Var == null) {
            if (onError != null) {
                onError.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            r0a r0aVar = this.paramsCreator;
            if (roomId == null) {
                roomId = (dnf) this.getActiveRoomId.invoke();
            }
            r0aVar.getClass();
            q4gVar.l(r0a.b(statesToUpdate, yt1Var, roomId), new nx(6, onSuccess), new ox(6, onError));
        } catch (JSONException e) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    public static final void updateMediaOptions$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void updateMediaOptions$lambda$1(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public p0a getMediaOptionsForCall(dnf roomId) {
        o91 o91Var = (o91) this.getCall.invoke();
        if (roomId == null) {
            roomId = (dnf) this.getActiveRoomId.invoke();
        }
        if (o91Var == null) {
            return new p0a();
        }
        n8b n8bVarH = o91Var.F0.h(roomId);
        return new p0a(n8bVarH.a, n8bVarH.b, n8bVarH.c, n8bVarH.d);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public p0a getMediaOptionsForCurrentUser() {
        o91 o91Var = (o91) this.getCall.invoke();
        if (o91Var == null) {
            return new p0a();
        }
        n8b n8bVar = o91Var.F0.i;
        return new p0a(n8bVar.a, n8bVar.b, n8bVar.c, n8bVar.d);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForAll(Set<? extends n0a> mediaOptions, dnf roomId, af7 onSuccess, cf7 onError) {
        requestToEnableMedia(mediaOptions, null, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForParticipant(Set<? extends n0a> mediaOptions, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError) {
        requestToEnableMedia(mediaOptions, participantId, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void setAudioPlayoutMuted(boolean mute) {
        o91 o91Var = (o91) this.getCall.invoke();
        if (o91Var != null) {
            zzf zzfVar = o91Var.e0;
            zzfVar.a.execute(new wzf(zzfVar, mute, 2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForAll(Map<n0a, ? extends o0a> statesToUpdate, dnf roomId, af7 onSuccess, cf7 onError) {
        updateMediaOptions(statesToUpdate, null, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForParticipant(Map<n0a, ? extends o0a> statesToUpdate, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError) {
        updateMediaOptions(statesToUpdate, participantId, roomId, onSuccess, onError);
    }
}
