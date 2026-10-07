package defpackage;

import java.util.LinkedHashSet;
import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 en9, still in use, count: 1, list:
  (r0v0 en9) from 0x0094: FILLED_NEW_ARRAY (r0v0 en9), (r1v1 en9), (r2v2 en9), (r8v4 en9) A[WRAPPED] elemType: en9
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class en9 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(R.id.markdown_original, R.string.markdown_original),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(R.id.markdown_heading, R.string.markdown_heading),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(R.id.markdown_bold, R.string.markdown_bold),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(R.id.markdown_italic, R.string.markdown_italic),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(R.id.markdown_underline, R.string.markdown_underline),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(R.id.markdown_mono, R.string.markdown_mono),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(R.id.markdown_strikethrough, R.string.markdown_strikethrough),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(R.id.markdown_link, R.string.markdown_add_link),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(R.id.markdown_quote, R.string.markdown_quote),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(R.id.markdown_regular, R.string.markdown_regular);

    public static final LinkedHashSet c;
    public final int a;
    public final int b;

    static {
        en9 en9Var = EF1;
        en9 en9Var2 = EF2;
        en9 en9Var3 = EF8;
        lof.W(en9Var, en9Var, en9Var2, en9Var3);
        c = lof.W(en9Var, en9Var2, en9Var, en9Var, en9Var, en9Var, en9Var, en9Var3, en9Var);
    }

    public en9(int i, int i2) {
        super(str, i);
        this.a = i;
        this.b = i2;
    }

    public static en9 valueOf(String str) {
        return (en9) Enum.valueOf(en9.class, str);
    }

    public static en9[] values() {
        return (en9[]) d.clone();
    }
}
