package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vje implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2d b;

    public /* synthetic */ vje(f2d f2dVar, int i) {
        this.a = i;
        this.b = f2dVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        f2d f2dVar = this.b;
        switch (i) {
            case 0:
                f2dVar.f = new u6g();
                break;
            default:
                u6g u6gVar = f2dVar.f;
                if (u6gVar != null) {
                    GLES20.glDeleteProgram(u6gVar.a);
                    oc9.o("glDeleteProgram", new int[0]);
                }
                f2dVar.f = null;
                break;
        }
        return sbiVar;
    }
}
