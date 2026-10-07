package defpackage;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ble {
    public final b87 a;
    public final c98 b;
    public final long c;
    public final List d;
    public final l4e e;

    public ble(b87 b87Var, List list, mcf mcfVar, List list2) {
        lvb.R(!list.isEmpty());
        this.a = b87Var;
        this.b = c98.n(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.e = mcfVar.a(this);
        long j = mcfVar.c;
        long j2 = mcfVar.b;
        String str = vqi.a;
        this.c = vqi.i0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract x15 c();

    public abstract l4e e();
}
