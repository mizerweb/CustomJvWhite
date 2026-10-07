package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qt8 {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(false),
    USE_FAST_DOUBLE_WRITER(false),
    WRITE_HEX_UPPER_CASE(true),
    ESCAPE_FORWARD_SLASHES(false),
    COMBINE_UNICODE_SURROGATES_IN_UTF8(false);

    public final boolean a;
    public final int b = 1 << ordinal();

    qt8(boolean z) {
        this.a = z;
    }

    public final boolean a(int i) {
        return (this.b & i) != 0;
    }
}
