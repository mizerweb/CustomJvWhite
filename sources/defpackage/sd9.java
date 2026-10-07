package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class sd9 {
    public static final sd9 c;
    public static final sd9 d;
    public static final sd9 e;
    public static final sd9 f;
    public static final sd9 g;
    public static final sd9 h;
    public static final sd9 i;
    public static final /* synthetic */ sd9[] j;
    public final String a;
    public final je9 b;

    static {
        sd9 sd9Var = new sd9("SEND", 0, "send");
        c = sd9Var;
        je9 je9Var = je9.g;
        sd9 sd9Var2 = new sd9("EXCEPTION", 1, "exception", je9Var);
        d = sd9Var2;
        sd9 sd9Var3 = new sd9("SEND_ACK", 2, "send_ack");
        e = sd9Var3;
        sd9 sd9Var4 = new sd9("QUEUE", 3, "queue");
        f = sd9Var4;
        sd9 sd9Var5 = new sd9("ERROR", 4, "error", je9Var);
        g = sd9Var5;
        sd9 sd9Var6 = new sd9("RECEIVE", 5, "receive");
        h = sd9Var6;
        sd9 sd9Var7 = new sd9("NOTIF", 6, "notif");
        i = sd9Var7;
        j = new sd9[]{sd9Var, sd9Var2, sd9Var3, sd9Var4, sd9Var5, sd9Var6, sd9Var7};
    }

    public sd9(String str, int i2, String str2, je9 je9Var) {
        super(str, i2);
        this.a = str2;
        this.b = je9Var;
    }

    public static sd9 valueOf(String str) {
        return (sd9) Enum.valueOf(sd9.class, str);
    }

    public static sd9[] values() {
        return (sd9[]) j.clone();
    }

    public /* synthetic */ sd9(String str, int i2, String str2) {
        this(str, i2, str2, je9.d);
    }
}
