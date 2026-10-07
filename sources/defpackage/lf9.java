package defpackage;

import android.content.Context;
import com.vk.push.core.base.AidlException;
import java.io.File;
import java.util.HashMap;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class lf9 extends kpe {
    public final /* synthetic */ int b;

    public /* synthetic */ lf9(int i) {
        this.b = i;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new pd0(h5Var.d(157), h5Var.d(231));
            case 1:
                return new vg9(h5Var.d(326), h5Var.d(108), h5Var.d(85), h5Var.d(476), h5Var.d(AidlException.HOST_IS_NOT_MASTER), h5Var.d(15));
            case 2:
                Context context = (Context) h5Var.c(7);
                ra5 ra5Var = new ra5();
                synchronized (ra5Var) {
                    ra5Var.b = true;
                }
                jc5 jc5Var = new jc5(context, ra5Var);
                fs9 fs9Var = new fs9(h5Var);
                jc5Var.b = fs9Var;
                qz4 qz4Var = jc5Var.a;
                if (fs9Var != ((s25) qz4Var.e)) {
                    qz4Var.e = fs9Var;
                    ((HashMap) qz4Var.c).clear();
                    ((HashMap) qz4Var.d).clear();
                }
                return jc5Var;
            case 3:
                return new m15(1, h5Var);
            case 4:
                return new ks5((Context) h5Var.c(7), (m35) h5Var.c(152), (j6g) h5Var.c(151), (s25) h5Var.c(149), ((a2c) h5Var.c(27)).c());
            case 5:
                return new j6g(new File(zo5.o(((Context) h5Var.c(7)).getCacheDir().getAbsolutePath(), "/media")), new fz8(wm9.Q0(new ylc(ty9.d, 524288000L), new ylc(ty9.b, 52428800L))), (m35) h5Var.c(152), false);
            case 6:
                return new il0(h5Var.d(262), h5Var.d(206), h5Var.d(136), h5Var.d(260));
            case 7:
                return new fl0(h5Var.d(32), h5Var.d(263), h5Var.d(260));
            case 8:
                return new dze(h5Var.d(263), h5Var.d(260));
            case 9:
                return new z26();
            case 10:
                return new hze((v3f) h5Var.c(33), ((n0c) ((xhh) h5Var.c(23))).b());
            case 11:
                return new my5(h5Var.d(157));
            case 12:
                return new sx4(h5Var.d(23), h5Var.d(97), h5Var.d(179), h5Var.d(7));
            case 13:
                return new mx();
            case 14:
                return new r1a(h5Var.d(23), h5Var.d(138), h5Var.d(7), h5Var.d(788), h5Var.d(188), h5Var.d(np0.o), h5Var.d(178));
            case 15:
                return new hi7();
            case 16:
                return new rq9(h5Var.d(7));
            case 17:
                return new z8a((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 18:
                ifh ifhVarD = h5Var.d(479);
                ifh ifhVarD2 = h5Var.d(85);
                ifh ifhVarD3 = h5Var.d(480);
                h5Var.d(54);
                return new kc5(ifhVarD, ifhVarD2, ifhVarD3, h5Var.d(377));
            case 19:
                return new k6b(h5Var.d(157));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new e1c((Context) h5Var.c(7), (d95) h5Var.c(679));
            case 21:
                return new dm(new bm(), (Context) h5Var.c(7), ((n0c) ((xhh) h5Var.c(23))).c());
            case 22:
                return new w69();
            case 23:
                return (vz8) h5Var.c(1120);
            case 24:
                return new mzb(h5Var.d(312), (wmi) h5Var.c(139));
            case 25:
                return new jzb(h5Var.d(377));
            case 26:
                return new fxb((ym1) h5Var.c(875));
            case 27:
                return new xl7(h5Var.d(353), h5Var.d(144));
            case 28:
                return new wz5(h5Var.d(291), h5Var.d(136), h5Var.d(23), h5Var.d(290));
            default:
                return new h87(h5Var.d(290), h5Var.d(1059), h5Var.d(291), h5Var.d(18));
        }
    }
}
