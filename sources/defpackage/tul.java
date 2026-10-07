package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum tul implements oqk {
    UNKNOWN_STATUS(0),
    EXPLICITLY_REQUESTED(1),
    /* JADX INFO: Fake field, exist only in values array */
    IMPLICITLY_REQUESTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_INFO_RETRIEVAL_SUCCEEDED(3),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_INFO_RETRIEVAL_FAILED(4),
    SCHEDULED(5),
    DOWNLOADING(6),
    SUCCEEDED(7),
    FAILED(8),
    LIVE(9),
    UPDATE_AVAILABLE(10),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOADED(11),
    /* JADX INFO: Fake field, exist only in values array */
    STARTED(12);

    public final int a;

    tul(int i) {
        this.a = i;
    }

    @Override // defpackage.oqk
    public final int zza() {
        return this.a;
    }
}
