package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum n4h implements go8 {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_SOURCE(gu8.AUTO_CLOSE_SOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(gu8.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNDEFINED(gu8.IGNORE_UNDEFINED),
    /* JADX INFO: Fake field, exist only in values array */
    INCLUDE_SOURCE_IN_LOCATION(gu8.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(gu8.USE_FAST_DOUBLE_PARSER),
    USE_FAST_BIG_NUMBER_PARSER(gu8.USE_FAST_BIG_NUMBER_PARSER);

    public final boolean a;
    public final int b;
    public final gu8 c;

    n4h(gu8 gu8Var) {
        this.c = gu8Var;
        this.b = gu8Var.b;
        this.a = gu8Var.a;
    }

    @Override // defpackage.go8
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.go8
    public final int h() {
        return this.b;
    }
}
