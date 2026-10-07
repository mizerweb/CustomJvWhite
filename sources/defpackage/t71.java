package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t71 {
    public static final /* synthetic */ t71[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    t71 EF5;

    static {
        t71[] t71VarArr = {new t71("IMAGES", 0), new t71("AUDIO", 1), new t71("GIF", 2), new t71("STICKERS", 3), new t71("MUSIC", 4), new t71("VIDEO", 5), new t71("OTHERS", 6)};
        a = t71VarArr;
        b = new ma6(t71VarArr);
    }

    public static t71 valueOf(String str) {
        return (t71) Enum.valueOf(t71.class, str);
    }

    public static t71[] values() {
        return (t71[]) a.clone();
    }
}
