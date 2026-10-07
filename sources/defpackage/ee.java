package defpackage;

import android.graphics.Point;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.collections.a;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.chatscreen.chatpreview.ChatPreviewBottomWidget;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import one.me.stories.edit.EditStoryScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.cookie.ClientCookie;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ee implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ee(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        switch (this.a) {
            case 0:
                ((m) this.b).invoke(Long.valueOf(((oc) this.c).a));
                break;
            case 1:
                e8c e8cVar = (e8c) this.b;
                TextView textView = (TextView) this.c;
                zv8[] zv8VarArr = AppearanceSettingsMultiThemeScreen.i;
                if (e8cVar.getValue() != 1.0f) {
                    p0m.a(textView, lt7.CONTEXT_CLICK);
                }
                e8cVar.setValue(1.0f);
                break;
            case 2:
                ((m) ((am0) this.b).v).invoke((zl0) this.c);
                break;
            case 3:
                ((g47) ((am0) this.b).v).invoke((o47) this.c);
                break;
            case 4:
                c7k c7kVar = (c7k) this.b;
                long j = ((yf1) this.c).c;
                CallDebugMenuScreen callDebugMenuScreen = (CallDebugMenuScreen) c7kVar.b;
                zv8[] zv8VarArr2 = CallDebugMenuScreen.i;
                bg1 bg1Var = (bg1) callDebugMenuScreen.c.getValue();
                bg1Var.getClass();
                ny8 ny8Var = bg1Var.c;
                if (j == vyb.q) {
                    ((x02) ((b95) ny8Var.getValue()).i.a.getValue()).r().a();
                } else if (j == vyb.r) {
                    ((x02) ((b95) ny8Var.getValue()).i.a.getValue()).r().b();
                }
                break;
            case 5:
                i1m i1mVar = (i1m) this.b;
                long itemId = ((cq1) this.c).getItemId();
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) i1mVar.a;
                ldf ldfVar = CallLinkInfoScreen.t;
                callLinkInfoScreen.t1().C(itemId);
                break;
            case 6:
                lq1 lq1Var = (lq1) this.b;
                CallLinkInfoScreen callLinkInfoScreen2 = (CallLinkInfoScreen) this.c;
                ldf ldfVar2 = CallLinkInfoScreen.t;
                if (lq1Var.d instanceof jq1) {
                    callLinkInfoScreen2.r1().c = la2.c;
                    callLinkInfoScreen2.r1().e = 1;
                    callLinkInfoScreen2.r1().g(ma2.a, false);
                    callLinkInfoScreen2.t1().C(R.id.call_history_info_start_call);
                }
                break;
            case 7:
                CallLinkInfoScreen callLinkInfoScreen3 = (CallLinkInfoScreen) this.b;
                gq1 gq1Var = (gq1) this.c;
                ldf ldfVar3 = CallLinkInfoScreen.t;
                callLinkInfoScreen3.r1().e = 1;
                callLinkInfoScreen3.r1().c = la2.c;
                callLinkInfoScreen3.r1().g(ma2.a, false);
                callLinkInfoScreen3.t1().C(gq1Var.getItemId());
                break;
            case 8:
                dt1 dt1Var = (dt1) this.b;
                fu1 fu1Var = (fu1) this.c;
                ft0 ft0Var = dt1Var.u;
                if (ft0Var != null) {
                    dt1Var.l();
                    CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) ft0Var.a;
                    callOpponentsListWidget.f.B(callOpponentsListWidget, CallOpponentsListWidget.v[0], yab.i0(callOpponentsListWidget.getViewLifecycleScope(), null, 2, new qt1(callOpponentsListWidget, fu1Var, null, 0), 1));
                }
                break;
            case 9:
                ImageView imageView = (ImageView) this.b;
                m22 m22Var = (m22) this.c;
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                Point point = new Point(iArr[0], iArr[1]);
                point.y = imageView.getHeight() + point.y;
                l22 l22Var = m22Var.x;
                if (l22Var != null) {
                    fu1 fu1Var2 = m22Var.C;
                    CallScreen callScreen = ((fx1) l22Var).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.R1().R(fu1Var2, point);
                }
                break;
            case 10:
                a42 a42Var = (a42) this.b;
                v9c v9cVar = (v9c) this.c;
                z32 z32Var = a42Var.s;
                if (z32Var != null) {
                    boolean zIsChecked = v9cVar.isChecked();
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((b1k) z32Var).b;
                    zv8[] zv8VarArr3 = CallTopPanelWidget.e;
                    callTopPanelWidget.p1().d.e.a(zIsChecked);
                }
                break;
            case 11:
                s52 s52Var = (s52) this.b;
                wue wueVar = (wue) this.c;
                int[] iArr2 = new int[2];
                s52Var.A.getLocationOnScreen(iArr2);
                Point point2 = new Point(iArr2[0], iArr2[1]);
                point2.y = wueVar.getHeight() + point2.y;
                p52 p52Var = s52Var.s1;
                if (p52Var != null) {
                    p52Var.i(s52Var.x1, point2);
                }
                break;
            case 12:
                a8j.x(((AboutAppSettingsScreen) ((zo7) ((bt1) this.b).v).b).o1().g, new C0047t(((CharSequence) this.c).toString()));
                break;
            case 13:
                ((n61) this.b).invoke((u7a) this.c);
                break;
            case 14:
                ((n61) this.b).invoke((u7a) this.c);
                break;
            case 15:
                ((cf7) this.b).invoke((x7a) this.c);
                break;
            case 16:
                ChatPreviewBottomWidget chatPreviewBottomWidget = (ChatPreviewBottomWidget) this.b;
                rp4 rp4Var = (rp4) this.c;
                zv8[] zv8VarArr4 = ChatPreviewBottomWidget.b;
                ((z93) chatPreviewBottomWidget.a.getValue()).F(rp4Var.a);
                break;
            case 17:
                ((a8f) this.b).invoke((be3) this.c);
                break;
            case 18:
                ((fz7) this.b).invoke((be3) this.c);
                break;
            case 19:
                ChatStatusBottomWidget chatStatusBottomWidget = (ChatStatusBottomWidget) this.b;
                ie3 ie3Var = (ie3) this.c;
                zv8[] zv8VarArr5 = ChatStatusBottomWidget.c;
                switch (ie3Var.ordinal()) {
                    case 0:
                        xd3 xd3VarO1 = chatStatusBottomWidget.o1();
                        a8j.t(xd3VarO1, ((n0c) xd3VarO1.H()).a(), new dd3(xd3VarO1, null, 1), 2);
                        break;
                    case 1:
                    case 6:
                        break;
                    case 2:
                        xd3 xd3VarO2 = chatStatusBottomWidget.o1();
                        rt2 rt2Var = (rt2) xd3VarO2.G1.a.getValue();
                        String strF = rt2Var != null ? rt2Var.F() : null;
                        a8j.x(xd3VarO2.L1, new jc3(new vnh(R.string.chat_screen__remove_chat_title, a.n1(new Object[]{strF != null ? strF : ""})), null, xw3.P0(new kc4(R.id.chat_screen__remove_chat_confirm, new tnh(R.string.chat_screen__remove_chat_action), 1, 56), new kc4(R.id.chat_screen__action_cancel, new tnh(R.string.cancel), 2, 56))));
                        break;
                    case 3:
                        xd3 xd3VarO3 = chatStatusBottomWidget.o1();
                        rt2 rt2Var2 = (rt2) xd3VarO3.G1.a.getValue();
                        String strF2 = rt2Var2 != null ? rt2Var2.F() : null;
                        a8j.x(xd3VarO3.L1, new jc3(new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{strF2 != null ? strF2 : ""})), null, xw3.P0(new kc4(R.id.chat_screen__leave_chat_confirm, new tnh(R.string.leave_chat), 1, 56), new kc4(R.id.chat_screen__action_cancel, new tnh(R.string.leave_chat_cancel), 2, 56))));
                        break;
                    case 4:
                        xd3 xd3VarO4 = chatStatusBottomWidget.o1();
                        xd3VarO4.A1.B(xd3VarO4, xd3.X1[8], yab.h0(xd3VarO4.b, ((n0c) xd3VarO4.H()).b(), 2, new dd3(xd3VarO4, null, 0)));
                        break;
                    case 5:
                        chatStatusBottomWidget.o1().L();
                        break;
                    case 7:
                        xd3 xd3VarO5 = chatStatusBottomWidget.o1();
                        xd3VarO5.getClass();
                        a8j.t(xd3VarO5, null, new dd3(xd3VarO5, null, 5), 3);
                        break;
                    case 8:
                        chatStatusBottomWidget.o1().O();
                        break;
                    case 9:
                        xd3 xd3VarO6 = chatStatusBottomWidget.o1();
                        xd3VarO6.B1.B(xd3VarO6, xd3.X1[9], yab.h0(xd3VarO6.b, ((n0c) xd3VarO6.H()).b(), 2, new dd3(xd3VarO6, null, 3)));
                        break;
                    default:
                        ore.o();
                        break;
                }
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vn7 vn7Var = (vn7) this.b;
                long j2 = ((e04) this.c).a;
                CommentsBlackListScreen commentsBlackListScreen = (CommentsBlackListScreen) vn7Var.b;
                zv8[] zv8VarArr6 = CommentsBlackListScreen.k;
                q04 q04VarR1 = commentsBlackListScreen.r1();
                long jT = ((s7f) ((et3) q04VarR1.f.getValue())).t();
                ic6 ic6Var = q04VarR1.p;
                if (j2 != jT) {
                    a8j.x(ic6Var, new xz3(j2));
                } else {
                    a8j.x(ic6Var, new zz3(new tnh(R.string.profile_self_user_click_snackbar_title)));
                }
                break;
            case 21:
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = (ConfirmAddOpponentToCallBottomSheet) this.b;
                ap3 ap3Var = (ap3) this.c;
                int i = ConfirmAddOpponentToCallBottomSheet.x;
                xa4 xa4Var = (xa4) confirmAddOpponentToCallBottomSheet.v.getValue();
                boolean zIsChecked2 = ap3Var.isChecked();
                Long l = ((be1) ((n42) xa4Var.c).e.a.getValue()).a;
                if (l == null) {
                    gm0.Y(xa4.class.getName(), "Early return in openAddUsers cuz of chatId is null");
                    break;
                } else {
                    long jLongValue = l.longValue();
                    if (xa4Var.f == null) {
                        xa4Var.f = a8j.t(xa4Var, ((n0c) ((xhh) xa4Var.e.getValue())).b(), new wa4(xa4Var, zIsChecked2, jLongValue, null), 2);
                        break;
                    }
                }
                break;
            case 22:
                ((w14) this.b).invoke(Long.valueOf(((ek4) this.c).a));
                break;
            case 23:
                ((a8f) this.b).invoke((fm4) this.c);
                break;
            case 24:
                ((w14) this.b).invoke((rp4) this.c);
                break;
            case 25:
                ((cf7) this.b).invoke((rp4) this.c);
                break;
            case 26:
                pq4 pq4Var = (pq4) this.b;
                ria riaVar = (ria) this.c;
                due dueVar = pq4Var.y;
                if (dueVar != null) {
                    long j3 = riaVar.a;
                    MessagesListWidget messagesListWidget = (MessagesListWidget) dueVar.a;
                    zv8[] zv8VarArr7 = MessagesListWidget.T1;
                    fva fvaVarG0 = messagesListWidget.F1().g0();
                    fvaVarG0.g(yab.h0(fvaVarG0.c, fvaVarG0.b, 2, new i20(fvaVarG0, j3, (lq4) null, 19)));
                }
                break;
            case 27:
                qyb qybVar = (qyb) this.b;
                x0c x0cVar = (x0c) this.c;
                SelectCountryBottomSheet selectCountryBottomSheet = (SelectCountryBottomSheet) qybVar.b;
                ldf ldfVar4 = SelectCountryBottomSheet.s;
                br4 targetController = selectCountryBottomSheet.getTargetController();
                wu4 wu4Var = targetController instanceof wu4 ? (wu4) targetController : null;
                if (wu4Var != null) {
                    wu4Var.H0(x0cVar);
                }
                if (selectCountryBottomSheet.getView() != null) {
                    selectCountryBottomSheet.v1(true);
                }
                break;
            case 28:
                ((nv4) this.b).invoke(Integer.valueOf(((lv4) this.c).a));
                break;
            default:
                dr3 dr3Var = (dr3) this.b;
                EditStoryScreen editStoryScreen = (EditStoryScreen) this.c;
                zv8[] zv8VarArr8 = EditStoryScreen.A1;
                p0m.a(dr3Var, kt7.CLOCK_TICK);
                p26 p26VarC1 = editStoryScreen.C1();
                p26VarC1.s.b();
                if (!((Boolean) p26VarC1.G.a.getValue()).booleanValue()) {
                    kb9 kb9VarJ = p26VarC1.J();
                    if (kb9VarJ != null) {
                        boolean z = kb9VarJ.l == jb9.d;
                        Object value = p26VarC1.X.a.getValue();
                        e16 e16Var = value instanceof e16 ? (e16) value : null;
                        rvc rvcVar = e16Var != null ? e16Var.c : null;
                        Uri uri = (z || rvcVar == null) ? kb9VarJ.b : rvcVar.a;
                        ic6 ic6Var2 = p26VarC1.E1;
                        psg psgVar = psg.b;
                        String string = uri.toString();
                        t3f t3fVar = p26VarC1.e;
                        psgVar.getClass();
                        n65 n65Var = new n65();
                        n65Var.a = ":stories/publish";
                        n65Var.d(Uri.encode(string), ClientCookie.PATH_ATTR);
                        n65Var.d(Uri.encode(t3fVar.a), "scope_id");
                        bc1.q(n65Var.b(), ic6Var2);
                        break;
                    } else {
                        String str = p26VarC1.j;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "onNextClick: no local media item available", null);
                            }
                            break;
                        }
                    }
                } else if (((String) p26VarC1.N().h.a.getValue()) != null) {
                    ic6 ic6Var3 = p26VarC1.E1;
                    psg psgVar2 = psg.b;
                    t3f t3fVar2 = p26VarC1.e;
                    psgVar2.getClass();
                    n65 n65Var2 = new n65();
                    n65Var2.a = ":stories/publish";
                    n65Var2.d(Uri.encode(""), ClientCookie.PATH_ATTR);
                    n65Var2.d(Uri.encode(t3fVar2.a), "scope_id");
                    bc1.q(n65Var2.b(), ic6Var3);
                    break;
                }
                break;
        }
    }
}
