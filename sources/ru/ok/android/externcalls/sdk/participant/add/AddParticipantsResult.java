package ru.ok.android.externcalls.sdk.participant.add;

import defpackage.cqk;
import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003JY\u0010\u0014\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001b\u0010\b\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "", "addedIds", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "accepted", "rejectedParticipantsIds", "bannedParticipantIds", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;)V", "getAddedIds", "()Ljava/util/Collection;", "getAccepted", "getRejectedParticipantsIds", "getBannedParticipantIds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddParticipantsResult {
    private final Collection<ParticipantId> accepted;
    private final Collection<ParticipantId> addedIds;
    private final Collection<ParticipantId> bannedParticipantIds;
    private final Collection<ParticipantId> rejectedParticipantsIds;

    public AddParticipantsResult(Collection<ParticipantId> collection, Collection<ParticipantId> collection2, Collection<ParticipantId> collection3, Collection<ParticipantId> collection4) {
        this.addedIds = collection;
        this.accepted = collection2;
        this.rejectedParticipantsIds = collection3;
        this.bannedParticipantIds = collection4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddParticipantsResult copy$default(AddParticipantsResult addParticipantsResult, Collection collection, Collection collection2, Collection collection3, Collection collection4, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = addParticipantsResult.addedIds;
        }
        if ((i & 2) != 0) {
            collection2 = addParticipantsResult.accepted;
        }
        if ((i & 4) != 0) {
            collection3 = addParticipantsResult.rejectedParticipantsIds;
        }
        if ((i & 8) != 0) {
            collection4 = addParticipantsResult.bannedParticipantIds;
        }
        return addParticipantsResult.copy(collection, collection2, collection3, collection4);
    }

    public final Collection<ParticipantId> component1() {
        return this.addedIds;
    }

    public final Collection<ParticipantId> component2() {
        return this.accepted;
    }

    public final Collection<ParticipantId> component3() {
        return this.rejectedParticipantsIds;
    }

    public final Collection<ParticipantId> component4() {
        return this.bannedParticipantIds;
    }

    public final AddParticipantsResult copy(Collection<ParticipantId> addedIds, Collection<ParticipantId> accepted, Collection<ParticipantId> rejectedParticipantsIds, Collection<ParticipantId> bannedParticipantIds) {
        return new AddParticipantsResult(addedIds, accepted, rejectedParticipantsIds, bannedParticipantIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddParticipantsResult)) {
            return false;
        }
        AddParticipantsResult addParticipantsResult = (AddParticipantsResult) other;
        return cqk.d(this.addedIds, addParticipantsResult.addedIds) && cqk.d(this.accepted, addParticipantsResult.accepted) && cqk.d(this.rejectedParticipantsIds, addParticipantsResult.rejectedParticipantsIds) && cqk.d(this.bannedParticipantIds, addParticipantsResult.bannedParticipantIds);
    }

    public final Collection<ParticipantId> getAccepted() {
        return this.accepted;
    }

    public final Collection<ParticipantId> getAddedIds() {
        return this.addedIds;
    }

    public final Collection<ParticipantId> getBannedParticipantIds() {
        return this.bannedParticipantIds;
    }

    public final Collection<ParticipantId> getRejectedParticipantsIds() {
        return this.rejectedParticipantsIds;
    }

    public int hashCode() {
        return this.bannedParticipantIds.hashCode() + ((this.rejectedParticipantsIds.hashCode() + ((this.accepted.hashCode() + (this.addedIds.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AddParticipantsResult(addedIds=" + this.addedIds + ", accepted=" + this.accepted + ", rejectedParticipantsIds=" + this.rejectedParticipantsIds + ", bannedParticipantIds=" + this.bannedParticipantIds + ")";
    }
}
