package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import defpackage.cqk;
import defpackage.dnf;
import defpackage.r1b;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participant", "Ldnf;", "roomId", "Lr1b;", "movie", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Lr1b;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Ldnf;", "component3", "()Lr1b;", "copy", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Lr1b;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipant", "Ldnf;", "getRoomId", "Lr1b;", "getMovie", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MovieStartedData {
    private final r1b movie;
    private final ParticipantId participant;
    private final dnf roomId;

    public MovieStartedData(ParticipantId participantId, dnf dnfVar, r1b r1bVar) {
        this.participant = participantId;
        this.roomId = dnfVar;
        this.movie = r1bVar;
    }

    public static /* synthetic */ MovieStartedData copy$default(MovieStartedData movieStartedData, ParticipantId participantId, dnf dnfVar, r1b r1bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStartedData.participant;
        }
        if ((i & 2) != 0) {
            dnfVar = movieStartedData.roomId;
        }
        if ((i & 4) != 0) {
            r1bVar = movieStartedData.movie;
        }
        return movieStartedData.copy(participantId, dnfVar, r1bVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ParticipantId getParticipant() {
        return this.participant;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final dnf getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final r1b getMovie() {
        return this.movie;
    }

    public final MovieStartedData copy(ParticipantId participant, dnf roomId, r1b movie) {
        return new MovieStartedData(participant, roomId, movie);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovieStartedData)) {
            return false;
        }
        MovieStartedData movieStartedData = (MovieStartedData) other;
        return cqk.d(this.participant, movieStartedData.participant) && cqk.d(this.roomId, movieStartedData.roomId) && cqk.d(this.movie, movieStartedData.movie);
    }

    public final r1b getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final dnf getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return this.movie.hashCode() + ((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "MovieStartedData(participant=" + this.participant + ", roomId=" + this.roomId + ", movie=" + this.movie + ")";
    }
}
