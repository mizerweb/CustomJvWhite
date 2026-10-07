package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class gj5 implements si8 {
    public final /* synthetic */ int a;

    public /* synthetic */ gj5(int i) {
        this.a = i;
    }

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        switch (this.a) {
            case 0:
                return new crh(h5Var.d(23));
            case 1:
                return new lu7(h5Var.d(7), h5Var.d(179), h5Var.d(23), h5Var.d(316));
            case 2:
                return new vrc(h5Var.d(7), h5Var.d(179), h5Var.d(23), h5Var.d(316), h5Var.d(11));
            case 3:
                return new vf(h5Var.d(316), h5Var.d(252), 0);
            case 4:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), 0, i9.B, "Отключить кеширование транскода", "debug.cache.transcode_ignore", h5Var.d(163));
            case 5:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), 0, i9.C, "Форсировать префетч видео", "debug.media.video.autoload.force", h5Var.d(163));
            case 6:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), 0, i9.D, "Моковые ссылки в слоях историй", "debug.stories.layers.mock", h5Var.d(163));
            case 7:
                return yq6.b;
            case 8:
                return new cwf(2);
            case 9:
                return new d47(h5Var.d(226), h5Var.d(146), h5Var.d(205), h5Var.d(676), (xhh) h5Var.c(23));
            case 10:
                return new nei(h5Var.d(226), h5Var.d(146), h5Var.d(144), (ed6) h5Var.c(205));
            case 11:
                return new c27((yt4) h5Var.c(48), h5Var.d(226), h5Var.d(146), h5Var.d(205), (xhh) h5Var.c(23));
            case 12:
                return new sfi(h5Var.d(226), h5Var.d(146), (ed6) h5Var.c(205));
            case 13:
                return new ffi(h5Var.d(226), h5Var.d(146), (ed6) h5Var.c(205));
            case 14:
                return new z0a(3);
            case 15:
                return new t40(h5Var.d(161), h5Var.d(583), h5Var.d(85), h5Var.d(23), h5Var.d(7), h5Var.d(486), h5Var.d(582), h5Var.d(353), h5Var.d(669), h5Var.d(26));
            case 16:
                return new wa9(Boolean.FALSE, zfe.a(Boolean.class), R.drawable.icon_image_add, i9.E, "Fresco Debug", "app.debug.fresco", h5Var.d(163));
            case 17:
                return new jmd(3);
            case 18:
                oa8 oa8Var = (oa8) h5Var.c(330);
                if (((svb) oa8Var.d.getValue()).b()) {
                    return oa8Var.l;
                }
                oa8Var.l = null;
                return null;
            case 19:
                return (gza) h5Var.c(1016);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new cwf(3);
            case 21:
                return new tk7(h5Var.d(132), h5Var.d(110));
            case 22:
                return new r29((c59) h5Var.c(216), (n49) h5Var.c(214));
            case 23:
                return new c59(h5Var.d(219), h5Var.d(131), h5Var.d(144), h5Var.d(220), h5Var.d(146), h5Var.d(221), h5Var.d(23), h5Var.d(222), h5Var.d(223), h5Var.d(224), h5Var.d(85), h5Var.d(161), h5Var.d(225), h5Var.d(184), h5Var.d(218), h5Var.d(226), h5Var.d(100), h5Var.d(217));
            case 24:
                return cd9.a;
            case 25:
                return qf9.a;
            case 26:
                return new z0a(4);
            case 27:
                return new ok9(h5Var.d(1063), h5Var.d(54), h5Var.d(85));
            case 28:
                return new lnd(((e5d) h5Var.c(26)).B());
            default:
                return new mvc(h5Var.d(23), h5Var.d(179), h5Var.d(7));
        }
    }
}
