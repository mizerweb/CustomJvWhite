package ru.ok.android.externcalls.sdk.id.local;

import defpackage.c0a;
import defpackage.j95;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LocalParticipantId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicInteger sequence = new AtomicInteger(0);
    private final int id;

    private LocalParticipantId(int i) {
        this.id = i;
    }

    public static /* synthetic */ LocalParticipantId copy$default(LocalParticipantId localParticipantId, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = localParticipantId.id;
        }
        return localParticipantId.copy(i);
    }

    public static final LocalParticipantId nextId() {
        return INSTANCE.nextId();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final LocalParticipantId copy(int id) {
        return new LocalParticipantId(id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalParticipantId) && this.id == ((LocalParticipantId) other).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    public String toString() {
        return c0a.k(this.id, "LocalParticipantId(id=", ")");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId$Companion;", "", "<init>", "()V", "sequence", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextId", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final LocalParticipantId nextId() {
            return new LocalParticipantId(LocalParticipantId.sequence.getAndIncrement(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocalParticipantId(int i, j95 j95Var) {
        this(i);
    }
}
