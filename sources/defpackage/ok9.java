package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.main.MainScreen;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes.dex */
public final class ok9 implements h65 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public ok9(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    @Override // defpackage.h65
    public final u65 a(String str, final m65 m65Var, final Bundle bundle) {
        f2 f2Var;
        t65 of9Var;
        if (!((LinkedHashSet) ((pk9) this.a.getValue()).b).contains(m65Var)) {
            return null;
        }
        f2 q65Var = r65.c;
        pk9.c.getClass();
        boolean z = false;
        z = false;
        final int i = 1;
        if (m65Var.equals(pk9.f) || m65Var.equals(pk9.g) || m65Var.equals(pk9.h)) {
            final int i2 = z ? 1 : 0;
            t65 t65Var = new t65() { // from class: mk9
                @Override // defpackage.t65
                public final Object t() {
                    int i3 = i2;
                    Bundle bundle2 = bundle;
                    m65 m65Var2 = m65Var;
                    switch (i3) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return new MainScreen(v65.a(m65Var2.a), bundle2);
                }
            };
            f2Var = q65Var;
            z = true;
            of9Var = t65Var;
        } else {
            boolean zEquals = m65Var.equals(pk9.e);
            ny8 ny8Var = this.b;
            if (zEquals) {
                boolean zR = ((f5d) ((wo6) ny8Var.getValue())).r();
                boolean z2 = !zR;
                of9Var = !zR ? new t65() { // from class: mk9
                    @Override // defpackage.t65
                    public final Object t() {
                        int i3 = i;
                        Bundle bundle2 = bundle;
                        m65 m65Var2 = m65Var;
                        switch (i3) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return new MainScreen(v65.a(m65Var2.a), bundle2);
                    }
                } : new of9(1, bundle);
                f2Var = q65Var;
                z = z2;
            } else {
                if (!m65Var.equals(pk9.d)) {
                    ore.k(qt4.m("unknown route ", m65Var));
                    return null;
                }
                final long jH0 = sb8.h0(bundle, "bot_id");
                if (((f5d) ((wo6) ny8Var.getValue())).t() && jH0 == ((f5d) ((wo6) ny8Var.getValue())).d()) {
                    z = true;
                }
                if (z) {
                    final int i3 = 2;
                    of9Var = new t65() { // from class: mk9
                        @Override // defpackage.t65
                        public final Object t() {
                            int i4 = i3;
                            Bundle bundle2 = bundle;
                            m65 m65Var2 = m65Var;
                            switch (i4) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                            }
                            return new MainScreen(v65.a(m65Var2.a), bundle2);
                        }
                    };
                } else {
                    q65Var = new q65(new j68(5), new j68(6));
                    of9Var = new t65() { // from class: nk9
                        @Override // defpackage.t65
                        public final Object t() {
                            boolean zBooleanValue;
                            Bundle bundle2 = bundle;
                            bdj bdjVarD = l21.d(sb8.j0(bundle2, "entry_point"));
                            Long lY = sb8.Y(bundle2, "source_id");
                            String string = bundle2.getString("start_param");
                            Boolean boolW = sb8.W(bundle2, "hide_close_btn");
                            boolean zBooleanValue2 = boolW != null ? boolW.booleanValue() : false;
                            Boolean boolW2 = sb8.W(bundle2, "is_fullscreen");
                            if (boolW2 != null) {
                                zBooleanValue = boolW2.booleanValue();
                            } else {
                                xb9 xb9Var = (xb9) ((et3) this.a.c.getValue());
                                zBooleanValue = ((Boolean) xb9Var.D0.m(xb9Var, xb9.g1[20])).booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            Integer numX = sb8.X(bundle2, "request_code");
                            return new WebAppRootScreen(jH0, bdjVarD, lY, string, z3, zBooleanValue2, null, numX != null ? numX.intValue() : 0, new ha9(bundle2.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)), 64, null);
                        }
                    };
                }
                f2Var = q65Var;
            }
        }
        return new u65(str, m65Var, bundle, 0, f2Var, z, of9Var, 8);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return (pk9) this.a.getValue();
    }
}
