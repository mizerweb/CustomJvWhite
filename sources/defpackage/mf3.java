package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mf3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ mf3(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        int i6 = 8;
        int i7 = 3;
        final int i8 = 0;
        final int i9 = 1;
        lq4 lq4Var = null;
        final ChatTitleIconScreen chatTitleIconScreen = this.b;
        switch (i5) {
            case 0:
                return chatTitleIconScreen.b.g();
            case 1:
                zv8[] zv8VarArr = ChatTitleIconScreen.q;
                mjg mjgVar = chatTitleIconScreen.s1().p;
                tf3 tf3Var = new tf3(null, null, null);
                mjgVar.getClass();
                mjgVar.j(null, tf3Var);
                return sbi.a;
            case 2:
                zv8[] zv8VarArr2 = ChatTitleIconScreen.q;
                int iOrdinal = chatTitleIconScreen.r1().ordinal();
                if (iOrdinal == 0) {
                    return y3f.CREATE_CHAT_INFO;
                }
                if (iOrdinal == 1) {
                    return y3f.CREATE_CHANNEL_INFO;
                }
                ore.o();
                return null;
            case 3:
                zv8[] zv8VarArr3 = ChatTitleIconScreen.q;
                rcc rccVar = new rcc(chatTitleIconScreen.getContext());
                rccVar.setId(R.id.oneme_startconversation_chat_titleicon_toolbar);
                rccVar.setLayoutParams(new uf4(-1, -2));
                rccVar.setForm(gcc.Compact);
                int iOrdinal2 = chatTitleIconScreen.r1().ordinal();
                if (iOrdinal2 == 0) {
                    i = R.string.oneme_startconversations_chat_titleicon_toolbar_title;
                } else {
                    if (iOrdinal2 != 1) {
                        ore.o();
                        return null;
                    }
                    i = R.string.oneme_startconversations_chat_titleicon_toolbar_title_channel;
                }
                rccVar.setTitle(i);
                rccVar.setLeftActions(new wbc(new j22(14, rccVar)));
                return rccVar;
            case 4:
                zv8[] zv8VarArr4 = ChatTitleIconScreen.q;
                TextView textView = new TextView(chatTitleIconScreen.getContext());
                textView.setId(R.id.oneme_startconversation_chat_titleicon_create_hint_text_view);
                textView.setLayoutParams(new uf4(0, -2));
                textView.setGravity(17);
                textView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0);
                int iOrdinal3 = chatTitleIconScreen.r1().ordinal();
                if (iOrdinal3 == 0) {
                    i2 = R.string.oneme_startconversations_chat_titleicon_hint;
                } else {
                    if (iOrdinal3 != 1) {
                        ore.o();
                        return null;
                    }
                    i2 = R.string.oneme_startconversations_chat_titleicon_hint_channel;
                }
                textView.setText(i2);
                n1g.N(new f7(i7, lq4Var, i6), textView);
                return textView;
            case 5:
                zv8[] zv8VarArr5 = ChatTitleIconScreen.q;
                kwb kwbVar = new kwb(chatTitleIconScreen.getContext());
                kwbVar.setId(R.id.oneme_startconversation_chat_titleicon_icon_view);
                kwbVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 96.0f), gm0.K(96.0f * yl5.d().getDisplayMetrics().density)));
                kwb.y(kwbVar, chatTitleIconScreen.getContext().getDrawable(R.drawable.icon_camera_open_fill), null, null, null, 30);
                kwbVar.setAvatarShape(awb.a);
                qe7.H(kwbVar, 300L, new View.OnClickListener() { // from class: nf3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i8;
                        boolean z = false;
                        boolean z2 = false;
                        ChatTitleIconScreen chatTitleIconScreen2 = chatTitleIconScreen;
                        int i11 = 2;
                        switch (i10) {
                            case 0:
                                zv8[] zv8VarArr6 = ChatTitleIconScreen.q;
                                ml9.b(chatTitleIconScreen2);
                                chatTitleIconScreen2.s1().getClass();
                                int i12 = 3;
                                int i13 = 56;
                                List listP0 = xw3.P0(new kc4(R.id.oneme_startconversation_chat_titleicon_avatars_load_from_gallery_action, new tnh(R.string.oneme_startconversations_chat_titleicon_avatars_load_from_gallery_action), i12, i13), new kc4(R.id.oneme_startconversation_chat_titleicon_avatars_take_photo_action, new tnh(R.string.oneme_startconversations_chat_titleicon_avatars_take_photo_action), i12, i13), new kc4(R.id.oneme_startconversation_chat_titleicon_avatars_cancel_action, new tnh(R.string.oneme_startconversations_chat_titleicon_avatars_take_photo_cancel), i11, i13));
                                zv8[] zv8VarArr7 = BottomSheetWidget.t;
                                jc4 jc4VarC = p.c(R.string.oneme_startconversations_chat_titleicon_avatar_bottomsheet_title, null, null, 6);
                                Iterator it = listP0.iterator();
                                while (it.hasNext()) {
                                    jc4VarC.a((kc4) it.next());
                                }
                                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(chatTitleIconScreen2);
                                confirmationBottomSheetF.setTargetController(chatTitleIconScreen2);
                                br4 parentController = chatTitleIconScreen2;
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
                                break;
                            default:
                                zv8[] zv8VarArr8 = ChatTitleIconScreen.q;
                                ml9.b(chatTitleIconScreen2);
                                chatTitleIconScreen2.q1().setLoading(true);
                                wf3 wf3VarS1 = chatTitleIconScreen2.s1();
                                int iOrdinal4 = wf3VarS1.d.ordinal();
                                if (iOrdinal4 == 0) {
                                    sgg sggVar = wf3VarS1.w;
                                    if (sggVar == null || !sggVar.isActive()) {
                                        wf3VarS1.w = a8j.t(wf3VarS1, ((n0c) wf3VarS1.C()).a(), new k23(wf3VarS1, z ? 1 : 0, 16), 2);
                                    }
                                } else if (iOrdinal4 != 1) {
                                    ore.o();
                                } else {
                                    wf3VarS1.u.B(wf3VarS1, wf3.A[0], a8j.t(wf3VarS1, ((n0c) wf3VarS1.C()).b(), new jhc(wf3VarS1, z2 ? 1 : 0, 18), 2));
                                }
                                break;
                        }
                    }
                });
                kwbVar.setCloseBadgeClickListener(new mf3(chatTitleIconScreen, i9));
                return kwbVar;
            case 6:
                zv8[] zv8VarArr6 = ChatTitleIconScreen.q;
                jac jacVar = new jac(chatTitleIconScreen.getContext());
                jacVar.setId(R.id.oneme_startconversation_chat_titleicon_title_view);
                jacVar.setLayoutParams(new uf4(0, -2));
                jacVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
                int iOrdinal4 = chatTitleIconScreen.r1().ordinal();
                if (iOrdinal4 == 0) {
                    i3 = R.string.oneme_startconversations_chat_titleicon_input_hint;
                } else {
                    if (iOrdinal4 != 1) {
                        ore.o();
                        return null;
                    }
                    i3 = R.string.oneme_startconversations_chat_titleicon_input_hint_channel;
                }
                jacVar.setHint(np4.q(jacVar.getContext(), i3));
                jacVar.setText(chatTitleIconScreen.s1().y);
                jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
                jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((g5d) ((gjf) chatTitleIconScreen.c.getValue())).k())});
                n1g.N(new of3(3, null, 0), jacVar);
                jacVar.k(new j22(13, chatTitleIconScreen));
                return jacVar;
            case 7:
                zv8[] zv8VarArr7 = ChatTitleIconScreen.q;
                ei5 ei5Var = new ei5(chatTitleIconScreen.getContext());
                ei5Var.setId(R.id.oneme_startconversation_chat_titleicon_description_view);
                uf4 uf4Var = new uf4(0, -2);
                uf4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                uf4Var.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                ei5Var.setLayoutParams(uf4Var);
                ei5Var.setMinimumHeight(gm0.K(84.0f * yl5.d().getDisplayMetrics().density));
                ei5Var.setOnClickListener(new t8(16, ei5Var));
                ei5Var.setMaxCount(((g5d) ((gjf) chatTitleIconScreen.c.getValue())).f());
                ei5Var.setHint(new tnh(R.string.oneme_startconversations_chat_titleicon_input_description_hint));
                ei5Var.setText(chatTitleIconScreen.s1().z);
                ei5Var.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
                ei5Var.setHintColorAttr(R.attr.text_tertiary);
                n1g.N(new ud9(i7, lq4Var, 11), ei5Var);
                return ei5Var;
            default:
                zv8[] zv8VarArr8 = ChatTitleIconScreen.q;
                cyb cybVar = new cyb(chatTitleIconScreen.getContext());
                cybVar.setId(R.id.oneme_startconversation_chat_titleicon_create_button_view);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                cybVar.setLayoutParams(layoutParams);
                int iOrdinal5 = chatTitleIconScreen.r1().ordinal();
                if (iOrdinal5 == 0) {
                    i4 = R.string.oneme_startconversations_chat_titleicon_confirm_button_title;
                } else {
                    if (iOrdinal5 != 1) {
                        ore.o();
                        return null;
                    }
                    i4 = R.string.oneme_startconversations_chat_titleicon_confirm_button_title_channel;
                }
                cybVar.setText(np4.q(cybVar.getContext(), i4));
                cybVar.setSize(ayb.g);
                cybVar.setAppearance(zxb.PRIMARY);
                wf3 wf3VarS1 = chatTitleIconScreen.s1();
                String str = chatTitleIconScreen.s1().y;
                wf3VarS1.getClass();
                if (!r5h.X0(str) && str.length() <= ((g5d) wf3VarS1.e).k()) {
                    i6 = 0;
                }
                cybVar.setVisibility(i6);
                qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: nf3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i9;
                        boolean z = false;
                        boolean z2 = false;
                        ChatTitleIconScreen chatTitleIconScreen2 = chatTitleIconScreen;
                        int i11 = 2;
                        switch (i10) {
                            case 0:
                                zv8[] zv8VarArr9 = ChatTitleIconScreen.q;
                                ml9.b(chatTitleIconScreen2);
                                chatTitleIconScreen2.s1().getClass();
                                int i12 = 3;
                                int i13 = 56;
                                List listP0 = xw3.P0(new kc4(R.id.oneme_startconversation_chat_titleicon_avatars_load_from_gallery_action, new tnh(R.string.oneme_startconversations_chat_titleicon_avatars_load_from_gallery_action), i12, i13), new kc4(R.id.oneme_startconversation_chat_titleicon_avatars_take_photo_action, new tnh(R.string.oneme_startconversations_chat_titleicon_avatars_take_photo_action), i12, i13), new kc4(R.id.oneme_startconversation_chat_titleicon_avatars_cancel_action, new tnh(R.string.oneme_startconversations_chat_titleicon_avatars_take_photo_cancel), i11, i13));
                                zv8[] zv8VarArr10 = BottomSheetWidget.t;
                                jc4 jc4VarC = p.c(R.string.oneme_startconversations_chat_titleicon_avatar_bottomsheet_title, null, null, 6);
                                Iterator it = listP0.iterator();
                                while (it.hasNext()) {
                                    jc4VarC.a((kc4) it.next());
                                }
                                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(chatTitleIconScreen2);
                                confirmationBottomSheetF.setTargetController(chatTitleIconScreen2);
                                br4 parentController = chatTitleIconScreen2;
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
                                break;
                            default:
                                zv8[] zv8VarArr11 = ChatTitleIconScreen.q;
                                ml9.b(chatTitleIconScreen2);
                                chatTitleIconScreen2.q1().setLoading(true);
                                wf3 wf3VarS2 = chatTitleIconScreen2.s1();
                                int iOrdinal6 = wf3VarS2.d.ordinal();
                                if (iOrdinal6 == 0) {
                                    sgg sggVar = wf3VarS2.w;
                                    if (sggVar == null || !sggVar.isActive()) {
                                        wf3VarS2.w = a8j.t(wf3VarS2, ((n0c) wf3VarS2.C()).a(), new k23(wf3VarS2, z ? 1 : 0, 16), 2);
                                    }
                                } else if (iOrdinal6 != 1) {
                                    ore.o();
                                } else {
                                    wf3VarS2.u.B(wf3VarS2, wf3.A[0], a8j.t(wf3VarS2, ((n0c) wf3VarS2.C()).b(), new jhc(wf3VarS2, z2 ? 1 : 0, 18), 2));
                                }
                                break;
                        }
                    }
                });
                return cybVar;
        }
    }
}
