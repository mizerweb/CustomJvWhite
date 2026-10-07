package defpackage;

import android.view.View;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gmg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerSetBottomSheet b;

    public /* synthetic */ gmg(StickerSetBottomSheet stickerSetBottomSheet, int i) {
        this.a = i;
        this.b = stickerSetBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hve router;
        omg omgVar;
        int i = this.a;
        StickerSetBottomSheet stickerSetBottomSheet = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = StickerSetBottomSheet.v;
                br4 parentController = stickerSetBottomSheet.getParentController();
                if (parentController != null && (router = parentController.getRouter()) != null) {
                    router.D();
                    break;
                }
                break;
            case 1:
                zv8[] zv8VarArr2 = StickerSetBottomSheet.v;
                amg amgVar = (amg) stickerSetBottomSheet.m.getValue();
                omg omgVar2 = (omg) amgVar.A.a.getValue();
                if (omgVar2 != null) {
                    sgg sggVar = amgVar.F;
                    if (sggVar == null || !sggVar.isActive()) {
                        amgVar.F = a8j.t(amgVar, ((n0c) amgVar.e).b(), new wd9(omgVar2, amgVar, (lq4) null, 15), 2);
                    }
                }
                break;
            default:
                zv8[] zv8VarArr3 = StickerSetBottomSheet.v;
                amg amgVar2 = (amg) stickerSetBottomSheet.m.getValue();
                int id = view.getId();
                vv vvVar = stickerSetBottomSheet.n;
                zv8 zv8Var = StickerSetBottomSheet.v[0];
                boolean zBooleanValue = ((Boolean) vvVar.a(stickerSetBottomSheet)).booleanValue();
                ic6 ic6Var = amgVar2.t;
                ny8 ny8Var = amgVar2.m;
                c79 c79VarW = yab.w();
                tnh tnhVar = new tnh(R.string.forward);
                Integer numValueOf = Integer.valueOf(R.drawable.icon_forward);
                Integer numValueOf2 = Integer.valueOf(R.attr.icon_primary);
                c79VarW.add(new rp4(R.id.oneme_stickers_preview_action_forward_set, tnhVar, numValueOf, numValueOf2, 4));
                c79VarW.add(new rp4(R.id.oneme_stickers_preview_action_copy_link, new tnh(R.string.share_copy), Integer.valueOf(R.drawable.icon_link), numValueOf2, 4));
                if (!zBooleanValue && ((f5d) ((wo6) ny8Var.getValue())).B() && ((f5d) ((wo6) ny8Var.getValue())).A() && (omgVar = (omg) amgVar2.A.a.getValue()) != null && omgVar.k) {
                    c79VarW.add(new rp4(R.id.oneme_stickers_preview_action_edit_set, new tnh(R.string.oneme_stickers_preview_action_edit_set_title), Integer.valueOf(R.drawable.icon_edit), numValueOf2, 4));
                }
                a8j.x(ic6Var, new z1g(yab.j(c79VarW), id));
                break;
        }
    }
}
