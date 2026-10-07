package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r5f {
    public static final r5f a;
    public static final r5f b;
    public static final r5f c;
    public static final /* synthetic */ r5f[] d;

    static {
        r5f r5fVar = new r5f("UNREAD", 0);
        a = r5fVar;
        r5f r5fVar2 = new r5f("MENTION", 1);
        b = r5fVar2;
        r5f r5fVar3 = new r5f("REACTION", 2);
        c = r5fVar3;
        d = new r5f[]{r5fVar, r5fVar2, r5fVar3};
    }

    public static r5f valueOf(String str) {
        return (r5f) Enum.valueOf(r5f.class, str);
    }

    public static r5f[] values() {
        return (r5f[]) d.clone();
    }
}
