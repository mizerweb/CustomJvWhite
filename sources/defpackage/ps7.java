package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ps7 {
    public static final /* synthetic */ ps7[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    ps7 EF5;

    static {
        ps7[] ps7VarArr = {new ps7("TOP_LEFT", 0), new ps7("TOP_RIGHT", 1), new ps7("BOTTOM_LEFT", 2), new ps7("BOTTOM_RIGHT", 3), new ps7("TOP_CENTER", 4), new ps7("BOTTOM_CENTER", 5), new ps7("LEFT_CENTER", 6), new ps7("RIGHT_CENTER", 7)};
        a = ps7VarArr;
        b = new ma6(ps7VarArr);
    }

    public static ps7 valueOf(String str) {
        return (ps7) Enum.valueOf(ps7.class, str);
    }

    public static ps7[] values() {
        return (ps7[]) a.clone();
    }
}
