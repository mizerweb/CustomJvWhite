package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class y83 extends a8j {
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;

    public y83(ny8 ny8Var, ny8 ny8Var2) {
        this.c = ny8Var2;
        this.d = ny8Var;
        mjg mjgVarA = p90.a(r66.a);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        mjgVarA.setValue(B());
    }

    public final c79 B() {
        c79 c79VarW = yab.w();
        boolean z = C().h() != 1;
        boolean z2 = C().h() == 0;
        boolean z3 = C().h() == 2;
        c79VarW.add(new ctf(R.id.oneme_notifications_settings_chat_enable_notifications_button, 0, new tnh(R.string.oneme_notifications_settings_chat_enable_notifications_button), null, null, null, null, new ksf(z, true), null, false, null, 1912));
        if (z) {
            c79VarW.add(new ctf(R.id.oneme_notifications_settings_chat_type_all_button, 1, new tnh(R.string.oneme_notifications_settings_chat_type_all_button), null, null, null, null, new jsf(z2, true), null, false, null, 1912));
            c79VarW.add(new ctf(R.id.oneme_notifications_settings_chat_type_pin_reply_button, 1, new tnh(R.string.oneme_notifications_settings_chat_type_pin_reply_button), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, new jsf(z3, true), null, false, null, 1912));
        }
        return yab.j(c79VarW);
    }

    public final nni C() {
        return (nni) this.d.getValue();
    }

    public final void D(long j) {
        if (j == R.id.oneme_notifications_settings_chat_enable_notifications_button) {
            E(C().h() == 1 ? C().d.getInt("app.notification.chats.show.last", 0) : 1);
        } else if (j == R.id.oneme_notifications_settings_chat_type_all_button) {
            E(0);
        } else if (j == R.id.oneme_notifications_settings_chat_type_pin_reply_button) {
            E(2);
        }
    }

    public final void E(int i) {
        String str;
        if (i != 1) {
            str = i != 2 ? "ON" : "REPLY";
        } else {
            str = "OFF";
        }
        C().o(i);
        pvb pvbVar = (pvb) this.c.getValue();
        ini iniVar = new ini();
        iniVar.d = str;
        pvbVar.q(new lni(iniVar));
        this.e.setValue(B());
    }
}
