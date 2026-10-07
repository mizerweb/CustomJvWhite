package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.android.root.RootController;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lff extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SelectedMediaBottomBarWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lff(lq4 lq4Var, SelectedMediaBottomBarWidget selectedMediaBottomBarWidget) {
        super(2, lq4Var);
        this.e = 0;
        this.g = selectedMediaBottomBarWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = this.g;
        switch (i) {
            case 0:
                lff lffVar = new lff(lq4Var, selectedMediaBottomBarWidget);
                lffVar.f = obj;
                return lffVar;
            case 1:
                lff lffVar2 = new lff(lq4Var, selectedMediaBottomBarWidget, 1);
                lffVar2.f = obj;
                return lffVar2;
            case 2:
                lff lffVar3 = new lff(lq4Var, selectedMediaBottomBarWidget, 2);
                lffVar3.f = obj;
                return lffVar3;
            case 3:
                lff lffVar4 = new lff(lq4Var, selectedMediaBottomBarWidget, 3);
                lffVar4.f = obj;
                return lffVar4;
            case 4:
                lff lffVar5 = new lff(lq4Var, selectedMediaBottomBarWidget, 4);
                lffVar5.f = obj;
                return lffVar5;
            case 5:
                lff lffVar6 = new lff(lq4Var, selectedMediaBottomBarWidget, 5);
                lffVar6.f = obj;
                return lffVar6;
            case 6:
                lff lffVar7 = new lff(lq4Var, selectedMediaBottomBarWidget, 6);
                lffVar7.f = obj;
                return lffVar7;
            case 7:
                lff lffVar8 = new lff(lq4Var, selectedMediaBottomBarWidget, 7);
                lffVar8.f = obj;
                return lffVar8;
            case 8:
                lff lffVar9 = new lff(lq4Var, selectedMediaBottomBarWidget, 8);
                lffVar9.f = obj;
                return lffVar9;
            case 9:
                lff lffVar10 = new lff(lq4Var, selectedMediaBottomBarWidget, 9);
                lffVar10.f = obj;
                return lffVar10;
            default:
                lff lffVar11 = new lff(lq4Var, selectedMediaBottomBarWidget, 10);
                lffVar11.f = obj;
                return lffVar11;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((lff) create((zka) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((lff) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String string;
        Object value;
        Object value2;
        Object value3;
        switch (this.e) {
            case 0:
                zka zkaVar = (zka) this.f;
                ch3.d0(obj);
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = this.g;
                zv8[] zv8VarArr = SelectedMediaBottomBarWidget.C;
                String name = SelectedMediaBottomBarWidget.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "onToggleEmoji: " + zkaVar, null);
                    }
                }
                hve hveVar = selectedMediaBottomBarWidget.y;
                if (hveVar != null) {
                    int iOrdinal = zkaVar.a.ordinal();
                    if (iOrdinal == 0) {
                        kz9 kz9Var = selectedMediaBottomBarWidget.w;
                        if (kz9Var != null) {
                            zv8[] zv8VarArr2 = kz9.p;
                            kz9Var.i(true);
                        }
                        selectedMediaBottomBarWidget.q1().setLeftIcon(R.drawable.icon_sticker);
                    } else if (iOrdinal == 1) {
                        if (!hveVar.o()) {
                            MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(selectedMediaBottomBarWidget.a, 0L, true, false, null, false, 58, null);
                            kbc kbcVar = selectedMediaBottomBarWidget.B;
                            mediaKeyboardWidget.p = kbcVar;
                            sw8 sw8Var = mediaKeyboardWidget.o;
                            if (sw8Var != null) {
                                sw8Var.L(kbcVar);
                            }
                            hveVar.T(oc9.e(mediaKeyboardWidget, null, null));
                        }
                        kz9 kz9Var2 = selectedMediaBottomBarWidget.w;
                        if (kz9Var2 != null) {
                            kz9Var2.l();
                        }
                        selectedMediaBottomBarWidget.q1().setLeftIcon(R.drawable.icon_keyboard);
                    } else if (iOrdinal == 2) {
                        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = (SelectedMediaBottomBarWidget) selectedMediaBottomBarWidget.z.b;
                        if (selectedMediaBottomBarWidget2.getView() != null) {
                            selectedMediaBottomBarWidget2.q1().h(true);
                        }
                        selectedMediaBottomBarWidget.q1().setLeftIcon(R.drawable.icon_keyboard);
                    }
                }
                return sbi.a;
            case 1:
                Object obj2 = this.f;
                ch3.d0(obj);
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget3 = this.g;
                zv8[] zv8VarArr3 = SelectedMediaBottomBarWidget.C;
                CharSequence charSequence = selectedMediaBottomBarWidget3.s1().C().a;
                if (charSequence == null || (string = charSequence.toString()) == null) {
                    string = "";
                }
                selectedMediaBottomBarWidget3.s1().g.B(selectedMediaBottomBarWidget3.q1(), string);
                x9h x9hVarS1 = selectedMediaBottomBarWidget3.s1();
                CharSequence text = selectedMediaBottomBarWidget3.q1().getText();
                String string2 = text != null ? text.toString() : null;
                mjg mjgVar = x9hVarS1.w;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, string2));
                selectedMediaBottomBarWidget3.s1().G(null);
                return sbi.a;
            case 2:
                Object obj3 = this.f;
                ch3.d0(obj);
                int iIntValue = ((Number) obj3).intValue();
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget4 = this.g;
                zv8[] zv8VarArr4 = SelectedMediaBottomBarWidget.C;
                mjg mjgVar2 = selectedMediaBottomBarWidget4.s1().x;
                do {
                    value2 = mjgVar2.getValue();
                    ((Number) value2).intValue();
                } while (!mjgVar2.h(value2, Integer.valueOf(iIntValue)));
                return sbi.a;
            case 3:
                Object obj4 = this.f;
                ch3.d0(obj);
                CharSequence charSequence2 = (CharSequence) obj4;
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget5 = this.g;
                zv8[] zv8VarArr5 = SelectedMediaBottomBarWidget.C;
                selectedMediaBottomBarWidget5.q1().setText(charSequence2);
                selectedMediaBottomBarWidget5.q1().n(charSequence2.length());
                return sbi.a;
            case 4:
                Object obj5 = this.f;
                ch3.d0(obj);
                u9h u9hVar = (u9h) obj5;
                String name2 = SelectedMediaBottomBarWidget.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name2, "Insert selected mention into media bar caption", null);
                    }
                }
                CharSequence charSequenceB = this.g.s1().B(u9hVar);
                fik fikVar = this.g.s1().g;
                tha thaVarQ1 = this.g.q1();
                fikVar.getClass();
                fik.C(thaVarQ1, charSequenceB, u9hVar);
                return sbi.a;
            case 5:
                Object obj6 = this.f;
                ch3.d0(obj);
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget6 = this.g;
                zv8[] zv8VarArr6 = SelectedMediaBottomBarWidget.C;
                ((nef) selectedMediaBottomBarWidget6.q.getValue()).H((List) obj6);
                return sbi.a;
            case 6:
                Object obj7 = this.f;
                ch3.d0(obj);
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget7 = this.g;
                int iOrdinal2 = ((igf) obj7).ordinal();
                if (iOrdinal2 == 0) {
                    selectedMediaBottomBarWidget7.q1().setRightOuterIconActionState(lha.a);
                } else if (iOrdinal2 == 1) {
                    selectedMediaBottomBarWidget7.q1().setRightOuterIconActionState(jha.a);
                } else if (iOrdinal2 == 2) {
                    selectedMediaBottomBarWidget7.q1().setRightOuterIconActionState(kha.a);
                } else {
                    if (iOrdinal2 != 3) {
                        ore.o();
                        return null;
                    }
                    selectedMediaBottomBarWidget7.q1().setRightOuterIconActionState(mha.a);
                }
                return sbi.a;
            case 7:
                Object obj8 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget8 = this.g;
                j8e j8eVar = selectedMediaBottomBarWidget8.s;
                zv8[] zv8VarArr7 = SelectedMediaBottomBarWidget.C;
                ((ViewGroup) j8eVar.m(selectedMediaBottomBarWidget8, zv8VarArr7[5])).setVisibility(zBooleanValue ? 0 : 8);
                ((RecyclerView) selectedMediaBottomBarWidget8.r.m(selectedMediaBottomBarWidget8, zv8VarArr7[4])).setAdapter(((ViewGroup) selectedMediaBottomBarWidget8.s.m(selectedMediaBottomBarWidget8, zv8VarArr7[5])).getVisibility() == 0 ? (nef) selectedMediaBottomBarWidget8.q.getValue() : null);
                return sbi.a;
            case 8:
                Object obj9 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget9 = this.g;
                zv8[] zv8VarArr8 = SelectedMediaBottomBarWidget.C;
                selectedMediaBottomBarWidget9.q1().setVisibility(zBooleanValue2 ? 0 : 8);
                if (!zBooleanValue2) {
                    kz9 kz9Var3 = selectedMediaBottomBarWidget9.w;
                    if (kz9Var3 != null) {
                        zv8[] zv8VarArr9 = kz9.p;
                        kz9Var3.i(true);
                    }
                    selectedMediaBottomBarWidget9.z.i();
                    mjg mjgVar3 = selectedMediaBottomBarWidget9.s1().y;
                    do {
                        value3 = mjgVar3.getValue();
                    } while (!mjgVar3.h(value3, null));
                }
                return sbi.a;
            case 9:
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget10 = this.g;
                Object obj10 = this.f;
                ch3.d0(obj);
                tff tffVar = (tff) obj10;
                if (tffVar instanceof rff) {
                    rff rffVar = (rff) tffVar;
                    ((RecyclerView) selectedMediaBottomBarWidget10.r.m(selectedMediaBottomBarWidget10, SelectedMediaBottomBarWidget.C[4])).w0(rffVar.b);
                    oef oefVar = selectedMediaBottomBarWidget10.A;
                    if (oefVar != null) {
                        oefVar.h(rffVar.a);
                    }
                } else {
                    if (!(tffVar instanceof sff)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr10 = SelectedMediaBottomBarWidget.C;
                    sol.g(selectedMediaBottomBarWidget10, selectedMediaBottomBarWidget10.q1().getMessagePreviewAnchor(), ((sff) tffVar).a, null);
                }
                return sbi.a;
            default:
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget11 = this.g;
                Object obj11 = this.f;
                ch3.d0(obj);
                uef uefVar = (uef) obj11;
                if (uefVar instanceof qef) {
                    oef oefVar2 = selectedMediaBottomBarWidget11.A;
                    if (oefVar2 != null) {
                        oefVar2.h(((qef) uefVar).a);
                    }
                } else if (uefVar instanceof ref) {
                    int i = ((ref) uefVar).a;
                    g8c g8cVar = selectedMediaBottomBarWidget11.v;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    String quantityString = selectedMediaBottomBarWidget11.getContext().getResources().getQuantityString(R.plurals.oneme_gallery_max_attach_count_error, i, Integer.valueOf(i));
                    h8c h8cVar = new h8c(selectedMediaBottomBarWidget11);
                    h8cVar.n(quantityString);
                    selectedMediaBottomBarWidget11.v = h8cVar.p();
                } else if (uefVar instanceof sef) {
                    zv8[] zv8VarArr11 = SelectedMediaBottomBarWidget.C;
                    zv8[] zv8VarArr12 = BottomSheetWidget.t;
                    ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(selectedMediaBottomBarWidget11.a.b(), 1L, ((sef) uefVar).a, null, 8, null);
                    scheduledSendPickerBottomSheet.setTargetController(selectedMediaBottomBarWidget11);
                    br4 parentController = selectedMediaBottomBarWidget11;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (uefVar instanceof tef) {
                    zv8[] zv8VarArr13 = SelectedMediaBottomBarWidget.C;
                    sol.g(selectedMediaBottomBarWidget11, selectedMediaBottomBarWidget11.q1().getMessagePreviewAnchor(), ((tef) uefVar).a, null);
                } else {
                    if (!(uefVar instanceof pef)) {
                        ore.o();
                        return null;
                    }
                    oef oefVar3 = selectedMediaBottomBarWidget11.A;
                    if (oefVar3 != null) {
                        oefVar3.c0();
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lff(lq4 lq4Var, SelectedMediaBottomBarWidget selectedMediaBottomBarWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = selectedMediaBottomBarWidget;
    }
}
