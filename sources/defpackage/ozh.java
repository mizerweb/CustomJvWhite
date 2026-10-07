package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ozh {
    public static final ozh a;
    public static final ozh b;
    public static final /* synthetic */ ozh[] c;

    static {
        ozh ozhVar = new ozh("DEFERRED", 0);
        a = ozhVar;
        ozh ozhVar2 = new ozh("IMMEDIATE", 1);
        b = ozhVar2;
        c = new ozh[]{ozhVar, ozhVar2, new ozh("EXCLUSIVE", 2)};
    }

    public static ozh valueOf(String str) {
        return (ozh) Enum.valueOf(ozh.class, str);
    }

    public static ozh[] values() {
        return (ozh[]) c.clone();
    }
}
