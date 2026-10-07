package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ge3 implements a4b {
    public final ArrayList a;
    public final long b;
    public final Long c;

    public ge3(t28 t28Var) {
        this.a = (ArrayList) t28Var.b;
        this.b = t28Var.a;
        this.c = (Long) t28Var.c;
    }

    public static t28 b() {
        return new t28();
    }

    public static ge3 c(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        t28 t28Var = new t28();
        ArrayList arrayList = new ArrayList(a93.e);
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "dontDisturbUntil":
                    t28Var.a = fkaVar.I0();
                    break;
                case "led":
                    if (fkaVar.v0()) {
                        arrayList.add(a93.LED);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "vibr":
                    if (fkaVar.v0()) {
                        arrayList.add(a93.VIBRATION);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "sound":
                    if (fkaVar.v0()) {
                        arrayList.add(a93.SOUND);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "favIndex":
                    t28Var.h(ch3.T(fkaVar, 0L));
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        t28Var.b = arrayList;
        return new ge3(t28Var);
    }

    @Override // defpackage.a4b
    public final void a(yia yiaVar) throws IOException {
        Long l = this.c;
        yiaVar.I(l != null ? 5 : 4);
        yiaVar.P("dontDisturbUntil");
        yiaVar.E(this.b);
        if (l != null) {
            yiaVar.P("favIndex");
            yiaVar.E(l.longValue());
        }
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            yiaVar.P("sound");
            yiaVar.Y((byte) -62);
            yiaVar.P("vibr");
            yiaVar.Y((byte) -62);
            yiaVar.P("led");
            yiaVar.Y((byte) -62);
            return;
        }
        yiaVar.P("sound");
        yiaVar.y(arrayList.contains(a93.SOUND));
        yiaVar.P("vibr");
        yiaVar.y(arrayList.contains(a93.VIBRATION));
        yiaVar.P("led");
        yiaVar.y(arrayList.contains(a93.LED));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        Long l = this.c;
        return qt4.q(nbh.B(this.b, "ChatSettings{options=", strValueOf, ", dontDisturbUntil="), ", favoriteIndex = ", l != null ? l.toString() : "null", "}");
    }
}
