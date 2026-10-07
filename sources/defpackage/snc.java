package defpackage;

import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
public final class snc {
    public final ParticipantId a;
    public final v4j b;

    public snc(ParticipantId participantId, v4j v4jVar) {
        this.a = participantId;
        this.b = v4jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snc)) {
            return false;
        }
        snc sncVar = (snc) obj;
        return this.a.equals(sncVar.a) && this.b == sncVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LastFrameCacheKey(participantId=" + this.a + ", type=" + this.b + ")";
    }
}
