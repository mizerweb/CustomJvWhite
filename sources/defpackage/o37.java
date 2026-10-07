package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.devmenu.DevMenuInfoScreen;
import one.me.devmenu.logsviewer.IntegrityLogsViewerScreen;
import one.me.devmenu.utils.JsonBottomSheet;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.gallery.permissions.PartialMediaAccessWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o37 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o37(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj;
                zv8[] zv8VarArr = FolderMemberPickerScreen.q;
                n37 n37Var = (n37) folderMemberPickerScreen.x1().d;
                vv vvVar = folderMemberPickerScreen.n;
                zv8 zv8Var = FolderMemberPickerScreen.q[0];
                String str = (String) vvVar.a(folderMemberPickerScreen);
                if (!n37Var.h) {
                    n37Var.h = true;
                    gu4 gu4Var = n37Var.g;
                    if (gu4Var != null) {
                        yab.h0(gu4Var, lvb.x0(zhb.b, ((n0c) ((xhh) n37Var.d.getValue())).b()), 3, new t20(n37Var, str, (lq4) null, 17));
                    }
                    break;
                }
                break;
            case 1:
                ((s47) obj).v.invoke();
                break;
            case 2:
                ForceUpdateScreen forceUpdateScreen = (ForceUpdateScreen) obj;
                Activity activity = forceUpdateScreen.getActivity();
                if (activity != null) {
                    forceUpdateScreen.b.a(activity);
                }
                break;
            case 3:
                ForgotPinCodeDialog forgotPinCodeDialog = (ForgotPinCodeDialog) obj;
                int i2 = ForgotPinCodeDialog.v;
                vv vvVar2 = forgotPinCodeDialog.q;
                zv8 zv8Var2 = BottomSheetWidget.t[0];
                vvVar2.b(forgotPinCodeDialog, Boolean.FALSE);
                wtc wtcVar = forgotPinCodeDialog.u;
                e9i.j0(new fz6(n1g.v(new jz(new xc3(((c59) wtcVar.getAccessor().d(216).getValue()).g((String) ((g5d) ((gjf) wtcVar.getAccessor().d(97).getValue())).a.O.a(e5d.S6[33]).i()), 20), 13), forgotPinCodeDialog.getViewLifecycleOwner().f(), n09.d), new sp2(null, new tc(forgotPinCodeDialog, 18, (o65) wtcVar.getAccessor().c(184)), 1), 3), forgotPinCodeDialog.getViewLifecycleScope());
                break;
            case 4:
                ((a53) ((ji0) obj).e).invoke();
                break;
            case 5:
                af7 af7Var = ((wu7) obj).a;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            case 6:
                ((jx) obj).J0(-1, -1);
                break;
            case 7:
                ((rod) obj).invoke();
                break;
            case 8:
                rj5 rj5Var = (rj5) ((am0) obj).v;
                DevMenuInfoScreen devMenuInfoScreen = (DevMenuInfoScreen) rj5Var.b;
                it3.a(devMenuInfoScreen.getContext(), ww3.z1(((DevMenuInfoScreen) rj5Var.b).o1(), "\n\n", null, null, new w83(24), 30));
                h8c h8cVar = new h8c(devMenuInfoScreen);
                h8cVar.n("Информация о сборке и устройстве скопирована в буфер обмена");
                h8cVar.p();
                break;
            case 9:
                IntegrityLogsViewerScreen integrityLogsViewerScreen = (IntegrityLogsViewerScreen) obj;
                int size = integrityLogsViewerScreen.c.d.size() - 1;
                if (size >= 0) {
                    ((k96) integrityLogsViewerScreen.d.getValue()).w0(size);
                }
                break;
            case 10:
                ((k9d) obj).invoke();
                break;
            case 11:
                ((dx4) obj).invoke();
                break;
            case 12:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj;
                zv8[] zv8VarArr2 = InviteByPhoneScreen.p;
                inviteByPhoneScreen.r1().D(inviteByPhoneScreen.q1().getCode(), inviteByPhoneScreen.q1().getPhoneWithoutCode());
                AppCompatTextView appCompatTextView = inviteByPhoneScreen.k;
                if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
                    z = true;
                }
                cyb cybVarP1 = inviteByPhoneScreen.p1();
                cybVarP1.setLoading(!z);
                cybVarP1.setClickable(z);
                break;
            case 13:
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) obj;
                zv8[] zv8VarArr3 = InviteByQrBottomSheet.H;
                p3c p3cVar = inviteByQrBottomSheet.D;
                zv8[] zv8VarArr4 = InviteByQrBottomSheet.H;
                vo8 vo8Var = (vo8) p3cVar.m(inviteByQrBottomSheet, zv8VarArr4[3]);
                if (vo8Var == null || !vo8Var.isActive()) {
                    sm8 sm8Var = (sm8) inviteByQrBottomSheet.A.getValue();
                    Integer numC = ((tbb) sm8Var.b.getValue()).c();
                    sm8Var.a("clicked_to_invite", (numC != null && numC.intValue() == 100) ? "plus" : "main", "invite_friends");
                    p3cVar.B(inviteByQrBottomSheet, zv8VarArr4[3], yab.i0(inviteByQrBottomSheet.getViewLifecycleScope(), null, 2, new km8(inviteByQrBottomSheet, null, 1), 1));
                }
                break;
            case 14:
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) obj;
                zv8[] zv8VarArr5 = InviteFriendsToMaxBottomSheet.D;
                p3c p3cVar2 = inviteFriendsToMaxBottomSheet.B;
                zv8[] zv8VarArr6 = InviteFriendsToMaxBottomSheet.D;
                vo8 vo8Var2 = (vo8) p3cVar2.m(inviteFriendsToMaxBottomSheet, zv8VarArr6[0]);
                if (vo8Var2 == null || !vo8Var2.isActive()) {
                    p3cVar2.B(inviteFriendsToMaxBottomSheet, zv8VarArr6[0], yab.i0(inviteFriendsToMaxBottomSheet.getViewLifecycleScope(), null, 2, new el6(inviteFriendsToMaxBottomSheet, (lq4) null, 16), 1));
                }
                break;
            case 15:
                JsonBottomSheet jsonBottomSheet = (JsonBottomSheet) obj;
                zv8[] zv8VarArr7 = JsonBottomSheet.z;
                xs8 xs8Var = new xs8(jsonBottomSheet, "", kt8.c(""));
                jsonBottomSheet.x.add(xs8Var);
                LinearLayout linearLayout = jsonBottomSheet.y;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                linearLayout.addView(xs8Var.d);
                LinearLayout linearLayout2 = jsonBottomSheet.y;
                (linearLayout2 != null ? linearLayout2 : null).post(new su6(jsonBottomSheet, 7, xs8Var));
                break;
            case 16:
                ((rod) obj).invoke();
                break;
            case 17:
                MediaPickerPermissionWidget mediaPickerPermissionWidget = (MediaPickerPermissionWidget) obj;
                zv8[] zv8VarArr8 = MediaPickerPermissionWidget.d;
                ny8 ny8Var = mediaPickerPermissionWidget.c;
                if (((wsc) ny8Var.getValue()).c(wsc.n)) {
                    ((wsc) ny8Var.getValue()).o(new svj(mediaPickerPermissionWidget, 1));
                } else {
                    ((wsc) ny8Var.getValue()).m(new svj(mediaPickerPermissionWidget, 1), wsc.p, 162);
                }
                break;
            case 18:
                zv8[] zv8VarArr9 = MediaPickerScreen.J;
                a8j.x(((MediaPickerScreen) obj).w1().t, f1a.b);
                break;
            case 19:
                t5a t5aVar = (t5a) obj;
                t5aVar.b.p0(t5aVar.h);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr10 = MessageContextMenuBottomSheet.w1;
                ((MessageContextMenuBottomSheet) obj).v1(true);
                break;
            case 21:
                gia giaVar = (gia) obj;
                fia fiaVar = giaVar.e;
                if (fiaVar != null) {
                    long j = fiaVar.a;
                    wha whaVar = fiaVar.e;
                    if (whaVar == null || fiaVar.d != null) {
                        qf7 qf7Var = giaVar.c;
                        if (qf7Var != null) {
                            qf7Var.invoke(Long.valueOf(j), Long.valueOf(fiaVar.b));
                        }
                    } else {
                        qf7 qf7Var2 = giaVar.d;
                        if (qf7Var2 != null) {
                            qf7Var2.invoke(whaVar, Long.valueOf(j));
                        }
                    }
                    break;
                }
                break;
            case 22:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj;
                int i3 = messageWriteWidget.H;
                if (i3 != 0) {
                    nma nmaVarA1 = messageWriteWidget.A1();
                    CharSequence charSequence = (CharSequence) messageWriteWidget.t1().getMessageState().getValue();
                    Integer num = (Integer) messageWriteWidget.t1().getMessagePosition().getValue();
                    ic6 ic6Var = nmaVarA1.x;
                    int iD = qt4.D(i3);
                    if (iD == 0) {
                        Long lF = nmaVarA1.F();
                        nma.P(nmaVarA1, null, null, null, false, 14);
                        a8j.x(ic6Var, new rla(lF));
                    } else if (iD == 1) {
                        mjg mjgVar = nmaVarA1.n1;
                        jla jlaVar = new jla(charSequence, num);
                        mjgVar.getClass();
                        mjgVar.j(null, jlaVar);
                        nmaVarA1.Q(null);
                    } else if (iD == 2) {
                        a8j.x(ic6Var, new vla());
                    } else {
                        ore.o();
                    }
                    break;
                }
                break;
            case 23:
                ((iaa) obj).invoke(view);
                break;
            case 24:
                zv8[] zv8VarArr11 = NotificationsSettingsScreen.m;
                kob kobVarP1 = ((NotificationsSettingsScreen) obj).p1();
                kobVarP1.x.B(kobVarP1, kob.E[0], yab.h0(kobVarP1.b, ((n0c) kobVarP1.D()).b(), 2, new job(kobVarP1, null, 3)));
                break;
            case 25:
                oyb oybVar = (oyb) obj;
                Rect rect = oybVar.i;
                ArrayList arrayList = new ArrayList();
                u8b u8bVar = oybVar.g;
                Object[] objArr = u8bVar.a;
                int i4 = u8bVar.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(oyb.c((lyb) objArr[i5]));
                }
                u8b u8bVar2 = oybVar.h;
                Object[] objArr2 = u8bVar2.a;
                int i6 = u8bVar2.b;
                for (int i7 = 0; i7 < i6; i7++) {
                    arrayList.add(oyb.c((lyb) objArr2[i7]));
                }
                o6g o6gVar = new o6g(oybVar.getContext(), oybVar.getCustomTheme() != null, arrayList, new lh9(19, oybVar));
                view.getGlobalVisibleRect(rect);
                o6gVar.showAtLocation(view, 8388661, wk8.u(oybVar.getContext()) - rect.right, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, rect.bottom));
                break;
            case 26:
                ((ll5) obj).b(j8c.e);
                break;
            case 27:
                jac jacVar = (jac) obj;
                p1c p1cVar = jacVar.b;
                cf7 cf7Var = jacVar.j;
                if (cf7Var != null) {
                    cf7Var.invoke(jacVar.getText());
                } else if (jacVar.getTypingMode() != hac.b) {
                    Editable text = p1cVar.getText();
                    if (text != null) {
                        text.clear();
                    }
                } else if (p1cVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
                    jacVar.setEndIconDrawable(jacVar.f);
                    int selectionStart = p1cVar.getSelectionStart();
                    int selectionEnd = p1cVar.getSelectionEnd();
                    p1cVar.setTransformationMethod(SingleLineTransformationMethod.getInstance());
                    p1cVar.setSelection(selectionStart, selectionEnd);
                } else {
                    jacVar.setEndIconDrawable(jacVar.e);
                    int selectionStart2 = p1cVar.getSelectionStart();
                    int selectionEnd2 = p1cVar.getSelectionEnd();
                    p1cVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    p1cVar.setSelection(selectionStart2, selectionEnd2);
                }
                break;
            case 28:
                PopupWindow popupWindow = (PopupWindow) obj;
                if (popupWindow != null) {
                    popupWindow.showAsDropDown(view);
                }
                break;
            default:
                PartialMediaAccessWidget partialMediaAccessWidget = (PartialMediaAccessWidget) obj;
                ((wsc) partialMediaAccessWidget.a.getValue()).o(new svj(partialMediaAccessWidget, 1));
                break;
        }
    }
}
