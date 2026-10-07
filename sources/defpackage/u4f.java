package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u4f {
    public static final u4f a;
    public static final u4f b;
    public static final u4f c;
    public static final u4f d;
    public static final /* synthetic */ u4f[] e;

    static {
        u4f u4fVar = new u4f("STARTED", 0);
        a = u4fVar;
        u4f u4fVar2 = new u4f("ERROR", 1);
        b = u4fVar2;
        u4f u4fVar3 = new u4f("FINISHED", 2);
        c = u4fVar3;
        u4f u4fVar4 = new u4f("INIT", 3);
        d = u4fVar4;
        e = new u4f[]{u4fVar, u4fVar2, u4fVar3, u4fVar4};
    }

    public static u4f valueOf(String str) {
        return (u4f) Enum.valueOf(u4f.class, str);
    }

    public static u4f[] values() {
        return (u4f[]) e.clone();
    }
}
