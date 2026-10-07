package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum cv8 {
    NOT_AVAILABLE(-1, null),
    START_OBJECT(1, "{"),
    END_OBJECT(2, "}"),
    START_ARRAY(3, "["),
    END_ARRAY(4, "]"),
    FIELD_NAME(5, null),
    /* JADX INFO: Fake field, exist only in values array */
    VALUE_EMBEDDED_OBJECT(12, null),
    VALUE_STRING(6, null),
    VALUE_NUMBER_INT(7, null),
    VALUE_NUMBER_FLOAT(8, null),
    VALUE_TRUE(9, "true"),
    VALUE_FALSE(10, "false"),
    VALUE_NULL(11, "null");

    public final String a;
    public final char[] b;
    public final byte[] c;
    public final int d;
    public final boolean e;
    public final boolean f;

    cv8(int i, String str) {
        if (str == null) {
            this.a = null;
            this.b = null;
            this.c = null;
        } else {
            this.a = str;
            char[] charArray = str.toCharArray();
            this.b = charArray;
            int length = charArray.length;
            this.c = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.c[i2] = (byte) this.b[i2];
            }
        }
        this.d = i;
        if (i != 10) {
        }
        if (i != 7) {
        }
        this.e = i == 1 || i == 3;
        this.f = i == 2 || i == 4;
    }
}
