package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lu7 implements dk5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final long e;
    public final long f;
    public final dq4 g;
    public sgg h;
    public final r8e i;

    public lu7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var3;
        this.c = ny8Var2;
        this.d = ny8Var4;
        AtomicLong atomicLong = ej5.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        this.e = jIncrementAndGet;
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        this.f = jIncrementAndGet2;
        this.g = cqk.a(((n0c) ((xhh) ny8Var3.getValue())).a());
        this.i = new r8e(p90.a(xw3.P0(new e55(jIncrementAndGet, new tnh(R.string.oneme_settings_dump_heap), R.drawable.icon_folder_add_to, null, null, 24), new e55(jIncrementAndGet2, new tnh(R.string.oneme_settings_dump_heap_tracer), R.drawable.icon_folder_add_to, null, null, 24))));
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.i;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        long j = e55Var.a;
        boolean zA = ej5.a(j, this.e);
        ny8 ny8Var = this.d;
        if (zA) {
            sgg sggVar = this.h;
            if (sggVar == null || !sggVar.isActive()) {
                this.h = yab.i0(this.g, ((n0c) ((xhh) this.b.getValue())).b(), 0, new qc5(this, (lq4) null, 25), 2);
                return;
            } else {
                h8c h8cVar = (h8c) ny8Var.getValue();
                h8cVar.n("Дамп памяти уже происходит, нужно немного подождать");
                h8cVar.p();
                return;
            }
        }
        if (ej5.a(j, this.f)) {
            nu7 nu7Var = nu7.a;
            if (r5h.X0("dev_menu")) {
                ore.p("Blank tag");
                return;
            }
            nu7.b("dev_menu");
            h8c h8cVar2 = (h8c) ny8Var.getValue();
            h8cVar2.n("Дамп памяти отправлен в tracer. Для повторной выгрузки перезапустите приложение");
            h8cVar2.p();
        }
    }
}
