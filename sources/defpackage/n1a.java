package defpackage;

import one.me.mediapicker.MediaPickerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class n1a implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ n1a(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        MediaPickerScreen mediaPickerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MediaPickerScreen.J;
                mediaPickerScreen.z1();
                mediaPickerScreen.A1();
                break;
            default:
                zv8[] zv8VarArr2 = MediaPickerScreen.J;
                mediaPickerScreen.z1();
                mediaPickerScreen.A1();
                break;
        }
        return sbiVar;
    }
}
