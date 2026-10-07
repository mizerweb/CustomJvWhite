package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum mrc implements lrc {
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(0),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_USE_SPECIAL_TYPE_FOR_DEV_NULL_NOT_USE(-1),
    INVALID_SCHEMA(-2),
    NEGATIVE_DURATIONS(-3),
    LACK_SPAN_COUNT(-4),
    LACK_REQUIRED_PROPS(-5),
    /* JADX INFO: Fake field, exist only in values array */
    SHOULD_BE_TIMEOUT(-6),
    ROOT_SPAN_INVALID_DURATION(-7),
    ZERO_DURATIONS(-8),
    MAX_PERSISTENT_ATTEMPTS(-10);

    public final int a;

    mrc(int i2) {
        this.a = i2;
    }

    @Override // defpackage.lrc
    public final int a() {
        return this.a;
    }
}
