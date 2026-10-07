package one.me.filedownloadwarning;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a8j;
import defpackage.ar6;
import defpackage.br4;
import defpackage.c15;
import defpackage.dx4;
import defpackage.fj3;
import defpackage.h;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i50;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.l5e;
import defpackage.lve;
import defpackage.mc4;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p;
import defpackage.qy3;
import defpackage.sdg;
import defpackage.t54;
import defpackage.tnh;
import defpackage.xhh;
import defpackage.ylc;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/filedownloadwarning/FileDownloadWarningBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "messageId", "", "attachId", "fileId", "fileName", "fileUrl", "fileSize", "Lha9;", "localAccountId", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JLha9;)V", "file-download-warning"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileDownloadWarningBottomSheet extends Widget implements mc4 {
    public final h a;
    public final ny8 b;
    public final ny8 c;

    public FileDownloadWarningBottomSheet(long j, long j2, String str, long j3, String str2, String str3, long j4, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("chat_id", Long.valueOf(j)), new ylc("message_id", Long.valueOf(j2)), new ylc("attach_id", str), new ylc("file_id", Long.valueOf(j3)), new ylc("file_name", str2), new ylc("file_url", str3), new ylc("file_size", Long.valueOf(j4))));
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        ar6 ar6VarO1 = o1();
        ((i50) ar6VarO1.n.getValue()).a(new l5e(ar6VarO1.d, ar6VarO1.i, ar6VarO1.e, null));
        sdg sdgVarB = o1().B();
        if (sdgVarB != null) {
            ((c15) this.c.getValue()).a(sdgVarB, 3);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ny8 ny8Var = this.c;
        if (i == R.id.oneme_file_download_warning_confirm) {
            ar6 ar6VarO1 = o1();
            ar6VarO1.p.B(ar6VarO1, ar6.q[0], a8j.t(ar6VarO1, ((n0c) ((xhh) ar6VarO1.j.getValue())).b(), new qy3(ar6VarO1, null, 20), 2));
            sdg sdgVarB = o1().B();
            if (sdgVarB != null) {
                ((c15) ny8Var.getValue()).a(sdgVarB, 2);
                return;
            }
            return;
        }
        if (i == R.id.oneme_file_download_warning_deny) {
            ar6 ar6VarO2 = o1();
            ((i50) ar6VarO2.n.getValue()).a(new l5e(ar6VarO2.d, ar6VarO2.i, ar6VarO2.e, null));
            sdg sdgVarB2 = o1().B();
            if (sdgVarB2 != null) {
                ((c15) ny8Var.getValue()).a(sdgVarB2, 3);
            }
        }
    }

    public final ar6 o1() {
        return (ar6) this.b.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.oneme_file_download_warning_title, null, null, 6);
        jc4VarC.g(new tnh(R.string.oneme_file_download_warning_description));
        jc4VarC.a(new kc4(R.id.oneme_file_download_warning_deny, new tnh(R.string.oneme_file_download_warning_deny_btn), 3, true, 3, 3), new kc4(R.id.oneme_file_download_warning_confirm, new tnh(R.string.oneme_file_download_warning_confirm_btn), 2, 32));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(this);
        confirmationBottomSheetF.addLifecycleListener(new t54(this, 1));
        confirmationBottomSheetF.setTargetController(this);
        br4 parentController = this;
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
        sdg sdgVarB = o1().B();
        if (sdgVarB != null) {
            ((c15) this.c.getValue()).a(sdgVarB, 1);
        }
    }

    public FileDownloadWarningBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = createViewModelLazy(ar6.class, new fj3(23, new dx4(this, bundle, 12)));
        this.c = hVar.getAccessor().d(240);
    }
}
