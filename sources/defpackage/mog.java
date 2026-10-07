package defpackage;

import one.me.stickerssettings.StickersSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mog implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSettingsScreen b;

    public /* synthetic */ mog(StickersSettingsScreen stickersSettingsScreen, int i) {
        this.a = i;
        this.b = stickersSettingsScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        StickersSettingsScreen stickersSettingsScreen = this.b;
        switch (i) {
            case 0:
                vaf vafVar = (vaf) obj;
                zv8[] zv8VarArr = StickersSettingsScreen.g;
                ic6 ic6Var = stickersSettingsScreen.o1().k;
                if (vafVar instanceof taf) {
                    log logVar = log.b;
                    long j = ((taf) vafVar).a;
                    logVar.getClass();
                    bc1.q(":stickers/set?set_id=" + j + "&from_settings=true", ic6Var);
                } else if (vafVar instanceof uaf) {
                    a8j.x(ic6Var, ((uaf) vafVar).b);
                }
                break;
            case 1:
                vaf vafVar2 = (vaf) obj;
                zv8[] zv8VarArr2 = StickersSettingsScreen.g;
                rog rogVarO1 = stickersSettingsScreen.o1();
                rogVarO1.getClass();
                ny8 ny8Var = rogVarO1.f;
                Integer numValueOf = Integer.valueOf(R.attr.icon_themed);
                if (vafVar2 instanceof taf) {
                    c79 c79VarW = yab.w();
                    int i2 = 4;
                    c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_forward, new tnh(R.string.oneme_stickers_settings_menu_forward_title), Integer.valueOf(R.drawable.icon_forward), numValueOf, i2));
                    c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_share, new tnh(R.string.oneme_stickers_settings_menu_share_title), Integer.valueOf(R.drawable.icon_share_android), numValueOf, i2));
                    c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_copy_link, new tnh(R.string.oneme_stickers_settings_menu_copy_link_title), Integer.valueOf(R.drawable.copy_outline_24), numValueOf, i2));
                    if (((f5d) ((wo6) ny8Var.getValue())).B() && ((f5d) ((wo6) ny8Var.getValue())).A() && ((taf) vafVar2).g) {
                        c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_edit_set, new tnh(R.string.oneme_stickers_settings_menu_edit_set_title), Integer.valueOf(R.drawable.icon_edit), numValueOf, 4));
                    }
                    c79VarW.add(new rp4(R.id.oneme_stickers_settings_menu_delete_set, new tnh(R.string.oneme_stickers_settings_menu_delete_set_title), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative), 4));
                    c79 c79VarJ = yab.j(c79VarW);
                    rogVarO1.p = Long.valueOf(((taf) vafVar2).a);
                    a8j.x(rogVarO1.j, new vrf(c79VarJ));
                }
                break;
            case 2:
                lfe lfeVar = (lfe) obj;
                zv8[] zv8VarArr3 = StickersSettingsScreen.g;
                p0m.a(lfeVar.a, mt7.LONG_PRESS);
                rn8 rn8Var = stickersSettingsScreen.e;
                if (rn8Var != null) {
                    rn8Var.s(lfeVar);
                }
                break;
            default:
                zv8[] zv8VarArr4 = StickersSettingsScreen.g;
                stickersSettingsScreen.getRouter().D();
                break;
        }
        return sbiVar;
    }
}
