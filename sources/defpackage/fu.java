package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;

    public /* synthetic */ fu(gza gzaVar, ny8 ny8Var) {
        this.a = 8;
        this.b = ny8Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                ((wxb) ny8Var.getValue()).getClass();
                return "https://whitemaxmod.com";
            case 1:
                return Boolean.valueOf(((x13) ny8Var.getValue()).c());
            case 2:
                if (!((f5d) ((wo6) ny8Var.getValue())).r()) {
                    return r66.a;
                }
                hz4 hz4Var = new hz4(R.id.oneme_contactlist_menu_item_add_contact, new tnh(R.string.contact_list_menu_item_add_contact), Integer.valueOf(R.drawable.icon_plus));
                hz4 hz4Var2 = new hz4(R.id.oneme_contactlist_menu_item_create_chat, new tnh(R.string.action_create_multichat), Integer.valueOf(R.drawable.icon_users));
                c79 c79VarW = yab.w();
                c79VarW.add(hz4Var);
                c79VarW.add(hz4Var2);
                c79VarW.addAll(ch3.j(xw3.P0(ll8.a, ll8.b)));
                return yab.j(c79VarW);
            case 3:
                return (hua) ((mta) ny8Var.getValue()).c.getValue();
            case 4:
                return ((n0c) ((xhh) ny8Var.getValue())).a().R0(4, "read-folder-local-dispatcher");
            case 5:
                return q4.a(((Context) ny8Var.getValue()).getSystemService(q4.i()));
            case 6:
                return ((a2c) ny8Var.getValue()).c();
            case 7:
                return new mpa(ny8Var);
            case 8:
                return new yj0(ny8Var);
            case 9:
                return new vnf((uih) ny8Var.getValue());
            case 10:
                return sb8.a((qs8) ny8Var.getValue(), new vza(ny8Var, 1));
            case 11:
                return (SensorManager) ((Context) ny8Var.getValue()).getSystemService("sensor");
            case 12:
                return (PowerManager) ((Context) ny8Var.getValue()).getSystemService("power");
            case 13:
                int iIntValue = ((Number) ((e5d) ny8Var.getValue()).z().i()).intValue();
                if (iIntValue != 1) {
                    i2 = 2;
                    if (iIntValue != 2) {
                        i2 = 0;
                    }
                }
                return new owe(i2);
            default:
                return new zyg(((s7f) ((et3) ny8Var.getValue())).t());
        }
    }

    public /* synthetic */ fu(ny8 ny8Var, int i) {
        this.a = i;
        this.b = ny8Var;
    }
}
