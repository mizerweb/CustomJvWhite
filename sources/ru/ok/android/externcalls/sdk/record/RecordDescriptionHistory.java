package ru.ok.android.externcalls.sdk.record;

import defpackage.cqk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "", "currentState", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "previousState", "<init>", "(Lru/ok/android/externcalls/sdk/record/RecordDescription;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "getCurrentState", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getPreviousState", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RecordDescriptionHistory {
    private final RecordDescription currentState;
    private final RecordDescription previousState;

    public RecordDescriptionHistory(RecordDescription recordDescription, RecordDescription recordDescription2) {
        this.currentState = recordDescription;
        this.previousState = recordDescription2;
    }

    public static /* synthetic */ RecordDescriptionHistory copy$default(RecordDescriptionHistory recordDescriptionHistory, RecordDescription recordDescription, RecordDescription recordDescription2, int i, Object obj) {
        if ((i & 1) != 0) {
            recordDescription = recordDescriptionHistory.currentState;
        }
        if ((i & 2) != 0) {
            recordDescription2 = recordDescriptionHistory.previousState;
        }
        return recordDescriptionHistory.copy(recordDescription, recordDescription2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecordDescription getCurrentState() {
        return this.currentState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecordDescription getPreviousState() {
        return this.previousState;
    }

    public final RecordDescriptionHistory copy(RecordDescription currentState, RecordDescription previousState) {
        return new RecordDescriptionHistory(currentState, previousState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordDescriptionHistory)) {
            return false;
        }
        RecordDescriptionHistory recordDescriptionHistory = (RecordDescriptionHistory) other;
        return cqk.d(this.currentState, recordDescriptionHistory.currentState) && cqk.d(this.previousState, recordDescriptionHistory.previousState);
    }

    public final RecordDescription getCurrentState() {
        return this.currentState;
    }

    public final RecordDescription getPreviousState() {
        return this.previousState;
    }

    public int hashCode() {
        RecordDescription recordDescription = this.currentState;
        int iHashCode = (recordDescription == null ? 0 : recordDescription.hashCode()) * 31;
        RecordDescription recordDescription2 = this.previousState;
        return iHashCode + (recordDescription2 != null ? recordDescription2.hashCode() : 0);
    }

    public String toString() {
        return "RecordDescriptionHistory(currentState=" + this.currentState + ", previousState=" + this.previousState + ")";
    }
}
