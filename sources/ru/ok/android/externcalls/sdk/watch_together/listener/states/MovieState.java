package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import defpackage.cqk;
import defpackage.h2b;
import defpackage.j95;
import defpackage.nbh;
import defpackage.p;
import defpackage.r1b;
import defpackage.x1b;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001e\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000b\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lx1b;", "position", "", "isPlaying", "Lh2b;", "volume", "isMuted", "Lr1b;", "movie", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lx1b;ZFZLr1b;Lj95;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lx1b;", "component3", "()Z", "component4-_pGdNCs", "()F", "component4", "component5", "component6", "()Lr1b;", "copy-brw6TxU", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lx1b;ZFZLr1b;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipantId", "Lx1b;", "getPosition", "Z", "F", "getVolume-_pGdNCs", "Lr1b;", "getMovie", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MovieState {
    private final boolean isMuted;
    private final boolean isPlaying;
    private final r1b movie;
    private final ParticipantId participantId;
    private final x1b position;
    private final float volume;

    private MovieState(ParticipantId participantId, x1b x1bVar, boolean z, float f, boolean z2, r1b r1bVar) {
        this.participantId = participantId;
        this.position = x1bVar;
        this.isPlaying = z;
        this.volume = f;
        this.isMuted = z2;
        this.movie = r1bVar;
    }

    /* JADX INFO: renamed from: copy-brw6TxU$default, reason: not valid java name */
    public static /* synthetic */ MovieState m142copybrw6TxU$default(MovieState movieState, ParticipantId participantId, x1b x1bVar, boolean z, float f, boolean z2, r1b r1bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieState.participantId;
        }
        if ((i & 2) != 0) {
            x1bVar = movieState.position;
        }
        if ((i & 4) != 0) {
            z = movieState.isPlaying;
        }
        if ((i & 8) != 0) {
            f = movieState.volume;
        }
        if ((i & 16) != 0) {
            z2 = movieState.isMuted;
        }
        if ((i & 32) != 0) {
            r1bVar = movieState.movie;
        }
        boolean z3 = z2;
        r1b r1bVar2 = r1bVar;
        return movieState.m144copybrw6TxU(participantId, x1bVar, z, f, z3, r1bVar2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final x1b getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: component4-_pGdNCs, reason: not valid java name and from getter */
    public final float getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final r1b getMovie() {
        return this.movie;
    }

    /* JADX INFO: renamed from: copy-brw6TxU, reason: not valid java name */
    public final MovieState m144copybrw6TxU(ParticipantId participantId, x1b position, boolean isPlaying, float volume, boolean isMuted, r1b movie) {
        return new MovieState(participantId, position, isPlaying, volume, isMuted, movie, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovieState)) {
            return false;
        }
        MovieState movieState = (MovieState) other;
        if (!cqk.d(this.participantId, movieState.participantId) || !cqk.d(this.position, movieState.position) || this.isPlaying != movieState.isPlaying) {
            return false;
        }
        float f = this.volume;
        float f2 = movieState.volume;
        float f3 = h2b.a;
        return Float.compare(f, f2) == 0 && this.isMuted == movieState.isMuted && cqk.d(this.movie, movieState.movie);
    }

    public final r1b getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final x1b getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: getVolume-_pGdNCs, reason: not valid java name */
    public final float m145getVolume_pGdNCs() {
        return this.volume;
    }

    public int hashCode() {
        int iN = nbh.n((this.position.hashCode() + (this.participantId.hashCode() * 31)) * 31, 31, this.isPlaying);
        float f = this.volume;
        float f2 = h2b.a;
        int iN2 = nbh.n(nbh.m(iN, f, 31), 31, this.isMuted);
        r1b r1bVar = this.movie;
        return iN2 + (r1bVar == null ? 0 : r1bVar.hashCode());
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        ParticipantId participantId = this.participantId;
        x1b x1bVar = this.position;
        boolean z = this.isPlaying;
        float f = this.volume;
        float f2 = h2b.a;
        return "MovieState(participantId=" + participantId + ", position=" + x1bVar + ", isPlaying=" + z + ", volume=" + p.e("MovieVolume(value=", ")", f) + ", isMuted=" + this.isMuted + ", movie=" + this.movie + ")";
    }

    public /* synthetic */ MovieState(ParticipantId participantId, x1b x1bVar, boolean z, float f, boolean z2, r1b r1bVar, j95 j95Var) {
        this(participantId, x1bVar, z, f, z2, r1bVar);
    }
}
