package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.push.core.base.AidlException;
import java.io.File;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes.dex */
public final class m3d extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ m3d(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                ju6 ju6Var = (ju6) ((rs6) h5Var.c(138));
                ju6Var.getClass();
                return new j6g(ju6.j(ju6.j(ju6Var.b(), "videoCache").getPath(), "exoPlayer"), new ez8(104857600L), null, true);
            case 1:
                return new tui(h5Var.d(54), h5Var.d(85));
            case 2:
                Context context = (Context) h5Var.c(7);
                iec iecVar = (iec) ((e5d) h5Var.c(26)).l().i();
                gec gecVar = iecVar instanceof gec ? (gec) iecVar : null;
                dfd dfdVar = new dfd();
                ju6 ju6Var2 = (ju6) ((rs6) h5Var.c(138));
                ju6Var2.getClass();
                File fileJ = ju6.j(ju6.j(ju6Var2.b(), "videoCache").getPath(), "one_video_preload");
                long j = (gecVar != null ? gecVar.b : 100L) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                z55 z55Var = new z55();
                myh myhVar = myh.c;
                return new h3j(context, dfdVar, nv8.f(context, fileJ, j, new xvi(z55Var)));
            case 3:
                return new d4d((gjf) h5Var.c(97));
            case 4:
                return new p3d((xhh) h5Var.c(23), (ka0) h5Var.c(AidlException.SDK_IS_NOT_INITIALIZED), (w7b) h5Var.c(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION), (d0j) h5Var.c(918), h5Var.d(136), h5Var.d(132), h5Var.d(144), h5Var.d(85), h5Var.d(916));
            case 5:
                return new m6d((et3) h5Var.c(85), (Context) h5Var.c(7), (xn3) h5Var.c(144), (sua) h5Var.c(136), (b) h5Var.c(481), (xhh) h5Var.c(23), (fad) h5Var.c(766));
            case 6:
                return new z7d();
            case 7:
                return new i8d();
            case 8:
                return new l8d(h5Var.d(23), h5Var.d(299));
            case 9:
                return new t9d((xn3) h5Var.c(144), (sua) h5Var.c(136), (et3) h5Var.c(85), (Context) h5Var.c(7), (b) h5Var.c(481), h5Var.d(218), h5Var.d(23), h5Var.d(26));
            case 10:
                return new u9c((Context) h5Var.c(7), (cs6) h5Var.c(28));
            case 11:
                return (u9c) h5Var.c(165);
            case 12:
                return new zed((xb9) h5Var.c(162), (e5d) h5Var.c(26), (nni) h5Var.c(159), (wd0) h5Var.c(164), (u9c) h5Var.c(165));
            case 13:
                return (zed) h5Var.c(166);
            case 14:
                ha9 ha9Var = (ha9) h5Var.c(30);
                ghb ghbVar = ew5.b;
                long jNanoTime = System.nanoTime();
                lw5 lw5Var = lw5.NANOSECONDS;
                long jP = qe7.P(jNanoTime, lw5Var);
                e5d e5dVar = new e5d(new ifh(new yed(h5Var, ha9Var, 0)), new ifh(new yed(h5Var, ha9Var, 1)), new ifh(new yed(h5Var, ha9Var, 2)), h5Var.d(29));
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "PmsProperties", "init by ".concat(ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), jP))), null);
                    }
                }
                return e5dVar;
            case 15:
                return new nni((Context) h5Var.c(7), (cs6) h5Var.c(28), (zte) h5Var.c(91), (ha9) h5Var.c(30));
            case 16:
                return (nni) h5Var.c(159);
            case 17:
                return (nni) h5Var.c(159);
            case 18:
                return ((e5d) h5Var.c(26)).b();
            case 19:
                return ((e5d) h5Var.c(26)).a();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new xb9((Context) h5Var.c(7), (cs6) h5Var.c(28), (ha9) h5Var.c(30), h5Var.d(91), h5Var.d(29));
            case 21:
                return (s7f) h5Var.c(162);
            case 22:
                return (et3) h5Var.c(162);
            case 23:
                return new wd0((Context) h5Var.c(7), ((ha9) h5Var.c(30)).a("auth", "prefs"), (cs6) h5Var.c(28));
            case 24:
                return new afd(h5Var);
            case 25:
                return new aue((Context) h5Var.c(7), (cs6) h5Var.c(28));
            case 26:
                return new r04(h5Var.d(759), h5Var.d(144), h5Var.d(132), h5Var.d(23), h5Var.d(85), h5Var.d(353), h5Var.d(1081), h5Var.d(755));
            case 27:
                ifh ifhVarD = h5Var.d(175);
                ifh ifhVarD2 = h5Var.d(85);
                ifh ifhVarD3 = h5Var.d(54);
                ifh ifhVarD4 = h5Var.d(97);
                ifh ifhVarD5 = h5Var.d(26);
                ifh ifhVarD6 = h5Var.d(144);
                ifh ifhVarD7 = h5Var.d(23);
                ifh ifhVarD8 = h5Var.d(132);
                ifh ifhVarD9 = h5Var.d(216);
                ifh ifhVarD10 = h5Var.d(34);
                ifh ifhVarD11 = h5Var.d(220);
                ifh ifhVarD12 = h5Var.d(18);
                ifh ifhVarD13 = h5Var.d(157);
                ifh ifhVarD14 = h5Var.d(7);
                ifh ifhVarD15 = h5Var.d(290);
                ifh ifhVarD16 = h5Var.d(214);
                yl4 yl4Var = (yl4) h5Var.c(1072);
                ifh ifhVarD17 = h5Var.d(48);
                ja3 ja3Var = (ja3) h5Var.c(1073);
                a11 a11Var = (a11) h5Var.c(1070);
                ifh ifhVarD18 = h5Var.d(1065);
                return new evd(ifhVarD8, ifhVarD6, h5Var.d(529), ifhVarD, ifhVarD15, ifhVarD7, ifhVarD18, ifhVarD10, ifhVarD2, ifhVarD4, ifhVarD3, ifhVarD5, h5Var.d(179), h5Var.d(np0.o), ifhVarD9, ifhVarD11, ifhVarD17, ifhVarD13, ifhVarD16, ifhVarD12, ifhVarD14, h5Var.d(377), h5Var.d(HttpStatus.SC_NOT_IMPLEMENTED), h5Var.d(139), a11Var, (yif) h5Var.c(1071), yl4Var, ja3Var);
            case 28:
                ifh ifhVarD19 = h5Var.d(621);
                ifh ifhVarD20 = h5Var.d(144);
                ifh ifhVarD21 = h5Var.d(23);
                ifh ifhVarD22 = h5Var.d(97);
                ifh ifhVarD23 = h5Var.d(26);
                ifh ifhVarD24 = h5Var.d(622);
                ifh ifhVarD25 = h5Var.d(641);
                ifh ifhVarD26 = h5Var.d(132);
                ifh ifhVarD27 = h5Var.d(624);
                ifh ifhVarD28 = h5Var.d(18);
                kld kldVar = (kld) h5Var.c(1066);
                return new a11(ifhVarD26, ifhVarD27, ifhVarD20, ifhVarD19, ifhVarD24, ifhVarD25, ifhVarD21, h5Var.d(85), ifhVarD22, ifhVarD23, h5Var.d(377), ifhVarD28, kldVar, h5Var.d(1074), h5Var.d(353));
            default:
                return new yif(h5Var.d(1074), h5Var.d(85), h5Var.d(353), h5Var.d(377));
        }
    }
}
