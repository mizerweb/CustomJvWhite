package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f3h {
    public static final f3h a;
    public static final /* synthetic */ f3h[] b;

    static {
        f3h f3hVar = new f3h("DOWNLOADS", 0);
        a = f3hVar;
        b = new f3h[]{f3hVar, new f3h("UPLOAD", 1)};
    }

    public static f3h valueOf(String str) {
        return (f3h) Enum.valueOf(f3h.class, str);
    }

    public static f3h[] values() {
        return (f3h[]) b.clone();
    }
}
