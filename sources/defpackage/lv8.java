package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lv8 implements go8 {
    /* JADX INFO: Fake field, exist only in values array */
    QUOTE_FIELD_NAMES(true, qt8.QUOTE_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NAN_AS_STRINGS(true, qt8.QUOTE_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NUMBERS_AS_STRINGS(false, qt8.WRITE_NUMBERS_AS_STRINGS),
    /* JADX INFO: Fake field, exist only in values array */
    ESCAPE_NON_ASCII(false, qt8.ESCAPE_NON_ASCII),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_HEX_UPPER_CASE(true, qt8.WRITE_HEX_UPPER_CASE),
    ESCAPE_FORWARD_SLASHES(false, qt8.ESCAPE_FORWARD_SLASHES),
    /* JADX INFO: Fake field, exist only in values array */
    COMBINE_UNICODE_SURROGATES_IN_UTF8(false, qt8.COMBINE_UNICODE_SURROGATES_IN_UTF8);

    public final boolean a;
    public final int b = 1 << ordinal();
    public final qt8 c;

    lv8(boolean z, qt8 qt8Var) {
        this.a = z;
        this.c = qt8Var;
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
