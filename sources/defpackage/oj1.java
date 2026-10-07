package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class oj1 {
    public final ny8 a;
    public final ny8 b;

    public oj1(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final void a(KeyEvent keyEvent) {
        je9 je9Var = je9.d;
        boolean zK = ((x02) ((b95) this.a.getValue()).i.a.getValue()).k();
        boolean z = keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25);
        if (!z || !zK) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "HandleSilenceMode", zo5.q("skip handle buttons, isIncoming=", " isNeededAction=", zK, z), null);
                return;
            }
            return;
        }
        gm0.n("HandleSilenceMode", "try mute ringtones");
        sw1 sw1VarA = ((eqe) this.b.getValue()).a();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            sw1VarA.getClass();
            if (a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "RingtoneManagerTag", " set mute", null);
            }
        }
        sw1VarA.d();
    }
}
