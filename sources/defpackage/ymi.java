package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ymi {
    public static final ymi a;
    public static final ymi b;
    public static final ymi c;
    public static final ymi d;
    public static final /* synthetic */ ymi[] e;

    static {
        ymi ymiVar = new ymi("ALL", 0);
        a = ymiVar;
        ymi ymiVar2 = new ymi("USER_FOLDER", 1);
        b = ymiVar2;
        ymi ymiVar3 = new ymi("CREATE_FOLDER", 2);
        c = ymiVar3;
        ymi ymiVar4 = new ymi("RECOMMENDED_FOLDER", 3);
        d = ymiVar4;
        e = new ymi[]{ymiVar, ymiVar2, ymiVar3, ymiVar4};
    }

    public static ymi valueOf(String str) {
        return (ymi) Enum.valueOf(ymi.class, str);
    }

    public static ymi[] values() {
        return (ymi[]) e.clone();
    }
}
