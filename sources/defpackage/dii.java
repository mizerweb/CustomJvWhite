package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dii {
    public static final dii a;
    public static final dii b;
    public static final /* synthetic */ dii[] c;

    static {
        dii diiVar = new dii("ONE_ME", 0);
        a = diiVar;
        dii diiVar2 = new dii("ONE_VIDEO", 1);
        b = diiVar2;
        c = new dii[]{diiVar, diiVar2};
    }

    public static dii valueOf(String str) {
        return (dii) Enum.valueOf(dii.class, str);
    }

    public static dii[] values() {
        return (dii[]) c.clone();
    }
}
