package defpackage;

import one.me.folders.edit.FolderEditScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e27 implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ ha9 c;

    public /* synthetic */ e27(int i, long[] jArr, ha9 ha9Var) {
        this.a = i;
        this.b = jArr;
        this.c = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.c;
        long[] jArr = this.b;
        switch (i) {
            case 0:
                return new FolderEditScreen(jArr, ha9Var);
            default:
                return new ChatTitleIconScreen(jArr, jhg.CHAT, ha9Var);
        }
    }
}
