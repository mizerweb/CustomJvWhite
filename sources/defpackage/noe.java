package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class noe {
    public static final /* synthetic */ noe[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    noe EF5;

    static {
        noe[] noeVarArr = {new noe("LIMITED_TO_REVERSE_CONTACTS", 0)};
        a = noeVarArr;
        b = new ma6(noeVarArr);
    }

    public static noe valueOf(String str) {
        return (noe) Enum.valueOf(noe.class, str);
    }

    public static noe[] values() {
        return (noe[]) a.clone();
    }
}
