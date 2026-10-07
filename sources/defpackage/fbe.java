package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fbe {
    public static final fbe a;
    public static final fbe b;
    public static final /* synthetic */ fbe[] c;

    static {
        fbe fbeVar = new fbe("VIDEO_MSG", 0);
        a = fbeVar;
        fbe fbeVar2 = new fbe("AUDIO_MSG", 1);
        b = fbeVar2;
        c = new fbe[]{fbeVar, fbeVar2};
    }

    public static fbe valueOf(String str) {
        return (fbe) Enum.valueOf(fbe.class, str);
    }

    public static fbe[] values() {
        return (fbe[]) c.clone();
    }
}
