package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uo2 {
    public static final uo2 c = new uo2(ww3.X1(new ArrayList()), null);
    public final Set a;
    public final rx8 b;

    public uo2(Set set, rx8 rx8Var) {
        this.a = set;
        this.b = rx8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uo2)) {
            return false;
        }
        uo2 uo2Var = (uo2) obj;
        return uo2Var.a.equals(this.a) && cqk.d(uo2Var.b, this.b);
    }

    public final int hashCode() {
        int iO = nbh.o(this.a, 1517, 41);
        rx8 rx8Var = this.b;
        return iO + (rx8Var != null ? rx8Var.hashCode() : 0);
    }
}
