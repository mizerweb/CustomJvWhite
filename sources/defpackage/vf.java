package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.util.Collections;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vf implements dk5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public vf(ny8 ny8Var, ny8 ny8Var2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ny8Var;
                this.c = ny8Var2;
                this.d = new r8e(p90.a(Collections.singletonList(new e55(ej5.b.incrementAndGet(), new xnh("Пуши заново"), R.drawable.icon_change_camera, null, null, 24))));
                break;
            default:
                long jIncrementAndGet = ej5.b.incrementAndGet();
                this.b = ny8Var;
                this.c = ny8Var2;
                this.d = new r8e(p90.a(Collections.singletonList(new e55(jIncrementAndGet, new xnh("Отправить аналитику"), R.drawable.icon_language_fill, null, null, 24))));
                break;
        }
    }

    @Override // defpackage.dk5
    public final gjg a() {
        switch (this.a) {
            case 0:
                return (r8e) this.d;
            case 1:
                return (r8e) this.d;
            default:
                return (mjg) this.c;
        }
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ae9) ((ny8) obj).getValue()).l("devtool", true);
                h8c h8cVar = (h8c) ((ny8) obj2).getValue();
                h8cVar.n("Логи отправлены");
                h8cVar.p();
                break;
            case 1:
                m8b m8bVar = new m8b();
                for (rt2 rt2Var : ((qw2) ((ny8) obj2).getValue()).J(null)) {
                    if (rt2Var.b.m > 0) {
                        m8bVar.a(rt2Var.a);
                    }
                }
                ((h5c) ((ny8) obj).getValue()).h(m8bVar);
                break;
            default:
                a8g a8gVar = a8g.b;
                Context context = (Context) obj2;
                gm0.n(a8g.class.getName(), "switch");
                a8gVar.g(context, true ^ a8gVar.f(context));
                mjg mjgVar = (mjg) obj;
                List listD = d();
                mjgVar.getClass();
                mjgVar.j(null, listD);
                h8c h8cVar2 = (h8c) ((h5) this.d).c(316);
                h8cVar2.n("Перезапустите приложение");
                h8cVar2.b("Для применения конфига перезапустите приложение");
                h8cVar2.p();
                break;
        }
    }

    public List d() {
        SpannedString spannedString;
        boolean zF = a8g.b.f((Context) this.b);
        long jIncrementAndGet = ej5.b.incrementAndGet();
        xnh xnhVar = new xnh("Включить single-core mode");
        if (zF) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            sb8.c(spannableStringBuilder, "включено‼️", new p77(-65536));
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            sb8.c(spannableStringBuilder2, "выключено", new p77(Color.parseColor("#4CAF50")));
            spannedString = new SpannedString(spannableStringBuilder2);
        }
        return Collections.singletonList(new e55(jIncrementAndGet, xnhVar, 0, new xnh(spannedString), new d55(zF), 4));
    }

    public vf(h5 h5Var) {
        this.a = 2;
        this.d = h5Var;
        this.b = (Context) h5Var.c(7);
        this.c = p90.a(d());
    }
}
