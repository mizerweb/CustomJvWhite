package defpackage;

import one.me.folders.pickerfolders.FoldersPickerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p57 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ p57(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (i) {
            case 0:
                e67 e67Var = (e67) foldersPickerScreen.e.getAccessor().c(1027);
                vv vvVar = foldersPickerScreen.b;
                zv8 zv8Var = FoldersPickerScreen.l[0];
                return new d67((long[]) vvVar.a(foldersPickerScreen), e67Var.a, e67Var.b, e67Var.c, e67Var.d, e67Var.e, e67Var.f);
            default:
                zv8[] zv8VarArr = FoldersPickerScreen.l;
                r1c r1cVar = new r1c(foldersPickerScreen.getContext());
                r1cVar.setClipChildren(false);
                r1cVar.setIcon(R.drawable.icon_folder);
                r1cVar.setTitle(new tnh(R.string.oneme_folders_picker_empty_title));
                r1cVar.f(r1cVar.getContext().getString(R.string.oneme_folders_list_create_folder), new r57(foldersPickerScreen, 1));
                return r1cVar;
        }
    }
}
