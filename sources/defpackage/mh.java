package defpackage;

import android.app.Application;
import android.content.Context;
import com.vk.push.core.base.AidlException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class mh extends kpe {
    public final /* synthetic */ int b;

    public /* synthetic */ mh(int i) {
        this.b = i;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                ifh ifhVarD = h5Var.d(0);
                Context context = (Context) h5Var.c(7);
                bk5 bk5Var = (bk5) ((e5d) h5Var.c(26)).j().i();
                bk5Var.getClass();
                zv8 zv8Var = bk5.c[6];
                return new xaa(ifhVarD, context, bk5Var.b("memory"));
            case 1:
                return new xe6(h5Var.d(26), h5Var.d(40), (Context) h5Var.c(7));
            case 2:
                return new we6(h5Var.d(0), new ye6());
            case 3:
                ifh ifhVarD2 = h5Var.d(0);
                Context context2 = (Context) h5Var.c(7);
                trc trcVar = (trc) h5Var.c(46);
                bk5 bk5Var2 = (bk5) ((e5d) h5Var.c(26)).j().i();
                bk5Var2.getClass();
                zv8 zv8Var2 = bk5.c[7];
                return new lu0(ifhVarD2, bk5Var2.b("battery"), trcVar, context2);
            case 4:
                return new yp0((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 5:
                return new t1j(h5Var.d(198), h5Var.d(444), h5Var.d(23));
            case 6:
                ifh ifhVar = new ifh(tt.b);
                ifh ifhVarD3 = h5Var.d(136);
                ifh ifhVarD4 = h5Var.d(190);
                ifh ifhVarD5 = h5Var.d(23);
                ifh ifhVarD6 = h5Var.d(296);
                return new tyi(h5Var.d(144), ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6, h5Var.d(198), h5Var.d(920), h5Var.d(161), ifhVar, h5Var.d(294), h5Var.d(85));
            case 7:
                return new xt(h5Var);
            case 8:
                return new yt(h5Var);
            case 9:
                return new ldf(27);
            case 10:
                return new dp3(h5Var.d(146), h5Var.d(131), h5Var.d(144), h5Var.d(325));
            case 11:
                return new pp3(h5Var.d(26));
            case 12:
                return new k76(h5Var.d(85), h5Var.d(54), h5Var.d(377), h5Var.d(919), h5Var.d(910), h5Var.d(23), h5Var.d(132));
            case 13:
                return new y9d(h5Var.d(146), h5Var.d(136));
            case 14:
                return new kta(h5Var.d(136), h5Var.d(132), h5Var.d(129), h5Var.d(198), h5Var.d(139));
            case 15:
                return new knh((Context) h5Var.c(7), (xhh) h5Var.c(23), (Context) h5Var.c(7), (o1c) h5Var.c(806));
            case 16:
                return new zt(h5Var);
            case 17:
                return new vk6(h5Var.d(157));
            case 18:
                return new u3d((xhh) h5Var.c(23), h5Var.d(887), (w7b) h5Var.c(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION), (ka0) h5Var.c(AidlException.SDK_IS_NOT_INITIALIZED));
            case 19:
                return new o50((xhh) h5Var.c(23), (i50) h5Var.c(295), (Application) h5Var.c(70), (zk6) h5Var.c(623));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new y8d();
            case 21:
                return new u4a(h5Var.d(24), h5Var.d(101), (dsc) h5Var.c(79), true);
            case 22:
                return (u4a) h5Var.c(917);
            case 23:
                return new d0j(h5Var.d(193), h5Var.d(23), h5Var.d(69), h5Var.d(85), h5Var.d(26));
            case 24:
                return new al7(h5Var.d(353), h5Var.d(7));
            case 25:
                return new hyi(h5Var.d(296), h5Var.d(918), h5Var.d(190), h5Var.d(206), h5Var.d(23), h5Var.d(617));
            case 26:
                return new mz7((vo5) h5Var.c(341), (w69) h5Var.c(220), (oqg) h5Var.c(84), (xhh) h5Var.c(23));
            case 27:
                return new jn0((in0) h5Var.c(339), (et3) h5Var.c(85), (mz7) h5Var.c(334), (gue) h5Var.c(69));
            case 28:
                return new kn0(h5Var.d(157));
            default:
                return new ym4(1);
        }
    }
}
