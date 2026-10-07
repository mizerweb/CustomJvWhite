package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cde {
    public static final cde a;
    public static final cde b;
    public static final /* synthetic */ cde[] c;

    /* JADX INFO: Fake field, exist only in values array */
    cde EF0;

    static {
        cde cdeVar = new cde("UNDEFINE", 0);
        cde cdeVar2 = new cde("OWNER_EXIT", 1);
        a = cdeVar2;
        cde cdeVar3 = new cde("RECORD_STOP", 2);
        b = cdeVar3;
        c = new cde[]{cdeVar, cdeVar2, cdeVar3};
    }

    public static cde valueOf(String str) {
        return (cde) Enum.valueOf(cde.class, str);
    }

    public static cde[] values() {
        return (cde[]) c.clone();
    }
}
