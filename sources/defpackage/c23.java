package defpackage;

import android.graphics.Rect;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.contactadddialog.ContactAddBottomSheet;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.informer.InformerBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import one.me.transparent.TransparentWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class c23 extends ib {
    public final /* synthetic */ int c;
    public final /* synthetic */ BaseBottomSheetWidget d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c23(BaseBottomSheetWidget baseBottomSheetWidget, int i) {
        super(baseBottomSheetWidget, 1);
        this.c = i;
        this.d = baseBottomSheetWidget;
    }

    @Override // defpackage.ib, defpackage.xbd
    public ccd f(ccd ccdVar, ccd ccdVar2) {
        switch (this.c) {
            case 1:
                return ((ccdVar == ccd.c || ccdVar2 == ccd.b) && !((ConfirmationBottomSheet) this.d).x1()) ? ccdVar : ccdVar2;
            default:
                return super.f(ccdVar, ccdVar2);
        }
    }

    @Override // defpackage.ib, defpackage.xbd
    public void h() {
        switch (this.c) {
            case 3:
                super.h();
                TransparentWidget transparentWidget = ((InformerBottomSheet) this.d).w;
                if (transparentWidget != null) {
                    transparentWidget.getRouter().C(transparentWidget);
                    af7 af7Var = transparentWidget.j;
                    if (af7Var != null) {
                        af7Var.invoke();
                    }
                    transparentWidget.j = null;
                }
                break;
            default:
                super.h();
                break;
        }
    }

    @Override // defpackage.ib, defpackage.xbd
    public boolean j() {
        int i = this.c;
        BaseBottomSheetWidget baseBottomSheetWidget = this.d;
        switch (i) {
            case 1:
                return ((ConfirmationBottomSheet) baseBottomSheetWidget).x1();
            case 2:
            default:
                return super.j();
            case 3:
                zv8[] zv8VarArr = InformerBottomSheet.y;
                bf8 bf8Var = ((ff8) ((InformerBottomSheet) baseBottomSheetWidget).x.getValue()).d;
                yab.i0(bf8Var.a, null, 0, new qy3(bf8Var, null, 27), 3);
                return true;
        }
    }

    @Override // defpackage.ib, defpackage.xbd
    public void k(ccd ccdVar) {
        switch (this.c) {
            case 0:
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.d;
                zv8[] zv8VarArr = ChatMediaDownloadBottomSheet.B;
                e9i.j0(new fz6(n1g.v(((n23) chatMediaDownloadBottomSheet.v.getValue()).p, chatMediaDownloadBottomSheet.getViewLifecycleOwner().f(), n09.e), new b23(null, chatMediaDownloadBottomSheet, 0), 3), chatMediaDownloadBottomSheet.getViewLifecycleScope());
                break;
            default:
                super.k(ccdVar);
                break;
        }
    }

    @Override // defpackage.ib, defpackage.xbd
    public boolean n(ccd ccdVar, float f, float f2) {
        int i = this.c;
        BaseBottomSheetWidget baseBottomSheetWidget = this.d;
        switch (i) {
            case 1:
                return ((ConfirmationBottomSheet) baseBottomSheetWidget).x1();
            case 2:
                ContactAddBottomSheet contactAddBottomSheet = (ContactAddBottomSheet) baseBottomSheetWidget;
                zv8[] zv8VarArr = ContactAddBottomSheet.x;
                j8e j8eVar = contactAddBottomSheet.r;
                zv8[] zv8VarArr2 = ContactAddBottomSheet.x;
                ScrollView scrollView = (ScrollView) j8eVar.m(contactAddBottomSheet, zv8VarArr2[2]);
                Rect rect = n9j.a;
                n9j.e(rect, scrollView);
                return (rect.contains((int) f, (int) f2) && ((ScrollView) j8eVar.m(contactAddBottomSheet, zv8VarArr2[2])).canScrollVertically(-1)) ? false : true;
            case 3:
            default:
                return super.n(ccdVar, f, f2);
            case 4:
                SelectCountryBottomSheet selectCountryBottomSheet = (SelectCountryBottomSheet) baseBottomSheetWidget;
                return (selectCountryBottomSheet.getView() == null || ((RecyclerView) selectCountryBottomSheet.o.m(selectCountryBottomSheet, SelectCountryBottomSheet.t[0])).canScrollVertically(-1)) ? false : true;
        }
    }
}
