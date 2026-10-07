package defpackage;

import android.os.Bundle;
import android.os.Looper;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.share.CallSharePickerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.contactadddialog.ContactAddBottomSheet;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yj1 implements t65, rv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ yj1(zg4 zg4Var, Bundle bundle) {
        this.a = 6;
        this.b = bundle;
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        if (jv9Var.isConnected()) {
            ghe gheVar = jv9Var.u;
            ghe gheVar2 = jv9Var.v;
            Bundle bundle = this.b;
            jv9Var.I = bundle;
            ghe gheVarN0 = jv9.n0(jv9Var.t, jv9Var.s, jv9Var.w, jv9Var.z, bundle);
            jv9Var.u = gheVarN0;
            jv9Var.v = jv9.m0(gheVarN0, jv9Var.s, jv9Var.I, jv9Var.w, jv9Var.z);
            ghe gheVar3 = jv9Var.u;
            gheVar3.getClass();
            boolean zA = j8f.a(gheVar3, gheVar);
            ghe gheVar4 = jv9Var.v;
            gheVar4.getClass();
            j8f.a(gheVar4, gheVar2);
            iu9 iu9Var = jv9Var.a;
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
            gu9 gu9Var = iu9Var.e;
            gu9Var.getClass();
            if (zA) {
                return;
            }
            gu9Var.o();
        }
    }

    @Override // defpackage.t65
    public Object t() {
        Bundle bundle;
        int i = this.a;
        Bundle bundle2 = this.b;
        switch (i) {
            case 0:
                return new CallHistoryScreen(bundle2);
            case 1:
                return new CallSharePickerScreen(bundle2);
            case 2:
                return new ChatScreen(bundle2);
            case 3:
                return new ChatScreen(bundle2);
            case 4:
                return new ChatScreen(bundle2);
            case 5:
                return new ChatScreen(bundle2);
            case 6:
                Long lY = sb8.Y(bundle2, "contact_id");
                Integer numX = sb8.X(bundle2, "bottom_margin");
                if (lY == null && numX == null) {
                    bundle = null;
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, bundle2.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                    if (lY != null) {
                        bundle3.putLong("contact_id", lY.longValue());
                    }
                    if (numX != null) {
                        bundle3.putInt("bottom_margin", numX.intValue());
                    }
                    bundle = bundle3;
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                return new ContactAddBottomSheet(bundle);
            case 7:
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                return new InviteByQrBottomSheet(bundle2);
            case 8:
            default:
                return new StickersShowcaseScreen(bundle2);
            case 9:
                return new ShareDataPickerScreen(bundle2);
            case 10:
                return new ShareDataPickerScreen(bundle2);
            case 11:
                return new StickersSearchScreen(bundle2);
        }
    }

    public /* synthetic */ yj1(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }
}
