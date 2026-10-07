package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ozb {
    public static final ozb a;
    public static final /* synthetic */ ozb[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ozb EF0;

    static {
        ozb ozbVar = new ozb("TITLE", 0);
        ozb ozbVar2 = new ozb("SUBTITLE", 1);
        ozb ozbVar3 = new ozb("NONE", 2);
        a = ozbVar3;
        b = new ozb[]{ozbVar, ozbVar2, ozbVar3};
    }

    public static ozb valueOf(String str) {
        return (ozb) Enum.valueOf(ozb.class, str);
    }

    public static ozb[] values() {
        return (ozb[]) b.clone();
    }
}
