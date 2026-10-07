package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ttc {
    public static final ttc a;
    public static final /* synthetic */ zv8[] b;
    public static final String c;
    public static final fbc d;

    static {
        dwd dwdVar = new dwd(ttc.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        zfe.a.getClass();
        b = new zv8[]{dwdVar};
        a = new ttc();
        c = ttc.class.getName();
        d = new fbc(19, new cka(20));
    }

    public static StringBuilder a() {
        zv8 zv8Var = b[0];
        return (StringBuilder) ((oqh) d.c).get();
    }

    public static String b(String str) {
        boolean zX0 = r5h.X0(str);
        String str2 = c;
        if (zX0) {
            gm0.U(str2, "raw is blank");
            return null;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('0' <= cCharAt && cCharAt < ':') {
                a().append(cCharAt);
            }
        }
        if (a().length() == 0) {
            gm0.U(str2, "raw is not contains digits: '" + str + "'");
            return null;
        }
        String string = a().toString();
        if (string.length() >= 3 && z5h.K0(string, "00", false)) {
            string = string.substring(2);
        }
        if (string.length() == 11 && string.charAt(0) == '8') {
            string = "7".concat(string.substring(1));
        }
        a().delete(0, a().length());
        a().setLength(0);
        return string;
    }
}
