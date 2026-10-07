package defpackage;

import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class b64 {
    public static final b64 e;
    public static final b64 f;
    public static final b64 g;
    public static final b64 h;
    public static final /* synthetic */ b64[] i;
    public final tnh a;
    public final tnh b;
    public final tnh c;
    public final w8c d;

    static {
        tnh tnhVar = new tnh(R.string.oneme_chat_complaint_title);
        tnh tnhVar2 = new tnh(R.string.oneme_chat_complaint_description);
        tnh tnhVar3 = new tnh(R.string.oneme_chat_complaint_cancel);
        w8c w8cVar = new w8c(R.drawable.icon_security_check_fill);
        b64 b64Var = new b64("DEFAULT", 0, tnhVar, tnhVar2, tnhVar3, w8cVar);
        e = b64Var;
        b64 b64Var2 = new b64("P2P", 1, new tnh(R.string.oneme_chat_complaint_p2p_title), new tnh(R.string.oneme_chat_complaint_p2p_description), new tnh(R.string.close), new w8c(R.drawable.ic_secure_animated));
        f = b64Var2;
        b64 b64Var3 = new b64("SUSPICIOUS_P2G", 2, new tnh(R.string.oneme_chat_complaint_sus_p2g_title), new tnh(R.string.oneme_chat_complaint_p2p_description), new tnh(R.string.close), new w8c(R.drawable.ic_secure_animated));
        g = b64Var3;
        b64 b64Var4 = new b64("STORY", 3, tnhVar, tnhVar2, tnhVar3, w8cVar);
        h = b64Var4;
        i = new b64[]{b64Var, b64Var2, b64Var3, b64Var4};
    }

    public b64(String str, int i2, tnh tnhVar, tnh tnhVar2, tnh tnhVar3, w8c w8cVar) {
        super(str, i2);
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = tnhVar3;
        this.d = w8cVar;
    }

    public static b64 valueOf(String str) {
        return (b64) Enum.valueOf(b64.class, str);
    }

    public static b64[] values() {
        return (b64[]) i.clone();
    }
}
