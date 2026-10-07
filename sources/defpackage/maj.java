package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class maj {
    public static final maj a;
    public static final maj b;
    public static final /* synthetic */ maj[] c;

    static {
        maj majVar = new maj("FG", 0);
        a = majVar;
        maj majVar2 = new maj("BG", 1);
        b = majVar2;
        c = new maj[]{majVar, majVar2};
    }

    public static maj valueOf(String str) {
        return (maj) Enum.valueOf(maj.class, str);
    }

    public static maj[] values() {
        return (maj[]) c.clone();
    }
}
