package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ax8, still in use, count: 1, list:
  (r0v0 ax8) from 0x002a: FILLED_NEW_ARRAY (r0v0 ax8), (r1v1 ax8) A[WRAPPED] elemType: ax8
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
public final class ax8 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(R.string.oneme_media_keyboard_tab_stickers, 1),
    e(R.string.oneme_media_keyboard_tab_emoji, 2),
    /* JADX INFO: Fake field, exist only in values array */
    EF33(R.string.oneme_media_keyboard_tab_gifs, 3);

    public static final List d;
    public final int a;
    public final int b;
    public final int c;

    static {
        ax8 ax8Var = e;
        d = xw3.P0(ax8Var, ax8Var);
    }

    public ax8(int i, int i2) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = i;
    }

    public static ax8 valueOf(String str) {
        return (ax8) Enum.valueOf(ax8.class, str);
    }

    public static ax8[] values() {
        return (ax8[]) f.clone();
    }
}
