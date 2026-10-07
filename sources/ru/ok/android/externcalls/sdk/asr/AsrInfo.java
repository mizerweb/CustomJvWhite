package ru.ok.android.externcalls.sdk.asr;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/AsrInfo;", "", "initiator", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "movieId", "", "<init>", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/lang/Long;)V", "getInitiator", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AsrInfo {
    private final ConversationParticipant initiator;
    private final Long movieId;

    public AsrInfo(ConversationParticipant conversationParticipant, Long l) {
        this.initiator = conversationParticipant;
        this.movieId = l;
    }

    public final ConversationParticipant getInitiator() {
        return this.initiator;
    }

    public final Long getMovieId() {
        return this.movieId;
    }
}
