package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dzg {
    public static final dzg a;
    public static final dzg b;
    public static final dzg c;
    public static final /* synthetic */ dzg[] d;
    public static final /* synthetic */ ma6 e;

    static {
        dzg dzgVar = new dzg("USER", 0);
        a = dzgVar;
        dzg dzgVar2 = new dzg("CHAT", 1);
        b = dzgVar2;
        dzg dzgVar3 = new dzg("CHANNEL", 2);
        c = dzgVar3;
        dzg[] dzgVarArr = {dzgVar, dzgVar2, dzgVar3};
        d = dzgVarArr;
        e = new ma6(dzgVarArr);
    }

    public static dzg valueOf(String str) {
        return (dzg) Enum.valueOf(dzg.class, str);
    }

    public static dzg[] values() {
        return (dzg[]) d.clone();
    }
}
