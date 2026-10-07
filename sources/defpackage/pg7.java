package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pg7 {
    public static final pg7 a;
    public static final pg7 b;
    public static final pg7 c;
    public static final pg7 d;
    public static final pg7 e;
    public static final pg7 f;
    public static final pg7 g;
    public static final pg7 h;
    public static final pg7 i;
    public static final pg7 j;
    public static final /* synthetic */ pg7[] k;

    static {
        pg7 pg7Var = new pg7("client_hello", 0);
        a = pg7Var;
        pg7 pg7Var2 = new pg7("server_hello", 1);
        b = pg7Var2;
        pg7 pg7Var3 = new pg7("new_session_ticket", 2);
        pg7 pg7Var4 = new pg7("end_of_early_data", 3);
        pg7 pg7Var5 = new pg7("encrypted_extensions", 4);
        c = pg7Var5;
        pg7 pg7Var6 = new pg7("certificate", 5);
        pg7 pg7Var7 = new pg7("certificate_request", 6);
        d = pg7Var7;
        pg7 pg7Var8 = new pg7("certificate_verify", 7);
        pg7 pg7Var9 = new pg7("finished", 8);
        pg7 pg7Var10 = new pg7("key_update", 9);
        pg7 pg7Var11 = new pg7("server_certificate", 10);
        e = pg7Var11;
        pg7 pg7Var12 = new pg7("server_certificate_verify", 11);
        f = pg7Var12;
        pg7 pg7Var13 = new pg7("server_finished", 12);
        g = pg7Var13;
        pg7 pg7Var14 = new pg7("client_certificate", 13);
        h = pg7Var14;
        pg7 pg7Var15 = new pg7("client_certificate_verify", 14);
        i = pg7Var15;
        pg7 pg7Var16 = new pg7("client_finished", 15);
        j = pg7Var16;
        k = new pg7[]{pg7Var, pg7Var2, pg7Var3, pg7Var4, pg7Var5, pg7Var6, pg7Var7, pg7Var8, pg7Var9, pg7Var10, pg7Var11, pg7Var12, pg7Var13, pg7Var14, pg7Var15, pg7Var16};
    }

    public static pg7 valueOf(String str) {
        return (pg7) Enum.valueOf(pg7.class, str);
    }

    public static pg7[] values() {
        return (pg7[]) k.clone();
    }
}
