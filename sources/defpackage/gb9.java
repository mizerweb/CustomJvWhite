package defpackage;

import ru.ok.tamtam.messages.a;

/* JADX INFO: loaded from: classes.dex */
public final class gb9 {
    public final ny8 a;
    public final ny8 b;

    public gb9(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final fda a(long j, boolean z) {
        sfa sfaVarL = ((qfa) this.a.getValue()).l(j);
        fda fdaVarA = (sfaVarL == null || (!z && sfaVarL.j == wja.DELETED)) ? null : a.a((a) this.b.getValue(), sfaVarL);
        if (fdaVarA != null) {
            return fdaVarA;
        }
        throw new IllegalStateException(("message not found or deleted, id=" + j).toString());
    }
}
