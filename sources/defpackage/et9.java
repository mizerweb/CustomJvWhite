package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 et9[], still in use, count: 1, list:
  (r0v1 et9[]) from 0x0044: CONSTRUCTOR (r1v2 ma6) = (r0v1 et9[]) A[MD:(java.lang.Enum[]):void (m)] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class et9 {
    /* JADX INFO: Fake field, exist only in values array */
    UNLIMITED(0, R.id.oneme_settings_media_item_unlimited, R.string.oneme_settings_media_action_unlimited),
    /* JADX INFO: Fake field, exist only in values array */
    SIX_MONTH(1, R.id.oneme_settings_media_item_six_month, R.string.oneme_settings_media_action_six_month),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_MONTH(2, R.id.oneme_settings_media_item_one_month, R.string.oneme_settings_media_action_one_month),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_WEEK(3, R.id.oneme_settings_media_item_one_week, R.string.oneme_settings_media_action_one_week);

    public static final ArrayList d;
    public static final /* synthetic */ ma6 f;
    public final int a;
    public final int b;
    public final int c;

    static {
        ma6 ma6Var = new ma6(et9VarArr);
        f = ma6Var;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        Iterator it = ma6Var.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                d = arrayList;
                return;
            }
            arrayList.add(Integer.valueOf(((et9) y1Var.next()).b));
        }
    }

    public et9(int i, int i2, int i3) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static et9 valueOf(String str) {
        return (et9) Enum.valueOf(et9.class, str);
    }

    public static et9[] values() {
        return (et9[]) e.clone();
    }
}
