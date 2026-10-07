package defpackage;

import one.me.mediapicker.crop.CropPhotoScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class gx4 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ CropPhotoScreen e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx4(CropPhotoScreen cropPhotoScreen, nq4 nq4Var) {
        super(nq4Var);
        this.e = cropPhotoScreen;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.z0(this);
    }
}
