package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class iia {
    public static final iia a;
    public static final iia b;
    public static final iia c;
    public static final iia d;
    public static final iia e;
    public static final /* synthetic */ iia[] f;

    static {
        iia iiaVar = new iia("SIMPLE", 0);
        a = iiaVar;
        iia iiaVar2 = new iia("CONTACT", 1);
        b = iiaVar2;
        iia iiaVar3 = new iia("MEDIA", 2);
        c = iiaVar3;
        iia iiaVar4 = new iia("STICKER", 3);
        d = iiaVar4;
        iia iiaVar5 = new iia("FORWARD", 4);
        e = iiaVar5;
        f = new iia[]{iiaVar, iiaVar2, iiaVar3, iiaVar4, iiaVar5};
    }

    public static iia valueOf(String str) {
        return (iia) Enum.valueOf(iia.class, str);
    }

    public static iia[] values() {
        return (iia[]) f.clone();
    }
}
