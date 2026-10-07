package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nji {
    public static final nji a;
    public static final /* synthetic */ nji[] b;

    /* JADX INFO: Fake field, exist only in values array */
    nji EF0;

    static {
        nji njiVar = new nji("LOGS", 0);
        nji njiVar2 = new nji("STATS", 1);
        a = njiVar2;
        b = new nji[]{njiVar, njiVar2};
    }

    public static nji valueOf(String str) {
        return (nji) Enum.valueOf(nji.class, str);
    }

    public static nji[] values() {
        return (nji[]) b.clone();
    }
}
