package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qf0[], still in use, count: 1, list:
  (r0v1 qf0[]) from 0x0050: CONSTRUCTOR (r1v2 ma6) = (r0v1 qf0[]) A[MD:(java.lang.Enum[]):void (m)] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qf0 {
    PERSONAL(R.string.oneme_settings_media_autosave_type_personal, R.drawable.icon_user, w7c.h),
    GROUP(R.string.oneme_settings_media_autosave_type_group, R.drawable.icon_users, w7c.g),
    CHANNEL(R.string.oneme_settings_media_autosave_type_channel, R.drawable.icon_megaphone, w7c.e),
    BOT(R.string.oneme_settings_media_autosave_type_bot, R.drawable.icon_bot, w7c.d);

    public static final er3 d;
    public static final ArrayList e;
    public static final /* synthetic */ ma6 k;
    public final int a;
    public final int b;
    public final long c;

    static {
        ma6 ma6Var = new ma6(qf0VarArr);
        k = ma6Var;
        d = new er3();
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        Iterator it = ma6Var.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                e = arrayList;
                return;
            }
            arrayList.add(Integer.valueOf((int) ((qf0) y1Var.next()).c));
        }
    }

    public qf0(int i, int i2, long j2) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = j2;
    }

    public static qf0 valueOf(String str) {
        return (qf0) Enum.valueOf(qf0.class, str);
    }

    public static qf0[] values() {
        return (qf0[]) j.clone();
    }
}
