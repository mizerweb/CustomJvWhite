package defpackage;

import android.view.View;
import kotlin.collections.a;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r57 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ r57(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = FoldersPickerScreen.l;
                d67 d67VarO1 = foldersPickerScreen.o1();
                d67VarO1.getClass();
                yab.h0(d67VarO1.b, lvb.x0(zhb.b, ((n0c) d67VarO1.d).b()), 3, new b67(d67VarO1, null));
                break;
            default:
                zv8[] zv8VarArr2 = FoldersPickerScreen.l;
                yl2.a(foldersPickerScreen);
                r37 r37Var = r37.b;
                vv vvVar = foldersPickerScreen.b;
                zv8 zv8Var = FoldersPickerScreen.l[0];
                long[] jArr = (long[]) vvVar.a(foldersPickerScreen);
                r37Var.getClass();
                String strF1 = a.f1(62, jArr);
                if (strF1.length() <= 0) {
                    strF1 = null;
                }
                String strConcat = strF1 != null ? "?ids=".concat(strF1) : null;
                if (strConcat == null) {
                    strConcat = "";
                }
                o65.c(r37Var.b(), ":settings/folder/create".concat(strConcat), null, null, 6);
                break;
        }
    }
}
