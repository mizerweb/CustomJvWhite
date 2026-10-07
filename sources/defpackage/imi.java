package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class imi {
    public static final List d = Arrays.asList(1, 2, 4, 3, 7);
    public b9j a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(cli cliVar) {
        this.b.add(cliVar);
    }

    public final kr6 b() {
        ArrayList arrayList = this.b;
        qyj.h("UseCase must not be empty.", !arrayList.isEmpty());
        ArrayList arrayList2 = this.c;
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((xxi) it.next()).a;
            yvl.a(i2, d);
            int i3 = i & i2;
            if (i3 > 0) {
                Locale locale = Locale.US;
                ore.p(c0a.o("More than one effects has targets ", yvl.b(i3), "."));
                return null;
            }
            i |= i2;
        }
        return new kr6(this.a, arrayList, arrayList2);
    }
}
