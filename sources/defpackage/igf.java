package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class igf {
    public static final igf a;
    public static final igf b;
    public static final igf c;
    public static final /* synthetic */ igf[] d;

    static {
        igf igfVar = new igf("HideKeyboard", 0);
        a = igfVar;
        igf igfVar2 = new igf("SendMessage", 1);
        b = igfVar2;
        igf igfVar3 = new igf("SendDelayedMessage", 2);
        igf igfVar4 = new igf("SendMessageWithDisabling", 3);
        c = igfVar4;
        d = new igf[]{igfVar, igfVar2, igfVar3, igfVar4};
    }

    public static igf valueOf(String str) {
        return (igf) Enum.valueOf(igf.class, str);
    }

    public static igf[] values() {
        return (igf[]) d.clone();
    }
}
