package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cx1 {
    public static final /* synthetic */ cx1[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    cx1 EF5;

    static {
        cx1[] cx1VarArr = {new cx1("LINK", 0), new cx1("CHAT", 1), new cx1("ONE_TO_ONE", 2), new cx1("ACTIVE", 3)};
        a = cx1VarArr;
        b = new ma6(cx1VarArr);
    }

    public static cx1 valueOf(String str) {
        return (cx1) Enum.valueOf(cx1.class, str);
    }

    public static cx1[] values() {
        return (cx1[]) a.clone();
    }
}
