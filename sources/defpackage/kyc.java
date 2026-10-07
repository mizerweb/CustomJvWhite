package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kyc extends a8j {
    public final r8e c;

    public kyc(ny8 ny8Var, q2c q2cVar, xhh xhhVar, r2c r2cVar) {
        mjg mjgVarA = p90.a(Collections.singletonList(new q37("all.chat.folder", r2cVar.a.getString(R.string.folder_all), null, ou4.b, EnumSet.allOf(s37.class))));
        this.c = new r8e(mjgVarA);
        sy4 sy4Var = (sy4) ny8Var.getValue();
        sy4Var.getClass();
        n0c n0cVar = (n0c) xhhVar;
        e9i.j0(e9i.T(new fz6(e9i.T(new r07(new jz(sy4Var.n, 14), new xc3(q2cVar.e, 22), new d3(this, null, 27), 0), n0cVar.a()), new rea(2, mjgVarA, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), 3), n0cVar.c()), this.b);
    }
}
