package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import defpackage.af7;
import defpackage.cf7;
import defpackage.dnf;
import defpackage.n0a;
import defpackage.o0a;
import defpackage.p0a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J_\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012JS\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u0017\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010\u0019\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "", "", "Ln0a;", "Lo0a;", "statesToUpdate", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Ldnf;", "roomId", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "updateMediaOptionsForAll", "(Ljava/util/Map;Ldnf;Laf7;Lcf7;)V", "", "mediaOptions", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "requestToEnableMediaForAll", "(Ljava/util/Set;Ldnf;Laf7;Lcf7;)V", "Lp0a;", "getMediaOptionsForCall", "(Ldnf;)Lp0a;", "getMediaOptionsForCurrentUser", "()Lp0a;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface MediaMuteCommandExecutor {
    p0a getMediaOptionsForCall(dnf roomId);

    p0a getMediaOptionsForCurrentUser();

    void requestToEnableMediaForAll(Set<? extends n0a> mediaOptions, dnf roomId, af7 onSuccess, cf7 onError);

    void requestToEnableMediaForParticipant(Set<? extends n0a> mediaOptions, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError);

    void setAudioPlayoutMuted(boolean mute);

    void updateMediaOptionsForAll(Map<n0a, ? extends o0a> statesToUpdate, dnf roomId, af7 onSuccess, cf7 onError);

    void updateMediaOptionsForParticipant(Map<n0a, ? extends o0a> statesToUpdate, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError);
}
