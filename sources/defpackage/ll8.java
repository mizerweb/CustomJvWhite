package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ll8 {
    public static final ll8 a;
    public static final ll8 b;
    public static final /* synthetic */ ll8[] c;
    public static final /* synthetic */ ma6 d;

    static {
        ll8 ll8Var = new ll8("INVITE_BY_PHONE", 0);
        a = ll8Var;
        ll8 ll8Var2 = new ll8("INVITE_BY_LINK", 1);
        b = ll8Var2;
        ll8[] ll8VarArr = {ll8Var, ll8Var2};
        c = ll8VarArr;
        d = new ma6(ll8VarArr);
    }

    public static ll8 valueOf(String str) {
        return (ll8) Enum.valueOf(ll8.class, str);
    }

    public static ll8[] values() {
        return (ll8[]) c.clone();
    }
}
