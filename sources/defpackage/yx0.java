package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class yx0 extends mj9 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    @Override // defpackage.mj9
    public Object a(Object obj) {
        switch (this.g) {
            case 2:
                pfg pfgVar = (pfg) obj;
                return jxf.b(pfgVar.a, pfgVar.b);
            default:
                return super.a(obj);
        }
    }

    @Override // defpackage.mj9
    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 0:
                break;
        }
    }

    @Override // defpackage.mj9
    public int h(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                int iD = oy0.d((Bitmap) obj2);
                if (iD < 1) {
                    return 1;
                }
                return iD;
            default:
                return super.h(obj, obj2);
        }
    }
}
