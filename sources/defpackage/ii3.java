package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ii3 extends kih {
    public List c;
    public long d;

    public ii3(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.d = fkaVar.I0();
        } else if (str.equals("chats")) {
            this.c = b50.b(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return zo5.g(tre.O(this.c), this.d, "marker=", ", chats=");
    }
}
