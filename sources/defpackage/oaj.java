package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oaj {
    public static final /* synthetic */ oaj[] a = {new oaj("UNKNOWN", 0), new oaj("VISIBLE", 1), new oaj("INVISIBLE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    oaj EF5;

    static {
        values();
    }

    public static oaj valueOf(String str) {
        return (oaj) Enum.valueOf(oaj.class, str);
    }

    public static oaj[] values() {
        return (oaj[]) a.clone();
    }
}
