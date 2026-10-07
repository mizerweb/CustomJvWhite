package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class u3b extends hih {
    public final long c;
    public final List d;

    public u3b(long j, List list) {
        super(kfc.R3);
        this.c = j;
        this.d = list;
        List<p93> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (p93 p93Var : list2) {
            arrayList.add(ouk.a(new ylc("messageId", Long.valueOf(p93Var.a)), new ylc("pollId", Long.valueOf(p93Var.b))));
        }
        boolean zIsEmpty = this.d.isEmpty();
        long j2 = this.c;
        if (zIsEmpty) {
            ore.c(zo5.j(j2, "try get poll updates with empty pollIds for chatId = "));
            throw null;
        }
        f(j2, ApiProtocol.PARAM_CHAT_ID);
        if (arrayList.isEmpty()) {
            return;
        }
        d("polls", arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3b)) {
            return false;
        }
        u3b u3bVar = (u3b) obj;
        return this.c == u3bVar.c && cqk.d(this.d, u3bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }
}
