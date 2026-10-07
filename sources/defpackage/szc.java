package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class szc {
    public static final szc a;
    public static final szc b;
    public static final szc c;
    public static final szc d;
    public static final /* synthetic */ szc[] e;

    static {
        szc szcVar = new szc("CHATS", 0);
        a = szcVar;
        szc szcVar2 = new szc("CHAT", 1);
        b = szcVar2;
        szc szcVar3 = new szc("SCHEDULED_CHAT", 2);
        c = szcVar3;
        szc szcVar4 = new szc("OTHER", 3);
        d = szcVar4;
        e = new szc[]{szcVar, szcVar2, szcVar3, szcVar4};
    }

    public static szc valueOf(String str) {
        return (szc) Enum.valueOf(szc.class, str);
    }

    public static szc[] values() {
        return (szc[]) e.clone();
    }
}
