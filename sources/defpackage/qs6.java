package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qs6 {
    public static final qs6 a;
    public static final /* synthetic */ qs6[] b;

    static {
        qs6 qs6Var = new qs6("AUDIO_CACHE", 0);
        a = qs6Var;
        b = new qs6[]{qs6Var};
    }

    public static qs6 valueOf(String str) {
        return (qs6) Enum.valueOf(qs6.class, str);
    }

    public static qs6[] values() {
        return (qs6[]) b.clone();
    }
}
