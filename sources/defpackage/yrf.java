package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yrf {
    public static final yrf a;
    public static final /* synthetic */ yrf[] b;

    static {
        yrf yrfVar = new yrf("NONE", 0);
        a = yrfVar;
        b = new yrf[]{yrfVar, new yrf("DARK", 1)};
    }

    public static yrf valueOf(String str) {
        return (yrf) Enum.valueOf(yrf.class, str);
    }

    public static yrf[] values() {
        return (yrf[]) b.clone();
    }
}
