package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import defpackage.cqk;
import defpackage.dnf;
import defpackage.qt4;
import defpackage.u1b;
import defpackage.z1b;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participant", "Ldnf;", "roomId", "Lu1b;", "movieId", "Lz1b;", "sourceType", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Lu1b;Lz1b;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Ldnf;", "component3", "()Lu1b;", "component4", "()Lz1b;", "copy", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Lu1b;Lz1b;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipant", "Ldnf;", "getRoomId", "Lu1b;", "getMovieId", "Lz1b;", "getSourceType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MovieStoppedData {
    private final u1b movieId;
    private final ParticipantId participant;
    private final dnf roomId;
    private final z1b sourceType;

    public MovieStoppedData(ParticipantId participantId, dnf dnfVar, u1b u1bVar, z1b z1bVar) {
        this.participant = participantId;
        this.roomId = dnfVar;
        this.movieId = u1bVar;
        this.sourceType = z1bVar;
    }

    public static /* synthetic */ MovieStoppedData copy$default(MovieStoppedData movieStoppedData, ParticipantId participantId, dnf dnfVar, u1b u1bVar, z1b z1bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStoppedData.participant;
        }
        if ((i & 2) != 0) {
            dnfVar = movieStoppedData.roomId;
        }
        if ((i & 4) != 0) {
            u1bVar = movieStoppedData.movieId;
        }
        if ((i & 8) != 0) {
            z1bVar = movieStoppedData.sourceType;
        }
        return movieStoppedData.copy(participantId, dnfVar, u1bVar, z1bVar);
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
    public final u1b getMovieId() {
        return this.movieId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final z1b getSourceType() {
        return this.sourceType;
    }

    public final MovieStoppedData copy(ParticipantId participant, dnf roomId, u1b movieId, z1b sourceType) {
        return new MovieStoppedData(participant, roomId, movieId, sourceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovieStoppedData)) {
            return false;
        }
        MovieStoppedData movieStoppedData = (MovieStoppedData) other;
        return cqk.d(this.participant, movieStoppedData.participant) && cqk.d(this.roomId, movieStoppedData.roomId) && cqk.d(this.movieId, movieStoppedData.movieId) && this.sourceType == movieStoppedData.sourceType;
    }

    public final u1b getMovieId() {
        return this.movieId;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final dnf getRoomId() {
        return this.roomId;
    }

    public final z1b getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return this.sourceType.hashCode() + qt4.g((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31, 31, this.movieId.a);
    }

    public String toString() {
        return "MovieStoppedData(participant=" + this.participant + ", roomId=" + this.roomId + ", movieId=" + this.movieId + ", sourceType=" + this.sourceType + ")";
    }
}
