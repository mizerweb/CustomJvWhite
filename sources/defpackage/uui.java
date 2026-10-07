package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uui {
    public static final uui a;
    public static final uui b;
    public static final uui c;
    public static final uui d;
    public static final /* synthetic */ uui[] e;

    static {
        uui uuiVar = new uui("MP4", 0);
        a = uuiVar;
        uui uuiVar2 = new uui("HLS", 1);
        b = uuiVar2;
        uui uuiVar3 = new uui("DASH", 2);
        c = uuiVar3;
        uui uuiVar4 = new uui("RTMP", 3);
        uui uuiVar5 = new uui("OFFLINE", 4);
        uui uuiVar6 = new uui("LOCAL", 5);
        d = uuiVar6;
        e = new uui[]{uuiVar, uuiVar2, uuiVar3, uuiVar4, uuiVar5, uuiVar6, new uui("FRAME", 6)};
    }

    public static uui valueOf(String str) {
        return (uui) Enum.valueOf(uui.class, str);
    }

    public static uui[] values() {
        return (uui[]) e.clone();
    }
}
