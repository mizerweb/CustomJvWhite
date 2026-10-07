package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cti {
    public static final cti a;
    public static final cti b;
    public static final cti c;
    public static final cti d;
    public static final /* synthetic */ cti[] e;

    static {
        cti ctiVar = new cti("ACTION_PLAY", 0);
        a = ctiVar;
        cti ctiVar2 = new cti("FIRST_BYTES", 1);
        b = ctiVar2;
        cti ctiVar3 = new cti("FIRST_FRAME", 2);
        c = ctiVar3;
        cti ctiVar4 = new cti("PLAYBACK_STARTED", 3);
        d = ctiVar4;
        e = new cti[]{ctiVar, ctiVar2, ctiVar3, ctiVar4, new cti("CONTENT_ERROR", 4), new cti("EMPTY_BUFFER", 5), new cti("CLOSE_AT_EMPTY_BUFFER", 6)};
    }

    public static cti valueOf(String str) {
        return (cti) Enum.valueOf(cti.class, str);
    }

    public static cti[] values() {
        return (cti[]) e.clone();
    }
}
