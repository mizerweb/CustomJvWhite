package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum gu8 {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_RS_CONTROL_CHAR(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(false),
    USE_FAST_DOUBLE_PARSER(false),
    USE_FAST_BIG_NUMBER_PARSER(false);

    public final boolean a;
    public final int b = 1 << ordinal();

    gu8(boolean z) {
        this.a = z;
    }

    public final boolean a(int i) {
        return (this.b & i) != 0;
    }
}
