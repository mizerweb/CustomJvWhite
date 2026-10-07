package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum uu8 implements go8 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_JAVA_COMMENTS(gu8.ALLOW_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_YAML_COMMENTS(gu8.ALLOW_YAML_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_SINGLE_QUOTES(gu8.ALLOW_SINGLE_QUOTES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNQUOTED_FIELD_NAMES(gu8.ALLOW_UNQUOTED_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNESCAPED_CONTROL_CHARS(gu8.ALLOW_UNQUOTED_CONTROL_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_RS_CONTROL_CHAR(gu8.ALLOW_RS_CONTROL_CHAR),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(gu8.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(gu8.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(gu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(gu8.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(gu8.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_NON_NUMERIC_NUMBERS(gu8.ALLOW_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MISSING_VALUES(gu8.ALLOW_MISSING_VALUES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_TRAILING_COMMA(gu8.ALLOW_TRAILING_COMMA);

    public final int a = 1 << ordinal();
    public final gu8 b;

    uu8(gu8 gu8Var) {
        this.b = gu8Var;
    }

    @Override // defpackage.go8
    public final boolean a() {
        return false;
    }

    @Override // defpackage.go8
    public final int h() {
        return this.a;
    }
}
