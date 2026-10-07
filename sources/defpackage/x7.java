package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.informer.InformerBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.transparent.TransparentWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class x7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        int i = this.a;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((q8) obj).a();
                break;
            case 1:
                lf lfVar = (lf) obj;
                if (view == lfVar.i && (message = lfVar.k) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                lfVar.z.obtainMessage(1, lfVar.b).sendToTarget();
                break;
            case 2:
                zv8[] zv8VarArr = CallPresettingsScreen.i;
                nv1 nv1VarO1 = ((CallPresettingsScreen) obj).o1();
                ic6 ic6Var = nv1VarO1.k;
                if (!nv1VarO1.B()) {
                    a8j.x(ic6Var, rt3.b);
                } else {
                    hv1 hv1Var = (hv1) nv1VarO1.e.getValue();
                    CharSequence charSequence = hv1Var.a;
                    boolean z = charSequence == null || r5h.X0(charSequence);
                    if (z) {
                        nv1VarO1.C(hv1Var.a);
                    }
                    xt4 xt4VarB = ((n0c) ((xhh) nv1VarO1.d.getValue())).b();
                    zhb zhbVar = zhb.b;
                    xt4VarB.getClass();
                    a8j.t(nv1VarO1, lvb.x0(xt4VarB, zhbVar), new qt1(nv1VarO1, hv1Var, null, 2), 2);
                    if (!z) {
                        a8j.x(ic6Var, rt3.b);
                    }
                }
                break;
            case 3:
                ((ChatMediaDownloadBottomSheet) obj).v1(true);
                break;
            case 4:
                InformerBottomSheet informerBottomSheet = (InformerBottomSheet) obj;
                zv8[] zv8VarArr2 = InformerBottomSheet.y;
                ff8 ff8Var = (ff8) informerBottomSheet.x.getValue();
                bf8 bf8Var = ff8Var.d;
                Object value = ff8Var.e.a.getValue();
                gf8 gf8Var = value instanceof gf8 ? (gf8) value : null;
                if (gf8Var == null) {
                    gm0.Y(ff8.class.getName(), "Can't process click in splash informer because wrong state");
                } else if (!(gf8Var.i instanceof ce8)) {
                    yab.i0(bf8Var.a, null, 0, new vk4(bf8Var, (lq4) null, 22), 3);
                } else {
                    TransparentWidget transparentWidget = informerBottomSheet.w;
                    if (transparentWidget != null ? true ^ transparentWidget.q1() : true) {
                        yab.i0(bf8Var.a, null, 0, new vk4(bf8Var, (lq4) null, 22), 3);
                    }
                }
                break;
            case 5:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj;
                messageWriteWidget.i.a.i = messageWriteWidget.t1().getText();
                a8j.x(messageWriteWidget.A1().x, wla.a);
                break;
            case 6:
                ku8 ku8Var = ProfileScreen.B;
                dvd dvdVarV1 = ((ProfileScreen) obj).v1();
                bkd bkdVar = (bkd) dvdVarV1.Z.getValue();
                if (bkdVar == null || bkdVar.m <= 0 || bkdVar.o) {
                    dvdVarV1.P();
                } else {
                    a8j.x(dvdVarV1.B, new iud(xw3.P0(new rp4(R.id.profile_avatar_action_show_stories, new tnh(R.string.profile_show_stories), (Integer) null, (Integer) null, 28), new rp4(R.id.profile_avatar_action_show_photo, new tnh(R.string.profile_show_photo), (Integer) null, (Integer) null, 28))));
                }
                break;
            case 7:
                ((RecordExitBottomSheet) obj).v1(true);
                break;
            case 8:
                ((c3g) obj).u.invoke(b3g.c);
                break;
            case 9:
                af7 af7Var = ((s47) obj).v;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            default:
                zuh zuhVar = ((Toolbar) obj).n1;
                cca ccaVar = zuhVar != null ? zuhVar.b : null;
                if (ccaVar != null) {
                    ccaVar.collapseActionView();
                }
                break;
        }
    }
}
