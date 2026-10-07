package defpackage;

import java.util.Collections;
import one.me.devmenu.tools.TestCrash;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lc1 implements dk5 {
    public final /* synthetic */ int a;
    public final mjg b;

    public lc1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = p90.a(Collections.singletonList(new e55(ej5.b.incrementAndGet(), new xnh("Test crash"), R.drawable.icon_warning, new xnh("Тестовый креш для отправки в tracer"), null, 16)));
                break;
            default:
                this.b = p90.a(Collections.singletonList(new e55(ej5.b.incrementAndGet(), new xnh("0.2.6"), R.drawable.icon_call, new xnh("Версия SDK Звонков"), null, 16)));
                break;
        }
    }

    private final void d(e55 e55Var) {
    }

    @Override // defpackage.dk5
    public final gjg a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                throw new TestCrash();
        }
    }
}
