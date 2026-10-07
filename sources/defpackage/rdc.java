package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rdc {
    public static final rdc a;
    public static final rdc b;
    public static final rdc c;
    public static final rdc d;
    public static final rdc e;
    public static final /* synthetic */ rdc[] f;

    static {
        rdc rdcVar = new rdc("BUFFERING_NOT_LOADING", 0);
        a = rdcVar;
        rdc rdcVar2 = new rdc("BUFFERING_NO_PROGRESS", 1);
        b = rdcVar2;
        rdc rdcVar3 = new rdc("PLAYING_NO_PROGRESS", 2);
        c = rdcVar3;
        rdc rdcVar4 = new rdc("PLAYING_NOT_ENDING", 3);
        d = rdcVar4;
        rdc rdcVar5 = new rdc("SUPPRESSED", 4);
        e = rdcVar5;
        f = new rdc[]{rdcVar, rdcVar2, rdcVar3, rdcVar4, rdcVar5, new rdc("UNKNOWN", 5)};
    }

    public static rdc valueOf(String str) {
        return (rdc) Enum.valueOf(rdc.class, str);
    }

    public static rdc[] values() {
        return (rdc[]) f.clone();
    }
}
