package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class spg extends a8j {
    public static final /* synthetic */ zv8[] y = {new z8b(spg.class, "clearJob", "getClearJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, spg.class, "deleteStickersJob", "getDeleteStickersJob()Lkotlinx/coroutines/Job;"), new z8b(spg.class, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;"), new z8b(spg.class, "deleteSetWithoutConfirmationJob", "getDeleteSetWithoutConfirmationJob()Lkotlinx/coroutines/Job;"), new z8b(spg.class, "addSetJob", "getAddSetJob()Lkotlinx/coroutines/Job;")};
    public final kng c;
    public final long d;
    public final boolean e;
    public final Context f;
    public final xhh g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final p3c m = qyj.S();
    public final p3c n = qyj.S();
    public final p3c o = qyj.S();
    public final p3c p = qyj.S();
    public final p3c q = qyj.S();
    public final mjg r;
    public final r8e s;
    public final r8e t;
    public final r8e u;
    public final ic6 v;
    public final ic6 w;
    public final ifh x;

    public spg(kng kngVar, long j, boolean z, Context context, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        xx6 byeVar;
        xx6 q0dVar;
        this.c = kngVar;
        this.d = j;
        this.e = z;
        this.f = context;
        this.g = xhhVar;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var6;
        this.l = ny8Var7;
        mjg mjgVarA = p90.a(r66.a);
        this.r = mjgVarA;
        this.s = new r8e(mjgVarA);
        kng kngVar2 = kng.SET;
        if (kngVar != kngVar2 || j == -1) {
            byeVar = new bye(new ryf(new kpg(kngVar == kng.RECENT ? new tnh(R.string.oneme_stickers_settings_recent_toolbar_title) : new tnh(R.string.oneme_stickers_settings_favorite_toolbar_title), null, null, B(false, false)), null, 9));
        } else {
            byeVar = new q0d(new r07(((ceh) ny8Var5.getValue()).a(j, !D().n(j)), new n50(D().i, j, 3), ppg.h, 0), this, 22);
        }
        n0c n0cVar = (n0c) xhhVar;
        xx6 xx6VarT = e9i.T(byeVar, n0cVar.b());
        a8g a8gVar = j0g.a;
        this.t = e9i.G0(xx6VarT, this.b, a8gVar, null);
        this.u = e9i.G0(e9i.T(new bye(new qi4(this, z, (lq4) null, 10)), n0cVar.b()), this.b, a8gVar, null);
        this.v = new ic6(null);
        this.w = new ic6(null);
        this.x = new ifh(new bpg(0, this));
        if (kngVar == kngVar2 && j == -1) {
            String name = spg.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Try load stickers from stickerSet by invalid id: -1", null);
                }
            }
            q0dVar = o66.a;
        } else {
            int iOrdinal = kngVar.ordinal();
            if (iOrdinal == 0) {
                vdh vdhVar = (vdh) ny8Var.getValue();
                q0dVar = new q0d(((wae) vdhVar.g.getValue()).h(), vdhVar, 25);
            } else if (iOrdinal == 1) {
                q0dVar = ((um6) ny8Var3.getValue()).k;
            } else {
                if (iOrdinal != 2) {
                    ore.o();
                    throw null;
                }
                q0dVar = new hde(((ceh) ny8Var5.getValue()).a(j, !D().n(j)), 8);
            }
        }
        e9i.j0(e9i.T(new fz6(q0dVar, new dyd(2, this, spg.class, "processStickers", "processStickers(Ljava/util/List;)V", 4, 17), 3), n0cVar.b()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:22:0x00db  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
    public final c79 B(boolean z, boolean z2) {
        int iOrdinal;
        Integer numValueOf;
        Integer numValueOf2 = Integer.valueOf(R.attr.icon_negative);
        Integer numValueOf3 = Integer.valueOf(R.drawable.icon_delete);
        Integer numValueOf4 = Integer.valueOf(R.attr.text_negative);
        Integer numValueOf5 = Integer.valueOf(R.drawable.icon_edit);
        Integer numValueOf6 = Integer.valueOf(R.attr.icon_primary);
        c79 c79VarW = yab.w();
        kng kngVar = kng.SET;
        kng kngVar2 = this.c;
        if (kngVar2 == kngVar) {
            if (!this.e) {
                c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_forward, new tnh(R.string.oneme_stickers_settings_menu_share_title), Integer.valueOf(R.drawable.icon_forward), numValueOf6, 4));
            }
            c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_copy_link, new tnh(R.string.oneme_stickers_settings_menu_copy_link_title), Integer.valueOf(R.drawable.icon_link), numValueOf6, 4));
            ny8 ny8Var = this.k;
            if (((f5d) ((wo6) ny8Var.getValue())).B() && ((f5d) ((wo6) ny8Var.getValue())).A() && z2) {
                c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_edit_set, new tnh(R.string.oneme_stickers_settings_menu_edit_set_title), numValueOf5, numValueOf6, 4));
            }
            if (z) {
                c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_delete_set, new tnh(R.string.oneme_stickers_settings_menu_delete_set_title), numValueOf4, numValueOf3, numValueOf2));
            }
            iOrdinal = kngVar2.ordinal();
            if (iOrdinal != 0) {
                numValueOf = Integer.valueOf(R.id.oneme_stickers_settings_stickers_recent_menu_clear);
            } else if (iOrdinal != 1) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(R.id.oneme_stickers_settings_stickers_favorite_menu_clear);
            }
            if (numValueOf != null) {
                c79VarW.add(new rp4(numValueOf.intValue(), new tnh(R.string.oneme_stickers_settings_stickers_recent_menu_clear_title), numValueOf4, numValueOf3, numValueOf2));
            }
            return yab.j(c79VarW);
        }
        c79VarW.add(new rp4(R.id.oneme_stickers_settings_stickers_menu_change, new tnh(R.string.oneme_stickers_settings_stickers_menu_change_title), numValueOf5, numValueOf6, 4));
        iOrdinal = kngVar2.ordinal();
        if (iOrdinal != 0) {
            numValueOf = Integer.valueOf(R.id.oneme_stickers_settings_stickers_recent_menu_clear);
        } else if (iOrdinal != 1) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(R.id.oneme_stickers_settings_stickers_favorite_menu_clear);
        }
        if (numValueOf != null) {
            c79VarW.add(new rp4(numValueOf.intValue(), new tnh(R.string.oneme_stickers_settings_stickers_recent_menu_clear_title), numValueOf4, numValueOf3, numValueOf2));
        }
        return yab.j(c79VarW);
    }

    public final void C() {
        ShareData shareData = new ShareData(0, null, null, null, null, null, null, null, 255, null);
        shareData.type = 8;
        kpg kpgVar = (kpg) this.t.a.getValue();
        shareData.text = kpgVar != null ? kpgVar.c : null;
        a8j.x(this.v, new srf(shareData));
    }

    public final ldh D() {
        return (ldh) this.j.getValue();
    }

    public final w5b E() {
        return (w5b) this.x.getValue();
    }

    public final String F(int i) {
        return this.f.getResources().getQuantityString(R.plurals.oneme_stickers_set_count, i, Integer.valueOf(i));
    }
}
