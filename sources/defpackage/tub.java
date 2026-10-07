package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tub {
    public static final tub a;
    public static final tub b;
    public static final /* synthetic */ tub[] c;

    static {
        tub tubVar = new tub("TOP", 0);
        a = tubVar;
        tub tubVar2 = new tub("BOTTOM", 1);
        b = tubVar2;
        c = new tub[]{tubVar, tubVar2};
    }

    public static tub valueOf(String str) {
        return (tub) Enum.valueOf(tub.class, str);
    }

    public static tub[] values() {
        return (tub[]) c.clone();
    }
}
