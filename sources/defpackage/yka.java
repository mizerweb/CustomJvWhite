package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yka {
    public static final yka a;
    public static final yka b;
    public static final yka c;
    public static final yka d;
    public static final /* synthetic */ yka[] e;

    static {
        yka ykaVar = new yka("DEFAULT", 0);
        a = ykaVar;
        yka ykaVar2 = new yka("EMOJI", 1);
        b = ykaVar2;
        yka ykaVar3 = new yka("KEYBOARD", 2);
        c = ykaVar3;
        yka ykaVar4 = new yka("KEYBOARD_BY_SYSTEM", 3);
        d = ykaVar4;
        e = new yka[]{ykaVar, ykaVar2, ykaVar3, ykaVar4};
    }

    public static yka valueOf(String str) {
        return (yka) Enum.valueOf(yka.class, str);
    }

    public static yka[] values() {
        return (yka[]) e.clone();
    }
}
