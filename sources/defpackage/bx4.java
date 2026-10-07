package defpackage;

import one.me.android.root.RootController;
import one.me.mediapicker.crop.CropPhotoScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bx4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CropPhotoScreen b;

    public /* synthetic */ bx4(CropPhotoScreen cropPhotoScreen, int i) {
        this.a = i;
        this.b = cropPhotoScreen;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    @Override // defpackage.af7
    public final Object invoke() {
        boolean z;
        int i = this.a;
        sbi sbiVar = sbi.a;
        CropPhotoScreen cropPhotoScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = CropPhotoScreen.p;
                if (cropPhotoScreen.getView() != null) {
                    br4 parentController = cropPhotoScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    z = (hveVarU1 == null || !hveVarU1.e().isEmpty() || ((Boolean) cropPhotoScreen.v1().z.getValue()).booleanValue()) ? false : true;
                }
                return Boolean.valueOf(z);
            case 1:
                zv8[] zv8VarArr2 = CropPhotoScreen.p;
                mrk.e(cropPhotoScreen);
                return sbiVar;
            case 2:
                zv8[] zv8VarArr3 = CropPhotoScreen.p;
                rx4 rx4VarV1 = cropPhotoScreen.v1();
                a8j.t(rx4VarV1, ((n0c) rx4VarV1.E()).a(), new qx4(rx4VarV1, null, 1), 2);
                return sbiVar;
            case 3:
                zv8[] zv8VarArr4 = CropPhotoScreen.p;
                cropPhotoScreen.v1().G(cropPhotoScreen.t1().z());
                return sbiVar;
            default:
                vv vvVar = cropPhotoScreen.f;
                zv8 zv8Var = CropPhotoScreen.p[1];
                return (y3f) vvVar.a(cropPhotoScreen);
        }
    }
}
