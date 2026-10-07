package defpackage;

import android.content.Context;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eqe {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ifh d;
    public int e;

    public eqe(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var2;
        this.b = ny8Var6;
        this.c = ny8Var;
        this.d = new ifh(new ja1(this, ny8Var3, ny8Var4, ny8Var5, 12));
    }

    public final sw1 a() {
        return (sw1) this.d.getValue();
    }

    public final void b() {
        this.e = 5;
        sw1 sw1VarA = a();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            sw1VarA.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "RingtoneManagerTag", "startBusy ringtone", null);
            }
        }
        if (sw1VarA.a()) {
            sw1VarA.b(sw1VarA.g.g, false, 0);
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, "RingtoneManagerTag", "Early return in startBusy cuz of !isRingtonePlayAvailable()", null);
        }
    }

    public final void c() {
        this.e = 1;
        sw1 sw1VarA = a();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            sw1VarA.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "RingtoneManagerTag", "startEnd ringtone", null);
            }
        }
        if (sw1VarA.a()) {
            sw1VarA.b(sw1VarA.g.a, false, 0);
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, "RingtoneManagerTag", "Early return in startEnd cuz of !isRingtonePlayAvailable()", null);
        }
    }

    public final void d() {
        if (this.e != 3) {
            this.e = 11;
            sw1 sw1VarA = a();
            Context context = sw1VarA.a;
            String strA = kc9.a(context);
            if (strA == null) {
                strA = kc9.e(context).toLanguageTag();
            }
            sw1VarA.b(new hdg(11, Integer.valueOf(kc9.a.contains(Locale.forLanguageTag(strA).getLanguage()) ? R.raw.call_hold_ru : R.raw.call_hold_en)), false, 0);
            return;
        }
        String name = eqe.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "startHold: skipped, current is: ".concat(pye.h(this.e)), null);
        }
    }

    public final void e() {
        int i = this.e;
        if (i == 1 || i == 2 || i == 5) {
            this.e = 0;
        } else {
            this.e = 0;
            a().d();
        }
    }
}
