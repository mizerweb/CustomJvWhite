package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nwd {
    public static final nwd a;
    public static final /* synthetic */ nwd[] b;

    static {
        nwd nwdVar = new nwd("DEFAULT", 0);
        a = nwdVar;
        b = new nwd[]{nwdVar, new nwd("SIGNED", 1), new nwd("FIXED", 2)};
    }

    public static nwd valueOf(String str) {
        return (nwd) Enum.valueOf(nwd.class, str);
    }

    public static nwd[] values() {
        return (nwd[]) b.clone();
    }
}
