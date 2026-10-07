package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yei {
    public static final yei a;
    public static final yei b;
    public static final /* synthetic */ yei[] c;

    static {
        yei yeiVar = new yei("UNKNOWN", 0);
        a = yeiVar;
        yei yeiVar2 = new yei("NOT_ENOUGH_VIDEO_TRACKS", 1);
        b = yeiVar2;
        c = new yei[]{yeiVar, yeiVar2};
    }

    public static yei valueOf(String str) {
        return (yei) Enum.valueOf(yei.class, str);
    }

    public static yei[] values() {
        return (yei[]) c.clone();
    }
}
