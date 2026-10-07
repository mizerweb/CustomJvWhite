package defpackage;

import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes.dex */
public final class mz2 extends aq implements qih {
    public final List f;

    public mz2(long j, List list) {
        super(j);
        this.f = list;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) throws Throwable {
        nz2 nz2Var = (nz2) kihVar;
        try {
            s().l(nz2Var);
        } catch (TamErrorException e) {
            String name = mz2.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "fail to get missed contacts for CHAT_INFO", e);
                }
            }
        }
        p().c0(nz2Var.c);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        return new ky(this.f);
    }
}
