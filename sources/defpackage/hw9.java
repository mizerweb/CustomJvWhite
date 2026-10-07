package defpackage;

import one.me.mediaeditor.MediaEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class hw9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaEditScreen b;

    public /* synthetic */ hw9(MediaEditScreen mediaEditScreen, int i) {
        this.a = i;
        this.b = mediaEditScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        MediaEditScreen mediaEditScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MediaEditScreen.w1;
                mediaEditScreen.a2().M();
                break;
            default:
                zv8[] zv8VarArr2 = MediaEditScreen.w1;
                mediaEditScreen.a2().M();
                break;
        }
        return sbiVar;
    }
}
