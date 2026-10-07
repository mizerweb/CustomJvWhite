package ru.ok.android.externcalls.sdk.feedback;

import defpackage.cqk;
import defpackage.j95;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "", "key", "", "finishTimeMs", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "source", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "<init>", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "getKey", "()Ljava/lang/String;", "getFinishTimeMs", "()J", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getSource", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "equals", "", "other", "hashCode", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ParticipantFeedback {
    private final long finishTimeMs;
    private final String key;
    private final ParticipantId participantId;
    private final ParticipantFeedbackSource source;

    public /* synthetic */ ParticipantFeedback(String str, long j, ParticipantId participantId, ParticipantFeedbackSource participantFeedbackSource, int i, j95 j95Var) {
        this(str, j, participantId, (i & 8) != 0 ? ParticipantFeedbackSource.UNKNOWN : participantFeedbackSource);
    }

    public boolean equals(Object other) {
        if (other instanceof ParticipantFeedback) {
            return cqk.d(this.participantId, ((ParticipantFeedback) other).participantId);
        }
        return false;
    }

    public final long getFinishTimeMs() {
        return this.finishTimeMs;
    }

    public final String getKey() {
        return this.key;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final ParticipantFeedbackSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.participantId.hashCode();
    }

    public ParticipantFeedback(String str, long j, ParticipantId participantId, ParticipantFeedbackSource participantFeedbackSource) {
        this.key = str;
        this.finishTimeMs = j;
        this.participantId = participantId;
        this.source = participantFeedbackSource;
    }
}
