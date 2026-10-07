package defpackage;

import android.content.Context;
import java.util.Arrays;
import kotlin.collections.a;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class amg extends a8j {
    public static final /* synthetic */ zv8[] G = {new z8b(amg.class, "loadStickerJob", "getLoadStickerJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, amg.class, "loadChatTitleJob", "getLoadChatTitleJob()Lkotlinx/coroutines/Job;")};
    public final r8e A;
    public final p3c B;
    public final p3c C;
    public volatile sgg D;
    public sgg E;
    public sgg F;
    public final long c;
    public final t73 d;
    public final xhh e;
    public final Context f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ic6 s = new ic6(null);
    public final ic6 t = new ic6(null);
    public final r8e u;
    public final mjg v;
    public final r8e w;
    public final mjg x;
    public final r8e y;
    public final mjg z;

    public amg(long j, t73 t73Var, xhh xhhVar, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12) {
        this.c = j;
        this.d = t73Var;
        this.e = xhhVar;
        this.f = context;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var6;
        this.m = ny8Var7;
        this.n = ny8Var8;
        this.o = ny8Var9;
        this.p = ny8Var10;
        this.q = ny8Var11;
        this.r = ny8Var12;
        this.u = ((xn3) ny8Var5.getValue()).k(j);
        mjg mjgVarA = p90.a(null);
        this.v = mjgVarA;
        this.w = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a("");
        this.x = mjgVarA2;
        this.y = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(null);
        this.z = mjgVarA3;
        this.A = new r8e(mjgVarA3);
        this.B = qyj.S();
        this.C = qyj.S();
    }

    public static final q3g B(amg amgVar, Throwable th) {
        boolean zEquals;
        ynh tnhVar;
        boolean z = th instanceof TamErrorException;
        if (z) {
            yhh yhhVar = ((TamErrorException) th).a;
            String str = yhhVar != null ? yhhVar.d : null;
            if (str == null || str.length() == 0) {
                tnhVar = new tnh(R.string.common_error_base_retry);
            } else {
                String str2 = yhhVar != null ? yhhVar.d : null;
                if (str2 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                tnhVar = new xnh(str2);
            }
        } else {
            if (th instanceof FavoriteStickersController$MaxFavoriteStickersException) {
                zEquals = true;
            } else {
                zEquals = !z ? false : "favorite.stickers.limit".equals(((TamErrorException) th).a.b);
            }
            tnhVar = zEquals ? new tnh(R.string.oneme_stickers_preview_snackbar_favorite_added_max) : new tnh(R.string.common_error_base_retry);
        }
        return new q3g(R.drawable.icon_info_fill, tnhVar);
    }

    public static tlg D(clg clgVar, boolean z, Long l) {
        String str = clgVar.h;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = clgVar.d;
        }
        String str2 = str;
        boolean z2 = l.longValue() == clgVar.a;
        long j = clgVar.a;
        long j2 = clgVar.k;
        return new tlg(j, j2, j2, str2, clgVar.l, clgVar.o, clgVar.b, clgVar.c, z, z2, 0L, 0, 12864);
    }

    public final void C(Long l) {
        tlg tlgVar = (tlg) this.v.getValue();
        if (tlgVar == null || tlgVar.b == 0) {
            gm0.n(amg.class.getName(), "Can't load sticker set because we haven't selected sticker or setId");
            return;
        }
        sgg sggVar = this.D;
        if (sggVar != null && sggVar.isActive()) {
            gm0.n(amg.class.getName(), "Already subscribe on set updates");
            return;
        }
        this.D = e9i.j0(e9i.T(new fz6(new r07(((ceh) this.h.getValue()).a(tlgVar.b, !((ldh) this.j.getValue()).n(tlgVar.b)), new n50(((ldh) this.j.getValue()).i, tlgVar.b, 3), ylg.h, 0), new jyf(this, l, (lq4) null, 5), 3), ((n0c) this.e).b()), this.b);
    }

    public final void E(g4b g4bVar, Long l) {
        t73 t73Var = this.d;
        if (t73Var.i() && l == null) {
            I();
            return;
        }
        r8e r8eVar = this.u;
        rt2 rt2Var = (rt2) r8eVar.a.getValue();
        if (rt2Var == null || !pll.d(rt2Var, (e5d) this.q.getValue(), t73Var.h(), l)) {
            H(g4bVar, l);
            return;
        }
        rt2 rt2Var2 = (rt2) r8eVar.a.getValue();
        String strF = rt2Var2 != null ? rt2Var2.F() : null;
        if (strF == null) {
            strF = "";
        }
        int i = 32;
        a8j.x(this.t, new i3g(new tnh(R.string.oneme_confirm_send_message_title), new vnh(R.string.oneme_confirm_send_message_description, a.n1(Arrays.copyOf(new Object[]{strF}, 1))), xw3.P0(new kc4(R.id.oneme_stickers_confirm_send_message_positive, new tnh(R.string.oneme_confirm_send_message_positive), 3, i), new kc4(R.id.oneme_stickers_confirm_send_message_negative, new tnh(R.string.oneme_confirm_send_message_negative), 2, i))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(t3f t3fVar, nq4 nq4Var) {
        zlg zlgVar;
        if (nq4Var instanceof zlg) {
            zlgVar = (zlg) nq4Var;
            int i = zlgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlgVar.f = i - Integer.MIN_VALUE;
            } else {
                zlgVar = new zlg(this, nq4Var);
            }
        } else {
            zlgVar = new zlg(this, nq4Var);
        }
        Object objN = zlgVar.d;
        int i2 = zlgVar.f;
        if (i2 == 0) {
            ch3.d0(objN);
            if (cqk.d(t3fVar, t3f.e) || this.c == 0) {
                return Boolean.FALSE;
            }
            jz jzVar = new jz(this.u, 13);
            zlgVar.f = 1;
            objN = e9i.N(jzVar, zlgVar);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        return Boolean.valueOf(((rt2) objN).k0((e5d) this.q.getValue()));
    }

    public final void G(long j) {
        tlg tlgVar = (tlg) this.w.a.getValue();
        if (tlgVar == null || tlgVar.a != j) {
            sgg sggVarH0 = yab.h0(this.b, ((n0c) this.e).b(), 2, new h99(this, j, (lq4) null, 9));
            this.B.B(this, G[0], sggVarH0);
        }
    }

    public final void H(g4b g4bVar, Long l) {
        tlg tlgVar = (tlg) this.w.a.getValue();
        long j = this.c;
        if (j <= 0 || tlgVar == null || tlgVar.equals(tlg.n)) {
            ((h4b) this.n.getValue()).B(f4b.EMPTY_STICKER_ID, g4bVar);
            return;
        }
        ae9.k((ae9) this.p.getValue(), "sticker", "send_sticker", ouk.a(new ylc("screen", "stickerset")), 8);
        ia8 ia8Var = (ia8) this.r.getValue();
        if (ia8Var != null) {
            ia8Var.f(a.p1(new ha8[]{new ha8(fa8.SEND_5_MESSAGES, 1), new ha8(fa8.SEND_3_STICKERS, 1)}), y3f.CHAT);
        }
        vkf vkfVar = new vkf(1, j, tlgVar.a);
        if (l != null) {
            vkfVar.f = new ng5(l.longValue(), true);
        }
        vkfVar.g = g4bVar;
        ((wzj) this.l.getValue()).c(new wkf(vkfVar, (byte) 0));
        a8j.x(this.s, rt3.b);
    }

    public final void I() {
        rt2 rt2Var = (rt2) this.u.a.getValue();
        if (rt2Var == null) {
            return;
        }
        a8j.x(this.t, new j3g(vol.c(rt2Var)));
    }
}
