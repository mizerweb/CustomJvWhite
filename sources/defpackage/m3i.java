package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class m3i implements si8 {
    public final /* synthetic */ int a;

    public /* synthetic */ m3i(int i) {
        this.a = i;
    }

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        switch (this.a) {
            case 0:
                return new fj5(h5Var.d(351));
            case 1:
                return f7i.a;
            case 2:
                return (hh9) h5Var.c(74);
            case 3:
                return new dqj((qs8) h5Var.c(29), h5Var.d(1032), h5Var.d(144), h5Var.d(136));
            case 4:
                return new ujj((qs8) h5Var.c(29), h5Var.d(1032));
            case 5:
                return new zgj((qs8) h5Var.c(29), h5Var.d(1032));
            case 6:
                return new dsj((qs8) h5Var.c(29), h5Var.d(1032));
            case 7:
                return new qlj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 8:
                return new osj((qs8) h5Var.c(29), h5Var.d(1032));
            case 9:
                return new gij((qs8) h5Var.c(29), h5Var.d(1032));
            case 10:
                return new z0a(6);
            case 11:
                ifh ifhVarD = h5Var.d(85);
                return new va9(new xnh("Полноэкранный режим веб-аппов"), new jc1((et3) ifhVarD.getValue(), 10), new kc1(ifhVarD, 2), R.drawable.icon_services, 16);
            case 12:
                return new nmj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 13:
                return new yrj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 14:
                return new hkj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 15:
                return new krj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 16:
                return new phj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 17:
                return new lgj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032));
            case 18:
                return new sfj((qs8) h5Var.c(29), h5Var.d(238), h5Var.d(1032), h5Var.d(76), (gu4) h5Var.c(139));
            case 19:
                return new is8(h5Var.d(23), h5Var.a(9), (asj) h5Var.c(1040), h5Var.d(29));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new asj(sb8.a((qs8) h5Var.c(29), dz7.s), h5Var.d(238));
            case 21:
                return auj.a;
            default:
                return new jq6(h5Var.d(23), h5Var.d(7));
        }
    }
}
