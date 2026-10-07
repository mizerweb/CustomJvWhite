package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class lu2 implements si8 {
    public final /* synthetic */ int a;

    public /* synthetic */ lu2(int i) {
        this.a = i;
    }

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        switch (this.a) {
            case 0:
                return new xne(h5Var.d(144), h5Var.d(353), h5Var.d(23));
            case 1:
                return new lt5(h5Var.d(144), h5Var.d(85), h5Var.d(291), h5Var.d(23), (os3) h5Var.c(1049));
            case 2:
                return new vyi(h5Var.d(1060));
            case 3:
                return new i1j(h5Var.d(23), h5Var.d(290), h5Var.d(1046), h5Var.d(1059));
            case 4:
                return new cwf(1);
            case 5:
                return new cwf(5);
            case 6:
                return new mc7(h5Var.d(948), h5Var.d(79), h5Var.d(23), (yt4) h5Var.c(48));
            case 7:
                return ao3.a;
            case 8:
                return new cwf(4);
            case 9:
                return new yn3((yfd) h5Var.c(479), (yfd) h5Var.c(480), h5Var.d(377));
            case 10:
                return new i9f((Context) h5Var.c(7), h5Var.d(353), h5Var.d(670), h5Var.d(748), h5Var.d(144), h5Var.d(480), h5Var.d(377), h5Var.d(85), h5Var.d(54), h5Var.d(751), h5Var.d(26));
            case 11:
                return new f27(h5Var.d(226), h5Var.d(146), (xhh) h5Var.c(23), (yt4) h5Var.c(48), h5Var.d(205), h5Var.d(157), h5Var.d(54));
            case 12:
                return new a47(h5Var.d(640), h5Var.d(226), h5Var.d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED), h5Var.d(23), h5Var.d(85), h5Var.d(290), h5Var.d(662), h5Var.d(157));
            case 13:
                return w54.b;
            case 14:
                return new zg4();
            case 15:
                return new z0a(h5Var.d(97));
            case 16:
                return new vf(h5Var.d(131), h5Var.d(662), 1);
            case 17:
                return new j9(h5Var.d(23), h5Var.d(735), h5Var.d(678));
            case 18:
                et3 et3Var = (et3) h5Var.c(85);
                xnh xnhVar = new xnh("Разрешить логирование sensitive информации");
                xb9 xb9Var = (xb9) et3Var;
                n3 n3Var = xb9Var.S0;
                zv8 zv8Var = xb9.g1[36];
                return new va9(xnhVar, new jc1((m3) n3Var.g), new ol0(14, xb9Var), 0, 24);
            case 19:
                et3 et3Var2 = (et3) h5Var.c(85);
                return new va9(new tnh(R.string.oneme_settings_iar_time_condition), new jc1(et3Var2, 4), new hj5(et3Var2, 0), 0, 24);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                et3 et3Var3 = (et3) h5Var.c(85);
                return new va9(new tnh(R.string.oneme_settings_iar_market_build_condition), new jc1(et3Var3, 5), new hj5(et3Var3, 1), 0, 24);
            case 21:
                et3 et3Var4 = (et3) h5Var.c(85);
                return new va9(new tnh(R.string.oneme_settings_web_app_ssl), new jc1(et3Var4, 6), new hj5(et3Var4, 2), 0, 24);
            case 22:
                zte zteVar = (zte) h5Var.c(91);
                return new va9(new xnh("Отключить получение звонков"), new jc1(zteVar), new ol0(15, zteVar), 0, 24);
            case 23:
                return new lc1(1);
            case 24:
                return new wa9(0, zfe.a(Integer.class), 0, i9.A, "Эмуляция ошибки ice_candidate", "app.calls_sdk.ice_candidate_emulation", h5Var.d(163));
            case 25:
                return new jmd(2);
            case 26:
                return new od8(h5Var.d(7), h5Var.d(85), h5Var.d(76), h5Var.d(82));
            case 27:
                return new sif(h5Var.d(184), (et3) h5Var.c(85));
            case 28:
                return new syf(h5Var.d(7), h5Var.d(179));
            default:
                return new ck5();
        }
    }
}
