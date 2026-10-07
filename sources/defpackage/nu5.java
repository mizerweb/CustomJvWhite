package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nu5 {
    public static final /* synthetic */ nu5[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    nu5 EF5;

    static {
        nu5[] nu5VarArr = {new nu5("LINE", 0), new nu5("CUBIC_BEZIER", 1), new nu5("ARROW", 2)};
        a = nu5VarArr;
        b = new ma6(nu5VarArr);
    }

    public static nu5 valueOf(String str) {
        return (nu5) Enum.valueOf(nu5.class, str);
    }

    public static nu5[] values() {
        return (nu5[]) a.clone();
    }
}
