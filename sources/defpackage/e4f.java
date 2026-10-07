package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e4f {
    public static final e4f a;
    public static final e4f b;
    public static final /* synthetic */ e4f[] c;

    static {
        e4f e4fVar = new e4f("PREVIEW_VIEW", 0);
        a = e4fVar;
        e4f e4fVar2 = new e4f("SCREEN_FLASH_VIEW", 1);
        b = e4fVar2;
        c = new e4f[]{e4fVar, e4fVar2};
    }

    public static e4f valueOf(String str) {
        return (e4f) Enum.valueOf(e4f.class, str);
    }

    public static e4f[] values() {
        return (e4f[]) c.clone();
    }
}
