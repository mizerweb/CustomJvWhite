package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uoh {
    public static final uoh a;
    public static final uoh b;
    public static final uoh c;
    public static final uoh d;
    public static final /* synthetic */ uoh[] e;

    static {
        uoh uohVar = new uoh("PHOTO", 0);
        a = uohVar;
        uoh uohVar2 = new uoh("GIF", 1);
        b = uohVar2;
        uoh uohVar3 = new uoh("VIDEO", 2);
        c = uohVar3;
        uoh uohVar4 = new uoh("AUDIO", 3);
        d = uohVar4;
        e = new uoh[]{uohVar, uohVar2, uohVar3, uohVar4};
    }

    public static uoh valueOf(String str) {
        return (uoh) Enum.valueOf(uoh.class, str);
    }

    public static uoh[] values() {
        return (uoh[]) e.clone();
    }
}
