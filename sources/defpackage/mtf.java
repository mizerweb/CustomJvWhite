package defpackage;

import android.content.ActivityNotFoundException;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.SettingsListScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mtf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SettingsListScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtf(lq4 lq4Var, SettingsListScreen settingsListScreen) {
        super(2, lq4Var);
        this.e = 2;
        this.g = settingsListScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        SettingsListScreen settingsListScreen = this.g;
        switch (i) {
            case 0:
                mtf mtfVar = new mtf(settingsListScreen, lq4Var, 0);
                mtfVar.f = obj;
                return mtfVar;
            case 1:
                mtf mtfVar2 = new mtf(settingsListScreen, lq4Var, 1);
                mtfVar2.f = obj;
                return mtfVar2;
            case 2:
                mtf mtfVar3 = new mtf(lq4Var, settingsListScreen);
                mtfVar3.f = obj;
                return mtfVar3;
            default:
                mtf mtfVar4 = new mtf(settingsListScreen, lq4Var, 3);
                mtfVar4.f = obj;
                return mtfVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((mtf) create((ivf) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((mtf) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((mtf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((mtf) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequenceB;
        switch (this.e) {
            case 0:
                ivf ivfVar = (ivf) this.f;
                ch3.d0(obj);
                SettingsListScreen settingsListScreen = this.g;
                zv8[] zv8VarArr = SettingsListScreen.r;
                settingsListScreen.s1().setTopBarContent(ivfVar);
                ((rcc) settingsListScreen.m.m(settingsListScreen, SettingsListScreen.r[1])).setTitle(ivfVar.c);
                return sbi.a;
            case 1:
                List list = (List) this.f;
                ch3.d0(obj);
                this.g.p.H(list);
                return sbi.a;
            case 2:
                SettingsListScreen settingsListScreen2 = this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                dc6 dc6Var = (dc6) obj2;
                itf itfVar = dc6Var instanceof itf ? (itf) dc6Var : null;
                if (itfVar instanceof ftf) {
                    ftf ftfVar = (ftf) itfVar;
                    it3.a(settingsListScreen2.getContext(), ftfVar.a);
                    if (it3.b() && (charSequenceB = ftfVar.b.b(settingsListScreen2.getContext())) != null) {
                        h8c h8cVar = (h8c) settingsListScreen2.n.getValue();
                        h8cVar.h(new w8c(R.drawable.icon_copy));
                        h8cVar.n(charSequenceB);
                        h8cVar.p();
                    }
                } else if (itfVar instanceof htf) {
                    ((uj4) settingsListScreen2.k.getValue()).a(settingsListScreen2.getContext(), ((htf) itfVar).a);
                } else if (cqk.d(itfVar, gtf.a)) {
                    settingsListScreen2.p1().w0(0);
                    rq rqVar = settingsListScreen2.o;
                    if (rqVar != null) {
                        rqVar.g(true, true, true);
                    }
                }
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                rbb rbbVar = (rbb) this.f;
                ch3.d0(obj);
                if (rbbVar instanceof juf) {
                    o65.c(jtf.b.b(), nbh.s(((juf) rbbVar).b, ":profile/edit?id=", "&type=contact"), null, null, 6);
                } else if (rbbVar instanceof luf) {
                    o65.c(jtf.b.b(), nbh.s(((luf) rbbVar).b, ":profile/avatars?id=", "&type=contact"), null, null, 6);
                } else if (cqk.d(rbbVar, guf.b)) {
                    SettingsListScreen settingsListScreen3 = this.g;
                    zv8[] zv8VarArr2 = SettingsListScreen.r;
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.oneme_settings_change_avatar_title, null, null, 6);
                    jc4VarC.a(new kc4(R.id.oneme_settings_change_avatar_upload_from_gallery, new tnh(R.string.oneme_settings_change_avatar_upload_from_gallery), 3, 56));
                    jc4VarC.a(new kc4(R.id.oneme_settings_change_avatar_upload_from_camera, new tnh(R.string.oneme_settings_change_avatar_upload_from_camera), 3, 56));
                    jc4VarC.a(new kc4(R.id.oneme_settings_change_avatar_cancel, new tnh(R.string.oneme_settings_change_avatar_cancel), 2, 56));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(settingsListScreen3);
                    confirmationBottomSheetF.setTargetController(settingsListScreen3);
                    br4 parentController = settingsListScreen3;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (cqk.d(rbbVar, huf.b)) {
                    SettingsListScreen settingsListScreen4 = this.g;
                    zv8[] zv8VarArr4 = SettingsListScreen.r;
                    ((wsc) settingsListScreen4.f.getValue()).n(new svj(this.g, 1));
                } else if (rbbVar instanceof iuf) {
                    iuf iufVar = (iuf) rbbVar;
                    c1a.b.j(iufVar.b, iufVar.c, false);
                } else if (rbbVar instanceof muf) {
                    try {
                        this.g.startActivityForResult(((muf) rbbVar).b, 333);
                        tbb.g((tbb) this.g.g.getValue(), y3f.AVATAR_PICKER_CAMERA);
                    } catch (ActivityNotFoundException unused) {
                        String name = SettingsListScreen.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4c.f(a4cVar, je9.g, name, "failed open camera", null, null, 8);
                        }
                        bpf bpfVarT1 = this.g.t1();
                        bpfVarT1.F.set(null);
                        a8j.x(bpfVarT1.z, new ouf(new tnh(R.string.oneme_settings_cant_open_camera), Integer.valueOf(R.drawable.icon_warning)));
                    }
                    break;
                } else if (cqk.d(rbbVar, nuf.b)) {
                    o65.c(jtf.b.b(), ":media-picker/select/photo", null, null, 6);
                } else if (rbbVar instanceof ouf) {
                    ouf oufVar = (ouf) rbbVar;
                    CharSequence charSequenceB2 = oufVar.b.b(this.g.getContext());
                    if (charSequenceB2 != null) {
                        h8c h8cVar2 = (h8c) this.g.n.getValue();
                        h8cVar2.n(charSequenceB2);
                        h8cVar2.h(new w8c(oufVar.c.intValue()));
                        h8cVar2.p();
                    }
                } else if (rbbVar instanceof kuf) {
                    sb8.O(this.g.getContext(), ((kuf) rbbVar).b);
                } else if (rbbVar instanceof i65) {
                    jtf.b.e((i65) rbbVar);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mtf(SettingsListScreen settingsListScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = settingsListScreen;
    }
}
