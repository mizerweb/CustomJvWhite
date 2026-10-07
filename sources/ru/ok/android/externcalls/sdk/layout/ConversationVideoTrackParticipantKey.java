package ru.ok.android.externcalls.sdk.layout;

import defpackage.u1b;
import defpackage.v4j;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes.dex */
public class ConversationVideoTrackParticipantKey {
    private final u1b movieId;
    private final ParticipantId participantId;
    private final v4j type;

    public static class Builder {
        private u1b movieId;
        private ParticipantId participantId;
        private v4j type = v4j.a;

        public ConversationVideoTrackParticipantKey build() {
            Objects.requireNonNull(this.participantId);
            Objects.requireNonNull(this.type);
            return new ConversationVideoTrackParticipantKey(this, 0);
        }

        public Builder setMovieId(u1b u1bVar) {
            this.movieId = u1bVar;
            return this;
        }

        public Builder setParticipantId(ParticipantId participantId) {
            this.participantId = participantId;
            return this;
        }

        public Builder setType(v4j v4jVar) {
            this.type = v4jVar;
            return this;
        }
    }

    private ConversationVideoTrackParticipantKey(Builder builder) {
        this.participantId = builder.participantId;
        this.type = builder.type;
        this.movieId = builder.movieId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = (ConversationVideoTrackParticipantKey) obj;
            if (this.participantId.equals(conversationVideoTrackParticipantKey.participantId) && this.type == conversationVideoTrackParticipantKey.type && Objects.equals(this.movieId, conversationVideoTrackParticipantKey.movieId)) {
                return true;
            }
        }
        return false;
    }

    public u1b getMovieId() {
        return this.movieId;
    }

    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public v4j getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.participantId, this.type, this.movieId);
    }

    public String toString() {
        return "ConversationVideoTrackParticipantKey{participantId=" + this.participantId + ", type=" + this.type + ", movieId=" + this.movieId + '}';
    }

    public /* synthetic */ ConversationVideoTrackParticipantKey(Builder builder, int i) {
        this(builder);
    }
}
