package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hy8 {
    public static final /* synthetic */ hy8[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    hy8 EF5;

    static {
        hy8[] hy8VarArr = {new hy8("DRAWING", 0)};
        a = hy8VarArr;
        b = new ma6(hy8VarArr);
    }

    public static hy8 valueOf(String str) {
        return (hy8) Enum.valueOf(hy8.class, str);
    }

    public static hy8[] values() {
        return (hy8[]) a.clone();
    }
}
