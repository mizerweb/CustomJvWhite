package defpackage;

import one.me.mediaeditor.editandreply.EditAndReplyScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ey5 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditAndReplyScreen b;

    public /* synthetic */ ey5(EditAndReplyScreen editAndReplyScreen, int i) {
        this.a = i;
        this.b = editAndReplyScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        EditAndReplyScreen editAndReplyScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = EditAndReplyScreen.w;
                editAndReplyScreen.t1().I();
                break;
            case 1:
                kz9 kz9Var = editAndReplyScreen.s;
                if (kz9Var != null) {
                    kz9Var.k();
                }
                break;
            default:
                zv8[] zv8VarArr2 = EditAndReplyScreen.w;
                iz5 iz5VarT1 = editAndReplyScreen.t1();
                String str = iz5VarT1.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onSaveToGalleryClick", null);
                    }
                }
                Object value = iz5VarT1.v.getValue();
                yy5 yy5Var = value instanceof yy5 ? (yy5) value : null;
                if (yy5Var == null) {
                    String str2 = iz5VarT1.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "onSaveToGalleryClick: called with no State.ResultPreview", null);
                        }
                    }
                } else {
                    ((ae9) ((my5) iz5VarT1.o.getValue()).a.getValue()).h("saving_edited_media_from_fullview_click", s66.a);
                    a8j.t(iz5VarT1, null, new qc5(iz5VarT1, yy5Var, (lq4) null, 7), 3);
                }
                break;
        }
        return sbi.a;
    }
}
