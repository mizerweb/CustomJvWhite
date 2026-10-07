package defpackage;

import java.util.ArrayList;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ypl {
    public static final ha9 a(long j) {
        Long lValueOf = Long.valueOf(j);
        if ((lValueOf.longValue() & Long.MIN_VALUE) == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new ha9((int) (lValueOf.longValue() & BuildConfig.MAX_TIME_TO_UPLOAD));
        }
        return null;
    }

    public static final void b(zy4 zy4Var) {
        ghe gheVar = zy4Var.a;
        ArrayList arrayList = new ArrayList(yw3.W0(gheVar, 10));
        a98 a98VarListIterator = gheVar.listIterator(0);
        while (a98VarListIterator.hasNext()) {
            arrayList.add(new h8h((yy4) a98VarListIterator.next()));
        }
    }
}
