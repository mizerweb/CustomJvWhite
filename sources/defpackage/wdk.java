package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wdk {
    public static final wdk a;
    public static final wdk b;
    public static final wdk c;
    public static final wdk d;
    public static final /* synthetic */ wdk[] e;

    static {
        wdk wdkVar = new wdk("CREATED", 0);
        a = wdkVar;
        wdk wdkVar2 = new wdk("OPEN", 1);
        b = wdkVar2;
        wdk wdkVar3 = new wdk("CLOSING", 2);
        c = wdkVar3;
        wdk wdkVar4 = new wdk("CLOSED", 3);
        d = wdkVar4;
        e = new wdk[]{wdkVar, wdkVar2, wdkVar3, wdkVar4};
    }

    public static wdk valueOf(String str) {
        return (wdk) Enum.valueOf(wdk.class, str);
    }

    public static wdk[] values() {
        return (wdk[]) e.clone();
    }
}
