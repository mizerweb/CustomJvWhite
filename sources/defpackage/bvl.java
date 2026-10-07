package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum bvl implements oqk {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    APP_ASSET(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(2),
    CLOUD(3),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_BUILT_IN(4),
    /* JADX INFO: Fake field, exist only in values array */
    URI(5);

    public final int a;

    bvl(int i) {
        this.a = i;
    }

    @Override // defpackage.oqk
    public final int zza() {
        return this.a;
    }
}
